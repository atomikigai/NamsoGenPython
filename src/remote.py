"""HTTP contracts recovered from APK 11.23; standard library only."""
from __future__ import annotations
import ipaddress
import json
import math
import os
from pathlib import Path
import re
import ssl
from urllib import error, parse, request


class RemoteError(ValueError):
    """A request could not be completed; messages never contain credentials."""


API = 'https://api.spacehowen.com/'
# name, method, URL, required public fields, write, fixed payload, environment fields
_SPECS = [
    ('ip-fraud', 'GET', 'https://api11.scamalytics.com/{user_id}/', ('ip',), False, {}, {'user_id':'NAMSO_SCAMALYTICS_USER_ID','key':'NAMSO_SCAMALYTICS_API_KEY'}),
    ('proxy-free-geonode', 'GET', 'https://proxylist.geonode.com/api/proxy-list', ('country',), False, {}, {}),
    ('proxy-free-proxyscrape', 'GET', 'https://api.proxyscrape.com/v2/', ('country',), False, {}, {}),
    ('url-shorten', 'POST', 'https://link.spacehowen.com/api/shorten', ('url',), True, {}, {}),
    ('mail-messages', 'GET', 'https://api.catchmail.io/api/v1/mailbox', ('address',), False, {}, {}),
    ('mail-read', 'GET', 'https://api.catchmail.io/api/v1/message/{message_id}', ('message_id', 'address'), False, {}, {}),
    ('bin-lookup', 'GET', 'https://bins.antipublic.cc/bins/{bin}', ('bin',), False, {}, {}),
    ('bin-search', 'GET', API+'bins-extras/search_bin.php', ('bin',), False, {}, {}),
    ('bin-save', 'POST', API+'bins-extras/save_bin.php', ('bin_base','month','year'), True, {}, {}),
    ('world-data', 'GET', 'https://raw.githubusercontent.com/spacehowen/world-data-json/refs/heads/main/world_data.json', (), False, {}, {}),
    ('coins-balance', 'POST', API+'users-coins/coins.php', (), False, {'action':'get_balance'}, {'id_token':'NAMSO_ID_TOKEN'}),
    ('coins-credit', 'POST', API+'users-coins/coins.php', ('sku','quantity'), True, {'action':'credit'}, {'id_token':'NAMSO_ID_TOKEN','purchaseToken':'NAMSO_PURCHASE_TOKEN'}),
    ('coins-spend', 'POST', API+'users-coins/coins.php', ('amount',), True, {'action':'spend'}, {'id_token':'NAMSO_ID_TOKEN'}),
    ('subscription-verify', 'POST', API+'verify/verify.php', ('sku',), False, {'type':'sub'}, {'token':'NAMSO_PURCHASE_TOKEN'}),
    ('proxy-countries', 'GET', API+'users-proxys/countries.php', (), False, {}, {}),
    ('proxy-get', 'POST', API+'users-proxys/get_proxy.php', ('country',), True, {}, {'id_token':'NAMSO_ID_TOKEN'}),
    ('proxy-quota', 'POST', API+'users-proxys/get_proxy.php', (), False, {'action':'get_balance'}, {'id_token':'NAMSO_ID_TOKEN'}),
    ('proxy-buy', 'POST', API+'users-proxys/buy.php', (), True, {'sku':'proxy_100_mb'}, {'id_token':'NAMSO_ID_TOKEN','purchaseToken':'NAMSO_PURCHASE_TOKEN'}),
    ('fcm-register', 'POST', API+'fcm/tokens.php', ('action',), True, {'app':'namso'}, {'token':'NAMSO_FCM_TOKEN'}),
    ('fcm-track', 'POST', API+'fcm/track.php', ('mid',), True, {'action':'received'}, {'dev':'NAMSO_DEVICE_ID'}),
    ('checker-get', 'POST', API+'cards-checker/get_status.php', ('gate','card'), False, {}, {}),
    ('checker-save', 'POST', API+'cards-checker/save_status.php', ('gate','card','status'), True, {}, {}),
]
_KEYED = {'coins-balance','coins-credit','coins-spend','subscription-verify','proxy-get','proxy-quota','proxy-buy'}
_PAYMENT = {'coins-credit','coins-spend','proxy-buy'}


def _client_key():
    override = os.environ.get('NAMSO_CLIENT_KEY')
    if override:
        return override
    source = Path(__file__).resolve().parents[1] / 'decompiled/jadx/sources/k3/f.java'
    try:
        text = source.read_text(encoding='utf-8')
    except (OSError, UnicodeError):
        raise RemoteError('No se puede leer clave empaquetada; define NAMSO_CLIENT_KEY.') from None
    matches = re.findall(r'\.f\(\s*"X-Client-Key"\s*,\s*("(?:[^"\\]|\\.)*")\s*\)', text)
    try:
        keys = {json.loads(value) for value in matches}
    except ValueError:
        raise RemoteError('Clave empaquetada no interpretable; define NAMSO_CLIENT_KEY.') from None
    if len(keys) != 1 or not next(iter(keys)):
        raise RemoteError('Clave empaquetada ausente o ambigua; define NAMSO_CLIENT_KEY.')
    return next(iter(keys))


class _NoRedirect(request.HTTPRedirectHandler):
    def redirect_request(self, req, fp, code, msg, headers, newurl):
        raise RemoteError('Redirección HTTP rechazada.')


class RemoteClient:
    MAX_BODY = 16 * 1024 * 1024

    def __init__(self, timeout=15.0, base_url=None, allow_write=False):
        self.last_response_is_object = None
        if not isinstance(timeout, (int,float)) or not math.isfinite(timeout) or timeout <= 0:
            raise RemoteError('Timeout debe ser un número positivo finito.')
        self.timeout = timeout
        self.allow_write = allow_write
        self.base_url = None
        if base_url is not None:
            try:
                parts = parse.urlsplit(base_url)
                local = ipaddress.ip_address(parts.hostname).is_loopback
                parts.port  # Validate the optional numeric port.
            except (ValueError, TypeError):
                raise RemoteError('base_url requiere una IP loopback HTTP.') from None
            if not local or parts.scheme != 'http' or parts.username or parts.password or parts.query or parts.fragment or parts.path not in ('','/'):
                raise RemoteError('base_url sólo admite http://IP-loopback:puerto para fixtures.')
            self.base_url = base_url.rstrip('/')
        self._opener = request.build_opener(request.ProxyHandler({}), request.HTTPSHandler(context=ssl.create_default_context()), _NoRedirect())

    def operations(self):
        result = []
        for name, method, url, required, write, fixed, env in _SPECS:
            credentials = list(env.values())
            result.append(dict(name=name, method=method, url=url, required=list(required), write=write,
                               credential_env=credentials, optional_credential_env=['NAMSO_CLIENT_KEY'] if name in _KEYED else [], description='Contrato recuperado del APK; pagos sólo fixture.' if name in _PAYMENT else 'Contrato recuperado del APK.'))
        return result

    def execute(self, name, params=None):
        self.last_response_is_object = None
        spec = next((s for s in _SPECS if s[0] == name), None)
        if spec is None:
            raise RemoteError('Operación desconocida.')
        _, method, url, required, write, fixed, env = spec
        if not isinstance(params, (dict,type(None))):
            raise RemoteError('Los parámetros deben ser un objeto.')
        params = dict(params or {})
        if set(params) != set(required):
            raise RemoteError('Parámetros requeridos: '+', '.join(required))
        if any(not isinstance(v,(str,int,float)) or isinstance(v,bool) or not str(v).strip() for v in params.values()):
            raise RemoteError('Parámetros vacíos o de tipo inválido.')
        if write and not self.allow_write:
            raise RemoteError('La operación necesita allow_write=True explícito.')
        if name in _PAYMENT and self.base_url is None:
            raise RemoteError('Compra, crédito y gasto sólo disponibles en fixtures loopback; no hay sandbox documentado.')
        if 'bin' in params:
            if not re.fullmatch(r'[0-9]{6}', str(params['bin'])):
                raise RemoteError('BIN debe tener exactamente seis dígitos.')
        if name == 'url-shorten':
            try:
                parts = parse.urlsplit(str(params['url']))
            except ValueError:
                raise RemoteError('URL inválida.') from None
            if parts.scheme not in ('https','http') or not parts.hostname or parts.username or parts.password:
                raise RemoteError('URL inválida.')
        if 'ip' in params:
            try:
                ipaddress.ip_address(str(params['ip']))
            except ValueError:
                raise RemoteError('Dirección IP inválida.') from None
        if 'country' in params:
            country = str(params['country']).strip()
            if not re.fullmatch(r'[A-Za-z]{2}', country):
                raise RemoteError('País requiere código ISO de dos letras.')
            params['country'] = country.upper() if name.startswith('proxy-free-') else country.lower()
        for field in ('quantity','amount'):
            if field in params:
                try:
                    value = int(params[field])
                except (ValueError,TypeError,OverflowError):
                    raise RemoteError('Se requiere entero positivo para '+field) from None
                if value <= 0 or str(value) != str(params[field]):
                    raise RemoteError('Se requiere entero positivo para '+field)
                params[field] = value
        payload = dict(fixed)
        payload.update(params)
        secrets = []
        for field, variable in env.items():
            value = os.environ.get(variable)
            if not value and variable == 'NAMSO_ID_TOKEN':
                try:
                    from auth import get_id_token, AuthError
                    value = get_id_token()
                except ImportError:
                    pass
                except AuthError:
                    raise RemoteError('No se pudo recuperar sesión; usa login o NAMSO_ID_TOKEN.') from None
            if not value:
                raise RemoteError('Falta credencial de entorno: '+variable)
            payload[field] = value
            secrets.append(value)
        headers = {'Accept':'application/json'}
        if name in _KEYED:
            key = _client_key()
            headers['X-Client-Key'] = key
            secrets.append(key)
        if name.startswith('proxy-free-'):
            headers['User-Agent'] = 'Mozilla/5.0 (Android; Mobile)'
        for field in ('bin','message_id','user_id'):
            if '{'+field+'}' in url:
                url = url.replace('{'+field+'}', parse.quote(str(payload.pop(field)), safe=''))
        query = {}
        if name == 'ip-fraud':
            query = {'key':payload.pop('key'), 'ip':payload.pop('ip')}
        elif name == 'proxy-free-geonode':
            query = {'country':payload.pop('country'), 'limit':40, 'sort_by':'lastChecked', 'sort_type':'desc'}
        elif name == 'proxy-free-proxyscrape':
            query = {'request':'displayproxies', 'protocol':'http,socks4,socks5', 'timeout':10000, 'country':payload.pop('country'), 'ssl':'all', 'anonymity':'all'}
        elif name == 'mail-messages':
            query['address'] = payload.pop('address')
        elif name == 'mail-read':
            query['mailbox'] = payload.pop('address')
        elif name == 'bin-search':
            query['bin'] = payload.pop('bin')
        elif name in ('fcm-register','fcm-track'):
            query['action'] = payload['action']
        if query:
            url += '?'+parse.urlencode(query)
        if self.base_url is not None:
            parts = parse.urlsplit(url)
            url = self.base_url+parts.path+('?' + parts.query if parts.query else '')
        data = None
        if method == 'POST':
            headers['Content-Type'] = 'application/json'
            try:
                data = json.dumps(payload, allow_nan=False).encode('utf-8')
            except (ValueError,TypeError):
                raise RemoteError('Payload JSON inválido.') from None
        try:
            req = request.Request(url, data=data, headers=headers, method=method)
            with self._opener.open(req, timeout=self.timeout) as response:
                body = response.read(self.MAX_BODY+1)
                status = response.status
            if len(body) > self.MAX_BODY:
                raise RemoteError('Respuesta supera límite de 16 MiB.')
            if name in ('fcm-register','fcm-track'):
                return {'http_status':status}
            if name == 'proxy-free-proxyscrape':
                try:
                    text = body.decode('utf-8')
                except UnicodeError:
                    raise RemoteError('Respuesta de proxies no es UTF-8 válido.') from None
                proxies = []
                seen = set()
                for line in text.splitlines():
                    pieces = line.strip().split(':')
                    if len(pieces) >= 2 and pieces[1].isdigit() and 1 <= int(pieces[1]) <= 65535 and pieces[0].strip():
                        address = pieces[0].strip()+':'+str(int(pieces[1]))
                        if address not in seen:
                            seen.add(address)
                            proxies.append(address)
                return {'proxies':proxies}
            try:
                decoded = json.loads(body.decode('utf-8'))
            except (ValueError,UnicodeError):
                raise RemoteError('Respuesta no es JSON UTF-8 válido.') from None
            self.last_response_is_object = isinstance(decoded, dict)
            # Do not print credentials even if a fixture/server echoes the request.
            def redact(value):
                if isinstance(value,dict):
                    return {k: '[REDACTED]' if k.lower() in {'token','id_token','purchasetoken','x-client-key','dev'} else redact(v) for k,v in value.items()}
                if isinstance(value,list):
                    return [redact(v) for v in value]
                if isinstance(value,str):
                    for secret in secrets:
                        value = value.replace(secret,'[REDACTED]')
                return value
            decoded = redact(decoded)
            return decoded if isinstance(decoded,dict) else {'data':decoded}
        except error.HTTPError as exc:
            raise RemoteError('Error HTTP '+str(exc.code)+'.') from None
        except (error.URLError,OSError,ValueError) as exc:
            if isinstance(exc,RemoteError):
                raise
            raise RemoteError('Error de red o solicitud; no se completó la operación.') from None

package ab;

import bd.m;
import bd.n;
import bd.s;
import bd.v;
import bd.w;
import bd.x;
import d6.e;
import fd.k;
import gd.d;
import hd.f;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import jc.i;
import od.g;
import od.h;
import od.o;
import od.p;
import od.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f269d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f271g;

    public a(s sVar, k kVar, p pVar, o oVar) {
        i.e(pVar, "source");
        i.e(oVar, "sink");
        this.f267b = sVar;
        this.f268c = kVar;
        this.f269d = pVar;
        this.e = oVar;
        this.f270f = new e(pVar);
    }

    @Override // gd.d
    public void a(v vVar) {
        Proxy.Type type = ((k) this.f268c).f3938b.f1548b.type();
        i.d(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) vVar.f1681b);
        sb2.append(' ');
        bd.o oVar = (bd.o) vVar.f1682c;
        if (oVar.i || type != Proxy.Type.HTTP) {
            String strB = oVar.b();
            String strD = oVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb2.append(strB);
        } else {
            sb2.append(oVar);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        i.d(string, "StringBuilder().apply(builderAction).toString()");
        k((m) vVar.f1683d, string);
    }

    @Override // gd.d
    public void b() {
        ((g) this.e).flush();
    }

    @Override // gd.d
    public t c(v vVar, long j4) {
        if ("chunked".equalsIgnoreCase(((m) vVar.f1683d).d("Transfer-Encoding"))) {
            if (this.f266a == 1) {
                this.f266a = 2;
                return new hd.b(this);
            }
            throw new IllegalStateException(("state: " + this.f266a).toString());
        }
        if (j4 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f266a == 1) {
            this.f266a = 2;
            return new hd.e(this);
        }
        throw new IllegalStateException(("state: " + this.f266a).toString());
    }

    @Override // gd.d
    public void cancel() {
        Socket socket = ((k) this.f268c).f3939c;
        if (socket != null) {
            cd.b.e(socket);
        }
    }

    @Override // gd.d
    public w d(boolean z4) throws IOException {
        e eVar = (e) this.f270f;
        int i = this.f266a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f266a).toString());
        }
        n nVar = null;
        try {
            String strR = ((h) eVar.f2936c).r(eVar.f2935b);
            eVar.f2935b -= (long) strR.length();
            bb.b bVarB = com.bumptech.glide.c.B(strR);
            int i10 = bVarB.f1524b;
            w wVar = new w();
            wVar.f1687b = (bd.t) bVarB.f1526d;
            wVar.f1688c = i10;
            wVar.f1689d = (String) bVarB.f1525c;
            wVar.f1690f = eVar.f().h();
            if (z4 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f266a = 3;
                return wVar;
            }
            if (102 > i10 || i10 >= 200) {
                this.f266a = 4;
                return wVar;
            }
            this.f266a = 3;
            return wVar;
        } catch (EOFException e) {
            bd.o oVar = ((k) this.f268c).f3938b.f1547a.i;
            oVar.getClass();
            try {
                n nVar2 = new n();
                nVar2.i(oVar, "/...");
                nVar = nVar2;
            } catch (IllegalArgumentException unused) {
            }
            i.b(nVar);
            nVar.f1622d = bd.b.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
            nVar.e = bd.b.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
            throw new IOException("unexpected end of stream on ".concat(nVar.a().h), e);
        }
    }

    @Override // gd.d
    public k e() {
        return (k) this.f268c;
    }

    @Override // gd.d
    public void f() {
        ((g) this.e).flush();
    }

    @Override // gd.d
    public od.v g(x xVar) {
        if (!gd.e.a(xVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(x.c(xVar, "Transfer-Encoding"))) {
            bd.o oVar = (bd.o) xVar.f1696a.f1682c;
            if (this.f266a == 4) {
                this.f266a = 5;
                return new hd.c(this, oVar);
            }
            throw new IllegalStateException(("state: " + this.f266a).toString());
        }
        long j4 = cd.b.j(xVar);
        if (j4 != -1) {
            return j(j4);
        }
        if (this.f266a == 4) {
            this.f266a = 5;
            ((k) this.f268c).k();
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f266a).toString());
    }

    @Override // gd.d
    public long h(x xVar) {
        if (!gd.e.a(xVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(x.c(xVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return cd.b.j(xVar);
    }

    public b i() {
        String strH = this.f266a == 0 ? " registrationStatus" : "";
        if (((Long) this.f270f) == null) {
            strH = strH.concat(" expiresInSecs");
        }
        if (((Long) this.f271g) == null) {
            strH = da.v.h(strH, " tokenCreationEpochInSecs");
        }
        if (strH.isEmpty()) {
            return new b((String) this.f267b, this.f266a, (String) this.f268c, (String) this.f269d, ((Long) this.f270f).longValue(), ((Long) this.f271g).longValue(), (String) this.e);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public hd.d j(long j4) {
        if (this.f266a == 4) {
            this.f266a = 5;
            return new hd.d(this, j4);
        }
        throw new IllegalStateException(("state: " + this.f266a).toString());
    }

    public void k(m mVar, String str) {
        g gVar = (g) this.e;
        i.e(str, "requestLine");
        if (this.f266a != 0) {
            throw new IllegalStateException(("state: " + this.f266a).toString());
        }
        gVar.y(str).y("\r\n");
        int size = mVar.size();
        for (int i = 0; i < size; i++) {
            gVar.y(mVar.g(i)).y(": ").y(mVar.i(i)).y("\r\n");
        }
        gVar.y("\r\n");
        this.f266a = 1;
    }
}

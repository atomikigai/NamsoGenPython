package id;

import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b[] f5278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f5279b;

    static {
        b bVar = new b(b.i, "");
        od.i iVar = b.f5260f;
        b bVar2 = new b(iVar, "GET");
        b bVar3 = new b(iVar, "POST");
        od.i iVar2 = b.f5261g;
        b bVar4 = new b(iVar2, "/");
        b bVar5 = new b(iVar2, "/index.html");
        od.i iVar3 = b.h;
        b bVar6 = new b(iVar3, ProxyConfig.MATCH_HTTP);
        b bVar7 = new b(iVar3, ProxyConfig.MATCH_HTTPS);
        od.i iVar4 = b.e;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(iVar4, "200"), new b(iVar4, "204"), new b(iVar4, "206"), new b(iVar4, "304"), new b(iVar4, "400"), new b(iVar4, "404"), new b(iVar4, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f5278a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(bVarArr[i].f5262a)) {
                linkedHashMap.put(bVarArr[i].f5262a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        jc.i.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        f5279b = mapUnmodifiableMap;
    }

    public static void a(od.i iVar) throws IOException {
        jc.i.e(iVar, "name");
        int iA = iVar.a();
        for (int i = 0; i < iA; i++) {
            byte bD = iVar.d(i);
            if (65 <= bD && bD < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.h()));
            }
        }
    }
}

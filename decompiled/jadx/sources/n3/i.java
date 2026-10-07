package n3;

import android.os.SystemClock;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import androidx.webkit.ProxyController;
import androidx.webkit.WebViewFeature;
import bd.n;
import bd.s;
import bd.u;
import bd.x;
import h3.o;
import i3.p;
import j$.time.Duration;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ServerSocket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import k3.r;
import vb.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f7270a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f7271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static r f7272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static n f7273d;
    public static final LinkedHashMap e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f7274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f7275g;
    public static final ArrayDeque h;
    public static final ArrayDeque i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f7276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f7277k;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        jc.i.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f7271b = executorServiceNewSingleThreadExecutor;
        e = new LinkedHashMap();
        f7275g = j.S("*.googlesyndication.com", "googlesyndication.com", "*.doubleclick.net", "doubleclick.net", "*.googleadservices.com", "googleadservices.com", "adservice.google.com", "*.admob.com", "admob.com", "*.app-measurement.com", "app-measurement.com", "fcmatch.google.com", "fcmatch.youtube.com", "*.google-analytics.com", "google-analytics.com");
        h = new ArrayDeque();
        i = new ArrayDeque();
        f7276j = new String[]{"https://www.gstatic.com/generate_204", "https://example.com"};
        f7277k = new String[]{"https://www.cloudflare.com/cdn-cgi/trace", "https://one.one.one.one/cdn-cgi/trace"};
    }

    public static ArrayList a() {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = e;
        synchronized (linkedHashMap) {
            arrayList = new ArrayList(linkedHashMap.keySet());
        }
        return arrayList;
    }

    public static ProxyConfig b(String str) {
        ProxyConfig.Builder builderAddProxyRule = new ProxyConfig.Builder().addProxyRule(str);
        jc.i.d(builderAddProxyRule, "addProxyRule(...)");
        Iterator it = f7275g.iterator();
        while (it.hasNext()) {
            try {
                builderAddProxyRule.addBypassRule((String) it.next());
            } catch (Throwable th) {
                r7.g.m(th);
            }
        }
        ProxyConfig proxyConfigBuild = builderAddProxyRule.build();
        jc.i.d(proxyConfigBuild, "build(...)");
        return proxyConfigBuild;
    }

    public static boolean e(long j4) {
        boolean zContainsKey;
        LinkedHashMap linkedHashMap = e;
        synchronized (linkedHashMap) {
            zContainsKey = linkedHashMap.containsKey(Long.valueOf(j4));
        }
        return zContainsKey;
    }

    public static boolean h(long j4, int i10, String str, int i11, String str2, String str3, String str4) {
        boolean z4;
        jc.i.e(str, "host");
        jc.i.e(str2, "user");
        jc.i.e(str3, "pass");
        LinkedHashMap linkedHashMap = e;
        synchronized (linkedHashMap) {
            g gVar = (g) linkedHashMap.get(Long.valueOf(j4));
            z4 = false;
            if (gVar != null && gVar.f7259b == i10 && jc.i.a(gVar.f7260c, str) && gVar.f7261d == i11 && jc.i.a(gVar.e, str2) && jc.i.a(gVar.f7262f, str3) && gVar.f7263g.equals(str4)) {
                z4 = true;
            }
        }
        return z4;
    }

    public static void i() {
        n nVar = f7273d;
        if (nVar != null) {
            synchronized (nVar.i) {
                ServerSocket serverSocket = (ServerSocket) nVar.h;
                if (serverSocket != null && !serverSocket.isClosed()) {
                    Log.i("krypt-router", "router detenido (puerto " + nVar.f1621c + ')');
                }
                try {
                    ServerSocket serverSocket2 = (ServerSocket) nVar.h;
                    if (serverSocket2 != null) {
                        serverSocket2.close();
                    }
                } catch (Throwable unused) {
                }
                nVar.h = null;
            }
        }
        f7273d = null;
    }

    public static h j(int i10, int i11, String str, String str2, String str3) {
        jc.i.e(str, "host");
        jc.i.e(str2, "user");
        jc.i.e(str3, "pass");
        h hVarK = k(i10, i11, str, str2, str3);
        StringBuilder sb2 = new StringBuilder("testDetailed ");
        sb2.append(str);
        sb2.append(':');
        sb2.append(i11);
        sb2.append(" user='");
        sb2.append(str2);
        sb2.append("' → primary ok=");
        boolean z4 = hVarK.f7264a;
        sb2.append(z4);
        sb2.append(" err=");
        int i12 = hVarK.f7265b;
        sb2.append(i12);
        sb2.append(" ms=");
        sb2.append(hVarK.f7266c);
        Log.d("KRYPT-PROXY", sb2.toString());
        if (!z4 && str2.length() != 0) {
            Log.d("KRYPT-PROXY", str + ':' + i11 + " falló con credenciales (err=" + i12 + "); reintentando sin ellas");
            h hVarK2 = k(i10, i11, str, "", "");
            boolean z10 = hVarK2.f7264a;
            Log.d("KRYPT-PROXY", "testDetailed " + str + ':' + i11 + " sin creds → alt ok=" + z10 + " err=" + hVarK2.f7265b + " ms=" + hVarK2.f7266c);
            if (z10) {
                return new h(true, hVarK2.f7265b, hVarK2.f7266c, hVarK2.f7267d, hVarK2.e, true, hVarK2.f7269g);
            }
        }
        return hVarK;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0225  */
    public static h k(int i10, int i11, String str, String str2, String str3) throws Throwable {
        r rVar;
        int i12;
        String str4;
        Proxy proxy;
        r rVar2;
        r rVar3;
        try {
            if (str2.length() <= 0 && i10 != 3) {
                i12 = i11;
                str4 = str;
                proxy = new Proxy((i10 == 2 || i10 == 3) ? Proxy.Type.SOCKS : Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str4, i12));
                rVar2 = null;
            } else {
                i12 = i11;
                str4 = str;
                rVar2 = new r(i10, i12, str4, str2, str3);
                if (!rVar2.n()) {
                    return new h(false, 1, 0L, (String) null, (String) null, 0, 120);
                }
                try {
                    proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("127.0.0.1", rVar2.i));
                } catch (Throwable th) {
                    th = th;
                    rVar = rVar2;
                    if (rVar != null) {
                        rVar.o();
                    }
                    throw th;
                }
            }
            try {
                bd.r rVar4 = new bd.r();
                proxy.equals(rVar4.f1644l);
                rVar4.f1644l = proxy;
                Duration durationOfSeconds = Duration.ofSeconds(6L);
                jc.i.d(durationOfSeconds, "ofSeconds(...)");
                long millis = durationOfSeconds.toMillis();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jc.i.e(timeUnit, "unit");
                rVar4.f1651s = cd.b.b(millis, timeUnit);
                Duration durationOfSeconds2 = Duration.ofSeconds(6L);
                jc.i.d(durationOfSeconds2, "ofSeconds(...)");
                long millis2 = durationOfSeconds2.toMillis();
                jc.i.e(timeUnit, "unit");
                rVar4.f1652t = cd.b.b(millis2, timeUnit);
                rVar4.h = true;
                s sVar = new s(rVar4);
                bd.r rVar5 = new bd.r();
                proxy.equals(rVar5.f1644l);
                rVar5.f1644l = proxy;
                Duration durationOfSeconds3 = Duration.ofSeconds(6L);
                jc.i.d(durationOfSeconds3, "ofSeconds(...)");
                long millis3 = durationOfSeconds3.toMillis();
                jc.i.e(timeUnit, "unit");
                rVar5.f1651s = cd.b.b(millis3, timeUnit);
                Duration durationOfSeconds4 = Duration.ofSeconds(8L);
                jc.i.d(durationOfSeconds4, "ofSeconds(...)");
                long millis4 = durationOfSeconds4.toMillis();
                jc.i.e(timeUnit, "unit");
                rVar5.f1652t = cd.b.b(millis4, timeUnit);
                rVar5.h = true;
                s sVar2 = new s(rVar5);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String[] strArr = f7276j;
                int length = strArr.length;
                boolean z4 = false;
                int i13 = 0;
                int i14 = -1;
                while (i13 < length) {
                    String str5 = strArr[i13];
                    try {
                        u uVar = new u();
                        uVar.j(str5);
                        boolean z10 = z4;
                        rVar3 = rVar2;
                        try {
                            try {
                                uVar.f("User-Agent", "Mozilla/5.0");
                                x xVarC = new fd.i(sVar, uVar.a()).c();
                                try {
                                    i14 = xVarC.f1699d;
                                    if (xVarC.d()) {
                                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        bb.b bVarD = f7270a.d(sVar2);
                                        h hVar = new h(true, 0, jElapsedRealtime2, bVarD != null ? (String) bVarD.f1525c : null, bVarD != null ? (String) bVarD.f1526d : null, bVarD != null ? bVarD.f1524b : 0, 32);
                                        xVarC.close();
                                        if (rVar3 != null) {
                                            rVar3.o();
                                        }
                                        return hVar;
                                    }
                                    if (xVarC.f1699d == 407) {
                                        h hVar2 = new h(false, 2, 0L, (String) null, (String) null, 0, 120);
                                        xVarC.close();
                                        if (rVar3 != null) {
                                            rVar3.o();
                                        }
                                        return hVar2;
                                    }
                                    Log.d("KRYPT-PROXY", "testOnce " + str4 + ':' + i12 + ' ' + str5 + " → HTTP " + xVarC.f1699d + " (sin éxito)");
                                    xVarC.close();
                                    z4 = z10;
                                    i13++;
                                    rVar2 = rVar3;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        r7.g.h(xVarC, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                rVar = rVar3;
                                if (rVar != null) {
                                    rVar.o();
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            Log.w("KRYPT-PROXY", "testOnce " + str4 + ':' + i12 + ' ' + str5 + " → IO: " + e.getMessage());
                            z4 = true;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        rVar3 = rVar2;
                    }
                }
                r rVar6 = rVar2;
                h hVar3 = new h(false, (z4 && i14 == -1) ? 1 : 3, 0L, (String) null, (String) null, 0, 120);
                if (rVar6 != null) {
                    rVar6.o();
                }
                return hVar3;
            } catch (Throwable th5) {
                th = th5;
                rVar3 = rVar2;
            }
        } catch (Throwable th6) {
            th = th6;
            rVar = null;
        }
    }

    public final synchronized void c(long j4) {
        g gVar;
        LinkedHashMap linkedHashMap = e;
        synchronized (linkedHashMap) {
            gVar = (g) linkedHashMap.remove(Long.valueOf(j4));
        }
        if (gVar == null) {
            Log.i("KRYPT-PROXY", "closeProfile #" + j4 + " → no había ruta montada");
            return;
        }
        Log.i("KRYPT-PROXY", "closeProfile #" + j4 + " → se desmonta " + gVar.f7260c + ':' + gVar.f7261d + " dominio='" + gVar.f7263g + '\'');
        gVar.f7258a.o();
        g();
    }

    /* JADX WARN: Code duplicated, block: B:172:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:175:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:182:0x0400  */
    /* JADX WARN: Code duplicated, block: B:184:0x040c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0420  */
    /* JADX WARN: Code duplicated, block: B:190:0x043c  */
    /* JADX WARN: Code duplicated, block: B:191:0x043f  */
    /* JADX WARN: Code duplicated, block: B:194:0x044a  */
    /* JADX WARN: Code duplicated, block: B:197:0x045e A[LOOP:9: B:195:0x0458->B:197:0x045e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x0487 A[LOOP:11: B:200:0x0481->B:202:0x0487, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x049a  */
    /* JADX WARN: Code duplicated, block: B:214:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:218:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:221:0x04df  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:232:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:235:0x0509  */
    /* JADX WARN: Code duplicated, block: B:237:0x050f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0511  */
    /* JADX WARN: Code duplicated, block: B:241:0x0554  */
    /* JADX WARN: Code duplicated, block: B:242:0x0557  */
    /* JADX WARN: Code duplicated, block: B:245:0x0562  */
    /* JADX WARN: Code duplicated, block: B:248:0x0572  */
    /* JADX WARN: Code duplicated, block: B:253:0x057e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0581  */
    /* JADX WARN: Code duplicated, block: B:299:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:302:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0509 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:? A[LOOP:6: B:231:0x04fa->B:309:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0248  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0294, code lost:
    
        java.lang.Thread.sleep(400);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [long] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v41, types: [int] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [int] */
    /* JADX WARN: Type inference failed for: r9v21, types: [int] */
    /* JADX WARN: Type inference failed for: r9v36, types: [h6.o0] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bb.b d(bd.s r24) {
        /*
            Method dump skipped, instruction units count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.i.d(bd.s):bb.b");
    }

    public final synchronized boolean f(long j4, int i10, String str, int i11, String str2, String str3, String str4) {
        String str5;
        g gVar;
        try {
            jc.i.e(str, "host");
            jc.i.e(str2, "user");
            jc.i.e(str3, "pass");
            StringBuilder sb2 = new StringBuilder("openProfile #");
            sb2.append(j4);
            sb2.append(" → ");
            sb2.append(str);
            sb2.append(':');
            sb2.append(i11);
            sb2.append(" tipo=");
            sb2.append(i10);
            sb2.append(" auth=");
            sb2.append(str2.length() > 0);
            sb2.append(" dominio='");
            sb2.append(str4);
            sb2.append("' montadoAntes=");
            LinkedHashMap linkedHashMap = e;
            synchronized (linkedHashMap) {
                g gVar2 = (g) linkedHashMap.get(Long.valueOf(j4));
                if (gVar2 != null) {
                    str5 = gVar2.f7260c + ':' + gVar2.f7261d + " dominio='" + gVar2.f7263g + '\'';
                } else {
                    str5 = null;
                }
            }
            if (str5 == null) {
                str5 = "ninguna";
            }
            sb2.append(str5);
            Log.i("KRYPT-PROXY", sb2.toString());
            if (pc.g.m0(str4)) {
                Log.w("KRYPT-PROXY", "openProfile #" + j4 + " SIN dominio → aborta");
                return false;
            }
            synchronized (linkedHashMap) {
                gVar = (g) linkedHashMap.remove(Long.valueOf(j4));
            }
            if (gVar != null) {
                gVar.f7258a.o();
            }
            r rVar = new r(i10, i11, str, str2, str3);
            if (!rVar.n()) {
                Log.w("KRYPT-PROXY", "openProfile #" + j4 + " relay dedicado NO inició");
                return false;
            }
            synchronized (linkedHashMap) {
                linkedHashMap.put(Long.valueOf(j4), new g(rVar, i10, str, i11, str2, str3, str4));
            }
            if (g() == 0) {
                Log.i("KRYPT-PROXY", "openProfile #" + j4 + " OK — sesión activa");
                return true;
            }
            Log.w("KRYPT-PROXY", "openProfile #" + j4 + " rebuild falló (" + f7274f + "); revirtiendo");
            synchronized (linkedHashMap) {
            }
            rVar.o();
            g();
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int g() {
        LinkedHashMap linkedHashMap;
        List<String> listD;
        String str;
        r rVar;
        r rVar2;
        String message;
        String string;
        int i10;
        try {
            i();
            r rVar3 = f7272c;
            if (rVar3 != null) {
                rVar3.o();
            }
            Throwable th = null;
            f7272c = null;
            f7274f = null;
            boolean z4 = p.b().getBoolean("proxy_enabled", false) && !pc.g.m0(p.c()) && 1 <= (i10 = p.b().getInt("proxy_port", 0)) && i10 < 65536;
            LinkedHashMap linkedHashMap2 = e;
            synchronized (linkedHashMap2) {
                linkedHashMap = new LinkedHashMap(linkedHashMap2);
            }
            StringBuilder sb2 = new StringBuilder("rebuild: mainOn=");
            sb2.append(z4);
            sb2.append(" perfiles=");
            sb2.append(linkedHashMap.size());
            sb2.append(" (");
            Collection collectionValues = linkedHashMap.values();
            jc.i.d(collectionValues, "<get-values>(...)");
            sb2.append(vb.i.e0(collectionValues, null, null, null, new o(16), 31));
            sb2.append(')');
            Log.i("KRYPT-PROXY", sb2.toString());
            if (!z4 && linkedHashMap.isEmpty()) {
                try {
                    if (WebViewFeature.isFeatureSupported(WebViewFeature.PROXY_OVERRIDE)) {
                        try {
                            ProxyController.getInstance().clearProxyOverride(f7271b, new e(0));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th2) {
                    r7.g.m(th2);
                }
                Log.i("krypt-proxy", "regla aplicada: (sin proxy)");
                return 0;
            }
            if (!z4) {
                listD = jd.d.D("");
                str = null;
                rVar = null;
            } else if (p.d().length() > 0 || p.b().getInt("proxy_type", 0) == 2 || p.b().getInt("proxy_type", 0) == 3) {
                int i11 = p.b().getInt("proxy_type", 0);
                String strC = p.c();
                int i12 = p.b().getInt("proxy_port", 0);
                String strD = p.d();
                String string2 = p.b().getString("proxy_pass", "");
                rVar = new r(i11, i12, strC, strD, string2 == null ? "" : string2);
                if (!rVar.n()) {
                    f7274f = "relay local no pudo iniciar";
                    return 1;
                }
                f7272c = rVar;
                int i13 = rVar.i;
                listD = j.S("localhost:" + i13, "http=localhost:" + i13, "http://localhost:" + i13, "127.0.0.1:" + i13);
                str = null;
            } else {
                str = p.c() + ':' + p.b().getInt("proxy_port", 0);
                listD = p.b().getInt("proxy_type", 0) == 1 ? j.S("https=" + str, str) : j.S(str, "http=" + str);
                rVar = null;
            }
            if (linkedHashMap.isEmpty()) {
                for (String str2 : listD) {
                    try {
                        ProxyController.getInstance().setProxyOverride(b(str2), f7271b, new e(0));
                        Log.i("krypt-proxy", "regla aplicada: " + str2);
                        return 0;
                    } catch (Throwable th3) {
                        th = th3;
                        Log.w("krypt-proxy", "formato rechazado (" + str2 + "): " + th.getMessage());
                    }
                }
                if (th == null || (string = th.getMessage()) == null) {
                    string = th != null ? th.toString() : "ningún formato aceptado";
                }
                f7274f = string;
                Log.w("krypt-proxy", "setProxyOverride falló", th);
                return 1;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Long l2 = (Long) entry.getKey();
                g gVar = (g) entry.getValue();
                linkedHashMap3.put(gVar.f7263g, gVar.f7258a);
                Log.i("krypt-proxy", "perfil #" + l2 + " → " + gVar.f7263g + " vía relay dedicado");
            }
            if (linkedHashMap.size() == 1) {
                Collection collectionValues2 = linkedHashMap.values();
                jc.i.d(collectionValues2, "<get-values>(...)");
                rVar2 = ((g) vb.i.Y(collectionValues2)).f7258a;
                str = null;
                rVar = null;
            } else {
                if (!z4 || rVar != null) {
                    str = null;
                }
                rVar2 = null;
            }
            n nVar = new n(new LinkedHashMap(linkedHashMap3), rVar, str, rVar2);
            if (!nVar.l()) {
                f7274f = "router de perfiles no pudo iniciar";
                return 1;
            }
            f7273d = nVar;
            int i14 = nVar.f1621c;
            for (String str3 : j.S("localhost:" + i14, "http=localhost:" + i14, "http://localhost:" + i14, "127.0.0.1:" + i14)) {
                try {
                    ProxyController.getInstance().setProxyOverride(b(str3), f7271b, new e(0));
                    Log.i("krypt-proxy", "regla aplicada: " + str3 + " (router: " + linkedHashMap.size() + " perfiles)");
                    return 0;
                } catch (Throwable th4) {
                    th = th4;
                    Log.w("krypt-proxy", "formato rechazado (" + str3 + "): " + th.getMessage());
                }
            }
            i();
            if (th == null || (message = th.getMessage()) == null) {
                message = "ningún formato aceptado";
            }
            f7274f = message;
            Log.w("krypt-proxy", "setProxyOverride (router) falló", th);
            return 1;
        } catch (Throwable th5) {
            throw th5;
        }
        throw th5;
    }
}

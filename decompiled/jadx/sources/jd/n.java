package jd;

import android.util.Log;
import bd.s;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile n f5799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f5800b;

    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[PHI: r2
      0x0071: PHI (r2v3 jd.n) = (r2v1 jd.n), (r2v4 jd.n) binds: [B:65:0x0154, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    static {
        n nVar;
        String property;
        n jVar = null;
        if (z9.c.m()) {
            for (Map.Entry entry : kd.c.f6215b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (kd.c.f6214a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(kd.d.f6216a);
                }
            }
            nVar = a.f5778d ? new a() : null;
            if (nVar == null) {
                jVar = c.e ? new c() : null;
                jc.i.b(jVar);
                nVar = jVar;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            nVar = h.f5787d ? new h() : null;
            if (nVar == null) {
                if (!"BC".equals(Security.getProviders()[0].getName())) {
                    if (e.f5784d) {
                        nVar = new e();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                            if (m.f5797d) {
                                nVar = new m();
                            } else {
                                nVar = null;
                            }
                            if (nVar == null) {
                                if (k.f5796c) {
                                    nVar = new k();
                                } else {
                                    nVar = null;
                                }
                                if (nVar == null) {
                                    property = System.getProperty("java.specification.version", "unknown");
                                    jc.i.d(property, "jvmVersion");
                                    if (Integer.parseInt(property) < 9) {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method = cls.getMethod("put", SSLSocket.class, cls2);
                                        Method method2 = cls.getMethod("get", SSLSocket.class);
                                        Method method3 = cls.getMethod("remove", SSLSocket.class);
                                        jc.i.d(method, "putMethod");
                                        jc.i.d(method2, "getMethod");
                                        jc.i.d(method3, "removeMethod");
                                        jc.i.d(cls3, "clientProviderClass");
                                        jc.i.d(cls4, "serverProviderClass");
                                        jVar = new j(method, method2, method3, cls3, cls4);
                                    }
                                    if (jVar != null) {
                                        nVar = jVar;
                                    } else {
                                        nVar = new n();
                                    }
                                }
                            }
                        } else {
                            if (k.f5796c) {
                                nVar = new k();
                            } else {
                                nVar = null;
                            }
                            if (nVar == null) {
                                property = System.getProperty("java.specification.version", "unknown");
                                jc.i.d(property, "jvmVersion");
                                if (Integer.parseInt(property) < 9) {
                                    Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method4 = cls5.getMethod("put", SSLSocket.class, cls6);
                                    Method method5 = cls5.getMethod("get", SSLSocket.class);
                                    Method method6 = cls5.getMethod("remove", SSLSocket.class);
                                    jc.i.d(method4, "putMethod");
                                    jc.i.d(method5, "getMethod");
                                    jc.i.d(method6, "removeMethod");
                                    jc.i.d(cls7, "clientProviderClass");
                                    jc.i.d(cls8, "serverProviderClass");
                                    jVar = new j(method4, method5, method6, cls7, cls8);
                                }
                                if (jVar != null) {
                                    nVar = jVar;
                                } else {
                                    nVar = new n();
                                }
                            }
                        }
                    }
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (k.f5796c) {
                        nVar = new k();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        property = System.getProperty("java.specification.version", "unknown");
                        jc.i.d(property, "jvmVersion");
                        if (Integer.parseInt(property) < 9) {
                            Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method method7 = cls9.getMethod("put", SSLSocket.class, cls10);
                            Method method8 = cls9.getMethod("get", SSLSocket.class);
                            Method method9 = cls9.getMethod("remove", SSLSocket.class);
                            jc.i.d(method7, "putMethod");
                            jc.i.d(method8, "getMethod");
                            jc.i.d(method9, "removeMethod");
                            jc.i.d(cls11, "clientProviderClass");
                            jc.i.d(cls12, "serverProviderClass");
                            jVar = new j(method7, method8, method9, cls11, cls12);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                } else {
                    if (m.f5797d) {
                        nVar = new m();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if (k.f5796c) {
                            nVar = new k();
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            property = System.getProperty("java.specification.version", "unknown");
                            jc.i.d(property, "jvmVersion");
                            if (Integer.parseInt(property) < 9) {
                                Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method method10 = cls13.getMethod("put", SSLSocket.class, cls14);
                                Method method11 = cls13.getMethod("get", SSLSocket.class);
                                Method method12 = cls13.getMethod("remove", SSLSocket.class);
                                jc.i.d(method10, "putMethod");
                                jc.i.d(method11, "getMethod");
                                jc.i.d(method12, "removeMethod");
                                jc.i.d(cls15, "clientProviderClass");
                                jc.i.d(cls16, "serverProviderClass");
                                jVar = new j(method10, method11, method12, cls15, cls16);
                            }
                            if (jVar != null) {
                                nVar = jVar;
                            } else {
                                nVar = new n();
                            }
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (e.f5784d) {
                nVar = new e();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (k.f5796c) {
                        nVar = new k();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        property = System.getProperty("java.specification.version", "unknown");
                        jc.i.d(property, "jvmVersion");
                        if (Integer.parseInt(property) < 9) {
                            Class<?> cls17 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls18 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> cls19 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> cls110 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method method13 = cls17.getMethod("put", SSLSocket.class, cls18);
                            Method method14 = cls17.getMethod("get", SSLSocket.class);
                            Method method15 = cls17.getMethod("remove", SSLSocket.class);
                            jc.i.d(method13, "putMethod");
                            jc.i.d(method14, "getMethod");
                            jc.i.d(method15, "removeMethod");
                            jc.i.d(cls19, "clientProviderClass");
                            jc.i.d(cls110, "serverProviderClass");
                            jVar = new j(method13, method14, method15, cls19, cls110);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                } else {
                    if (m.f5797d) {
                        nVar = new m();
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        if (k.f5796c) {
                            nVar = new k();
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            property = System.getProperty("java.specification.version", "unknown");
                            jc.i.d(property, "jvmVersion");
                            if (Integer.parseInt(property) < 9) {
                                Class<?> cls111 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls112 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> cls113 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> cls114 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method method16 = cls111.getMethod("put", SSLSocket.class, cls112);
                                Method method17 = cls111.getMethod("get", SSLSocket.class);
                                Method method18 = cls111.getMethod("remove", SSLSocket.class);
                                jc.i.d(method16, "putMethod");
                                jc.i.d(method17, "getMethod");
                                jc.i.d(method18, "removeMethod");
                                jc.i.d(cls113, "clientProviderClass");
                                jc.i.d(cls114, "serverProviderClass");
                                jVar = new j(method16, method17, method18, cls113, cls114);
                            }
                            if (jVar != null) {
                                nVar = jVar;
                            } else {
                                nVar = new n();
                            }
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (k.f5796c) {
                nVar = new k();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                property = System.getProperty("java.specification.version", "unknown");
                try {
                    jc.i.d(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        try {
                            Class<?> cls115 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls116 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> cls117 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> cls118 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method method19 = cls115.getMethod("put", SSLSocket.class, cls116);
                            Method method110 = cls115.getMethod("get", SSLSocket.class);
                            Method method111 = cls115.getMethod("remove", SSLSocket.class);
                            jc.i.d(method19, "putMethod");
                            jc.i.d(method110, "getMethod");
                            jc.i.d(method111, "removeMethod");
                            jc.i.d(cls117, "clientProviderClass");
                            jc.i.d(cls118, "serverProviderClass");
                            jVar = new j(method19, method110, method111, cls117, cls118);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (jVar != null) {
                    nVar = jVar;
                } else {
                    nVar = new n();
                }
            }
        } else {
            if (m.f5797d) {
                nVar = new m();
            } else {
                nVar = null;
            }
            if (nVar == null) {
                if (k.f5796c) {
                    nVar = new k();
                } else {
                    nVar = null;
                }
                if (nVar == null) {
                    property = System.getProperty("java.specification.version", "unknown");
                    jc.i.d(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        Class<?> cls119 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls1110 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> cls1111 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> cls1112 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method method112 = cls119.getMethod("put", SSLSocket.class, cls1110);
                        Method method113 = cls119.getMethod("get", SSLSocket.class);
                        Method method114 = cls119.getMethod("remove", SSLSocket.class);
                        jc.i.d(method112, "putMethod");
                        jc.i.d(method113, "getMethod");
                        jc.i.d(method114, "removeMethod");
                        jc.i.d(cls1111, "clientProviderClass");
                        jc.i.d(cls1112, "serverProviderClass");
                        jVar = new j(method112, method113, method114, cls1111, cls1112);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new n();
                    }
                }
            }
        }
        f5799a = nVar;
        f5800b = Logger.getLogger(s.class.getName());
    }

    public static void i(int i, String str, Throwable th) {
        jc.i.e(str, "message");
        f5800b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public r7.g b(X509TrustManager x509TrustManager) {
        return new nd.a(c(x509TrustManager));
    }

    public nd.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        jc.i.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new nd.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        jc.i.e(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        jc.i.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f5800b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        jc.i.e(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        jc.i.e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        jc.i.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            jc.i.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        jc.i.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                jc.i.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        jc.i.d(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}

package jd;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends n {
    public static final boolean e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ac.f f5783d;

    static {
        boolean z4 = false;
        if (z9.c.m() && Build.VERSION.SDK_INT < 30) {
            z4 = true;
        }
        e = z4;
    }

    public c() throws NoSuchMethodException {
        kd.n nVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            nVar = new kd.n(cls);
        } catch (Exception e4) {
            n.f5799a.getClass();
            n.i(5, "unable to load android socket classes", e4);
            nVar = null;
        }
        int i = 0;
        ArrayList arrayListO = vb.h.O(new kd.m[]{nVar, new kd.l(kd.f.f6217f), new kd.l(kd.j.f6223a), new kd.l(kd.h.f6222a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListO.size();
        while (i < size) {
            Object obj = arrayListO.get(i);
            i++;
            if (((kd.m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f5782c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f5783d = new ac.f(method3, method2, method);
    }

    @Override // jd.n
    public final r7.g b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        kd.b bVar = x509TrustManagerExtensions != null ? new kd.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new nd.a(c(x509TrustManager));
    }

    @Override // jd.n
    public final nd.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // jd.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        jc.i.e(list, "protocols");
        ArrayList arrayList = this.f5782c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((kd.m) obj).a(sSLSocket));
        kd.m mVar = (kd.m) obj;
        if (mVar != null) {
            mVar.c(sSLSocket, str, list);
        }
    }

    @Override // jd.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        jc.i.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // jd.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f5782c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((kd.m) obj).a(sSLSocket));
        kd.m mVar = (kd.m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @Override // jd.n
    public final Object g() {
        ac.f fVar = this.f5783d;
        fVar.getClass();
        Method method = fVar.f282a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = fVar.f283b;
                jc.i.b(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // jd.n
    public final boolean h(String str) {
        jc.i.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // jd.n
    public final void j(Object obj, String str) {
        jc.i.e(str, "message");
        ac.f fVar = this.f5783d;
        fVar.getClass();
        if (obj != null) {
            try {
                Method method = fVar.f284c;
                jc.i.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(5, str, null);
    }
}

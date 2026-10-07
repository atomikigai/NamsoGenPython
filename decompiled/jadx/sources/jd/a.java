package jd;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f5778d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5779c;

    static {
        f5778d = z9.c.m() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i = 0;
        ArrayList arrayListO = vb.h.O(new kd.m[]{(!z9.c.m() || Build.VERSION.SDK_INT < 29) ? null : new kd.a(), new kd.l(kd.f.f6217f), new kd.l(kd.j.f6223a), new kd.l(kd.h.f6222a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListO.size();
        while (i < size) {
            Object obj = arrayListO.get(i);
            i++;
            if (((kd.m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f5779c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        jc.i.e(list, "protocols");
        ArrayList arrayList = this.f5779c;
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f5779c;
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
    public final boolean h(String str) {
        jc.i.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}

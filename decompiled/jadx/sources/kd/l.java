package kd;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f6225b;

    public l(k kVar) {
        this.f6224a = kVar;
    }

    @Override // kd.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f6224a.a(sSLSocket);
    }

    @Override // kd.m
    public final String b(SSLSocket sSLSocket) {
        m mVarD = d(sSLSocket);
        if (mVarD != null) {
            return mVarD.b(sSLSocket);
        }
        return null;
    }

    @Override // kd.m
    public final void c(SSLSocket sSLSocket, String str, List list) {
        jc.i.e(list, "protocols");
        m mVarD = d(sSLSocket);
        if (mVarD != null) {
            mVarD.c(sSLSocket, str, list);
        }
    }

    public final synchronized m d(SSLSocket sSLSocket) {
        try {
            if (this.f6225b == null && this.f6224a.a(sSLSocket)) {
                this.f6225b = this.f6224a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6225b;
    }

    @Override // kd.m
    public final boolean isSupported() {
        return true;
    }
}

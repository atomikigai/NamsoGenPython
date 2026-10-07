package kd;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements k {
    @Override // kd.k
    public final boolean a(SSLSocket sSLSocket) {
        return jd.h.f5787d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // kd.k
    public final m b(SSLSocket sSLSocket) {
        return new j();
    }
}

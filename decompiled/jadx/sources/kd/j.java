package kd;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f6223a = new i();

    @Override // kd.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // kd.m
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // kd.m
    public final void c(SSLSocket sSLSocket, String str, List list) {
        jc.i.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            jd.n nVar = jd.n.f5799a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) z9.c.h(list).toArray(new String[0]));
        }
    }

    @Override // kd.m
    public final boolean isSupported() {
        boolean z4 = jd.h.f5787d;
        return jd.h.f5787d;
    }
}

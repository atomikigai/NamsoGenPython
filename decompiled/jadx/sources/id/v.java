package id;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends od.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f5335m;

    public v(w wVar) {
        this.f5335m = wVar;
    }

    @Override // od.e
    public final void j() {
        this.f5335m.e(9);
        o oVar = this.f5335m.f5337b;
        synchronized (oVar) {
            long j4 = oVar.f5309y;
            long j10 = oVar.f5308x;
            if (j4 < j10) {
                return;
            }
            oVar.f5308x = j10 + 1;
            oVar.f5310z = System.nanoTime() + ((long) 1000000000);
            oVar.f5303s.c(new ed.b(q1.a.m(new StringBuilder(), oVar.f5299c, " ping"), oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}

package i3;

import y1.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f5188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5189b = new c(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5190c = new d(3);

    public n(v vVar) {
        this.f5188a = vVar;
    }

    public final Object a(final long j4, ac.i iVar) {
        Object objW = n9.b.w(new ic.l() { // from class: i3.m
            @Override // ic.l
            public final Object invoke(Object obj) throws Exception {
                long j10 = j4;
                g2.a aVar = (g2.a) obj;
                jc.i.e(aVar, "_connection");
                g2.c cVarR = aVar.R("DELETE FROM notifications WHERE receivedAt < ?");
                try {
                    cVarR.b(1, j10);
                    cVarR.O();
                    return ub.k.f9073a;
                } finally {
                    cVarR.close();
                }
            }
        }, this.f5188a, iVar, false, true);
        return objW == zb.a.f11555a ? objW : ub.k.f9073a;
    }
}

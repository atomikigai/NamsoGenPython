package m2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.e f7013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7014b;

    public o(p pVar, r.e eVar) {
        this.f7014b = pVar;
        this.f7013a = eVar;
    }

    @Override // m2.l
    public final void c(m mVar) {
        ((ArrayList) this.f7013a.get(this.f7014b.f7016b)).remove(mVar);
        mVar.u(this);
    }
}

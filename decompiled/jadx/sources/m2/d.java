package m2;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6982a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6983b;

    public d(ViewGroup viewGroup) {
        this.f6983b = viewGroup;
    }

    @Override // m2.n, m2.l
    public final void a() {
        gb.p.c(this.f6983b, false);
    }

    @Override // m2.n, m2.l
    public final void b() {
        gb.p.c(this.f6983b, false);
        this.f6982a = true;
    }

    @Override // m2.l
    public final void c(m mVar) {
        if (!this.f6982a) {
            gb.p.c(this.f6983b, false);
        }
        mVar.u(this);
    }

    @Override // m2.n, m2.l
    public final void e() {
        gb.p.c(this.f6983b, true);
    }
}

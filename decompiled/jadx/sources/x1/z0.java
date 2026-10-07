package x1;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10254a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f10255b;

    public z0(w wVar) {
        this.f10255b = wVar;
    }

    @Override // x1.k0
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f10254a) {
            this.f10254a = false;
            this.f10255b.h();
        }
    }

    @Override // x1.k0
    public final void b(RecyclerView recyclerView, int i, int i10) {
        if (i == 0 && i10 == 0) {
            return;
        }
        this.f10254a = true;
    }
}

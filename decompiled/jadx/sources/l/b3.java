package l;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6239b;

    public /* synthetic */ b3(Toolbar toolbar, int i) {
        this.f6238a = i;
        this.f6239b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6238a) {
            case 0:
                d3 d3Var = this.f6239b.W;
                k.n nVar = d3Var == null ? null : d3Var.f6258b;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f6239b.n();
                break;
        }
    }
}

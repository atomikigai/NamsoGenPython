package l;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f6379b;

    public /* synthetic */ o2(SearchView searchView, int i) {
        this.f6378a = i;
        this.f6379b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6378a) {
            case 0:
                this.f6379b.s();
                break;
            default:
                v0.b bVar = this.f6379b.f496c0;
                if (bVar instanceof x2) {
                    bVar.b(null);
                }
                break;
        }
    }
}

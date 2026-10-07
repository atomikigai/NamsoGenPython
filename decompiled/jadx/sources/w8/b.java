package w8;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f9728b;

    public /* synthetic */ b(d dVar, int i) {
        this.f9727a = i;
        this.f9728b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9727a) {
            case 0:
                d dVar = this.f9728b;
                if (dVar.e > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                break;
            default:
                d dVar2 = this.f9728b;
                ((n) dVar2.getCurrentDrawable()).e(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.getClass();
                break;
        }
    }
}

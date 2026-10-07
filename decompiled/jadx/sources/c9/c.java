package c9;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1812c;

    public /* synthetic */ c(Object obj, int i, int i10) {
        this.f1810a = i10;
        this.f1812c = obj;
        this.f1811b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1810a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1812c;
                View view = (View) sideSheetBehavior.f2505p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, false, this.f1811b);
                }
                break;
            default:
                ((g0.b) this.f1812c).g(this.f1811b);
                break;
        }
    }
}

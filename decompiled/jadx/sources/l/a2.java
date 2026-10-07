package l;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6234b;

    public /* synthetic */ a2(Object obj, int i) {
        this.f6233a = i;
        this.f6234b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f6233a) {
            case 0:
                c2 c2Var = (c2) this.f6234b;
                if (c2Var.K.isShowing()) {
                    c2Var.h();
                }
                break;
            default:
                x2 x2Var = (x2) this.f6234b;
                x2Var.f9106a = true;
                x2Var.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f6233a) {
            case 0:
                ((c2) this.f6234b).dismiss();
                break;
            default:
                x2 x2Var = (x2) this.f6234b;
                x2Var.f9106a = false;
                x2Var.notifyDataSetInvalidated();
                break;
        }
    }
}

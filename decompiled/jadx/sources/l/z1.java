package l;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f6507b;

    public /* synthetic */ z1(c2 c2Var, int i) {
        this.f6506a = i;
        this.f6507b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6506a;
        c2 c2Var = this.f6507b;
        switch (i) {
            case 0:
                r1 r1Var = c2Var.f6244c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                }
                break;
            default:
                r1 r1Var2 = c2Var.f6244c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = q0.v0.f7946a;
                    if (q0.g0.b(r1Var2) && c2Var.f6244c.getCount() > c2Var.f6244c.getChildCount() && c2Var.f6244c.getChildCount() <= c2Var.f6253x) {
                        c2Var.K.setInputMethodMode(2);
                        c2Var.h();
                        break;
                    }
                }
                break;
        }
    }
}

package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.g0;
import l.h0;
import l.i2;
import l.m0;
import l.p0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5819b;

    public /* synthetic */ d(Object obj, int i) {
        this.f5818a = i;
        this.f5819b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f5818a;
        Object obj = this.f5819b;
        switch (i) {
            case 0:
                f fVar = (f) obj;
                ArrayList arrayList = fVar.f5841s;
                if (fVar.a() && arrayList.size() > 0) {
                    int i10 = 0;
                    if (!((e) arrayList.get(0)).f5833a.J) {
                        View view = fVar.f5848z;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i10 < size) {
                                Object obj2 = arrayList.get(i10);
                                i10++;
                                ((e) obj2).f5833a.h();
                            }
                        } else {
                            fVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            case 1:
                d0 d0Var = (d0) obj;
                i2 i2Var = d0Var.f5825s;
                if (d0Var.a() && !i2Var.J) {
                    View view2 = d0Var.f5830x;
                    if (view2 != null && view2.isShown()) {
                        i2Var.h();
                    } else {
                        d0Var.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                p0 p0Var = (p0) obj;
                if (!p0Var.getInternalPopup().a()) {
                    p0Var.f6389f.n(h0.b(p0Var), h0.a(p0Var));
                }
                ViewTreeObserver viewTreeObserver = p0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    g0.a(viewTreeObserver, this);
                }
                break;
            default:
                m0 m0Var = (m0) obj;
                p0 p0Var2 = m0Var.R;
                m0Var.getClass();
                WeakHashMap weakHashMap = v0.f7946a;
                if (q0.g0.b(p0Var2) && p0Var2.getGlobalVisibleRect(m0Var.P)) {
                    m0Var.s();
                    m0Var.h();
                } else {
                    m0Var.dismiss();
                }
                break;
        }
    }
}

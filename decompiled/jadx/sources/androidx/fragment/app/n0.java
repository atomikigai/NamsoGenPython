package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f945b;

    public /* synthetic */ n0(Object obj, int i) {
        this.f944a = i;
        this.f945b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f944a;
        Object obj = this.f945b;
        switch (i) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = q0.v0.f7946a;
                q0.h0.c(view2);
                break;
            case 1:
                g9.p pVar = (g9.p) obj;
                AccessibilityManager accessibilityManager = pVar.E;
                if (pVar.F != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap2 = q0.v0.f7946a;
                    if (q0.g0.b(pVar)) {
                        r0.c.a(accessibilityManager, pVar.F);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f944a) {
            case 0:
                break;
            case 1:
                g9.p pVar = (g9.p) this.f945b;
                r0.d dVar = pVar.F;
                if (dVar != null && (accessibilityManager = pVar.E) != null) {
                    r0.c.b(accessibilityManager, dVar);
                    break;
                }
                break;
            case 2:
                k.f fVar = (k.f) this.f945b;
                ViewTreeObserver viewTreeObserver = fVar.I;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.I = view.getViewTreeObserver();
                    }
                    fVar.I.removeGlobalOnLayoutListener(fVar.f5842t);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                k.d0 d0Var = (k.d0) this.f945b;
                ViewTreeObserver viewTreeObserver2 = d0Var.f5832z;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f5832z = view.getViewTreeObserver();
                    }
                    d0Var.f5832z.removeGlobalOnLayoutListener(d0Var.f5826t);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}

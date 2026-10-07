package q0;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f7895a;

    public e1(View view) {
        this.f7895a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f7895a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f7895a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = (View) this.f7895a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(f1 f1Var) {
        View view = (View) this.f7895a.get();
        if (view != null) {
            if (f1Var != null) {
                view.animate().setListener(new m2.j(f1Var, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f7895a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}

package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends g0.b {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f6406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0 f6407k;

    public r0(w0 w0Var, int i, int i10, WeakReference weakReference) {
        this.f6407k = w0Var;
        this.h = i;
        this.i = i10;
        this.f6406j = weakReference;
    }

    @Override // g0.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.h) != -1) {
            typeface = v0.a(typeface, i, (this.i & 2) != 0);
        }
        w0 w0Var = this.f6407k;
        if (w0Var.f6458m) {
            w0Var.f6457l = typeface;
            TextView textView = (TextView) this.f6406j.get();
            if (textView != null) {
                WeakHashMap weakHashMap = q0.v0.f7946a;
                if (q0.g0.b(textView)) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.f6455j, 4));
                } else {
                    textView.setTypeface(typeface, w0Var.f6455j);
                }
            }
        }
    }

    @Override // g0.b
    public final void g(int i) {
    }
}

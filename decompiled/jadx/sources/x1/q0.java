package x1;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10178d;
    public Interpolator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10180g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f10178d;
        if (i >= 0) {
            this.f10178d = -1;
            recyclerView.Q(i);
            this.f10179f = false;
            return;
        }
        if (!this.f10179f) {
            this.f10180g = 0;
            return;
        }
        Interpolator interpolator = this.e;
        if (interpolator != null && this.f10177c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i10 = this.f10177c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1150p0.c(this.f10175a, this.f10176b, i10, interpolator);
        int i11 = this.f10180g + 1;
        this.f10180g = i11;
        if (i11 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f10179f = false;
    }
}

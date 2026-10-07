package x1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends f0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final v9.i0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f10116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f10117d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f10119g;
    public final Drawable h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10124n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10125o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10126p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f10129s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f10136z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10127q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10128r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10130t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10131u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10132v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10133w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f10134x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f10135y = new int[2];

    public k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10136z = valueAnimatorOfFloat;
        this.A = 0;
        v9.i0 i0Var = new v9.i0(this, 2);
        this.B = i0Var;
        j jVar = new j(this);
        this.f10116c = stateListDrawable;
        this.f10117d = drawable;
        this.f10119g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f10118f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f10120j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f10114a = i10;
        this.f10115b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new t8.c(this));
        valueAnimatorOfFloat.addUpdateListener(new f9.b(this, 3));
        RecyclerView recyclerView2 = this.f10129s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.A;
            h0 h0Var = recyclerView2.f1166y;
            if (h0Var != null) {
                h0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f10129s;
            recyclerView3.B.remove(this);
            if (recyclerView3.C == this) {
                recyclerView3.C = null;
            }
            ArrayList arrayList2 = this.f10129s.f1159u0;
            if (arrayList2 != null) {
                arrayList2.remove(jVar);
            }
            this.f10129s.removeCallbacks(i0Var);
        }
        this.f10129s = recyclerView;
        recyclerView.i(this);
        this.f10129s.B.add(this);
        this.f10129s.j(jVar);
    }

    public static int e(float f10, float f11, int[] iArr, int i, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i - i11;
            int i14 = (int) (((f11 - f10) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    @Override // x1.f0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f10127q;
        RecyclerView recyclerView2 = this.f10129s;
        if (i != recyclerView2.getWidth() || this.f10128r != recyclerView2.getHeight()) {
            this.f10127q = recyclerView2.getWidth();
            this.f10128r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.f10130t) {
                int i10 = this.f10127q;
                int i11 = this.e;
                int i12 = i10 - i11;
                int i13 = this.f10122l;
                int i14 = this.f10121k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f10116c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f10118f;
                int i17 = this.f10128r;
                Drawable drawable = this.f10117d;
                drawable.setBounds(0, 0, i16, i17);
                WeakHashMap weakHashMap = q0.v0.f7946a;
                if (q0.e0.d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f10131u) {
                int i18 = this.f10128r;
                int i19 = this.i;
                int i20 = i18 - i19;
                int i21 = this.f10125o;
                int i22 = this.f10124n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f10119g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f10127q;
                int i25 = this.f10120j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    public final boolean c(float f10, float f11) {
        if (f11 < this.f10128r - this.i) {
            return false;
        }
        int i = this.f10125o;
        int i10 = this.f10124n;
        return f10 >= ((float) (i - (i10 / 2))) && f10 <= ((float) ((i10 / 2) + i));
    }

    public final boolean d(float f10, float f11) {
        WeakHashMap weakHashMap = q0.v0.f7946a;
        int iD = q0.e0.d(this.f10129s);
        int i = this.e;
        if (iD == 1) {
            if (f10 > i) {
                return false;
            }
        } else if (f10 < this.f10127q - i) {
            return false;
        }
        int i10 = this.f10122l;
        int i11 = this.f10121k / 2;
        return f11 >= ((float) (i10 - i11)) && f11 <= ((float) (i11 + i10));
    }

    public final void f(int i) {
        v9.i0 i0Var = this.B;
        StateListDrawable stateListDrawable = this.f10116c;
        if (i == 2 && this.f10132v != 2) {
            stateListDrawable.setState(C);
            this.f10129s.removeCallbacks(i0Var);
        }
        if (i == 0) {
            this.f10129s.invalidate();
        } else {
            g();
        }
        if (this.f10132v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.f10129s.removeCallbacks(i0Var);
            this.f10129s.postDelayed(i0Var, 1200);
        } else if (i == 1) {
            this.f10129s.removeCallbacks(i0Var);
            this.f10129s.postDelayed(i0Var, 1500);
        }
        this.f10132v = i;
    }

    public final void g() {
        int i = this.A;
        ValueAnimator valueAnimator = this.f10136z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}

package x1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10204a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f10205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f10206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10207d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f10208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f10209g;
    public boolean h;
    public final LinearInterpolator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f10210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f10211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f10212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10216p;

    public t(Context context) {
        q0 q0Var = new q0();
        q0Var.f10178d = -1;
        q0Var.f10179f = false;
        q0Var.f10180g = 0;
        q0Var.f10175a = 0;
        q0Var.f10176b = 0;
        q0Var.f10177c = Integer.MIN_VALUE;
        q0Var.e = null;
        this.f10209g = q0Var;
        this.i = new LinearInterpolator();
        this.f10210j = new DecelerateInterpolator();
        this.f10213m = false;
        this.f10215o = 0;
        this.f10216p = 0;
        this.f10212l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public int b(View view, int i) {
        h0 h0Var = this.f10206c;
        if (h0Var == null || !h0Var.d()) {
            return 0;
        }
        i0 i0Var = (i0) view.getLayoutParams();
        return a((view.getLeft() - ((i0) view.getLayoutParams()).f10106b.left) - ((ViewGroup.MarginLayoutParams) i0Var).leftMargin, view.getRight() + ((i0) view.getLayoutParams()).f10106b.right + ((ViewGroup.MarginLayoutParams) i0Var).rightMargin, h0Var.C(), h0Var.f10092n - h0Var.D(), i);
    }

    public int c(View view, int i) {
        h0 h0Var = this.f10206c;
        if (h0Var == null || !h0Var.e()) {
            return 0;
        }
        i0 i0Var = (i0) view.getLayoutParams();
        return a((view.getTop() - ((i0) view.getLayoutParams()).f10106b.top) - ((ViewGroup.MarginLayoutParams) i0Var).topMargin, view.getBottom() + ((i0) view.getLayoutParams()).f10106b.bottom + ((ViewGroup.MarginLayoutParams) i0Var).bottomMargin, h0Var.E(), h0Var.f10093o - h0Var.B(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f10213m) {
            this.f10214n = d(this.f10212l);
            this.f10213m = true;
        }
        return (int) Math.ceil(fAbs * this.f10214n);
    }

    public PointF f(int i) {
        Object obj = this.f10206c;
        if (obj instanceof r0) {
            return ((r0) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + r0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    public final void g(int i, int i10) {
        PointF pointFF;
        RecyclerView recyclerView = this.f10205b;
        if (this.f10204a == -1 || recyclerView == null) {
            i();
        }
        if (this.f10207d && this.f10208f == null && this.f10206c != null && (pointFF = f(this.f10204a)) != null) {
            float f10 = pointFF.x;
            if (f10 != 0.0f || pointFF.y != 0.0f) {
                recyclerView.f0(null, (int) Math.signum(f10), (int) Math.signum(pointFF.y));
            }
        }
        this.f10207d = false;
        View view = this.f10208f;
        q0 q0Var = this.f10209g;
        if (view != null) {
            this.f10205b.getClass();
            w0 w0VarM = RecyclerView.M(view);
            if ((w0VarM != null ? w0VarM.b() : -1) == this.f10204a) {
                View view2 = this.f10208f;
                s0 s0Var = recyclerView.f1155s0;
                h(view2, q0Var);
                q0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f10208f = null;
            }
        }
        if (this.e) {
            s0 s0Var2 = recyclerView.f1155s0;
            if (this.f10205b.f1166y.v() == 0) {
                i();
            } else {
                int i11 = this.f10215o;
                int i12 = i11 - i;
                if (i11 * i12 <= 0) {
                    i12 = 0;
                }
                this.f10215o = i12;
                int i13 = this.f10216p;
                int i14 = i13 - i10;
                if (i13 * i14 <= 0) {
                    i14 = 0;
                }
                this.f10216p = i14;
                if (i12 == 0 && i14 == 0) {
                    PointF pointFF2 = f(this.f10204a);
                    if (pointFF2 != null) {
                        float f11 = pointFF2.x;
                        if (f11 == 0.0f && pointFF2.y == 0.0f) {
                            q0Var.f10178d = this.f10204a;
                            i();
                        } else {
                            float f12 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                            float f13 = pointFF2.x / fSqrt;
                            pointFF2.x = f13;
                            float f14 = pointFF2.y / fSqrt;
                            pointFF2.y = f14;
                            this.f10211k = pointFF2;
                            this.f10215o = (int) (f13 * 10000.0f);
                            this.f10216p = (int) (f14 * 10000.0f);
                            int iE = e(10000);
                            int i15 = (int) (this.f10215o * 1.2f);
                            int i16 = (int) (this.f10216p * 1.2f);
                            q0Var.f10175a = i15;
                            q0Var.f10176b = i16;
                            q0Var.f10177c = (int) (iE * 1.2f);
                            q0Var.e = this.i;
                            q0Var.f10179f = true;
                        }
                    } else {
                        q0Var.f10178d = this.f10204a;
                        i();
                    }
                }
            }
            boolean z4 = q0Var.f10178d >= 0;
            q0Var.a(recyclerView);
            if (z4 && this.e) {
                this.f10207d = true;
                recyclerView.f1150p0.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void h(View view, q0 q0Var) {
        int i;
        PointF pointF = this.f10211k;
        int i10 = 0;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 == 0.0f) {
                i = 0;
            } else {
                i = f10 > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iB = b(view, i);
        PointF pointF2 = this.f10211k;
        if (pointF2 != null) {
            float f11 = pointF2.y;
            if (f11 != 0.0f) {
                i10 = f11 > 0.0f ? 1 : -1;
            }
        }
        int iC = c(view, i10);
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            q0Var.f10175a = -iB;
            q0Var.f10176b = -iC;
            q0Var.f10177c = iCeil;
            q0Var.e = this.f10210j;
            q0Var.f10179f = true;
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.f10216p = 0;
            this.f10215o = 0;
            this.f10211k = null;
            this.f10205b.f1155s0.f10193a = -1;
            this.f10208f = null;
            this.f10204a = -1;
            this.f10207d = false;
            h0 h0Var = this.f10206c;
            if (h0Var.e == this) {
                h0Var.e = null;
            }
            this.f10206c = null;
            this.f10205b = null;
        }
    }
}

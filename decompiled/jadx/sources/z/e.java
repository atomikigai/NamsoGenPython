package z;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10766d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10768g;
    public final /* synthetic */ ConstraintLayout h;

    public e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f10763a = constraintLayout2;
    }

    public static boolean a(int i, int i10, int i11) {
        if (i == i10) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
        }
        return false;
    }

    public final void b(w.d dVar, x.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z4;
        int measuredWidth;
        int baseline;
        int i;
        if (dVar == null) {
            return;
        }
        w.c cVar = dVar.K;
        w.c cVar2 = dVar.I;
        if (dVar.f9377g0 == 8) {
            bVar.e = 0;
            bVar.f9971f = 0;
            bVar.f9972g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        int i10 = bVar.f9967a;
        int i11 = bVar.f9968b;
        int i12 = bVar.f9969c;
        int i13 = bVar.f9970d;
        int i14 = this.f10764b + this.f10765c;
        int i15 = this.f10766d;
        View view = dVar.f9375f0;
        int iD = u.e.d(i10);
        if (iD == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else if (iD == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f10767f, i15, -2);
        } else if (iD == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f10767f, i15, -2);
            boolean z10 = dVar.f9394r == 1;
            int i16 = bVar.f9973j;
            if (i16 == 1 || i16 == 2) {
                boolean z11 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f9973j == 2 || !z10 || ((z10 && z11) || dVar.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (iD != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i17 = this.f10767f;
            int i18 = cVar2 != null ? cVar2.f9364g : 0;
            if (cVar != null) {
                i18 += cVar.f9364g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
        }
        int iD2 = u.e.d(i11);
        if (iD2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (iD2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f10768g, i14, -2);
        } else if (iD2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f10768g, i14, -2);
            boolean z12 = dVar.f9395s == 1;
            int i19 = bVar.f9973j;
            if (i19 == 1 || i19 == 2) {
                boolean z13 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f9973j == 2 || !z12 || ((z12 && z13) || dVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iD2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i20 = this.f10768g;
            int i21 = cVar2 != null ? dVar.J.f9364g : 0;
            if (cVar != null) {
                i21 += dVar.L.f9364g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i20, i14 + i21, -1);
        }
        w.e eVar = (w.e) dVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (eVar != null && w.j.c(constraintLayout.f558t, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f9366a0 && !dVar.z() && a(dVar.G, iMakeMeasureSpec, dVar.q()) && a(dVar.H, iMakeMeasureSpec2, dVar.k())) {
            bVar.e = dVar.q();
            bVar.f9971f = dVar.k();
            bVar.f9972g = dVar.f9366a0;
            return;
        }
        boolean z14 = i10 == 3;
        boolean z15 = i11 == 3;
        boolean z16 = i11 == 4 || i11 == 1;
        boolean z17 = i10 == 4 || i10 == 1;
        boolean z18 = z14 && dVar.W > 0.0f;
        boolean z19 = z15 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        d dVar2 = (d) view.getLayoutParams();
        int i22 = bVar.f9973j;
        if (i22 != 1 && i22 != 2 && z14 && dVar.f9394r == 0 && z15 && dVar.f9395s == 0) {
            z4 = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof s) && (dVar instanceof w.g)) {
                ((s) view).j((w.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.G = iMakeMeasureSpec;
            dVar.H = iMakeMeasureSpec2;
            dVar.f9376g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i23 = dVar.f9397u;
            int iMax2 = i23 > 0 ? Math.max(i23, measuredWidth2) : measuredWidth2;
            int i24 = dVar.f9398v;
            if (i24 > 0) {
                iMax2 = Math.min(i24, iMax2);
            }
            int i25 = dVar.f9400x;
            iMax = i25 > 0 ? Math.max(i25, measuredHeight) : measuredHeight;
            int i26 = iMakeMeasureSpec2;
            int i27 = dVar.f9401y;
            if (i27 > 0) {
                iMax = Math.min(i27, iMax);
            }
            if (!w.j.c(constraintLayout.f558t, 1)) {
                if (z18 && z16) {
                    iMax2 = (int) ((iMax * dVar.W) + 0.5f);
                } else if (z19 && z17) {
                    iMax = (int) ((iMax2 / dVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z4 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i26;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                dVar.G = iMakeMeasureSpec;
                dVar.H = iMakeMeasureSpec3;
                z4 = false;
                dVar.f9376g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z20 = baseline != i ? true : z4;
        bVar.i = (measuredWidth == bVar.f9969c && iMax == bVar.f9970d) ? z4 : true;
        boolean z21 = dVar2.f10730c0 ? true : z20;
        if (z21 && baseline != -1 && dVar.f9366a0 != baseline) {
            bVar.i = true;
        }
        bVar.e = measuredWidth;
        bVar.f9971f = iMax;
        bVar.h = z21;
        bVar.f9972g = baseline;
    }
}

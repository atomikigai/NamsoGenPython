package c9;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f1807b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1806a = i;
        this.f1807b = sideSheetBehavior;
    }

    @Override // jd.d
    public final boolean A(float f10) {
        switch (this.f1806a) {
            case 0:
                return f10 > 0.0f;
            default:
                return f10 < 0.0f;
        }
    }

    @Override // jd.d
    public final boolean B(View view) {
        switch (this.f1806a) {
            case 0:
                return view.getRight() < (q() - r()) / 2;
            default:
                return view.getLeft() > (q() + this.f1807b.f2502m) / 2;
        }
    }

    @Override // jd.d
    public final boolean C(float f10, float f11) {
        switch (this.f1806a) {
            case 0:
                return Math.abs(f10) > Math.abs(f11) && Math.abs(f10) > ((float) 500);
            default:
                return Math.abs(f10) > Math.abs(f11) && Math.abs(f10) > ((float) 500);
        }
    }

    @Override // jd.d
    public final boolean I(View view, float f10) {
        switch (this.f1806a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1807b;
                float fAbs = Math.abs((f10 * sideSheetBehavior.f2500k) + left);
                sideSheetBehavior.getClass();
                return fAbs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1807b;
                float fAbs2 = Math.abs((f10 * sideSheetBehavior2.f2500k) + right);
                sideSheetBehavior2.getClass();
                return fAbs2 > 0.5f;
        }
    }

    @Override // jd.d
    public final void N(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i10) {
        switch (this.f1806a) {
            case 0:
                if (i <= this.f1807b.f2502m) {
                    marginLayoutParams.leftMargin = i10;
                }
                break;
            default:
                int i11 = this.f1807b.f2502m;
                if (i <= i11) {
                    marginLayoutParams.rightMargin = i11 - i;
                }
                break;
        }
    }

    @Override // jd.d
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1806a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // jd.d
    public final float e(int i) {
        switch (this.f1806a) {
            case 0:
                float fR = r();
                return (i - fR) / (q() - fR);
            default:
                float f10 = this.f1807b.f2502m;
                return (f10 - i) / (f10 - q());
        }
    }

    @Override // jd.d
    public final int q() {
        switch (this.f1806a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1807b;
                return Math.max(0, sideSheetBehavior.f2503n + sideSheetBehavior.f2504o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1807b;
                return Math.max(0, (sideSheetBehavior2.f2502m - sideSheetBehavior2.f2501l) - sideSheetBehavior2.f2504o);
        }
    }

    @Override // jd.d
    public final int r() {
        switch (this.f1806a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1807b;
                return (-sideSheetBehavior.f2501l) - sideSheetBehavior.f2504o;
            default:
                return this.f1807b.f2502m;
        }
    }

    @Override // jd.d
    public final int t() {
        switch (this.f1806a) {
            case 0:
                return this.f1807b.f2504o;
            default:
                return this.f1807b.f2502m;
        }
    }

    @Override // jd.d
    public final int u() {
        switch (this.f1806a) {
            case 0:
                return -this.f1807b.f2501l;
            default:
                return q();
        }
    }

    @Override // jd.d
    public final int v(View view) {
        switch (this.f1806a) {
            case 0:
                return view.getRight() + this.f1807b.f2504o;
            default:
                return view.getLeft() - this.f1807b.f2504o;
        }
    }

    @Override // jd.d
    public final int w(CoordinatorLayout coordinatorLayout) {
        switch (this.f1806a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // jd.d
    public final int x() {
        switch (this.f1806a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}

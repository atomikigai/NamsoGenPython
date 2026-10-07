package c9;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r7.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1813d;
    public final /* synthetic */ b0.b e;

    public /* synthetic */ d(b0.b bVar, int i) {
        this.f1813d = i;
        this.e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    @Override // r7.g
    public final boolean H(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.f1813d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.f2505p) == null || weakReference.get() != view) ? false : true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                int i10 = bottomSheetBehavior.L;
                if (i10 != 1 && !bottomSheetBehavior.f2341a0) {
                    if (i10 == 3 && bottomSheetBehavior.Y == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.V;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference2 = bottomSheetBehavior.U;
                            if (weakReference2 == null) {
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference2 = bottomSheetBehavior.U;
                        if (weakReference2 == null && weakReference2.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // r7.g
    public final int e(View view, int i) {
        switch (this.f1813d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                return com.bumptech.glide.d.b(i, sideSheetBehavior.f2493a.u(), sideSheetBehavior.f2493a.t());
            default:
                return view.getLeft();
        }
    }

    @Override // r7.g
    public final int f(View view, int i) {
        switch (this.f1813d) {
            case 0:
                return view.getTop();
            default:
                return com.bumptech.glide.d.b(i, ((BottomSheetBehavior) this.e).x(), t());
        }
    }

    @Override // r7.g
    public int s(View view) {
        switch (this.f1813d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                return sideSheetBehavior.f2501l + sideSheetBehavior.f2504o;
            default:
                return super.s(view);
        }
    }

    @Override // r7.g
    public int t() {
        switch (this.f1813d) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            default:
                return super.t();
        }
    }

    @Override // r7.g
    public final void w(int i) {
        switch (this.f1813d) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                    if (sideSheetBehavior.f2498g) {
                        sideSheetBehavior.r(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                    }
                }
                break;
        }
    }

    @Override // r7.g
    public final void x(View view, int i, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1813d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference = sideSheetBehavior.f2506q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2493a.N(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2510u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2493a.e(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw q1.a.g(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.e).u(i10);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // r7.g
    public final void y(View view, float f10, float f11) {
        int i;
        switch (this.f1813d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                if (!sideSheetBehavior.f2493a.A(f10)) {
                    if (!sideSheetBehavior.f2493a.I(view, f10)) {
                        if (f10 == 0.0f || Math.abs(f10) <= Math.abs(f11)) {
                            int left = view.getLeft();
                            i = Math.abs(left - sideSheetBehavior.f2493a.q()) < Math.abs(left - sideSheetBehavior.f2493a.r()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f2493a.C(f10, f11) || sideSheetBehavior.f2493a.B(view)) {
                    }
                }
                sideSheetBehavior.t(view, true, i);
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                int i10 = 6;
                if (f11 < 0.0f) {
                    if (bottomSheetBehavior.f2342b) {
                        i10 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.E) {
                            i10 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.D(view, f11)) {
                    if (Math.abs(f10) >= Math.abs(f11) || f11 <= bottomSheetBehavior.f2346d) {
                        if (view.getTop() > (bottomSheetBehavior.x() + bottomSheetBehavior.T) / 2) {
                            i10 = 5;
                        } else if (bottomSheetBehavior.f2342b || Math.abs(view.getTop() - bottomSheetBehavior.x()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            i10 = 3;
                        }
                    } else {
                        i10 = 5;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f2342b) {
                        int i11 = bottomSheetBehavior.E;
                        if (top2 < i11) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                                i10 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - bottomSheetBehavior.G)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i10 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (bottomSheetBehavior.f2342b) {
                    i10 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i10 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.E(view, true, i10);
                break;
        }
    }
}

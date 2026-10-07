package h8;

import a5.b;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.o0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d9.e;
import d9.h;
import gb.r;
import java.util.WeakHashMap;
import q0.d0;
import q0.e0;
import q0.v0;
import r7.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5093d;
    public int e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f5094f;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f5094f = swipeDismissBehavior;
    }

    @Override // r7.g
    public final boolean H(View view, int i) {
        int i10 = this.e;
        return (i10 == -1 || i10 == i) && this.f5094f.r(view);
    }

    @Override // r7.g
    public final int e(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = v0.f7946a;
        boolean z4 = e0.d(view) == 1;
        int i10 = this.f5094f.e;
        if (i10 == 0) {
            if (z4) {
                width = this.f5093d - view.getWidth();
                width2 = this.f5093d;
            } else {
                width = this.f5093d;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 != 1) {
            width = this.f5093d - view.getWidth();
            width2 = view.getWidth() + this.f5093d;
        } else if (z4) {
            width = this.f5093d;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f5093d - view.getWidth();
            width2 = this.f5093d;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // r7.g
    public final int f(View view, int i) {
        return view.getTop();
    }

    @Override // r7.g
    public final int s(View view) {
        return view.getWidth();
    }

    @Override // r7.g
    public final void v(View view, int i) {
        this.e = i;
        this.f5093d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f5094f;
            swipeDismissBehavior.f2337d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2337d = false;
        }
    }

    @Override // r7.g
    public final void w(int i) {
        b bVar = this.f5094f.f2335b;
        if (bVar != null) {
            e eVar = ((h) bVar.f188b).f3076t;
            if (i == 0) {
                r.h().r(eVar);
            } else if (i == 1 || i == 2) {
                r.h().q(eVar);
            }
        }
    }

    @Override // r7.g
    public final void x(View view, int i, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f5094f;
        float f10 = width * swipeDismissBehavior.f2338f;
        float width2 = view.getWidth() * swipeDismissBehavior.f2339g;
        float fAbs = Math.abs(i - this.f5093d);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // r7.g
    public final void y(View view, float f10, float f11) {
        int i;
        int left;
        int i10;
        b bVar;
        this.e = -1;
        int width = view.getWidth();
        boolean z4 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f5094f;
        if (f10 != 0.0f) {
            WeakHashMap weakHashMap = v0.f7946a;
            boolean z10 = e0.d(view) == 1;
            int i11 = swipeDismissBehavior.e;
            if (i11 != 2 && (i11 != 0 ? i11 != 1 || (!z10 ? f10 < 0.0f : f10 > 0.0f) : !z10 ? f10 > 0.0f : f10 < 0.0f)) {
                i = this.f5093d;
            } else {
                if (f10 >= 0.0f) {
                    left = view.getLeft();
                    i10 = this.f5093d;
                    if (left < i10) {
                        i = this.f5093d - width;
                    } else {
                        i = i10 + width;
                    }
                } else {
                    i = this.f5093d - width;
                }
                z4 = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f5093d) >= Math.round(view.getWidth() * 0.5f)) {
                if (f10 >= 0.0f) {
                    left = view.getLeft();
                    i10 = this.f5093d;
                    if (left < i10) {
                        i = this.f5093d - width;
                    } else {
                        i = i10 + width;
                    }
                } else {
                    i = this.f5093d - width;
                }
                z4 = true;
            } else {
                i = this.f5093d;
            }
        }
        if (swipeDismissBehavior.f2334a.o(i, view.getTop())) {
            o0 o0Var = new o0(swipeDismissBehavior, view, z4);
            WeakHashMap weakHashMap2 = v0.f7946a;
            d0.m(view, o0Var);
        } else {
            if (!z4 || (bVar = swipeDismissBehavior.f2335b) == null) {
                return;
            }
            bVar.x(view);
        }
    }
}

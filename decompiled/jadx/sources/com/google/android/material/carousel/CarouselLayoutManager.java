package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.x;
import da.v;
import h2.c;
import l8.a;
import l8.b;
import x1.h0;
import x1.i0;
import x1.n0;
import x1.r0;
import x1.s0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends h0 implements r0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f2388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View.OnLayoutChangeListener f2389q;

    public CarouselLayoutManager() {
        new z9.c();
        new b();
        this.f2389q = new a(this, 0);
        n0();
        E0(0);
    }

    public final boolean C0() {
        return this.f2388p.f4608a == 0;
    }

    public final boolean D0() {
        return C0() && A() == 1;
    }

    public final void E0(int i) {
        l8.c cVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(v.f(i, "invalid orientation:"));
        }
        c(null);
        c cVar2 = this.f2388p;
        if (cVar2 == null || i != cVar2.f4608a) {
            if (i == 0) {
                cVar = new l8.c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new l8.c(this, 0);
            }
            this.f2388p = cVar;
            n0();
        }
    }

    @Override // x1.h0
    public final void P(RecyclerView recyclerView) {
        n0();
        recyclerView.addOnLayoutChangeListener(this.f2389q);
    }

    @Override // x1.h0
    public final void Q(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2389q);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // x1.h0
    public final View R(View view, int i, n0 n0Var, s0 s0Var) {
        byte b10;
        if (v() == 0) {
            return null;
        }
        int i10 = this.f2388p.f4608a;
        if (i == 1) {
            b10 = -1;
        } else if (i == 2) {
            b10 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                    } else if (i10 == 1) {
                        b10 = 1;
                    }
                    b10 = -2147483648;
                } else if (i10 != 0) {
                    b10 = -2147483648;
                } else if (D0()) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
            } else if (i10 == 1) {
                b10 = -1;
            } else {
                b10 = -2147483648;
            }
        } else if (i10 != 0) {
            b10 = -2147483648;
        } else if (D0()) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == -2147483648) {
            return null;
        }
        if (b10 == -1) {
            if (h0.F(view) == 0) {
                return null;
            }
            int iF = h0.F(u(0)) - 1;
            if (iF < 0 || iF >= z()) {
                return u(D0() ? v() - 1 : 0);
            }
            this.f2388p.e();
            throw null;
        }
        if (h0.F(view) == z() - 1) {
            return null;
        }
        int iF2 = h0.F(u(v() - 1)) + 1;
        if (iF2 < 0 || iF2 >= z()) {
            return u(D0() ? 0 : v() - 1);
        }
        this.f2388p.e();
        throw null;
    }

    @Override // x1.h0
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(h0.F(u(0)));
            accessibilityEvent.setToIndex(h0.F(u(v() - 1)));
        }
    }

    @Override // x1.h0
    public final void W(int i, int i10) {
        z();
    }

    @Override // x1.h0
    public final void Z(int i, int i10) {
        z();
    }

    @Override // x1.r0
    public final PointF a(int i) {
        return null;
    }

    @Override // x1.h0
    public final void b0(n0 n0Var, s0 s0Var) {
        if (s0Var.b() > 0) {
            if ((C0() ? this.f10092n : this.f10093o) > 0.0f) {
                D0();
                View view = n0Var.k(0, Long.MAX_VALUE).f10230a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        h0(n0Var);
    }

    @Override // x1.h0
    public final void c0(s0 s0Var) {
        if (v() == 0) {
            return;
        }
        h0.F(u(0));
    }

    @Override // x1.h0
    public final boolean d() {
        return C0();
    }

    @Override // x1.h0
    public final boolean e() {
        return !C0();
    }

    @Override // x1.h0
    public final int j(s0 s0Var) {
        v();
        return 0;
    }

    @Override // x1.h0
    public final int k(s0 s0Var) {
        return 0;
    }

    @Override // x1.h0
    public final int l(s0 s0Var) {
        return 0;
    }

    @Override // x1.h0
    public final int m(s0 s0Var) {
        v();
        return 0;
    }

    @Override // x1.h0
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z10) {
        return false;
    }

    @Override // x1.h0
    public final int n(s0 s0Var) {
        return 0;
    }

    @Override // x1.h0
    public final int o(s0 s0Var) {
        return 0;
    }

    @Override // x1.h0
    public final int o0(int i, n0 n0Var, s0 s0Var) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = n0Var.k(0, Long.MAX_VALUE).f10230a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // x1.h0
    public final int q0(int i, n0 n0Var, s0 s0Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = n0Var.k(0, Long.MAX_VALUE).f10230a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // x1.h0
    public final i0 r() {
        return new i0(-2, -2);
    }

    @Override // x1.h0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // x1.h0
    public final void z0(RecyclerView recyclerView, int i) {
        x xVar = new x(this, recyclerView.getContext());
        xVar.f10204a = i;
        A0(xVar);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        new b();
        this.f2389q = new a(this, 0);
        new z9.c();
        n0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d8.a.f3015d);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            n0();
            E0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // x1.h0
    public final void p0(int i) {
    }
}

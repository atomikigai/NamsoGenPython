package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.namso_gen.spacehowen.R;
import b0.b;
import b0.e;
import b9.g;
import b9.j;
import b9.k;
import c9.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import jd.d;
import q0.d0;
import q0.g0;
import q0.j0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f2493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f2494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f2495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f2496d;
    public final f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2498g;
    public int h;
    public y0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f2500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f2505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f2506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f2508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2509t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f2510u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c9.d f2511v;

    public SideSheetBehavior() {
        this.e = new f(this);
        this.f2498g = true;
        this.h = 5;
        this.f2500k = 0.1f;
        this.f2507r = -1;
        this.f2510u = new LinkedHashSet();
        this.f2511v = new c9.d(this, 0);
    }

    @Override // b0.b
    public final void c(e eVar) {
        this.f2505p = null;
        this.i = null;
    }

    @Override // b0.b
    public final void e() {
        this.f2505p = null;
        this.i = null;
    }

    @Override // b0.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        y0.d dVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && v0.d(view) == null) || !this.f2498g) {
            this.f2499j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2508s) != null) {
            velocityTracker.recycle();
            this.f2508s = null;
        }
        if (this.f2508s == null) {
            this.f2508s = VelocityTracker.obtain();
        }
        this.f2508s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2509t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2499j) {
            this.f2499j = false;
            return false;
        }
        return (this.f2499j || (dVar = this.i) == null || !dVar.p(motionEvent)) ? false : true;
    }

    @Override // b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i10;
        View viewFindViewById;
        WeakHashMap weakHashMap = v0.f7946a;
        int i11 = 1;
        if (d0.b(coordinatorLayout) && !d0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f2505p;
        g gVar = this.f2494b;
        int iV = 0;
        if (weakReference == null) {
            this.f2505p = new WeakReference(view);
            Context context = view.getContext();
            a.w(context, R.attr.motionEasingStandardDecelerateInterpolator, s0.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            a.v(context, R.attr.motionDurationMedium2, 300);
            a.v(context, R.attr.motionDurationShort3, 150);
            a.v(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                d0.q(view, gVar);
                float fI = this.f2497f;
                if (fI == -1.0f) {
                    fI = j0.i(view);
                }
                gVar.j(fI);
            } else {
                ColorStateList colorStateList = this.f2495c;
                if (colorStateList != null) {
                    j0.q(view, colorStateList);
                }
            }
            int i12 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i12) {
                view.setVisibility(i12);
            }
            u();
            if (d0.c(view) == 0) {
                d0.s(view, 1);
            }
            if (v0.d(view) == null) {
                v0.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i13 = Gravity.getAbsoluteGravity(((e) view.getLayoutParams()).f1321c, i) == 3 ? 1 : 0;
        d dVar = this.f2493a;
        if (dVar == null || dVar.x() != i13) {
            e eVar = null;
            k kVar = this.f2496d;
            if (i13 == 0) {
                this.f2493a = new c9.a(this, i11);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f2505p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof e)) {
                        eVar = (e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        j jVarE = kVar.e();
                        jVarE.f1473f = new b9.a(0.0f);
                        jVarE.f1474g = new b9.a(0.0f);
                        k kVarA = jVarE.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(kVarA);
                        }
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException(q1.a.j(i13, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f2493a = new c9.a(this, iV);
                if (kVar != null) {
                    WeakReference weakReference3 = this.f2505p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof e)) {
                        eVar = (e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        j jVarE2 = kVar.e();
                        jVarE2.e = new b9.a(0.0f);
                        jVarE2.h = new b9.a(0.0f);
                        k kVarA2 = jVarE2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(kVarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new y0.d(coordinatorLayout.getContext(), coordinatorLayout, this.f2511v);
        }
        int iV2 = this.f2493a.v(view);
        coordinatorLayout.q(view, i);
        this.f2502m = coordinatorLayout.getWidth();
        this.f2503n = this.f2493a.w(coordinatorLayout);
        this.f2501l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2504o = marginLayoutParams != null ? this.f2493a.d(marginLayoutParams) : 0;
        int i14 = this.h;
        if (i14 == 1 || i14 == 2) {
            iV = iV2 - this.f2493a.v(view);
        } else if (i14 != 3) {
            if (i14 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iV = this.f2493a.r();
        }
        view.offsetLeftAndRight(iV);
        if (this.f2506q == null && (i10 = this.f2507r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f2506q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f2510u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // b0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // b0.b
    public final void m(View view, Parcelable parcelable) {
        int i = ((c9.e) parcelable).f1814c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // b0.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c9.e(this);
    }

    @Override // b0.b
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2508s) != null) {
            velocityTracker.recycle();
            this.f2508s = null;
        }
        if (this.f2508s == null) {
            this.f2508s = VelocityTracker.obtain();
        }
        this.f2508s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f2499j && s()) {
            float fAbs = Math.abs(this.f2509t - motionEvent.getX());
            y0.d dVar = this.i;
            if (fAbs > dVar.f10377b) {
                dVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2499j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f2505p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
        Iterator it = this.f2510u.iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f2498g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r(2);
        r2.e.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, boolean r4, int r5) {
        /*
            r2 = this;
            r0 = 3
            if (r5 == r0) goto L19
            r0 = 5
            if (r5 != r0) goto Ld
            jd.d r0 = r2.f2493a
            int r0 = r0.r()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = da.v.f(r5, r4)
            r3.<init>(r4)
            throw r3
        L19:
            jd.d r0 = r2.f2493a
            int r0 = r0.q()
        L1f:
            y0.d r1 = r2.i
            if (r1 == 0) goto L57
            if (r4 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r4 = r3.getTop()
            r1.f10390r = r3
            r3 = -1
            r1.f10378c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r4, r3, r3)
            if (r3 != 0) goto L4b
            int r4 = r1.f10376a
            if (r4 != 0) goto L4b
            android.view.View r4 = r1.f10390r
            if (r4 == 0) goto L4b
            r4 = 0
            r1.f10390r = r4
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.r(r3)
            c9.f r3 = r2.e
            r3.b(r5)
            return
        L57:
            r2.r(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, boolean, int):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f2505p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.i(view, 262144);
        v0.g(view, 0);
        v0.i(view, 1048576);
        v0.g(view, 0);
        int i = 5;
        if (this.h != 5) {
            v0.j(view, r0.f.f8110j, new c9.b(this, i));
        }
        int i10 = 3;
        if (this.h != 3) {
            v0.j(view, r0.f.h, new c9.b(this, i10));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new f(this);
        this.f2498g = true;
        this.h = 5;
        this.f2500k = 0.1f;
        this.f2507r = -1;
        this.f2510u = new LinkedHashSet();
        this.f2511v = new c9.d(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d8.a.E);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f2495c = a.h(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f2496d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f2507r = resourceId;
            WeakReference weakReference = this.f2506q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2506q = null;
            WeakReference weakReference2 = this.f2505p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = v0.f7946a;
                    if (g0.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f2496d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2494b = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f2495c;
            if (colorStateList != null) {
                this.f2494b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2494b.setTint(typedValue.data);
            }
        }
        this.f2497f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f2498g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

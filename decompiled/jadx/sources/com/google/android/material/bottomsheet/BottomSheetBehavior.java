package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.namso_gen.spacehowen.R;
import b0.b;
import b0.e;
import b9.g;
import b9.k;
import c9.f;
import com.google.android.gms.internal.ads.zzbbs;
import da.v;
import ea.j;
import gb.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import q0.c;
import q0.d0;
import q0.e0;
import q0.g0;
import q0.h0;
import q0.j0;
import q0.j1;
import q0.k1;
import q0.n1;
import q0.v0;
import q1.a;
import y0.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b {
    public final f A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public d M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2340a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f2341a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2342b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public HashMap f2343b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2344c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f2345c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2346d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final c9.d f2347d0;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2349g;
    public final int h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f2350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f2356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f2357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f2359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f2361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f2364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f2365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2366z;

    public BottomSheetBehavior() {
        this.f2340a = 0;
        this.f2342b = true;
        this.f2351k = -1;
        this.f2352l = -1;
        this.A = new f(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.f2345c0 = new SparseIntArray();
        this.f2347d0 = new c9.d(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = v0.f7946a;
        if (j0.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewV = v(viewGroup.getChildAt(i));
            if (viewV != null) {
                return viewV;
            }
        }
        return null;
    }

    public static int w(int i, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f2348f) {
                return;
            } else {
                this.f2348f = true;
            }
        } else {
            if (!this.f2348f && this.e == i) {
                return;
            }
            this.f2348f = false;
            this.e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(a.m(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i10 = (i == 6 && this.f2342b && y(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.U.get();
        androidx.activity.g gVar = new androidx.activity.g(this, view, i10);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = v0.f7946a;
            if (g0.b(view)) {
                view.post(gVar);
                return;
            }
        }
        gVar.run();
    }

    public final void C(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z4 = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() > 0) {
            throw v.e(arrayList, 0);
        }
        F();
    }

    public final boolean D(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        C(2);
        G(r5, true);
        r2.A.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, boolean r4, int r5) {
        /*
            r2 = this;
            int r0 = r2.y(r5)
            y0.d r1 = r2.M
            if (r1 == 0) goto L40
            if (r4 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r4 = r3.getLeft()
            r1.f10390r = r3
            r3 = -1
            r1.f10378c = r3
            r3 = 0
            boolean r3 = r1.h(r4, r0, r3, r3)
            if (r3 != 0) goto L30
            int r4 = r1.f10376a
            if (r4 != 0) goto L30
            android.view.View r4 = r1.f10390r
            if (r4 == 0) goto L30
            r4 = 0
            r1.f10390r = r4
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r5, r3)
            c9.f r3 = r2.A
            r3.b(r5)
            return
        L40:
            r2.C(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, boolean, int):void");
    }

    public final void F() {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.i(view, 524288);
        v0.g(view, 0);
        v0.i(view, 262144);
        v0.g(view, 0);
        v0.i(view, 1048576);
        v0.g(view, 0);
        SparseIntArray sparseIntArray = this.f2345c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            v0.i(view, i);
            v0.g(view, 0);
            sparseIntArray.delete(0);
        }
        int i10 = 6;
        if (!this.f2342b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            j jVar = new j(this, i10);
            ArrayList arrayListE = v0.e(view);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayListE.size()) {
                    int i12 = 0;
                    int i13 = -1;
                    while (true) {
                        int[] iArr = v0.f7949d;
                        if (i12 >= iArr.length || i13 != -1) {
                            break;
                        }
                        int i14 = iArr[i12];
                        boolean z4 = true;
                        for (int i15 = 0; i15 < arrayListE.size(); i15++) {
                            z4 &= ((r0.f) arrayListE.get(i15)).a() != i14;
                        }
                        if (z4) {
                            i13 = i14;
                        }
                        i12++;
                    }
                    iA = i13;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((r0.f) arrayListE.get(i11)).f8113a).getLabel())) {
                    iA = ((r0.f) arrayListE.get(i11)).a();
                    break;
                }
                i11++;
            }
            if (iA != -1) {
                r0.f fVar = new r0.f(null, iA, string, jVar, null);
                View.AccessibilityDelegate accessibilityDelegateC = v0.c(view);
                c cVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof q0.a ? ((q0.a) accessibilityDelegateC).f7877a : new c(accessibilityDelegateC);
                if (cVar == null) {
                    cVar = new c();
                }
                v0.l(view, cVar);
                v0.i(view, fVar.a());
                v0.e(view).add(fVar);
                v0.g(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i16 = 5;
            if (this.L != 5) {
                v0.j(view, r0.f.f8110j, new j(this, i16));
            }
        }
        int i17 = this.L;
        int i18 = 4;
        int i19 = 3;
        if (i17 == 3) {
            v0.j(view, r0.f.i, new j(this, this.f2342b ? 4 : 6));
            return;
        }
        if (i17 == 4) {
            v0.j(view, r0.f.h, new j(this, this.f2342b ? 3 : 6));
        } else {
            if (i17 != 6) {
                return;
            }
            v0.j(view, r0.f.i, new j(this, i18));
            v0.j(view, r0.f.h, new j(this, i19));
        }
    }

    public final void G(int i, boolean z4) {
        g gVar;
        if (i == 2) {
            return;
        }
        boolean z10 = this.L == 3 && (this.f2364x || z());
        if (this.f2366z == z10 || (gVar = this.i) == null) {
            return;
        }
        this.f2366z = z10;
        ValueAnimator valueAnimator = this.B;
        if (z4 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f1454a.i, z10 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fS = this.f2366z ? s() : 1.0f;
        b9.f fVar = gVar.f1454a;
        if (fVar.i != fS) {
            fVar.i = fS;
            gVar.e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z4) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.f2343b0 != null) {
                    return;
                } else {
                    this.f2343b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z4) {
                    this.f2343b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.f2343b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.U != null) {
            r();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // b0.b
    public final void c(e eVar) {
        this.U = null;
        this.M = null;
    }

    @Override // b0.b
    public final void e() {
        this.U = null;
        this.M = null;
    }

    @Override // b0.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        d dVar;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x4, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2341a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.o(view, x4, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2341a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (this.N || (dVar = this.M) == null || !dVar.p(motionEvent)) {
            WeakReference weakReference2 = this.V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i = this.Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.M.f10377b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [int[], java.io.Serializable] */
    @Override // b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = v0.f7946a;
        int i10 = 1;
        if (d0.b(coordinatorLayout) && !d0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int i11 = 4;
        if (this.U == null) {
            this.f2349g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i12 = Build.VERSION.SDK_INT;
            boolean z4 = (i12 < 29 || this.f2354n || this.f2348f) ? false : true;
            if (this.f2355o || this.f2356p || this.f2357q || this.f2359s || this.f2360t || this.f2361u || z4) {
                ea.e eVar = new ea.e(this, z4);
                int iF = e0.f(view);
                view.getPaddingTop();
                int iE = e0.e(view);
                int paddingBottom = view.getPaddingBottom();
                r7.d dVar = new r7.d();
                dVar.f8196a = iF;
                dVar.f8197b = iE;
                dVar.f8198c = paddingBottom;
                j0.u(view, new s5.j(i11, eVar, dVar));
                if (g0.b(view)) {
                    h0.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new rb.d(i10));
                }
            }
            n nVar = new n();
            nVar.e = new int[2];
            nVar.f4484d = view;
            if (i12 >= 30) {
                n1.g(view, nVar);
            } else {
                PathInterpolator pathInterpolator = k1.e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener j1Var = new j1(view, nVar);
                view.setTag(R.id.tag_window_insets_animation_callback, j1Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(j1Var);
                }
            }
            this.U = new WeakReference(view);
            Context context = view.getContext();
            android.support.v4.media.session.a.w(context, R.attr.motionEasingStandardDecelerateInterpolator, s0.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            android.support.v4.media.session.a.v(context, R.attr.motionDurationMedium2, 300);
            android.support.v4.media.session.a.v(context, R.attr.motionDurationShort3, 150);
            android.support.v4.media.session.a.v(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            g gVar = this.i;
            if (gVar != null) {
                d0.q(view, gVar);
                float fI = this.H;
                if (fI == -1.0f) {
                    fI = j0.i(view);
                }
                gVar.j(fI);
            } else {
                ColorStateList colorStateList = this.f2350j;
                if (colorStateList != null) {
                    j0.q(view, colorStateList);
                }
            }
            F();
            if (d0.c(view) == 0) {
                d0.s(view, 1);
            }
        }
        if (this.M == null) {
            this.M = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f2347d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int iMin = this.T;
        int i13 = iMin - height;
        int i14 = this.f2363w;
        if (i13 < i14) {
            boolean z10 = this.f2358r;
            int i15 = this.f2352l;
            if (z10) {
                if (i15 != -1) {
                    iMin = Math.min(iMin, i15);
                }
                this.R = iMin;
            } else {
                int iMin2 = iMin - i14;
                if (i15 != -1) {
                    iMin2 = Math.min(iMin2, i15);
                }
                this.R = iMin2;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        r();
        int i16 = this.L;
        if (i16 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i16 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i16 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i16 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i16 == 1 || i16 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.L, false);
        this.V = new WeakReference(v(view));
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            return true;
        }
        throw v.e(arrayList, 0);
    }

    @Override // b0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f2351k, marginLayoutParams.width), w(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2352l, marginLayoutParams.height));
        return true;
    }

    @Override // b0.b
    public final boolean i(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // b0.b
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10, int[] iArr, int i11) {
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i10;
        boolean z4 = this.K;
        if (i10 > 0) {
            if (i12 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                int i13 = -iX;
                WeakHashMap weakHashMap = v0.f7946a;
                view.offsetTopAndBottom(i13);
                C(3);
            } else {
                if (!z4) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap2 = v0.f7946a;
                view.offsetTopAndBottom(-i10);
                C(1);
            }
        } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
            int i14 = this.G;
            if (i12 > i14 && !this.I) {
                int i15 = top - i14;
                iArr[1] = i15;
                int i16 = -i15;
                WeakHashMap weakHashMap3 = v0.f7946a;
                view.offsetTopAndBottom(i16);
                C(4);
            } else {
                if (!z4) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap4 = v0.f7946a;
                view.offsetTopAndBottom(-i10);
                C(1);
            }
        }
        u(view.getTop());
        this.O = i10;
        this.P = true;
    }

    @Override // b0.b
    public final void m(View view, Parcelable parcelable) {
        j8.a aVar = (j8.a) parcelable;
        int i = this.f2340a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = aVar.f5705d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2342b = aVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = aVar.f5706f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = aVar.f5707r;
            }
        }
        int i10 = aVar.f5704c;
        if (i10 == 1 || i10 == 2) {
            this.L = 4;
        } else {
            this.L = i10;
        }
    }

    @Override // b0.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new j8.a(this);
    }

    @Override // b0.b
    public final boolean o(View view, int i, int i10) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // b0.b
    public final void p(View view, View view2, int i) {
        int top;
        int top2;
        int i10;
        float yVelocity;
        int i11 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.V;
        if (weakReference != null && view2 == weakReference.get() && this.P) {
            if (this.O > 0) {
                if (!this.f2342b && view.getTop() > this.E) {
                    i11 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(zzbbs.zzq.zzf, this.f2344c);
                    yVelocity = this.X.getYVelocity(this.Y);
                }
                if (D(view, yVelocity)) {
                    i11 = 5;
                } else if (this.O == 0) {
                    top2 = view.getTop();
                    if (this.f2342b) {
                        i10 = this.E;
                        if (top2 < i10) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i10) < Math.abs(top2 - this.G)) {
                            i11 = 4;
                        }
                        i11 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i11 = 4;
                    }
                } else {
                    if (!this.f2342b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i11 = 6;
                        }
                    }
                    i11 = 4;
                }
            } else if (this.O == 0) {
                top2 = view.getTop();
                if (this.f2342b) {
                    i10 = this.E;
                    if (top2 < i10) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i10) < Math.abs(top2 - this.G)) {
                        i11 = 4;
                    }
                    i11 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i11 = 4;
                }
            } else {
                if (!this.f2342b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            E(view, false, i11);
            this.P = false;
        }
    }

    @Override // b0.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.M;
        if (dVar != null && (this.K || i == 1)) {
            dVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.Z - motionEvent.getY());
            d dVar2 = this.M;
            if (fAbs > dVar2.f10377b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void r() {
        int iT = t();
        if (this.f2342b) {
            this.G = Math.max(this.T - iT, this.D);
        } else {
            this.G = this.T - iT;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f10;
        float f11 = 0.0f;
        if (this.i != null && (weakReference = this.U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float fA = gVar.f1454a.f1440a.e.a(gVar.g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f10 = 0.0f;
                    } else {
                        f10 = radius / fA;
                    }
                } else {
                    f10 = 0.0f;
                }
                g gVar2 = this.i;
                float fA2 = gVar2.f1454a.f1440a.f1483f.a(gVar2.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f11 = radius2 / fA2;
                    }
                }
                return Math.max(f10, f11);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        if (this.f2348f) {
            return Math.min(Math.max(this.f2349g, this.T - ((this.S * 9) / 16)), this.R) + this.f2362v;
        }
        return (this.f2354n || this.f2355o || (i = this.f2353m) <= 0) ? this.e + this.f2362v : Math.max(this.e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i10 = this.G;
            if (i <= i10 && i10 != x()) {
                x();
            }
            if (arrayList.size() > 0) {
                throw v.e(arrayList, 0);
            }
        }
    }

    public final int x() {
        if (this.f2342b) {
            return this.D;
        }
        return Math.max(this.C, this.f2358r ? 0 : this.f2363w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(v.f(i, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f2340a = 0;
        this.f2342b = true;
        this.f2351k = -1;
        this.f2352l = -1;
        this.A = new f(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.f2345c0 = new SparseIntArray();
        this.f2347d0 = new c9.d(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d8.a.f3014c);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f2350j = android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f2365y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f2365y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f2350j;
            if (colorStateList != null) {
                this.i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new f9.b(this, 2));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f2351k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f2352l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            A(i);
        } else {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.I != z4) {
            this.I = z4;
            if (!z4 && this.L == 5) {
                B(4);
            }
            F();
        }
        this.f2354n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f2342b != z10) {
            this.f2342b = z10;
            if (this.U != null) {
                r();
            }
            C((this.f2342b && this.L == 6) ? 3 : this.L);
            G(this.L, true);
            F();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f2340a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.U != null) {
                this.E = (int) ((1.0f - f10) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i10 = typedValuePeekValue2.data;
                if (i10 >= 0) {
                    this.C = i10;
                    G(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2346d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f2355o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f2356p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f2357q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f2358r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f2359s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f2360t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f2361u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f2364x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f2344c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // b0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
    }
}

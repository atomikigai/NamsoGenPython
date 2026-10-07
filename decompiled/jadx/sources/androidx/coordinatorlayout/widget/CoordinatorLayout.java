package androidx.coordinatorlayout.widget;

import a0.a;
import a5.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import b0.c;
import b0.d;
import b0.e;
import b0.g;
import b0.h;
import b0.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p0.f;
import q0.d0;
import q0.d2;
import q0.e0;
import q0.g0;
import q0.h0;
import q0.j0;
import q0.l;
import q0.q;
import q0.r;
import q0.s;
import q0.v0;
import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {
    public static final String E;
    public static final Class[] F;
    public static final ThreadLocal G;
    public static final h H;
    public static final f I;
    public Drawable A;
    public ViewGroup.OnHierarchyChangeListener B;
    public b C;
    public final s D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gb.r f566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f568d;
    public final int[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f569f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b0.f f575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d2 f577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f578z;

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        E = r10 != null ? r10.getName() : null;
        H = new h(0);
        F = new Class[]{Context.class, AttributeSet.class};
        G = new ThreadLocal();
        I = new f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f565a = new ArrayList();
        this.f566b = new gb.r(1);
        this.f567c = new ArrayList();
        this.f568d = new ArrayList();
        this.e = new int[2];
        this.f569f = new int[2];
        this.D = new s();
        int[] iArr = a.f0a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        } else {
            coordinatorLayout = this;
            context2 = context;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f572t = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = coordinatorLayout.f572t;
                iArr2[i] = (int) (iArr2[i] * f10);
            }
        }
        coordinatorLayout.A = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d(this));
        WeakHashMap weakHashMap = v0.f7946a;
        if (d0.c(this) == 0) {
            d0.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) I.c();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, e eVar, int i10, int i11) {
        int iWidth;
        int iHeight;
        int i12 = eVar.f1321c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i);
        int i13 = eVar.f1322d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        if (i16 != 1) {
            iWidth = i16 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            iHeight = i17 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i14 == 1) {
            iWidth -= i10 / 2;
        } else if (i14 != 5) {
            iWidth -= i10;
        }
        if (i15 == 16) {
            iHeight -= i11 / 2;
        } else if (i15 != 80) {
            iHeight -= i11;
        }
        rect2.set(iWidth, iHeight, i10 + iWidth, i11 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f1320b) {
            if (view instanceof b0.a) {
                b0.b behavior = ((b0.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.b(behavior);
                eVar.f1320b = true;
                return eVar;
            }
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.b((b0.b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            eVar.f1320b = true;
        }
        return eVar;
    }

    public static void u(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.i;
        if (i10 != i) {
            WeakHashMap weakHashMap = v0.f7946a;
            view.offsetLeftAndRight(i - i10);
            eVar.i = i;
        }
    }

    public static void v(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.f1325j;
        if (i10 != i) {
            WeakHashMap weakHashMap = v0.f7946a;
            view.offsetTopAndBottom(i - i10);
            eVar.f1325j = i;
        }
    }

    @Override // q0.r
    public final void a(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        b0.b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z4 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i13) && (bVar = eVar.f1319a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, i10, i11, i12, iArr2);
                    iMax = i11 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i12 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // q0.q
    public final void b(View view, int i, int i10, int i11, int i12, int i13) {
        a(view, i, i10, i11, i12, 0, this.f569f);
    }

    @Override // q0.q
    public final boolean c(View view, View view2, int i, int i10) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b0.b bVar = eVar.f1319a;
                if (bVar != null) {
                    boolean zO = bVar.o(childAt, i, i10);
                    z4 |= zO;
                    if (i10 == 0) {
                        eVar.f1328m = zO;
                    } else if (i10 == 1) {
                        eVar.f1329n = zO;
                    }
                } else if (i10 == 0) {
                    eVar.f1328m = false;
                } else if (i10 == 1) {
                    eVar.f1329n = false;
                }
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // q0.q
    public final void d(View view, View view2, int i, int i10) {
        s sVar = this.D;
        if (i10 == 1) {
            sVar.f7939b = i;
        } else {
            sVar.f7938a = i;
        }
        this.f574v = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        b0.b bVar = ((e) view.getLayoutParams()).f1319a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // q0.q
    public final void e(View view, int i) {
        s sVar = this.D;
        if (i == 1) {
            sVar.f7939b = 0;
        } else {
            sVar.f7938a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b0.b bVar = eVar.f1319a;
                if (bVar != null) {
                    bVar.p(childAt, view, i);
                }
                if (i == 0) {
                    eVar.f1328m = false;
                } else if (i == 1) {
                    eVar.f1329n = false;
                }
                eVar.f1330o = false;
            }
        }
        this.f574v = null;
    }

    @Override // q0.q
    public final void f(View view, int i, int i10, int[] iArr, int i11) {
        b0.b bVar;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i11) && (bVar = eVar.f1319a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.j(this, childAt, view, i, i10, iArr2, i11);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i10 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f565a);
    }

    public final d2 getLastWindowInsets() {
        return this.f577y;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.D;
        return sVar.f7939b | sVar.f7938a;
    }

    public Drawable getStatusBarBackground() {
        return this.A;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i, int i10) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i10 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        k kVar = (k) this.f566b.f4494b;
        int i = kVar.f8100c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i; i10++) {
            ArrayList arrayList2 = (ArrayList) kVar.j(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.f(i10));
            }
        }
        ArrayList arrayList3 = this.f568d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = i.f1336a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = i.f1336a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        i.a(this, view, matrix);
        ThreadLocal threadLocal3 = i.f1337b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.f572t;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i10) {
        f fVar = I;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i, i10);
        } finally {
            rectG.setEmpty();
            fVar.b(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        t(false);
        if (this.f576x) {
            if (this.f575w == null) {
                this.f575w = new b0.f(this, i);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f575w);
        }
        if (this.f577y == null) {
            WeakHashMap weakHashMap = v0.f7946a;
            if (d0.b(this)) {
                h0.c(this);
            }
        }
        this.f571s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f576x && this.f575w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f575w);
        }
        View view = this.f574v;
        if (view != null) {
            e(view, 0);
        }
        this.f571s = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f578z || this.A == null) {
            return;
        }
        d2 d2Var = this.f577y;
        int iD = d2Var != null ? d2Var.d() : 0;
        if (iD > 0) {
            this.A.setBounds(0, 0, getWidth(), iD);
            this.A.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zR;
        }
        t(true);
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        b0.b bVar;
        WeakHashMap weakHashMap = v0.f7946a;
        int iD = e0.d(this);
        ArrayList arrayList = this.f565a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f1319a) == null || !bVar.g(this, view, iD))) {
                q(view, iD);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        boolean z4;
        int i11;
        int i12;
        int i13;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        b0.b bVar;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        ArrayList arrayList;
        int i18;
        View view;
        int i19;
        boolean zH;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i20 = 0;
        int i21 = 0;
        loop0: while (true) {
            if (i21 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i21);
            k kVar = (k) coordinatorLayout.f566b.f4494b;
            int i22 = kVar.f8100c;
            for (int i23 = 0; i23 < i22; i23++) {
                ArrayList arrayList2 = (ArrayList) kVar.j(i23);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i21++;
        }
        if (z4 != coordinatorLayout.f576x) {
            if (z4) {
                if (coordinatorLayout.f571s) {
                    if (coordinatorLayout.f575w == null) {
                        coordinatorLayout.f575w = new b0.f(coordinatorLayout, i20);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f575w);
                }
                coordinatorLayout.f576x = true;
            } else {
                if (coordinatorLayout.f571s && coordinatorLayout.f575w != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f575w);
                }
                coordinatorLayout.f576x = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = v0.f7946a;
        int iD = e0.d(coordinatorLayout);
        boolean z11 = iD == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z12 = coordinatorLayout.f577y != null && d0.b(coordinatorLayout);
        ArrayList arrayList3 = coordinatorLayout.f565a;
        int size3 = arrayList3.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = (View) arrayList3.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i12 = size3;
                i19 = i26;
                i14 = paddingLeft;
                suggestedMinimumWidth = i27;
                z10 = false;
                i16 = paddingRight;
            } else {
                e eVar = (e) view2.getLayoutParams();
                int i28 = eVar.e;
                if (i28 < 0 || mode == 0) {
                    i11 = suggestedMinimumHeight;
                } else {
                    int iM = coordinatorLayout.m(i28);
                    int i29 = eVar.f1321c;
                    if (i29 == 0) {
                        i29 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i29, iD) & 7;
                    i11 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z11) && !(absoluteGravity == 5 && z11)) {
                        if ((absoluteGravity == 5 && !z11) || (absoluteGravity == 3 && z11)) {
                            iMax = Math.max(0, iM - paddingLeft);
                        }
                        if (z12 || d0.b(view2)) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i10;
                        } else {
                            int iC = coordinatorLayout.f577y.c() + coordinatorLayout.f577y.b();
                            int iA = coordinatorLayout.f577y.a() + coordinatorLayout.f577y.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        bVar = eVar.f1319a;
                        if (bVar != null) {
                            z10 = false;
                            i14 = paddingLeft;
                            i15 = i27;
                            i16 = paddingRight;
                            i17 = i11;
                            arrayList = arrayList3;
                            int i30 = iMakeMeasureSpec;
                            i19 = i26;
                            int i31 = iMakeMeasureSpec2;
                            zH = bVar.h(this, view2, i30, i13, i31);
                            view = view2;
                            iMakeMeasureSpec = i30;
                            i18 = i31;
                            if (zH) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i15, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int iMax3 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i14 = paddingLeft;
                            i15 = i27;
                            z10 = false;
                            i16 = paddingRight;
                            i17 = i11;
                            arrayList = arrayList3;
                            i18 = iMakeMeasureSpec2;
                            view = view2;
                            i19 = i26;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i13, i18, 0);
                        int iMax4 = Math.max(i15, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax5 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    }
                    int i32 = size3;
                    i13 = iMax;
                    i12 = i32;
                    if (z12) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i10;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i10;
                    }
                    bVar = eVar.f1319a;
                    if (bVar != null) {
                        z10 = false;
                        i14 = paddingLeft;
                        i15 = i27;
                        i16 = paddingRight;
                        i17 = i11;
                        arrayList = arrayList3;
                        int i33 = iMakeMeasureSpec;
                        i19 = i26;
                        int i34 = iMakeMeasureSpec2;
                        zH = bVar.h(this, view2, i33, i13, i34);
                        view = view2;
                        iMakeMeasureSpec = i33;
                        i18 = i34;
                        if (zH) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i15, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax7 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i14 = paddingLeft;
                        i15 = i27;
                        z10 = false;
                        i16 = paddingRight;
                        i17 = i11;
                        arrayList = arrayList3;
                        i18 = iMakeMeasureSpec2;
                        view = view2;
                        i19 = i26;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i13, i18, 0);
                    int iMax8 = Math.max(i15, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax9 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i12 = size3;
                i13 = 0;
                if (z12) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i10;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i10;
                }
                bVar = eVar.f1319a;
                if (bVar != null) {
                    z10 = false;
                    i14 = paddingLeft;
                    i15 = i27;
                    i16 = paddingRight;
                    i17 = i11;
                    arrayList = arrayList3;
                    int i35 = iMakeMeasureSpec;
                    i19 = i26;
                    int i36 = iMakeMeasureSpec2;
                    zH = bVar.h(this, view2, i35, i13, i36);
                    view = view2;
                    iMakeMeasureSpec = i35;
                    i18 = i36;
                    if (zH) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i15, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax11 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i14 = paddingLeft;
                    i15 = i27;
                    z10 = false;
                    i16 = paddingRight;
                    i17 = i11;
                    arrayList = arrayList3;
                    i18 = iMakeMeasureSpec2;
                    view = view2;
                    i19 = i26;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i13, i18, 0);
                int iMax12 = Math.max(i15, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int iMax13 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i26 = i19 + 1;
            paddingLeft = i14;
            paddingRight = i16;
            size3 = i12;
            arrayList3 = arrayList;
        }
        int i37 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i37), View.resolveSizeAndState(suggestedMinimumHeight, i10, i37 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b0.b bVar = eVar.f1319a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        b0.b bVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f1319a) != null) {
                    zI |= bVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i10, int[] iArr) {
        f(view, i, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i10, int i11, int i12) {
        b(view, i, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f10011a);
        SparseArray sparseArray = gVar.f1334c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            b0.b bVar = n(childAt).f1319a;
            if (id2 != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            b0.b bVar = ((e) childAt.getLayoutParams()).f1319a;
            if (id2 != -1 && bVar != null && (parcelableN = bVar.n(childAt)) != null) {
                sparseArray.append(id2, parcelableN);
            }
        }
        gVar.f1334c = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zR;
        boolean zQ;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f573u == null) {
            zR = r(motionEvent, 1);
            if (!zR) {
                zQ = false;
            }
            motionEventObtain = null;
            if (this.f573u == null) {
                zQ |= super.onTouchEvent(motionEvent);
            } else if (zR) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zQ;
            }
            t(false);
            return zQ;
        }
        zR = false;
        b0.b bVar = ((e) this.f573u.getLayoutParams()).f1319a;
        if (bVar != null) {
            zQ = bVar.q(this.f573u, motionEvent);
        } else {
            zQ = false;
        }
        motionEventObtain = null;
        if (this.f573u == null) {
            zQ |= super.onTouchEvent(motionEvent);
        } else if (zR) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        t(false);
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void p(int i) {
        int i10;
        Rect rect;
        int i11;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        e eVar;
        int i18;
        View view;
        b0.b bVar;
        WeakHashMap weakHashMap = v0.f7946a;
        int iD = e0.d(this);
        ArrayList arrayList2 = this.f565a;
        int size = arrayList2.size();
        Rect rectG = g();
        Rect rectG2 = g();
        Rect rectG3 = g();
        int i19 = 0;
        while (true) {
            f fVar = I;
            if (i19 >= size) {
                Rect rect2 = rectG3;
                rectG.setEmpty();
                fVar.b(rectG);
                rectG2.setEmpty();
                fVar.b(rectG2);
                rect2.setEmpty();
                fVar.b(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i19);
            e eVar2 = (e) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i20 = 0;
                while (i20 < i19) {
                    if (eVar2.f1327l == ((View) arrayList2.get(i20))) {
                        e eVar3 = (e) view2.getLayoutParams();
                        if (eVar3.f1326k != null) {
                            Rect rectG4 = g();
                            Rect rectG5 = g();
                            e eVar4 = eVar2;
                            Rect rectG6 = g();
                            k(eVar3.f1326k, rectG4);
                            i(view2, rectG5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            eVar = eVar4;
                            i18 = i20;
                            iD = iD;
                            view = view3;
                            l(iD, rectG4, rectG6, eVar3, measuredWidth, measuredHeight);
                            boolean z11 = (rectG6.left == rectG5.left && rectG6.top == rectG5.top) ? false : true;
                            h(eVar3, rectG6, measuredWidth, measuredHeight);
                            int i21 = rectG6.left - rectG5.left;
                            int i22 = rectG6.top - rectG5.top;
                            if (i21 != 0) {
                                WeakHashMap weakHashMap2 = v0.f7946a;
                                view.offsetLeftAndRight(i21);
                            }
                            if (i22 != 0) {
                                WeakHashMap weakHashMap3 = v0.f7946a;
                                view.offsetTopAndBottom(i22);
                            }
                            if (z11 && (bVar = eVar3.f1319a) != null) {
                                bVar.d(this, view, eVar3.f1326k);
                            }
                            rectG4.setEmpty();
                            fVar.b(rectG4);
                            rectG5.setEmpty();
                            fVar.b(rectG5);
                            rectG6.setEmpty();
                            fVar.b(rectG6);
                        } else {
                            eVar = eVar2;
                            i18 = i20;
                            view = view2;
                        }
                    } else {
                        eVar = eVar2;
                        i18 = i20;
                        view = view2;
                    }
                    i20 = i18 + 1;
                    eVar2 = eVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i19 = i19;
                    rectG3 = rectG3;
                }
                ArrayList arrayList3 = arrayList2;
                e eVar5 = eVar2;
                int i23 = size;
                Rect rect3 = rectG3;
                i10 = i19;
                View view4 = view2;
                i(view4, rectG2, true);
                if (eVar5.f1324g != 0 && !rectG2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.f1324g, iD);
                    int i24 = absoluteGravity & 112;
                    if (i24 == 48) {
                        rectG.top = Math.max(rectG.top, rectG2.bottom);
                    } else if (i24 == 80) {
                        rectG.bottom = Math.max(rectG.bottom, getHeight() - rectG2.top);
                    }
                    int i25 = absoluteGravity & 7;
                    if (i25 == 3) {
                        rectG.left = Math.max(rectG.left, rectG2.right);
                    } else if (i25 == 5) {
                        rectG.right = Math.max(rectG.right, getWidth() - rectG2.left);
                    }
                }
                if (eVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = v0.f7946a;
                    if (g0.c(view4) && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        e eVar6 = (e) view4.getLayoutParams();
                        b0.b bVar2 = eVar6.f1319a;
                        Rect rectG7 = g();
                        Rect rectG8 = g();
                        rectG8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (bVar2 == null || !bVar2.a(view4, rectG7)) {
                            rectG7.set(rectG8);
                        } else if (!rectG8.contains(rectG7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectG7.toShortString() + " | Bounds:" + rectG8.toShortString());
                        }
                        rectG8.setEmpty();
                        fVar.b(rectG8);
                        if (rectG7.isEmpty()) {
                            rectG7.setEmpty();
                            fVar.b(rectG7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar6.h, iD);
                            if ((absoluteGravity2 & 48) != 48 || (i16 = (rectG7.top - ((ViewGroup.MarginLayoutParams) eVar6).topMargin) - eVar6.f1325j) >= (i17 = rectG.top)) {
                                z4 = false;
                            } else {
                                v(view4, i17 - i16);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectG7.bottom) - ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin) + eVar6.f1325j) < (i15 = rectG.bottom)) {
                                v(view4, height - i15);
                                z4 = true;
                            }
                            if (!z4) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i13 = (rectG7.left - ((ViewGroup.MarginLayoutParams) eVar6).leftMargin) - eVar6.i) >= (i14 = rectG.left)) {
                                z10 = false;
                            } else {
                                u(view4, i14 - i13);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectG7.right) - ((ViewGroup.MarginLayoutParams) eVar6).rightMargin) + eVar6.i) < (i12 = rectG.right)) {
                                u(view4, width - i12);
                                z10 = true;
                            }
                            if (!z10) {
                                u(view4, 0);
                            }
                            rectG7.setEmpty();
                            fVar.b(rectG7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((e) view4.getLayoutParams()).f1331p);
                    if (rect.equals(rectG2)) {
                        arrayList = arrayList3;
                        i11 = i23;
                    } else {
                        ((e) view4.getLayoutParams()).f1331p.set(rectG2);
                    }
                } else {
                    rect = rect3;
                }
                int i26 = i10 + 1;
                i11 = i23;
                while (true) {
                    arrayList = arrayList3;
                    if (i26 >= i11) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i26);
                    e eVar7 = (e) view5.getLayoutParams();
                    b0.b bVar3 = eVar7.f1319a;
                    if (bVar3 != null && bVar3.b(view5, view4)) {
                        if (i == 0 && eVar7.f1330o) {
                            eVar7.f1330o = false;
                        } else {
                            boolean zD = i != 2 ? bVar3.d(this, view5, view4) : true;
                            if (i == 1) {
                                eVar7.f1330o = zD;
                            }
                        }
                    }
                    i26++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                rect = rectG3;
                i10 = i19;
            }
            i19 = i10 + 1;
            rectG3 = rect;
            size = i11;
            arrayList2 = arrayList;
        }
    }

    public final void q(View view, int i) {
        int i10;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f1326k;
        if (view2 == null && eVar.f1323f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        f fVar = I;
        if (view2 != null) {
            Rect rectG = g();
            Rect rectG2 = g();
            try {
                k(view2, rectG);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectG, rectG2, eVar2, measuredWidth, measuredHeight);
                h(eVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                fVar.b(rectG);
                rectG2.setEmpty();
                fVar.b(rectG2);
            }
        }
        int i11 = eVar.e;
        if (i11 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            Rect rectG3 = g();
            rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f577y != null) {
                WeakHashMap weakHashMap = v0.f7946a;
                if (d0.b(this) && !d0.b(view)) {
                    rectG3.left = this.f577y.b() + rectG3.left;
                    rectG3.top = this.f577y.d() + rectG3.top;
                    rectG3.right -= this.f577y.c();
                    rectG3.bottom -= this.f577y.a();
                }
            }
            Rect rectG4 = g();
            int i12 = eVar3.f1321c;
            if ((i12 & 7) == 0) {
                i12 |= 8388611;
            }
            if ((i12 & 112) == 0) {
                i12 |= 48;
            }
            l.b(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, i);
            view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
            rectG3.setEmpty();
            fVar.b(rectG3);
            rectG4.setEmpty();
            fVar.b(rectG4);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i13 = eVar4.f1321c;
        if (i13 == 0) {
            i13 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i11 = width - i11;
        }
        int iM = m(i11) - measuredWidth2;
        if (i14 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i14 == 5) {
            iM += measuredWidth2;
        }
        if (i15 != 16) {
            i10 = i15 != 80 ? 0 : measuredHeight2;
        } else {
            i10 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f567c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        h hVar = H;
        if (hVar != null) {
            Collections.sort(arrayList, hVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            b0.b bVar = ((e) view.getLayoutParams()).f1319a;
            if (zF && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        bVar.f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        bVar.q(view, motionEventObtain);
                    }
                }
            } else if (!zF && bVar != null) {
                if (i == 0) {
                    zF = bVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    zF = bVar.q(view, motionEvent);
                }
                if (zF) {
                    this.f573u = view;
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        b0.b bVar = ((e) view.getLayoutParams()).f1319a;
        if (bVar != null) {
            bVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f570r) {
            return;
        }
        t(false);
        this.f570r = true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.B = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.A = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.A.setState(getDrawableState());
                }
                Drawable drawable3 = this.A;
                WeakHashMap weakHashMap = v0.f7946a;
                i0.c.b(drawable3, e0.d(this));
                this.A.setVisible(getVisibility() == 0, false);
                this.A.setCallback(this);
            }
            WeakHashMap weakHashMap2 = v0.f7946a;
            d0.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? e0.k.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z4 = i == 0;
        Drawable drawable = this.A;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.A.setVisible(z4, false);
    }

    public final void t(boolean z4) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b0.b bVar = ((e) childAt.getLayoutParams()).f1319a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    bVar.f(this, childAt, motionEventObtain);
                } else {
                    bVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((e) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.f573u = null;
        this.f570r = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A;
    }

    public final void w() {
        WeakHashMap weakHashMap = v0.f7946a;
        if (!d0.b(this)) {
            j0.u(this, null);
            return;
        }
        if (this.C == null) {
            this.C = new b(this, 6);
        }
        j0.u(this, this.C);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}

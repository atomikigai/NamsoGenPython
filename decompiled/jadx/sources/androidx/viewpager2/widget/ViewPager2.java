package androidx.viewpager2.widget;

import a3.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.i0;
import androidx.fragment.app.s;
import androidx.viewpager2.adapter.a;
import da.v;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o6.h0;
import q0.d0;
import q0.v0;
import s2.b;
import s2.c;
import s2.d;
import s2.e;
import s2.f;
import s2.g;
import s2.h;
import s2.k;
import s2.l;
import s2.m;
import x1.e0;
import x1.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public e0 A;
    public boolean B;
    public boolean C;
    public int D;
    public final j E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f1210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1211d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f1212f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f1213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Parcelable f1215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f1216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f1217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f1218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f1219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h0 f1220y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f1221z;

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1208a = new Rect();
        this.f1209b = new Rect();
        a aVar = new a();
        this.f1210c = aVar;
        int i = 0;
        this.e = false;
        this.f1212f = new e(this, i);
        this.f1214s = -1;
        this.A = null;
        this.B = false;
        int i10 = 1;
        this.C = true;
        this.D = -1;
        j jVar = new j();
        jVar.f110d = this;
        jVar.f107a = new q3.e(jVar);
        jVar.f108b = new a5.b(jVar, 26);
        this.E = jVar;
        l lVar = new l(this, context);
        this.f1216u = lVar;
        WeakHashMap weakHashMap = v0.f7946a;
        lVar.setId(q0.e0.a());
        this.f1216u.setDescendantFocusability(131072);
        h hVar = new h(this);
        this.f1213r = hVar;
        this.f1216u.setLayoutManager(hVar);
        this.f1216u.setScrollingTouchSlop(1);
        int[] iArr = r2.a.f8123a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        v0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f1216u.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            l lVar2 = this.f1216u;
            g gVar = new g();
            if (lVar2.N == null) {
                lVar2.N = new ArrayList();
            }
            lVar2.N.add(gVar);
            d dVar = new d(this);
            this.f1218w = dVar;
            this.f1220y = new h0(dVar);
            k kVar = new k(this);
            this.f1217v = kVar;
            kVar.a(this.f1216u);
            this.f1216u.j(this.f1218w);
            a aVar2 = new a();
            this.f1219x = aVar2;
            this.f1218w.f8349a = aVar2;
            f fVar = new f(this, i);
            f fVar2 = new f(this, i10);
            ((ArrayList) aVar2.f1193b).add(fVar);
            ((ArrayList) this.f1219x.f1193b).add(fVar2);
            j jVar2 = this.E;
            l lVar3 = this.f1216u;
            jVar2.getClass();
            d0.s(lVar3, 2);
            jVar2.f109c = new e(jVar2, i10);
            ViewPager2 viewPager2 = (ViewPager2) jVar2.f110d;
            if (d0.c(viewPager2) == 0) {
                d0.s(viewPager2, 1);
            }
            ((ArrayList) this.f1219x.f1193b).add(aVar);
            b bVar = new b();
            this.f1221z = bVar;
            ((ArrayList) this.f1219x.f1193b).add(bVar);
            l lVar4 = this.f1216u;
            attachViewToParent(lVar4, 0, lVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        z adapter;
        if (this.f1214s == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f1215t;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.d) {
                ((androidx.viewpager2.adapter.d) adapter).q(parcelable);
            }
            this.f1215t = null;
        }
        int iMax = Math.max(0, Math.min(this.f1214s, adapter.a() - 1));
        this.f1211d = iMax;
        this.f1214s = -1;
        this.f1216u.g0(iMax);
        this.E.f();
    }

    public final void b(int i) {
        a aVar;
        z adapter = getAdapter();
        if (adapter == null) {
            if (this.f1214s != -1) {
                this.f1214s = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.a() - 1);
        int i10 = this.f1211d;
        if ((iMin == i10 && this.f1218w.f8353f == 0) || iMin == i10) {
            return;
        }
        double d10 = i10;
        this.f1211d = iMin;
        this.E.f();
        d dVar = this.f1218w;
        if (dVar.f8353f != 0) {
            dVar.e();
            c cVar = dVar.f8354g;
            d10 = ((double) cVar.f8346a) + ((double) cVar.f8347b);
        }
        d dVar2 = this.f1218w;
        dVar2.getClass();
        dVar2.e = 2;
        boolean z4 = dVar2.i != iMin;
        dVar2.i = iMin;
        dVar2.c(2);
        if (z4 && (aVar = dVar2.f8349a) != null) {
            aVar.c(iMin);
        }
        double d11 = iMin;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f1216u.j0(iMin);
            return;
        }
        this.f1216u.g0(d11 > d10 ? iMin - 3 : iMin + 3);
        l lVar = this.f1216u;
        lVar.post(new androidx.emoji2.text.j(iMin, lVar));
    }

    public final void c() {
        k kVar = this.f1217v;
        if (kVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewE = kVar.e(this.f1213r);
        if (viewE == null) {
            return;
        }
        this.f1213r.getClass();
        int iF = x1.h0.F(viewE);
        if (iF != this.f1211d && getScrollState() == 0) {
            this.f1219x.c(iF);
        }
        this.e = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f1216u.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f1216u.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof m) {
            int i = ((m) parcelable).f8362a;
            sparseArray.put(this.f1216u.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.E.getClass();
        this.E.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public z getAdapter() {
        return this.f1216u.getAdapter();
    }

    public int getCurrentItem() {
        return this.f1211d;
    }

    public int getItemDecorationCount() {
        return this.f1216u.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.D;
    }

    public int getOrientation() {
        return this.f1213r.f1120p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        l lVar = this.f1216u;
        if (orientation == 0) {
            height = lVar.getWidth() - lVar.getPaddingLeft();
            paddingBottom = lVar.getPaddingRight();
        } else {
            height = lVar.getHeight() - lVar.getPaddingTop();
            paddingBottom = lVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f1218w.f8353f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.E.f110d;
        if (viewPager2.getAdapter() == null) {
            iA = 0;
            iA2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iA = viewPager2.getAdapter().a();
            iA2 = 1;
        } else {
            iA2 = viewPager2.getAdapter().a();
            iA = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) n5.c.a(iA, iA2, 0).f7282a);
        z adapter = viewPager2.getAdapter();
        if (adapter == null || (iA3 = adapter.a()) == 0 || !viewPager2.C) {
            return;
        }
        if (viewPager2.f1211d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f1211d < iA3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        int measuredWidth = this.f1216u.getMeasuredWidth();
        int measuredHeight = this.f1216u.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f1208a;
        rect.left = paddingLeft;
        rect.right = (i11 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i12 - i10) - getPaddingBottom();
        Rect rect2 = this.f1209b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f1216u.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        measureChild(this.f1216u, i, i10);
        int measuredWidth = this.f1216u.getMeasuredWidth();
        int measuredHeight = this.f1216u.getMeasuredHeight();
        int measuredState = this.f1216u.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f1214s = mVar.f8363b;
        this.f1215t = mVar.f8364c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f8362a = this.f1216u.getId();
        int i = this.f1214s;
        if (i == -1) {
            i = this.f1211d;
        }
        mVar.f8363b = i;
        Parcelable parcelable = this.f1215t;
        if (parcelable != null) {
            mVar.f8364c = parcelable;
            return mVar;
        }
        z adapter = this.f1216u.getAdapter();
        if (adapter instanceof androidx.viewpager2.adapter.d) {
            androidx.viewpager2.adapter.d dVar = (androidx.viewpager2.adapter.d) adapter;
            dVar.getClass();
            r.h hVar = dVar.f1202f;
            int iG = hVar.g();
            r.h hVar2 = dVar.f1203g;
            Bundle bundle = new Bundle(hVar2.g() + iG);
            for (int i10 = 0; i10 < hVar.g(); i10++) {
                long jD = hVar.d(i10);
                s sVar = (s) hVar.b(jD);
                if (sVar != null && sVar.y()) {
                    String strG = v.g("f#", jD);
                    i0 i0Var = dVar.e;
                    i0Var.getClass();
                    if (sVar.C != i0Var) {
                        i0Var.Y(new IllegalStateException(q1.a.k("Fragment ", sVar, " is not currently in the FragmentManager")));
                        throw null;
                    }
                    bundle.putString(strG, sVar.e);
                }
            }
            for (int i11 = 0; i11 < hVar2.g(); i11++) {
                long jD2 = hVar2.d(i11);
                if (androidx.viewpager2.adapter.d.l(jD2)) {
                    bundle.putParcelable(v.g("s#", jD2), (Parcelable) hVar2.b(jD2));
                }
            }
            mVar.f8364c = bundle;
        }
        return mVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.E.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        j jVar = this.E;
        ViewPager2 viewPager2 = (ViewPager2) jVar.f110d;
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager3 = (ViewPager2) jVar.f110d;
        if (viewPager3.C) {
            viewPager3.b(currentItem);
        }
        return true;
    }

    public void setAdapter(z zVar) {
        z adapter = this.f1216u.getAdapter();
        j jVar = this.E;
        if (adapter != null) {
            adapter.f10251a.unregisterObserver((e) jVar.f109c);
        } else {
            jVar.getClass();
        }
        e eVar = this.f1212f;
        if (adapter != null) {
            adapter.f10251a.unregisterObserver(eVar);
        }
        this.f1216u.setAdapter(zVar);
        this.f1211d = 0;
        a();
        j jVar2 = this.E;
        jVar2.f();
        if (zVar != null) {
            zVar.f10251a.registerObserver((e) jVar2.f109c);
        }
        if (zVar != null) {
            zVar.f10251a.registerObserver(eVar);
        }
    }

    public void setCurrentItem(int i) {
        Object obj = this.f1220y.f7621a;
        b(i);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.E.f();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.D = i;
        this.f1216u.requestLayout();
    }

    public void setOrientation(int i) {
        this.f1213r.c1(i);
        this.E.f();
    }

    public void setPageTransformer(s2.j jVar) {
        if (jVar != null) {
            if (!this.B) {
                this.A = this.f1216u.getItemAnimator();
                this.B = true;
            }
            this.f1216u.setItemAnimator(null);
        } else if (this.B) {
            this.f1216u.setItemAnimator(this.A);
            this.A = null;
            this.B = false;
        }
        this.f1221z.getClass();
        if (jVar == null) {
            return;
        }
        this.f1221z.getClass();
        this.f1221z.getClass();
    }

    public void setUserInputEnabled(boolean z4) {
        this.C = z4;
        this.E.f();
    }
}

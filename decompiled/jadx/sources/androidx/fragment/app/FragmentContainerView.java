package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.d2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f816d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f816d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f5128b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException(da.v.k("FragmentContainerView must be within a FragmentActivity to use ", str, "=\"", classAttribute, "\""));
            }
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.f814b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f813a == null) {
            this.f813a = new ArrayList();
        }
        this.f813a.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof s ? (s) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z4) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof s ? (s) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z4);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        d2 d2VarG;
        d2 d2VarG2 = d2.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f815c;
        if (onApplyWindowInsetsListener != null) {
            d2VarG = d2.g(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = q0.v0.f7946a;
            WindowInsets windowInsetsF = d2VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = q0.h0.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    d2VarG2 = d2.g(this, windowInsetsB);
                }
            }
            d2VarG = d2VarG2;
        }
        if (!d2VarG.f7892a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = q0.v0.f7946a;
                WindowInsets windowInsetsF2 = d2VarG.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = q0.h0.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        d2.g(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f816d && this.f813a != null) {
            for (int i = 0; i < this.f813a.size(); i++) {
                super.drawChild(canvas, (View) this.f813a.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        ArrayList arrayList;
        if (!this.f816d || (arrayList = this.f813a) == null || arrayList.size() <= 0 || !this.f813a.contains(view)) {
            return super.drawChild(canvas, view, j4);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f814b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f813a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f816d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        if (z4) {
            a(view);
        }
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i10) {
        for (int i11 = i; i11 < i + i10; i11++) {
            a(getChildAt(i11));
        }
        super.removeViews(i, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i10) {
        for (int i11 = i; i11 < i + i10; i11++) {
            a(getChildAt(i11));
        }
        super.removeViewsInLayout(i, i10);
    }

    public void setDrawDisappearingViewsLast(boolean z4) {
        this.f816d = z4;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f815c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f814b == null) {
                this.f814b = new ArrayList();
            }
            this.f814b.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}

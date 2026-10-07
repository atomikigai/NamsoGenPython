package f9;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3655c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f3656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f3657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabLayout tabLayout, Context context) {
        super(context);
        this.f3657b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        p0.f fVar = TabLayout.f2519c0;
        TabLayout tabLayout = this.f3657b;
        tabLayout.getClass();
        View childAt = getChildAt(i);
        b9.e eVar = tabLayout.T;
        Drawable drawable = tabLayout.f2535z;
        eVar.getClass();
        RectF rectFR = b9.e.r(tabLayout, childAt);
        drawable.setBounds((int) rectFR.left, drawable.getBounds().top, (int) rectFR.right, drawable.getBounds().bottom);
        tabLayout.f2520a = i;
    }

    public final void b(int i) {
        TabLayout tabLayout = this.f3657b;
        Rect bounds = tabLayout.f2535z.getBounds();
        tabLayout.f2535z.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f10) {
        TabLayout tabLayout = this.f3657b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f2535z;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f2535z.getBounds().bottom);
        } else {
            tabLayout.T.x(tabLayout, view, view2, f10, tabLayout.f2535z);
        }
        WeakHashMap weakHashMap = v0.f7946a;
        d0.k(this);
    }

    public final void d(int i, int i10, boolean z4) {
        TabLayout tabLayout = this.f3657b;
        if (tabLayout.f2520a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f2520a = i;
        e eVar = new e(this, childAt, childAt2);
        if (!z4) {
            this.f3656a.removeAllUpdateListeners();
            this.f3656a.addUpdateListener(eVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f3656a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.U);
        valueAnimator.setDuration(i10);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f3657b;
        int iHeight = tabLayout.f2535z.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f2535z.getIntrinsicHeight();
        }
        int i = tabLayout.M;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f2535z.getBounds().width() > 0) {
            Rect bounds = tabLayout.f2535z.getBounds();
            tabLayout.f2535z.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f2535z.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        ValueAnimator valueAnimator = this.f3656a;
        TabLayout tabLayout = this.f3657b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f2520a == -1) {
            tabLayout.f2520a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f2520a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f3657b;
        boolean z4 = true;
        if (tabLayout.K == 1 || tabLayout.N == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) n.d(getContext(), 16)) * 2)) {
                boolean z10 = false;
                for (int i12 = 0; i12 < childCount; i12++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i12).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z10 = true;
                    }
                }
                z4 = z10;
            } else {
                tabLayout.K = 0;
                tabLayout.i(false);
            }
            if (z4) {
                super.onMeasure(i, i10);
            }
        }
    }
}

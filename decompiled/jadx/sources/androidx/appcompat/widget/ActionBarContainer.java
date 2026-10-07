package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import app.namso_gen.spacehowen.R;
import java.util.WeakHashMap;
import l.n2;
import q0.d0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f449d;
    public Drawable e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f450f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f453t;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.b bVar = new l.b(this);
        WeakHashMap weakHashMap = v0.f7946a;
        d0.q(this, bVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f3552a);
        boolean z4 = false;
        this.f449d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f453t = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f451r = true;
            this.f450f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f451r ? !(this.f449d != null || this.e != null) : this.f450f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f449d;
        if (drawable != null && drawable.isStateful()) {
            this.f449d.setState(getDrawableState());
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f450f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f450f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f449d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f450f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f447b = findViewById(R.id.action_bar);
        this.f448c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f446a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        boolean z10 = true;
        if (this.f451r) {
            Drawable drawable = this.f450f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f449d == null) {
                z10 = false;
            } else if (this.f447b.getVisibility() == 0) {
                this.f449d.setBounds(this.f447b.getLeft(), this.f447b.getTop(), this.f447b.getRight(), this.f447b.getBottom());
            } else {
                View view = this.f448c;
                if (view == null || view.getVisibility() != 0) {
                    this.f449d.setBounds(0, 0, 0, 0);
                } else {
                    this.f449d.setBounds(this.f448c.getLeft(), this.f448c.getTop(), this.f448c.getRight(), this.f448c.getBottom());
                }
            }
            this.f452s = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        if (this.f447b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f453t) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i10);
        if (this.f447b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f449d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f449d);
        }
        this.f449d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f447b;
            if (view != null) {
                this.f449d.setBounds(view.getLeft(), this.f447b.getTop(), this.f447b.getRight(), this.f447b.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f451r ? !(this.f449d != null || this.e != null) : this.f450f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f450f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f450f);
        }
        this.f450f = drawable;
        boolean z4 = this.f451r;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f450f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f449d != null || this.e != null) : this.f450f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.e);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f452s && this.e != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f451r ? !(this.f449d != null || this.e != null) : this.f450f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z4) {
        this.f446a = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z4 = i == 0;
        Drawable drawable = this.f449d;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f450f;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f449d;
        boolean z4 = this.f451r;
        if (drawable == drawable2 && !z4) {
            return true;
        }
        if (drawable == this.e && this.f452s) {
            return true;
        }
        return (drawable == this.f450f && z4) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(n2 n2Var) {
    }
}

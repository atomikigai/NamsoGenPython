package w8;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import q0.g0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9735d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f9736f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f9739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f9740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f9741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f9742w;

    public d(Context context, AttributeSet attributeSet, int i, int i10) {
        super(i9.a.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.f9737r = false;
        this.f9738s = 4;
        this.f9739t = new b(this, 0);
        this.f9740u = new b(this, 1);
        this.f9741v = new c(this, 0);
        this.f9742w = new c(this, 1);
        Context context2 = getContext();
        this.f9732a = a(context2, attributeSet);
        u8.n.a(context2, attributeSet, i, i10);
        int[] iArr = d8.a.f3013b;
        u8.n.b(context2, attributeSet, iArr, i, i10, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i10);
        typedArrayObtainStyledAttributes.getInt(5, -1);
        this.e = Math.min(typedArrayObtainStyledAttributes.getInt(3, -1), zzbbs.zzq.zzf);
        typedArrayObtainStyledAttributes.recycle();
        this.f9736f = new a();
        this.f9735d = true;
    }

    private o getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f9782w;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f9764w;
    }

    public abstract e a(Context context, AttributeSet attributeSet);

    public void b(int i, boolean z4) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z4) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f9733b = i;
            this.f9734c = z4;
            this.f9737r = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.f9736f;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f9783x.h();
                    return;
                }
            }
            this.f9741v.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = v0.f7946a;
        if (!g0.b(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f9732a.f9747f;
    }

    public int[] getIndicatorColor() {
        return this.f9732a.f9745c;
    }

    public int getShowAnimationBehavior() {
        return this.f9732a.e;
    }

    public int getTrackColor() {
        return this.f9732a.f9746d;
    }

    public int getTrackCornerRadius() {
        return this.f9732a.f9744b;
    }

    public int getTrackThickness() {
        return this.f9732a.f9743a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f9783x.f(this.f9741v);
        }
        l progressDrawable = getProgressDrawable();
        c cVar = this.f9742w;
        if (progressDrawable != null) {
            l progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f9775f == null) {
                progressDrawable2.f9775f = new ArrayList();
            }
            if (!progressDrawable2.f9775f.contains(cVar)) {
                progressDrawable2.f9775f.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            p indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f9775f == null) {
                indeterminateDrawable.f9775f = new ArrayList();
            }
            if (!indeterminateDrawable.f9775f.contains(cVar)) {
                indeterminateDrawable.f9775f.add(cVar);
            }
        }
        if (c()) {
            if (this.e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f9740u);
        removeCallbacks(this.f9739t);
        ((n) getCurrentDrawable()).e(false, false, false);
        p indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f9742w;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().g(cVar);
            getIndeterminateDrawable().f9783x.j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i10) {
        try {
            o currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.d() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i10) : currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z4 = i == 0;
        if (this.f9735d) {
            ((n) getCurrentDrawable()).e(c(), false, z4);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f9735d) {
            ((n) getCurrentDrawable()).e(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.f9736f = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f9773c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f9773c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f9732a.f9747f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z4) {
        try {
            if (z4 == isIndeterminate()) {
                return;
            }
            n nVar = (n) getCurrentDrawable();
            if (nVar != null) {
                nVar.e(false, false, false);
            }
            super.setIndeterminate(z4);
            n nVar2 = (n) getCurrentDrawable();
            if (nVar2 != null) {
                nVar2.e(c(), false, false);
            }
            if ((nVar2 instanceof p) && c()) {
                ((p) nVar2).f9783x.i();
            }
            this.f9737r = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof p)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((n) drawable).e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{com.bumptech.glide.c.p(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f9732a.f9745c = iArr;
        getIndeterminateDrawable().f9783x.d();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof l)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            l lVar = (l) drawable;
            lVar.e(false, false, false);
            super.setProgressDrawable(lVar);
            lVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f9732a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        e eVar = this.f9732a;
        if (eVar.f9746d != i) {
            eVar.f9746d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        e eVar = this.f9732a;
        if (eVar.f9744b != i) {
            eVar.f9744b = Math.min(i, eVar.f9743a / 2);
        }
    }

    public void setTrackThickness(int i) {
        e eVar = this.f9732a;
        if (eVar.f9743a != i) {
            eVar.f9743a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f9738s = i;
    }

    @Override // android.widget.ProgressBar
    public p getIndeterminateDrawable() {
        return (p) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public l getProgressDrawable() {
        return (l) super.getProgressDrawable();
    }
}

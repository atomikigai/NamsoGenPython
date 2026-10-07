package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValueAnimator f2579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2582d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f2583f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f2584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f2586t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2587u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f2588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2590x;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f2579a = new ValueAnimator();
        this.f2581c = new ArrayList();
        Paint paint = new Paint();
        this.f2583f = paint;
        this.f2584r = new RectF();
        this.f2590x = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d8.a.i, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        android.support.v4.media.session.a.v(context, R.attr.motionDurationLong2, 200);
        android.support.v4.media.session.a.w(context, R.attr.motionEasingEmphasizedInterpolator, e8.a.f3492b);
        this.f2589w = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2582d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f2585s = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.e = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = v0.f7946a;
        d0.s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f2589w * 0.66f) : this.f2589w;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f2579a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = f10 % 360.0f;
        this.f2586t = f11;
        this.f2588v = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f2590x);
        float fCos = (((float) Math.cos(this.f2588v)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f2588v))) + height;
        float f12 = this.f2582d;
        this.f2584r.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        ArrayList arrayList = this.f2581c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((d) obj);
            if (Math.abs(clockFaceView.T - f11) > 0.001f) {
                clockFaceView.T = f11;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.f2590x);
        float f10 = width;
        float f11 = iA;
        float fCos = (((float) Math.cos(this.f2588v)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f2588v))) + f12;
        Paint paint = this.f2583f;
        paint.setStrokeWidth(0.0f);
        int i = this.f2582d;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.f2588v);
        double d10 = iA - i;
        paint.setStrokeWidth(this.f2585s);
        canvas.drawLine(f10, f12, width + ((int) (Math.cos(this.f2588v) * d10)), height + ((int) (d10 * dSin)), paint);
        canvas.drawCircle(f10, f12, this.e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        if (this.f2579a.isRunning()) {
            return;
        }
        b(this.f2586t);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.f2587u = false;
            z4 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f2587u;
            if (this.f2580b) {
                this.f2590x = ((float) Math.hypot((double) (x4 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + n.d(getContext(), 12) ? 2 : 1;
            }
            z4 = false;
        } else {
            z10 = false;
            z4 = false;
        }
        boolean z12 = this.f2587u;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x4 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f10 = i;
        boolean z13 = this.f2586t != f10;
        if (z4 && z13) {
            z11 = true;
        } else if (z13 || z10) {
            b(f10);
            z11 = true;
        }
        this.f2587u = z12 | z11;
        return true;
    }
}

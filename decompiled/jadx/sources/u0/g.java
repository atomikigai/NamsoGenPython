package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import l.r1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnTouchListener {
    public static final int C = ViewConfiguration.getTapTimeout();
    public boolean A;
    public final r1 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f8759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f8760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.activity.i f8761d;
    public final float[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f8762f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f8765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f8766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f8767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8771z;

    public g(r1 r1Var) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.f8757g = -1L;
        aVar.f8756f = 0L;
        this.f8758a = aVar;
        this.f8759b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8762f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f8765t = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f8766u = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8767v = fArr5;
        this.f8760c = r1Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f8763r = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f8764s = C;
        aVar.f8752a = 500;
        aVar.f8753b = 500;
        this.B = r1Var;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i, float f10, float f11, float f12) {
        float fB;
        float interpolation;
        float fB2 = b(this.e[i] * f11, 0.0f, this.f8762f[i]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f8759b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f13 = this.f8765t[i];
            float f14 = this.f8766u[i];
            float f15 = this.f8767v[i];
            float f16 = f13 * f12;
            return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f17 = this.f8765t[i];
        float f18 = this.f8766u[i];
        float f19 = this.f8767v[i];
        float f110 = f17 * f12;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i = this.f8763r;
            if (i == 0 || i == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f8771z && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f8769x) {
            this.f8771z = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f8758a;
        int i10 = (int) (jCurrentAnimationTimeMillis - aVar.e);
        int i11 = aVar.f8753b;
        if (i10 > i11) {
            i = i11;
        } else if (i10 >= 0) {
            i = i10;
        }
        aVar.i = i;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f8757g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.f8758a;
        float f10 = aVar.f8755d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f8754c);
        if (iAbs != 0 && (count = (r1Var = this.B).getCount()) != 0) {
            int childCount = r1Var.getChildCount();
            int firstVisiblePosition = r1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && r1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && r1Var.getChildAt(childCount - 1).getBottom() <= r1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.A
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f8770y = r2
            r7.f8768w = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            l.r1 r4 = r7.f8760c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            u0.a r9 = r7.f8758a
            r9.f8754c = r0
            r9.f8755d = r8
            boolean r8 = r7.f8771z
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            androidx.activity.i r8 = r7.f8761d
            if (r8 != 0) goto L62
            androidx.activity.i r8 = new androidx.activity.i
            r9 = 29
            r8.<init>(r7, r9)
            r7.f8761d = r8
        L62:
            r7.f8771z = r2
            r7.f8769x = r2
            boolean r8 = r7.f8768w
            if (r8 != 0) goto L77
            int r8 = r7.f8764s
            if (r8 <= 0) goto L77
            androidx.activity.i r9 = r7.f8761d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = q0.v0.f7946a
            q0.d0.n(r4, r9, r5)
            goto L7c
        L77:
            androidx.activity.i r8 = r7.f8761d
            r8.run()
        L7c:
            r7.f8768w = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

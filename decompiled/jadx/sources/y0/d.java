package y0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.Arrays;
import java.util.WeakHashMap;
import q0.v0;
import r7.g;
import v9.i0;
import x1.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f10375v = new y(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10377b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f10379d;
    public float[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f10380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f10381g;
    public int[] h;
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f10382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f10384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f10385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f10386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OverScroller f10388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f10389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f10390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f10392t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10378c = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i0 f10393u = new i0(this, 4);

    public d(Context context, CoordinatorLayout coordinatorLayout, g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f10392t = coordinatorLayout;
        this.f10389q = gVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10387o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f10377b = viewConfiguration.getScaledTouchSlop();
        this.f10385m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10386n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10388p = new OverScroller(context, f10375v);
    }

    public final void a() {
        this.f10378c = -1;
        float[] fArr = this.f10379d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f10380f, 0.0f);
            Arrays.fill(this.f10381g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f10382j, 0);
            this.f10383k = 0;
        }
        VelocityTracker velocityTracker = this.f10384l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10384l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f10392t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f10390r = view;
        this.f10378c = i;
        this.f10389q.v(view, i);
        n(1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean c(View view, float f10, float f11) {
        if (view != null) {
            g gVar = this.f10389q;
            boolean z4 = gVar.s(view) > 0;
            boolean z10 = gVar.t() > 0;
            if (z4 && z10) {
                float f12 = (f11 * f11) + (f10 * f10);
                int i = this.f10377b;
                if (f12 > i * i) {
                    return true;
                }
            } else if (!z4 ? !(!z10 || Math.abs(f11) <= this.f10377b) : Math.abs(f10) > this.f10377b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        float[] fArr = this.f10379d;
        if (fArr != null) {
            int i10 = this.f10383k;
            int i11 = 1 << i;
            if ((i10 & i11) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f10380f[i] = 0.0f;
                this.f10381g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.f10382j[i] = 0;
                this.f10383k = (~i11) & i10;
            }
        }
    }

    public final int e(int i, int i10, int i11) {
        if (i == 0) {
            return 0;
        }
        int width = this.f10392t.getWidth();
        float f10 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f10) + f10;
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i11) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f10376a == 2) {
            OverScroller overScroller = this.f10388p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f10390r.getLeft();
            int top = currY - this.f10390r.getTop();
            if (left != 0) {
                View view = this.f10390r;
                WeakHashMap weakHashMap = v0.f7946a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f10390r;
                WeakHashMap weakHashMap2 = v0.f7946a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f10389q.x(this.f10390r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f10392t.post(this.f10393u);
            }
        }
        return this.f10376a == 2;
    }

    public final View g(int i, int i10) {
        CoordinatorLayout coordinatorLayout = this.f10392t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f10389q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f10390r.getLeft();
        int top = this.f10390r.getTop();
        int i13 = i - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f10388p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f10390r;
        int i15 = (int) this.f10386n;
        int i16 = (int) this.f10385m;
        int iAbs = Math.abs(i11);
        if (iAbs < i15) {
            i11 = 0;
        } else if (iAbs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int iAbs2 = Math.abs(i12);
        if (iAbs2 < i15) {
            i12 = 0;
        } else if (iAbs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int iAbs3 = Math.abs(i13);
        int iAbs4 = Math.abs(i14);
        int iAbs5 = Math.abs(i11);
        int iAbs6 = Math.abs(i12);
        int i17 = iAbs5 + iAbs6;
        int i18 = iAbs3 + iAbs4;
        if (i11 != 0) {
            f10 = iAbs5;
            f11 = i17;
        } else {
            f10 = iAbs3;
            f11 = i18;
        }
        float f14 = f10 / f11;
        if (i12 != 0) {
            f12 = iAbs6;
            f13 = i17;
        } else {
            f12 = iAbs4;
            f13 = i18;
        }
        float f15 = f12 / f13;
        g gVar = this.f10389q;
        overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, gVar.t()) * f15) + (e(i13, i11, gVar.s(view)) * f14)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f10383k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10384l == null) {
            this.f10384l = VelocityTracker.obtain();
        }
        this.f10384l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x4, (int) y10);
            l(x4, y10, pointerId);
            q(viewG, pointerId);
            int i11 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f10376a == 1) {
                k();
            }
            a();
            return;
        }
        g gVar = this.f10389q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f10376a == 1) {
                    this.f10391s = true;
                    gVar.y(this.f10390r, 0.0f, 0.0f);
                    this.f10391s = false;
                    if (this.f10376a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                l(x10, y11, pointerId2);
                if (this.f10376a == 0) {
                    q(g((int) x10, (int) y11), pointerId2);
                    int i12 = this.h[pointerId2];
                    return;
                }
                int i13 = (int) x10;
                int i14 = (int) y11;
                View view = this.f10390r;
                if (view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom()) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    q(this.f10390r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f10376a == 1 && pointerId3 == this.f10378c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f10378c) {
                        View viewG2 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view2 = this.f10390r;
                        if (viewG2 == view2 && q(view2, pointerId4)) {
                            i = this.f10378c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f10376a == 1) {
            if (i(this.f10378c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f10378c);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f10380f;
                int i15 = this.f10378c;
                int i16 = (int) (x11 - fArr[i15]);
                int i17 = (int) (y12 - this.f10381g[i15]);
                int left = this.f10390r.getLeft() + i16;
                int top = this.f10390r.getTop() + i17;
                int left2 = this.f10390r.getLeft();
                int top2 = this.f10390r.getTop();
                if (i16 != 0) {
                    left = gVar.e(this.f10390r, left);
                    WeakHashMap weakHashMap = v0.f7946a;
                    this.f10390r.offsetLeftAndRight(left - left2);
                }
                if (i17 != 0) {
                    top = gVar.f(this.f10390r, top);
                    WeakHashMap weakHashMap2 = v0.f7946a;
                    this.f10390r.offsetTopAndBottom(top - top2);
                }
                if (i16 != 0 || i17 != 0) {
                    gVar.x(this.f10390r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i10 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i10);
            if (i(pointerId5)) {
                float x12 = motionEvent.getX(i10);
                float y13 = motionEvent.getY(i10);
                float f10 = x12 - this.f10379d[pointerId5];
                float f11 = y13 - this.e[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i18 = this.h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i19 = this.h[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i20 = this.h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i21 = this.h[pointerId5];
                if (this.f10376a != 1) {
                    View viewG3 = g((int) x12, (int) y13);
                    if (c(viewG3, f10, f11) && q(viewG3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i10++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f10384l;
        float f10 = this.f10385m;
        velocityTracker.computeCurrentVelocity(zzbbs.zzq.zzf, f10);
        float xVelocity = this.f10384l.getXVelocity(this.f10378c);
        float fAbs = Math.abs(xVelocity);
        float f11 = this.f10386n;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f10384l.getYVelocity(this.f10378c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f11) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f10391s = true;
        this.f10389q.y(this.f10390r, xVelocity, f10);
        this.f10391s = false;
        if (this.f10376a == 1) {
            n(0);
        }
    }

    public final void l(float f10, float f11, int i) {
        float[] fArr = this.f10379d;
        if (fArr == null || fArr.length <= i) {
            int i10 = i + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10380f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10381g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10382j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10379d = fArr2;
            this.e = fArr3;
            this.f10380f = fArr4;
            this.f10381g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.f10382j = iArr3;
        }
        float[] fArr9 = this.f10379d;
        this.f10380f[i] = f10;
        fArr9[i] = f10;
        float[] fArr10 = this.e;
        this.f10381g[i] = f11;
        fArr10[i] = f11;
        int[] iArr7 = this.h;
        int i11 = (int) f10;
        int i12 = (int) f11;
        CoordinatorLayout coordinatorLayout = this.f10392t;
        int left = coordinatorLayout.getLeft();
        int i13 = this.f10387o;
        int i14 = i11 < left + i13 ? 1 : 0;
        if (i12 < coordinatorLayout.getTop() + i13) {
            i14 |= 4;
        }
        if (i11 > coordinatorLayout.getRight() - i13) {
            i14 |= 2;
        }
        if (i12 > coordinatorLayout.getBottom() - i13) {
            i14 |= 8;
        }
        iArr7[i] = i14;
        this.f10383k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x4 = motionEvent.getX(i);
                float y10 = motionEvent.getY(i);
                this.f10380f[pointerId] = x4;
                this.f10381g[pointerId] = y10;
            }
        }
    }

    public final void n(int i) {
        this.f10392t.removeCallbacks(this.f10393u);
        if (this.f10376a != i) {
            this.f10376a = i;
            this.f10389q.w(i);
            if (this.f10376a == 0) {
                this.f10390r = null;
            }
        }
    }

    public final boolean o(int i, int i10) {
        if (this.f10391s) {
            return h(i, i10, (int) this.f10384l.getXVelocity(this.f10378c), (int) this.f10384l.getYVelocity(this.f10378c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    public final boolean p(MotionEvent motionEvent) {
        View viewG;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10384l == null) {
            this.f10384l = VelocityTracker.obtain();
        }
        this.f10384l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            l(x4, y10, pointerId);
            View viewG2 = g((int) x4, (int) y10);
            if (viewG2 == this.f10390r && this.f10376a == 2) {
                q(viewG2, pointerId);
            }
            int i = this.h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                l(x10, y11, pointerId2);
                int i10 = this.f10376a;
                if (i10 == 0) {
                    int i11 = this.h[pointerId2];
                } else if (i10 == 2 && (viewG = g((int) x10, (int) y11)) == this.f10390r) {
                    q(viewG, pointerId2);
                }
            } else if (actionMasked == 6) {
                d(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f10379d != null && this.e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i12 = 0; i12 < pointerCount; i12++) {
                int pointerId3 = motionEvent.getPointerId(i12);
                if (i(pointerId3)) {
                    float x11 = motionEvent.getX(i12);
                    float y12 = motionEvent.getY(i12);
                    float f10 = x11 - this.f10379d[pointerId3];
                    float f11 = y12 - this.e[pointerId3];
                    View viewG3 = g((int) x11, (int) y12);
                    boolean z4 = viewG3 != null && c(viewG3, f10, f11);
                    if (!z4) {
                        Math.abs(f10);
                        Math.abs(f11);
                        int i13 = this.h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i14 = this.h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f11);
                        int i15 = this.h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i16 = this.h[pointerId3];
                        if (this.f10376a != 1) {
                            break;
                        }
                    } else {
                        int left = viewG3.getLeft();
                        g gVar = this.f10389q;
                        int iE = gVar.e(viewG3, ((int) f10) + left);
                        int top = viewG3.getTop();
                        int iF = gVar.f(viewG3, ((int) f11) + top);
                        int iS = gVar.s(viewG3);
                        int iT = gVar.t();
                        if ((iS == 0 || (iS > 0 && iE == left)) && (iT == 0 || (iT > 0 && iF == top))) {
                            break;
                        }
                        Math.abs(f10);
                        Math.abs(f11);
                        int i17 = this.h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i18 = this.h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f11);
                        int i19 = this.h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i110 = this.h[pointerId3];
                        if (this.f10376a != 1 || (z4 && q(viewG3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m(motionEvent);
        }
        return this.f10376a == 1;
    }

    public final boolean q(View view, int i) {
        if (view == this.f10390r && this.f10378c == i) {
            return true;
        }
        if (view == null || !this.f10389q.H(view, i)) {
            return false;
        }
        this.f10378c = i;
        b(view, i);
        return true;
    }
}

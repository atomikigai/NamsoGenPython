package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f6432d;
    public t1 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t1 f6433f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f6436t = new int[2];

    public u1(View view) {
        this.f6432d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f6429a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f6430b = tapTimeout;
        this.f6431c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        t1 t1Var = this.f6433f;
        View view = this.f6432d;
        if (t1Var != null) {
            view.removeCallbacks(t1Var);
        }
        t1 t1Var2 = this.e;
        if (t1Var2 != null) {
            view.removeCallbacks(t1Var2);
        }
    }

    public abstract k.c0 b();

    public abstract boolean c();

    public boolean d() {
        k.c0 c0VarB = b();
        if (c0VarB == null || !c0VarB.a()) {
            return true;
        }
        c0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        r1 r1VarJ;
        boolean z10 = this.f6434r;
        View view2 = this.f6432d;
        if (z10) {
            k.c0 c0VarB = b();
            if (c0VarB != null && c0VarB.a() && (r1VarJ = c0VarB.j()) != null && r1VarJ.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f6436t;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                r1VarJ.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = r1VarJ.b(motionEventObtainNoHistory, this.f6435s);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z11) {
                    z4 = true;
                } else if (d()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else if (d()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f6435s = motionEvent.getPointerId(0);
                    if (this.e == null) {
                        this.e = new t1(this, 0);
                    }
                    view2.postDelayed(this.e, this.f6430b);
                    if (this.f6433f == null) {
                        this.f6433f = new t1(this, 1);
                    }
                    view2.postDelayed(this.f6433f, this.f6431c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f6435s);
                    if (iFindPointerIndex >= 0) {
                        float x4 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f6429a;
                        float f11 = -f10;
                        if (x4 < f11 || y10 < f11 || x4 >= (view2.getRight() - view2.getLeft()) + f10 || y10 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z4 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f6434r = z4;
        return z4 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6434r = false;
        this.f6435s = -1;
        t1 t1Var = this.e;
        if (t1Var != null) {
            this.f6432d.removeCallbacks(t1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

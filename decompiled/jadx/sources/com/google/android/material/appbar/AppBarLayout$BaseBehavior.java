package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.zzbbs;
import f8.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2318b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2320d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VelocityTracker f2321f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2319c = -1;
    public int e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    @Override // b0.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.e < 0) {
            this.e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2318b) {
            int i = this.f2319c;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y10 - this.f2320d) > this.e) {
                    this.f2320d = y10;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                    this.f2319c = -1;
                    motionEvent.getX();
                    motionEvent.getY();
                    throw new ClassCastException();
                }
                velocityTracker = this.f2321f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.f2319c = -1;
                motionEvent.getX();
                motionEvent.getY();
                throw new ClassCastException();
            }
            velocityTracker = this.f2321f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override // f8.a, b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // b0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        throw new ClassCastException();
    }

    @Override // b0.b
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10, int[] iArr, int i11) {
        throw new ClassCastException();
    }

    @Override // b0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // b0.b
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // b0.b
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // b0.b
    public final boolean o(View view, int i, int i10) {
        throw new ClassCastException();
    }

    @Override // b0.b
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[RETURN] */
    @Override // b0.b
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                        this.f2319c = motionEvent.getPointerId(i);
                        this.f2320d = (int) (motionEvent.getY(i) + 0.5f);
                    }
                }
                velocityTracker = this.f2321f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (this.f2318b) {
                    return true;
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2319c);
                if (iFindPointerIndex != -1) {
                    this.f2320d = (int) motionEvent.getY(iFindPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            return false;
        }
        VelocityTracker velocityTracker2 = this.f2321f;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f2321f.computeCurrentVelocity(zzbbs.zzq.zzf);
            this.f2321f.getYVelocity(this.f2319c);
            view.getClass();
            throw new ClassCastException();
        }
        this.f2318b = false;
        this.f2319c = -1;
        VelocityTracker velocityTracker3 = this.f2321f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f2321f = null;
        }
        velocityTracker = this.f2321f;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.f2318b) {
            return false;
        }
        return true;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}

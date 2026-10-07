package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f1010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1013d;
    public boolean e;

    public x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = true;
        this.f1010a = viewGroup;
        this.f1011b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.e = true;
        if (this.f1012c) {
            return !this.f1013d;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.f1012c = true;
            q0.w.a(this.f1010a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f1012c;
        ViewGroup viewGroup = this.f1010a;
        if (z4 || !this.e) {
            viewGroup.endViewTransition(this.f1011b);
            this.f1013d = true;
        } else {
            this.e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f10) {
        this.e = true;
        if (this.f1012c) {
            return !this.f1013d;
        }
        if (!super.getTransformation(j4, transformation, f10)) {
            this.f1012c = true;
            q0.w.a(this.f1010a, this);
        }
        return true;
    }
}

package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.b;
import h8.a;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;
import r0.f;
import y0.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f2334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a5.b f2335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2337d;
    public int e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2338f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2339g = 0.5f;
    public final a h = new a(this);

    @Override // b0.b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f2336c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2336c = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2336c = false;
        }
        if (zO) {
            if (this.f2334a == null) {
                this.f2334a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.f2337d && this.f2334a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = v0.f7946a;
        if (d0.c(view) == 0) {
            d0.s(view, 1);
            v0.i(view, 1048576);
            v0.g(view, 0);
            if (r(view)) {
                v0.j(view, f.f8110j, new a4.b(this, 15));
            }
        }
        return false;
    }

    @Override // b0.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f2334a == null) {
            return false;
        }
        if (this.f2337d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2334a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}

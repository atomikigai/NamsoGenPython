package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2592a;

    public b(ClockFaceView clockFaceView) {
        this.f2592a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2592a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.G.f2582d) - clockFaceView.O;
        if (height != clockFaceView.E) {
            clockFaceView.E = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.G;
            clockHandView.f2589w = clockFaceView.E;
            clockHandView.invalidate();
        }
        return true;
    }
}

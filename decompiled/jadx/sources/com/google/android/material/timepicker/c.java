package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import app.namso_gen.spacehowen.R;
import r0.k;
import r0.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2593d;

    public c(ClockFaceView clockFaceView) {
        this.f2593d = clockFaceView;
    }

    @Override // q0.c
    public final void d(View view, l lVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f8119a;
        this.f7886a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2593d.K.get(iIntValue - 1));
        }
        lVar.j(k.a(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        lVar.b(r0.f.e);
    }

    @Override // q0.c
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2593d;
        view.getHitRect(clockFaceView.H);
        float fCenterX = clockFaceView.H.centerX();
        float fCenterY = clockFaceView.H.centerY();
        clockFaceView.G.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.G.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}

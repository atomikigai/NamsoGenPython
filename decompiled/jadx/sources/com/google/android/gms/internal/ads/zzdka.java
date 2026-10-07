package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdka implements GestureDetector.OnGestureListener {
    private final zzdit zza;
    private final zzdju zzb;

    public zzdka(zzdit zzditVar, zzdju zzdjuVar) {
        this.zza = zzditVar;
        this.zzb = zzdjuVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int y10;
        try {
            if (this.zza != null) {
                int i = -1;
                if (Math.abs(f10) > Math.abs(f11)) {
                    if (f10 > 0.0f) {
                        y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                        i = 1;
                    } else if (f10 < 0.0f) {
                        y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                        i = 2;
                    } else {
                        y10 = 0;
                    }
                } else if (f11 > 0.0f) {
                    y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
                    i = 8;
                } else if (f11 < 0.0f) {
                    y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
                    i = 4;
                } else {
                    y10 = 0;
                }
                if (i == this.zza.zza()) {
                    this.zza.zzE(this.zzb.zzr(), y10);
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

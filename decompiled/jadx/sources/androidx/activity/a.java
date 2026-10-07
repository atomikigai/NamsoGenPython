package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f333a = new a();

    public final BackEvent a(float f10, float f11, float f12, int i) {
        return new BackEvent(f10, f11, f12, i);
    }

    public final float b(BackEvent backEvent) {
        jc.i.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        jc.i.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        jc.i.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        jc.i.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}

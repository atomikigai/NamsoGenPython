package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f338d;

    public b(BackEvent backEvent) {
        a aVar = a.f333a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.f335a = fD;
        this.f336b = fE;
        this.f337c = fB;
        this.f338d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f335a + ", touchY=" + this.f336b + ", progress=" + this.f337c + ", swipeEdge=" + this.f338d + '}';
    }
}

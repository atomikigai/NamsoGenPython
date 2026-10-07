package o;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f7418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f7419d;

    public e(g gVar, int i, int i10, Bundle bundle) {
        this.f7419d = gVar;
        this.f7416a = i;
        this.f7417b = i10;
        this.f7418c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7419d.f7427b.onActivityResized(this.f7416a, this.f7417b, this.f7418c);
    }
}

package o;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7423d;
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f7424f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f7425r;

    public f(g gVar, int i, int i10, int i11, int i12, int i13, Bundle bundle) {
        this.f7425r = gVar;
        this.f7420a = i;
        this.f7421b = i10;
        this.f7422c = i11;
        this.f7423d = i12;
        this.e = i13;
        this.f7424f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7425r.f7427b.onActivityLayout(this.f7420a, this.f7421b, this.f7422c, this.f7423d, this.e, this.f7424f);
    }
}

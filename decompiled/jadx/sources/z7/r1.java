package z7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f11330d;
    public final /* synthetic */ boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11331f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x1 f11333s;

    public r1(x1 x1Var, String str, String str2, long j4, Bundle bundle, boolean z4, boolean z10, boolean z11) {
        this.f11333s = x1Var;
        this.f11327a = str;
        this.f11328b = str2;
        this.f11329c = j4;
        this.f11330d = bundle;
        this.e = z4;
        this.f11331f = z10;
        this.f11332r = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11333s.m(this.f11327a, this.f11328b, this.f11329c, this.f11330d, this.e, this.f11331f, this.f11332r);
    }
}

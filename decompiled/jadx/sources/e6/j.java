package e6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3 f3329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3330d;
    public final /* synthetic */ q e;

    public j(q qVar, Context context, q3 q3Var, String str) {
        this.f3328b = context;
        this.f3329c = q3Var;
        this.f3330d = str;
        this.e = qVar;
    }

    @Override // e6.r
    public final Object a() {
        q.g(this.f3328b, "search");
        return new b3();
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.v(new q7.b(this.f3328b), this.f3329c, this.f3330d, 243799000);
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((n3) this.e.f3390a).a(this.f3328b, this.f3329c, this.f3330d, null, 3);
    }
}

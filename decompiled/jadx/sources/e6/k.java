package e6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbpc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3 f3333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3334d;
    public final /* synthetic */ zzbpc e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f3335f;

    public k(q qVar, Context context, q3 q3Var, String str, zzbpc zzbpcVar) {
        this.f3332b = context;
        this.f3333c = q3Var;
        this.f3334d = str;
        this.e = zzbpcVar;
        this.f3335f = qVar;
    }

    @Override // e6.r
    public final Object a() {
        q.g(this.f3332b, "interstitial");
        return new b3();
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.u(new q7.b(this.f3332b), this.f3333c, this.f3334d, this.e, 243799000);
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((n3) this.f3335f.f3390a).a(this.f3332b, this.f3333c, this.f3334d, this.e, 2);
    }
}

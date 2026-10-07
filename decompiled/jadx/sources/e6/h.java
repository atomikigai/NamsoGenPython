package e6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbpg;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3 f3311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3312d;
    public final /* synthetic */ zzbpg e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f3313f;

    public h(q qVar, Context context, q3 q3Var, String str, zzbpg zzbpgVar) {
        this.f3310b = context;
        this.f3311c = q3Var;
        this.f3312d = str;
        this.e = zzbpgVar;
        this.f3313f = qVar;
    }

    @Override // e6.r
    public final Object a() {
        q.g(this.f3310b, "banner");
        return new b3();
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.x(new q7.b(this.f3310b), this.f3311c, this.f3312d, this.e, 243799000);
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object c() {
        return ((n3) this.f3313f.f3390a).a(this.f3310b, this.f3311c, this.f3312d, this.e, 1);
    }
}

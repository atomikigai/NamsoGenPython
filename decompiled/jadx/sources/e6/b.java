package e6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbxo;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbpc f3295d;

    public b(Context context, String str, zzbpc zzbpcVar) {
        this.f3293b = context;
        this.f3294c = str;
        this.f3295d = zzbpcVar;
    }

    @Override // e6.r
    public final Object a() {
        q.g(this.f3293b, "rewarded");
        return new e3();
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.A(new q7.b(this.f3293b), this.f3294c, this.f3295d, 243799000);
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object c() {
        return zzbxo.zza(this.f3293b, this.f3294c, this.f3295d);
    }
}

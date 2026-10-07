package o6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcid;
import com.google.android.gms.internal.ads.zzckz;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzeri;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzhfx;
import com.google.android.gms.internal.ads.zzhgg;
import com.google.android.gms.internal.ads.zzhgp;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements zzhfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzchq f7658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzhgp f7659c;

    public /* synthetic */ p(zzchq zzchqVar, zzhgg zzhggVar, int i) {
        this.f7657a = i;
        this.f7658b = zzchqVar;
        this.f7659c = zzhggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f7657a) {
            case 0:
                Context contextZza = this.f7658b.zza();
                zzckz.zza();
                return new b(contextZza, zzeri.zzc(), ((zzcid) this.f7659c).zza());
            default:
                return new x(this.f7658b.zza(), (zzdsr) this.f7659c.zzb(), zzfin.zzc());
        }
    }
}

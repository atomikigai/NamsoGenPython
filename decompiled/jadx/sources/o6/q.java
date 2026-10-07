package o6;

import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzdxq;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzges;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements zzgdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f7660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzdxq f7661b;

    public q(zzges zzgesVar, zzdxq zzdxqVar) {
        this.f7660a = zzgesVar;
        this.f7661b = zzdxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdp
    public final /* bridge */ /* synthetic */ m9.a zza(Object obj) {
        zzbvx zzbvxVar = (zzbvx) obj;
        return zzgei.zzn(this.f7661b.zzc(zzbvxVar), new d(zzbvxVar, 2), this.f7660a);
    }
}

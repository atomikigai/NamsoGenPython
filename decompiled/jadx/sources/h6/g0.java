package h6;

import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzdxr;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzhfx;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements zzhfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzhfx f4996b;

    public /* synthetic */ g0(zzhfx zzhfxVar, int i) {
        this.f4995a = i;
        this.f4996b = zzhfxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        switch (this.f4995a) {
            case 0:
                return new f0(((zzchq) this.f4996b).zza());
            default:
                return new o6.q(zzfin.zzc(), ((zzdxr) this.f4996b).zzb());
        }
    }
}

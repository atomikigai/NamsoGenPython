package o6;

import com.google.android.gms.internal.ads.zzded;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzhfx;
import com.google.android.gms.internal.ads.zzhgg;
import com.google.android.gms.internal.ads.zzhgp;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements zzhfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzhgp f7652b;

    public /* synthetic */ n(zzhgg zzhggVar, int i) {
        this.f7651a = i;
        this.f7652b = zzhggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f7651a) {
            case 0:
                return new zzded((d0) this.f7652b.zzb(), zzfin.zzc());
            default:
                return new c0((zzdsr) this.f7652b.zzb());
        }
    }
}

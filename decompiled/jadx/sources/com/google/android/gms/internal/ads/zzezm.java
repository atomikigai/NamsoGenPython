package com.google.android.gms.internal.ads;

import e6.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzezm implements zzevz {
    private final zzbzz zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzges zze;

    public zzezm(zzbzz zzbzzVar, boolean z4, boolean z10, zzbzo zzbzoVar, zzges zzgesVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzbzzVar;
        this.zzb = z4;
        this.zzc = z10;
        this.zze = zzgesVar;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgS)).booleanValue() && this.zzc) {
            return zzgei.zzh(null);
        }
        if (!this.zzb) {
            return zzgei.zzh(null);
        }
        return zzgei.zze(zzgei.zzo(zzgei.zzm(zzgei.zzh(null), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzezk
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzezn(str);
            }
        }, this.zze), ((Long) zzbfb.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzezl
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                this.zza.zzc((Exception) obj);
                return null;
            }
        }, this.zze);
    }

    public final /* synthetic */ zzezn zzc(Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return null;
    }
}

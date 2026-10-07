package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfjh {
    final /* synthetic */ zzfjj zza;
    private final Object zzb;
    private final String zzc;
    private final m9.a zzd;
    private final List zze;
    private final m9.a zzf;

    private zzfjh(zzfjj zzfjjVar, Object obj, String str, m9.a aVar, List list, m9.a aVar2) {
        this.zza = zzfjjVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = aVar;
        this.zze = list;
        this.zzf = aVar2;
    }

    public final zzfix zza() {
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzfix zzfixVar = new zzfix(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzfixVar);
        m9.a aVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd.zzc(zzfixVar);
            }
        };
        zzges zzgesVar = zzcaj.zzf;
        aVar.addListener(runnable, zzgesVar);
        zzgei.zzr(zzfixVar, new zzfjg(this, zzfixVar), zzgesVar);
        return zzfixVar;
    }

    public final zzfjh zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfjh zzc(Class cls, zzgdp zzgdpVar) {
        return new zzfjh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgei.zzf(this.zzf, cls, zzgdpVar, this.zza.zzb));
    }

    public final zzfjh zzd(final m9.a aVar) {
        return zzg(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfje
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return aVar;
            }
        }, zzcaj.zzf);
    }

    public final zzfjh zze(final zzfiv zzfivVar) {
        return zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfjd
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(zzfivVar.zza(obj));
            }
        });
    }

    public final zzfjh zzf(zzgdp zzgdpVar) {
        return zzg(zzgdpVar, this.zza.zzb);
    }

    public final zzfjh zzg(zzgdp zzgdpVar, Executor executor) {
        return new zzfjh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgei.zzn(this.zzf, zzgdpVar, executor));
    }

    public final zzfjh zzh(String str) {
        return new zzfjh(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfjh zzi(long j4, TimeUnit timeUnit) {
        return new zzfjh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgei.zzo(this.zzf, j4, timeUnit, this.zza.zzc));
    }
}

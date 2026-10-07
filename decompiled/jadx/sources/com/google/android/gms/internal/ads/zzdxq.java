package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import d6.p;
import e6.t;
import h6.r0;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdxq {
    private final ScheduledExecutorService zza;
    private final zzges zzb;
    private final zzges zzc;
    private final zzdyj zzd;
    private final zzhfr zze;

    public zzdxq(ScheduledExecutorService scheduledExecutorService, zzges zzgesVar, zzges zzgesVar2, zzdyj zzdyjVar, zzhfr zzhfrVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgesVar;
        this.zzc = zzgesVar2;
        this.zzd = zzdyjVar;
        this.zze = zzhfrVar;
    }

    public final zzdyx zza(zzbvx zzbvxVar) throws Exception {
        return (zzdyx) this.zzd.zza(zzbvxVar).get(((Integer) t.f3437d.f3440c.zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ m9.a zzb(final zzbvx zzbvxVar, int i, Throwable th) throws Exception {
        Bundle bundle;
        if (zzbvxVar != null && (bundle = zzbvxVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgei.zzn(((zzebg) this.zze.zzb()).zzd(zzbvxVar, i), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(new zzdyx((InputStream) obj, zzbvxVar));
            }
        }, this.zzb);
    }

    public final m9.a zzc(final zzbvx zzbvxVar) {
        m9.a aVarZzb;
        String str = zzbvxVar.zzd;
        r0 r0Var = p.C.f2979c;
        if (r0.c(str)) {
            aVarZzb = zzgei.zzg(new zzdyw(1));
        } else {
            aVarZzb = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhi)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(zzbvxVar);
                }
            }) : this.zzd.zza(zzbvxVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgdz) zzgei.zzf((zzgdz) zzgei.zzo(zzgdz.zzu(aVarZzb), ((Integer) t.f3437d.f3440c.zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxp
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzb(zzbvxVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}

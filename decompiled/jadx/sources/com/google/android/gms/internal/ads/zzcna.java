package com.google.android.gms.internal.ads;

import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcna implements zzgee {
    final /* synthetic */ zzflr zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcnb zzc;

    public zzcna(zzcnb zzcnbVar, zzflr zzflrVar, String str) {
        this.zza = zzflrVar;
        this.zzb = str;
        this.zzc = zzcnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(final Throwable th) {
        this.zzc.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmy
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjW)).booleanValue();
                zzcna zzcnaVar = this.zza;
                Throwable th2 = th;
                if (zBooleanValue) {
                    zzcnb zzcnbVar = zzcnaVar.zzc;
                    zzcnbVar.zzb = zzbuj.zzc(zzcnbVar.zzc);
                    zzcnaVar.zzc.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcnb zzcnbVar2 = zzcnaVar.zzc;
                    zzcnbVar2.zza = zzbuj.zza(zzcnbVar2.zzc);
                    zzcnaVar.zzc.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                zzcnaVar.zza.zzc(zzcnaVar.zzb, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        this.zzc.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzc(str, null);
            }
        });
    }
}

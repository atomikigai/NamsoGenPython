package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeie implements zzgee {
    final /* synthetic */ zzfet zza;
    final /* synthetic */ zzeif zzb;

    public zzeie(zzeif zzeifVar, zzfet zzfetVar) {
        this.zza = zzfetVar;
        this.zzb = zzeifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            try {
                this.zzb.zzh.zzb(th, this.zza);
                zzfet zzfetVarZza = this.zzb.zzh.zza();
                if (this.zza.zzav) {
                    while (zzfetVarZza != null) {
                        this.zzb.zze(zzfetVarZza);
                        zzfetVarZza = this.zzb.zzh.zza();
                    }
                } else if (zzfetVarZza != null) {
                    this.zzb.zze(zzfetVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeiw zzeiwVar = (zzeiw) obj;
        synchronized (this.zzb) {
            try {
                this.zzb.zzh.zzc(zzeiwVar, this.zza);
                zzfet zzfetVarZza = this.zzb.zzh.zza();
                if (zzfetVarZza != null) {
                    this.zzb.zze(zzfetVarZza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

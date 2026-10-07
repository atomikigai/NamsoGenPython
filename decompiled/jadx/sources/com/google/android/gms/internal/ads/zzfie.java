package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfie {
    private final zzfhx zza;
    private final m9.a zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfie(final zzfhc zzfhcVar, final zzfhw zzfhwVar, final zzfhx zzfhxVar) {
        this.zza = zzfhxVar;
        this.zzb = zzgei.zzf(zzgei.zzn(zzfhwVar.zza(zzfhxVar), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfic
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzb(zzfhwVar, zzfhcVar, zzfhxVar, (zzfhl) obj);
            }
        }, zzfhxVar.zzb()), Exception.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfid
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc(zzfhwVar, (Exception) obj);
            }
        }, zzfhxVar.zzb());
    }

    public final synchronized m9.a zza(zzfhx zzfhxVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfhxVar.zza() != null && this.zza.zza().equals(zzfhxVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    public final /* synthetic */ m9.a zzb(zzfhw zzfhwVar, zzfhc zzfhcVar, zzfhx zzfhxVar, zzfhl zzfhlVar) throws Exception {
        synchronized (this) {
            try {
                this.zzd = true;
                zzfhwVar.zzb(zzfhlVar);
                if (this.zzc) {
                    return zzgei.zzh(new zzfhv(zzfhlVar, zzfhxVar));
                }
                zzfhcVar.zzd(zzfhxVar.zza(), zzfhlVar);
                return zzgei.zzh(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ m9.a zzc(zzfhw zzfhwVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgee zzgeeVar) {
        zzgei.zzr(zzgei.zzn(this.zzb, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfib
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzi();
            }
        }, this.zza.zzb()), zzgeeVar, this.zza.zzb());
    }
}

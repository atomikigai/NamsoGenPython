package com.google.android.gms.internal.ads;

import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdjh {
    zzbgz zza;
    zzbgw zzb;
    zzbhm zzc;
    zzbhj zzd;
    zzbmk zze;
    final k zzf = new k(0);
    final k zzg = new k(0);

    public final zzdjh zza(zzbgw zzbgwVar) {
        this.zzb = zzbgwVar;
        return this;
    }

    public final zzdjh zzb(zzbgz zzbgzVar) {
        this.zza = zzbgzVar;
        return this;
    }

    public final zzdjh zzc(String str, zzbhf zzbhfVar, zzbhc zzbhcVar) {
        this.zzf.put(str, zzbhfVar);
        if (zzbhcVar != null) {
            this.zzg.put(str, zzbhcVar);
        }
        return this;
    }

    public final zzdjh zzd(zzbmk zzbmkVar) {
        this.zze = zzbmkVar;
        return this;
    }

    public final zzdjh zze(zzbhj zzbhjVar) {
        this.zzd = zzbhjVar;
        return this;
    }

    public final zzdjh zzf(zzbhm zzbhmVar) {
        this.zzc = zzbhmVar;
        return this;
    }

    public final zzdjj zzg() {
        return new zzdjj(this);
    }
}

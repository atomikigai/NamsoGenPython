package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcri {
    private final zzcze zza;
    private final zzdbk zzb;

    public zzcri(zzcze zzczeVar, zzdbk zzdbkVar) {
        this.zza = zzczeVar;
        this.zzb = zzdbkVar;
    }

    public final zzcze zza() {
        return this.zza;
    }

    public final zzdbk zzb() {
        return this.zzb;
    }

    public final zzded zzc() {
        zzdbk zzdbkVar = this.zzb;
        return zzdbkVar != null ? new zzded(zzdbkVar, zzcaj.zzf) : new zzded(new zzcrh(this), zzcaj.zzf);
    }
}

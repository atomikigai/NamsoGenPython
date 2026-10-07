package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvv implements zzuq {
    private final zzgc zza;
    private int zzb;
    private final zzvu zzc;
    private final zzyw zzd;

    public zzvv(zzgc zzgcVar, zzvu zzvuVar) {
        zzyw zzywVar = new zzyw(-1);
        this.zza = zzgcVar;
        this.zzc = zzvuVar;
        this.zzd = zzywVar;
        this.zzb = 1048576;
    }

    public final zzvv zza(int i) {
        this.zzb = i;
        return this;
    }

    public final zzvx zzb(zzaw zzawVar) {
        zzawVar.zzb.getClass();
        return new zzvx(zzawVar, this.zza, this.zzc, zzrp.zza, this.zzd, this.zzb, null);
    }
}

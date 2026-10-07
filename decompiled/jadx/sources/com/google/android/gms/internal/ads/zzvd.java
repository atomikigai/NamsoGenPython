package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzvd implements zzyd {
    private final zzyd zza;
    private final zzbw zzb;

    public zzvd(zzyd zzydVar, zzbw zzbwVar) {
        this.zza = zzydVar;
        this.zzb = zzbwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvd)) {
            return false;
        }
        zzvd zzvdVar = (zzvd) obj;
        return this.zza.equals(zzvdVar.zza) && this.zzb.equals(zzvdVar.zzb);
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() + 527;
        return this.zza.hashCode() + (iHashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zza(int i) {
        return this.zza.zza(i);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzad zzd(int i) {
        return this.zzb.zzb(this.zza.zza(i));
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzbw zze() {
        return this.zzb;
    }
}

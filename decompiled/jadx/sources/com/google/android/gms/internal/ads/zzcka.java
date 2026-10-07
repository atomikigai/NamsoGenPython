package com.google.android.gms.internal.ads;

import o6.f0;
import o6.g0;
import o6.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcka implements f0 {
    private final zzciy zza;
    private zzcvw zzb;
    private k zzc;

    public /* synthetic */ zzcka(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // o6.f0
    public final /* bridge */ /* synthetic */ f0 zza(zzcvw zzcvwVar) {
        this.zzb = zzcvwVar;
        return this;
    }

    @Override // o6.f0
    public final /* bridge */ /* synthetic */ f0 zzb(k kVar) {
        this.zzc = kVar;
        return this;
    }

    @Override // o6.f0
    public final g0 zzc() {
        zzhgf.zzc(this.zzb, zzcvw.class);
        zzhgf.zzc(this.zzc, k.class);
        return new zzckb(this.zza, this.zzc, new zzcta(), new zzcuz(), new zzdta(), this.zzb, null, null, null);
    }
}

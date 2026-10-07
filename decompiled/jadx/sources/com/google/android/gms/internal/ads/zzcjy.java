package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjy implements zzdov {
    private final zzciy zza;
    private zzfco zzb;
    private zzfbr zzc;
    private zzdcf zzd;
    private zzcvw zze;

    public /* synthetic */ zzcjy(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final /* synthetic */ zzcvs zza(zzfbr zzfbrVar) {
        this.zzc = zzfbrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final /* synthetic */ zzcvs zzb(zzfco zzfcoVar) {
        this.zzb = zzfcoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdov
    public final /* bridge */ /* synthetic */ zzdov zzc(zzdcf zzdcfVar) {
        this.zzd = zzdcfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdov
    public final /* bridge */ /* synthetic */ zzdov zzd(zzcvw zzcvwVar) {
        this.zze = zzcvwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdow zzh() {
        zzhgf.zzc(this.zzd, zzdcf.class);
        zzhgf.zzc(this.zze, zzcvw.class);
        return new zzcjz(this.zza, new zzcta(), new zzfgu(), new zzcuz(), new zzdta(), this.zzd, this.zze, zzejg.zza(), null, this.zzb, this.zzc, null);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbor {
    private final zzbnu zza;
    private m9.a zzb;

    public zzbor(zzbnu zzbnuVar) {
        this.zza = zzbnuVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcao zzcaoVar = new zzcao();
            this.zzb = zzcaoVar;
            this.zza.zzb(null).zzj(new zzcas() { // from class: com.google.android.gms.internal.ads.zzboo
                @Override // com.google.android.gms.internal.ads.zzcas
                public final void zza(Object obj) {
                    zzcaoVar.zzc((zzbnv) obj);
                }
            }, new zzcaq() { // from class: com.google.android.gms.internal.ads.zzbop
                @Override // com.google.android.gms.internal.ads.zzcaq
                public final void zza() {
                    zzcaoVar.zzd(new zzbnx("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbou zza(String str, zzbob zzbobVar, zzboa zzboaVar) {
        zzd();
        return new zzbou(this.zzb, "google.afma.activeView.handleUpdate", zzbobVar, zzboaVar);
    }

    public final void zzb(final String str, final zzbjr zzbjrVar) {
        zzd();
        this.zzb = zzgei.zzn(this.zzb, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzboq
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                zzbnv zzbnvVar = (zzbnv) obj;
                zzbnvVar.zzq(str, zzbjrVar);
                return zzgei.zzh(zzbnvVar);
            }
        }, zzcaj.zzf);
    }

    public final void zzc(final String str, final zzbjr zzbjrVar) {
        this.zzb = zzgei.zzm(this.zzb, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbon
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzbnv zzbnvVar = (zzbnv) obj;
                zzbnvVar.zzr(str, zzbjrVar);
                return zzbnvVar;
            }
        }, zzcaj.zzf);
    }
}

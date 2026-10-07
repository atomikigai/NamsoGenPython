package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzekz implements zzefb {
    private final zzbdi zza;
    private final zzges zzb;
    private final zzfjr zzc;
    private final zzeli zzd;

    public zzekz(zzfjr zzfjrVar, zzges zzgesVar, zzbdi zzbdiVar, zzeli zzeliVar) {
        this.zzc = zzfjrVar;
        this.zzb = zzgesVar;
        this.zza = zzbdiVar;
        this.zzd = zzeliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(zzfff zzfffVar, zzfet zzfetVar) {
        zzcao zzcaoVar = new zzcao();
        zzele zzeleVar = new zzele();
        zzeleVar.zzd(new zzeky(this, zzcaoVar, zzfffVar, zzfetVar, zzeleVar));
        zzfey zzfeyVar = zzfetVar.zzs;
        final zzbdd zzbddVar = new zzbdd(zzeleVar, zzfeyVar.zzb, zzfeyVar.zza);
        zzfjl zzfjlVar = zzfjl.CUSTOM_RENDER_SYN;
        return zzfjb.zzd(new zzfiw() { // from class: com.google.android.gms.internal.ads.zzekx
            @Override // com.google.android.gms.internal.ads.zzfiw
            public final void zza() throws Exception {
                this.zza.zzc(zzbddVar);
            }
        }, this.zzb, zzfjlVar, this.zzc).zzb(zzfjl.CUSTOM_RENDER_ACK).zzd(zzcaoVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar;
        return (this.zza == null || (zzfeyVar = zzfetVar.zzs) == null || zzfeyVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbdd zzbddVar) throws Exception {
        this.zza.zze(zzbddVar);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import e6.j2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeku implements zzefb {
    private final Context zza;
    private final zzcqh zzb;
    private final zzbdi zzc;
    private final zzges zzd;
    private final zzfjr zze;

    public zzeku(Context context, zzcqh zzcqhVar, zzfjr zzfjrVar, zzges zzgesVar, zzbdi zzbdiVar) {
        this.zza = context;
        this.zzb = zzcqhVar;
        this.zze = zzfjrVar;
        this.zzd = zzgesVar;
        this.zzc = zzbdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(zzfff zzfffVar, zzfet zzfetVar) {
        zzeks zzeksVar = new zzeks(this, new View(this.zza), null, new zzcro() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // com.google.android.gms.internal.ads.zzcro
            public final j2 zza() {
                return null;
            }
        }, (zzfeu) zzfetVar.zzu.get(0));
        zzcpe zzcpeVarZza = this.zzb.zza(new zzcsg(zzfffVar, zzfetVar, null), zzeksVar);
        zzekt zzektVarZzl = zzcpeVarZza.zzl();
        zzfey zzfeyVar = zzfetVar.zzs;
        final zzbdd zzbddVar = new zzbdd(zzektVarZzl, zzfeyVar.zzb, zzfeyVar.zza);
        zzfjl zzfjlVar = zzfjl.CUSTOM_RENDER_SYN;
        return zzfjb.zzd(new zzfiw() { // from class: com.google.android.gms.internal.ads.zzekr
            @Override // com.google.android.gms.internal.ads.zzfiw
            public final void zza() throws Exception {
                this.zza.zzc(zzbddVar);
            }
        }, this.zzd, zzfjlVar, this.zze).zzb(zzfjl.CUSTOM_RENDER_ACK).zzd(zzgei.zzh(zzcpeVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar;
        return (this.zzc == null || (zzfeyVar = zzfetVar.zzs) == null || zzfeyVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbdd zzbddVar) throws Exception {
        this.zzc.zze(zzbddVar);
    }
}

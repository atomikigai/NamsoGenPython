package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import da.v;
import e6.t;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzehe implements zzefb {
    private final Context zza;
    private final zzdpn zzb;
    private final zzdgn zzc;
    private final zzffo zzd;
    private final Executor zze;
    private final i6.a zzf;
    private final zzbju zzg;
    private final boolean zzh = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zziy)).booleanValue();
    private final zzeea zzi;
    private final zzdsh zzj;

    public zzehe(Context context, i6.a aVar, zzffo zzffoVar, Executor executor, zzdgn zzdgnVar, zzdpn zzdpnVar, zzbju zzbjuVar, zzeea zzeeaVar, zzdsh zzdshVar) {
        this.zza = context;
        this.zzd = zzffoVar;
        this.zzc = zzdgnVar;
        this.zze = executor;
        this.zzf = aVar;
        this.zzb = zzdpnVar;
        this.zzg = zzbjuVar;
        this.zzi = zzeeaVar;
        this.zzj = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        final zzdpr zzdprVar = new zzdpr();
        m9.a aVarZzn = zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzehb
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc(zzfetVar, zzfffVar, zzdprVar, obj);
            }
        }, this.zze);
        aVarZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehc
            @Override // java.lang.Runnable
            public final void run() {
                zzdprVar.zzb();
            }
        }, this.zze);
        return aVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar = zzfetVar.zzs;
        return (zzfeyVar == null || zzfeyVar.zza == null) ? false : true;
    }

    public final m9.a zzc(final zzfet zzfetVar, zzfff zzfffVar, zzdpr zzdprVar, Object obj) throws Exception {
        zzbce zzbceVar = zzbcn.zzck;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, this.zzj.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzcfk zzcfkVarZza = this.zzb.zza(this.zzd.zze, zzfetVar, zzfffVar.zzb.zzb);
        zzcfkVarZza.zzac(zzfetVar.zzW);
        zzdprVar.zza(this.zza, zzcfkVarZza.zzF());
        if (((Boolean) zzbclVar2.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, this.zzj.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcao zzcaoVar = new zzcao();
        final zzdfk zzdfkVarZze = this.zzc.zze(new zzcsg(zzfffVar, zzfetVar, null), new zzdfn(new zzehd(this.zza, this.zzf, zzcaoVar, zzfetVar, zzcfkVarZza, this.zzd, this.zzh, this.zzg, this.zzi), zzcfkVarZza));
        zzcaoVar.zzc(zzdfkVarZze);
        if (((Boolean) zzbclVar2.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, this.zzj.zza(), zzdrv.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdfkVarZze.zzc().zzo(new zzcxg() { // from class: com.google.android.gms.internal.ads.zzegz
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final void zzr() {
                zzcfk zzcfkVar = zzcfkVarZza;
                if (zzcfkVar.zzN() != null) {
                    zzcfkVar.zzN().zzr();
                }
            }
        }, zzcaj.zzf);
        String strZzb = zzfetVar.zzs.zza;
        if (((Boolean) zzbclVar2.zza(zzbcn.zzfe)).booleanValue() && zzdfkVarZze.zzl().zze(true)) {
            strZzb = zzcgv.zzb(strZzb, zzcgv.zza(zzfetVar));
        }
        zzdfkVarZze.zzi().zzi(zzcfkVarZza, true, this.zzh ? this.zzg : null, this.zzj.zza());
        zzdfkVarZze.zzi();
        return zzgei.zzm(zzdpm.zzj(zzcfkVarZza, zzfetVar.zzs.zzb, strZzb, this.zzj.zza()), new zzfwh(this) { // from class: com.google.android.gms.internal.ads.zzeha
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj2) {
                zzcfk zzcfkVar = zzcfkVarZza;
                if (zzfetVar.zzM) {
                    zzcfkVar.zzah();
                }
                zzdfk zzdfkVar = zzdfkVarZze;
                zzcfkVar.zzab();
                zzcfkVar.onPause();
                return zzdfkVar.zzg();
            }
        }, this.zze);
    }
}

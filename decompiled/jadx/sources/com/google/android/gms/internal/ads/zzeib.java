package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import e6.t;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeib implements zzefh {
    private final Context zza;
    private final zzdhj zzb;
    private zzbpv zzc;
    private final i6.a zzd;

    public zzeib(Context context, zzdhj zzdhjVar, i6.a aVar) {
        this.zza = context;
        this.zzb = zzdhjVar;
        this.zzd = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzeiz, zzffv {
        if (!zzfffVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzeiz(2, "Unified must be used for RTB.");
        }
        zzdiy zzdiyVarZzt = zzdiy.zzt(this.zzc);
        zzffo zzffoVar = zzfffVar.zza.zza;
        if (!zzffoVar.zzg.contains(Integer.toString(zzdiyVarZzt.zzc()))) {
            throw new zzeiz(1, "No corresponding native ad listener");
        }
        zzdja zzdjaVarZze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdjk(zzdiyVarZzt), new zzdlb(null, null, this.zzc));
        ((zzegx) zzefeVar.zzc).zzc(zzdjaVarZze.zzj());
        return zzdjaVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            zzeia zzeiaVar = null;
            if (this.zzd.f5215c < ((Integer) t.f3437d.f3440c.zza(zzbcn.zzbN)).intValue()) {
                ((zzbrf) zzefeVar.zzb).zzm(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, new b(this.zza), new zzehz(this, zzefeVar, zzeiaVar), (zzbpm) zzefeVar.zzc);
            } else {
                ((zzbrf) zzefeVar.zzb).zzn(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, new b(this.zza), new zzehz(this, zzefeVar, zzeiaVar), (zzbpm) zzefeVar.zzc, zzfffVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzffv(e);
        }
    }
}

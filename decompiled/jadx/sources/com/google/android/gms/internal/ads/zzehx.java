package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzehx implements zzefh {
    private final Context zza;
    private final zzdhj zzb;
    private final Executor zzc;

    public zzehx(Context context, zzdhj zzdhjVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdhjVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfff zzfffVar, int i) {
        return zzfffVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        zzdiy zzdiyVarZzah;
        zzbpr zzbprVarZzD = ((zzfgm) zzefeVar.zzb).zzD();
        zzbps zzbpsVarZzE = ((zzfgm) zzefeVar.zzb).zzE();
        zzbpv zzbpvVarZzd = ((zzfgm) zzefeVar.zzb).zzd();
        if (zzbpvVarZzd != null && zzc(zzfffVar, 6)) {
            zzdiyVarZzah = zzdiy.zzt(zzbpvVarZzd);
        } else if (zzbprVarZzD != null && zzc(zzfffVar, 6)) {
            zzdiyVarZzah = zzdiy.zzai(zzbprVarZzD);
        } else if (zzbprVarZzD != null && zzc(zzfffVar, 2)) {
            zzdiyVarZzah = zzdiy.zzag(zzbprVarZzD);
        } else if (zzbpsVarZzE != null && zzc(zzfffVar, 6)) {
            zzdiyVarZzah = zzdiy.zzaj(zzbpsVarZzE);
        } else {
            if (zzbpsVarZzE == null || !zzc(zzfffVar, 1)) {
                throw new zzeiz(1, "No native ad mappers");
            }
            zzdiyVarZzah = zzdiy.zzah(zzbpsVarZzE);
        }
        zzffo zzffoVar = zzfffVar.zza.zza;
        if (!zzffoVar.zzg.contains(Integer.toString(zzdiyVarZzah.zzc()))) {
            throw new zzeiz(1, "No corresponding native ad listener");
        }
        zzdja zzdjaVarZze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdjk(zzdiyVarZzah), new zzdlb(zzbpsVarZzE, zzbprVarZzD, zzbpvVarZzd));
        ((zzegx) zzefeVar.zzc).zzc(zzdjaVarZze.zzk());
        zzdjaVarZze.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzc);
        return zzdjaVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        zzfgm zzfgmVar = (zzfgm) zzefeVar.zzb;
        zzffo zzffoVar = zzfffVar.zza.zza;
        String string = zzfetVar.zzv.toString();
        String strR = b.R(zzfetVar.zzs);
        zzbpm zzbpmVar = (zzbpm) zzefeVar.zzc;
        zzffo zzffoVar2 = zzfffVar.zza.zza;
        zzfgmVar.zzp(this.zza, zzffoVar.zzd, string, strR, zzbpmVar, zzffoVar2.zzi, zzffoVar2.zzg);
    }
}

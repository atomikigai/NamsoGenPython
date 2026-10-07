package com.google.android.gms.internal.ads;

import android.content.Context;
import i6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeji implements zzefh {
    private final Context zza;
    private final Executor zzb;
    private final zzdow zzc;

    public zzeji(Context context, Executor executor, zzdow zzdowVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        zzdos zzdosVarZze = this.zzc.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdot(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzejh
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z4, Context context, zzcwz zzcwzVar) throws zzdgu {
                zzefe zzefeVar2 = zzefeVar;
                try {
                    ((zzfgm) zzefeVar2.zzb).zzv(z4);
                    ((zzfgm) zzefeVar2.zzb).zzz(context);
                } catch (zzffv e) {
                    throw new zzdgu(e.getCause());
                }
            }
        }));
        zzdosVarZze.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzb);
        ((zzegx) zzefeVar.zzc).zzc(zzdosVarZze.zzn());
        return zzdosVarZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            zzffo zzffoVar = zzfffVar.zza.zza;
            if (zzffoVar.zzo.zza == 3) {
                ((zzfgm) zzefeVar.zzb).zzr(this.zza, zzffoVar.zzd, zzfetVar.zzv.toString(), (zzbpm) zzefeVar.zzc);
            } else {
                ((zzfgm) zzefeVar.zzb).zzq(this.zza, zzffoVar.zzd, zzfetVar.zzv.toString(), (zzbpm) zzefeVar.zzc);
            }
        } catch (Exception e) {
            h.h("Fail to load ad from adapter ".concat(String.valueOf(zzefeVar.zza)), e);
        }
    }
}

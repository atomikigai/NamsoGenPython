package com.google.android.gms.internal.ads;

import android.content.Context;
import i6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeke implements zzefh {
    private final Context zza;
    private final Executor zzb;
    private final zzdow zzc;

    public zzeke(Context context, Executor executor, zzdow zzdowVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) {
        try {
            ((zzfgm) zzefeVar.zzb).zzk(zzfffVar.zza.zza.zzd, zzfetVar.zzv.toString());
        } catch (Exception e) {
            h.h("Fail to load ad from adapter ".concat(String.valueOf(zzefeVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        zzdos zzdosVarZze = this.zzc.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdot(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z4, Context context, zzcwz zzcwzVar) throws zzdgu {
                zzefe zzefeVar2 = zzefeVar;
                try {
                    ((zzfgm) zzefeVar2.zzb).zzv(z4);
                    ((zzfgm) zzefeVar2.zzb).zzA();
                } catch (zzffv e) {
                    h.h("Cannot show rewarded video.", e);
                    throw new zzdgu(e.getCause());
                }
            }
        }));
        zzdosVarZze.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzb);
        zzcxt zzcxtVarZze = zzdosVarZze.zze();
        zzcwk zzcwkVarZzb = zzdosVarZze.zzb();
        ((zzegy) zzefeVar.zzc).zzc(new zzekd(this, zzdosVarZze.zza(), zzcwkVarZzb, zzcxtVarZze, zzdosVarZze.zzg()));
        return zzdosVarZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        if (((zzfgm) zzefeVar.zzb).zzC()) {
            zze(zzfffVar, zzfetVar, zzefeVar);
            return;
        }
        ((zzegy) zzefeVar.zzc).zzd(new zzekc(this, zzfffVar, zzfetVar, zzefeVar));
        Object obj = zzefeVar.zzb;
        Context context = this.zza;
        zzffo zzffoVar = zzfffVar.zza.zza;
        ((zzfgm) obj).zzh(context, zzffoVar.zzd, null, (zzbwu) zzefeVar.zzc, zzfetVar.zzv.toString());
    }
}

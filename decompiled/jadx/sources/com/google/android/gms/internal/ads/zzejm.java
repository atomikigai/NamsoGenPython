package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import h6.k0;
import w5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzejm implements zzefh {
    private final Context zza;
    private final zzdow zzb;

    public zzejm(Context context, zzdow zzdowVar) {
        this.zza = context;
        this.zzb = zzdowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        zzehg zzehgVar = new zzehg(zzfetVar, (zzbrf) zzefeVar.zzb, b.REWARDED);
        zzdos zzdosVarZze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdot(zzehgVar));
        zzehgVar.zzb(zzdosVarZze.zzc());
        ((zzegx) zzefeVar.zzc).zzc(zzdosVarZze.zzo());
        return zzdosVarZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            if (zzfffVar.zza.zza.zzo.zza == 3) {
                ((zzbrf) zzefeVar.zzb).zzo(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, new q7.b(this.zza), new zzejk(this, zzefeVar, null), (zzbpm) zzefeVar.zzc);
            } else {
                ((zzbrf) zzefeVar.zzb).zzp(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, new q7.b(this.zza), new zzejk(this, zzefeVar, null), (zzbpm) zzefeVar.zzc);
            }
        } catch (RemoteException e) {
            k0.l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import h6.k0;
import w5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzefu implements zzefh {
    private final Context zza;
    private final zzcor zzb;

    public zzefu(Context context, zzcor zzcorVar) {
        this.zza = context;
        this.zzb = zzcorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        zzehg zzehgVar = new zzehg(zzfetVar, (zzbrf) zzefeVar.zzb, b.APP_OPEN_AD);
        zzcoo zzcooVarZza = this.zzb.zza(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdfn(zzehgVar, null), new zzcop(zzfetVar.zzaa));
        zzehgVar.zzb(zzcooVarZza.zzc());
        ((zzegx) zzefeVar.zzc).zzc(zzcooVarZza.zzj());
        return zzcooVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            ((zzbrf) zzefeVar.zzb).zzi(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, new q7.b(this.zza), new zzefs(zzefeVar, null), (zzbpm) zzefeVar.zzc);
        } catch (RemoteException e) {
            k0.l("Remote exception loading an app open RTB ad", e);
            throw new zzffv(e);
        }
    }
}

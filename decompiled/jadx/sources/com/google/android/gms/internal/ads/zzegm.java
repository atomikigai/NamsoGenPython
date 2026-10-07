package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import e6.j2;
import e6.t;
import java.util.concurrent.ExecutionException;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzegm implements zzefh {
    private final Context zza;
    private final zzcqh zzb;
    private View zzc;
    private zzbpp zzd;

    public zzegm(Context context, zzcqh zzcqhVar) {
        this.zza = context;
        this.zzb = zzcqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final Object zza(zzfff zzfffVar, final zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        final View view;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
            try {
                view = (View) b.I(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzffv(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzegj
                            @Override // com.google.android.gms.internal.ads.zzgdp
                            public final m9.a zza(Object obj) {
                                return this.zza.zzc(view, zzfetVar, obj);
                            }
                        }, zzcaj.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzffv(e);
                    }
                }
            } catch (RemoteException e4) {
                throw new zzffv(e4);
            }
        } else {
            view = this.zzc;
        }
        zzcpe zzcpeVarZza = this.zzb.zza(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzcpk(view, null, new zzcro() { // from class: com.google.android.gms.internal.ads.zzegi
            @Override // com.google.android.gms.internal.ads.zzcro
            public final j2 zza() throws zzffv {
                try {
                    return ((zzbrf) zzefeVar.zzb).zze();
                } catch (RemoteException e10) {
                    throw new zzffv(e10);
                }
            }
        }, (zzfeu) zzfetVar.zzu.get(0)));
        zzcpeVarZza.zzg().zza(view);
        ((zzegx) zzefeVar.zzc).zzc(zzcpeVarZza.zzj());
        return zzcpeVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        try {
            ((zzbrf) zzefeVar.zzb).zzq(zzfetVar.zzZ);
            zzegl zzeglVar = null;
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
                ((zzbrf) zzefeVar.zzb).zzk(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, new b(this.zza), new zzegk(this, zzefeVar, zzeglVar), (zzbpm) zzefeVar.zzc, zzfffVar.zza.zza.zze);
            } else {
                ((zzbrf) zzefeVar.zzb).zzj(zzfetVar.zzU, zzfetVar.zzv.toString(), zzfffVar.zza.zza.zzd, new b(this.zza), new zzegk(this, zzefeVar, zzeglVar), (zzbpm) zzefeVar.zzc, zzfffVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzffv(e);
        }
    }

    public final /* synthetic */ m9.a zzc(View view, zzfet zzfetVar, Object obj) throws Exception {
        return zzgei.zzh(zzcrc.zza(this.zza, view, zzfetVar));
    }
}

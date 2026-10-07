package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.t;
import i6.h;
import java.util.concurrent.Executor;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzehi implements zzefh {
    private final Context zza;
    private final zzdgn zzb;
    private final i6.a zzc;
    private final Executor zzd;

    public zzehi(Context context, i6.a aVar, zzdgn zzdgnVar, Executor executor) {
        this.zza = context;
        this.zzc = aVar;
        this.zzb = zzdgnVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final /* bridge */ /* synthetic */ Object zza(zzfff zzfffVar, zzfet zzfetVar, final zzefe zzefeVar) throws zzffv, zzeiz {
        zzdfk zzdfkVarZze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza), new zzdfn(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzehh
            @Override // com.google.android.gms.internal.ads.zzdgv
            public final void zza(boolean z4, Context context, zzcwz zzcwzVar) throws zzdgu {
                this.zza.zzc(zzefeVar, z4, context, zzcwzVar);
            }
        }, null));
        zzdfkVarZze.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzd);
        ((zzegx) zzefeVar.zzc).zzc(zzdfkVarZze.zzk());
        return zzdfkVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        zzfgm zzfgmVar = (zzfgm) zzefeVar.zzb;
        zzffo zzffoVar = zzfffVar.zza.zza;
        String string = zzfetVar.zzv.toString();
        String strR = b.R(zzfetVar.zzs);
        zzfgmVar.zzo(this.zza, zzffoVar.zzd, string, strR, (zzbpm) zzefeVar.zzc);
    }

    public final void zzc(zzefe zzefeVar, boolean z4, Context context, zzcwz zzcwzVar) throws zzdgu {
        try {
            ((zzfgm) zzefeVar.zzb).zzv(z4);
            if (this.zzc.f5215c < ((Integer) t.f3437d.f3440c.zza(zzbcn.zzaP)).intValue()) {
                ((zzfgm) zzefeVar.zzb).zzx();
            } else {
                ((zzfgm) zzefeVar.zzb).zzy(context);
            }
        } catch (zzffv e) {
            h.f("Cannot show interstitial.");
            throw new zzdgu(e.getCause());
        }
    }
}

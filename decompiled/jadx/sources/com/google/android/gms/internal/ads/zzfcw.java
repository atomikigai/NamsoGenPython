package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import d6.p;
import e6.o3;
import e6.q3;
import e6.t;
import i6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfcw implements zzeni {
    private final Context zza;
    private final Executor zzb;
    private final zzchk zzc;
    private final zzems zzd;
    private final zzfdw zze;
    private zzbdi zzf;
    private final zzfko zzg;
    private final zzffm zzh;
    private m9.a zzi;

    public zzfcw(Context context, Executor executor, zzchk zzchkVar, zzems zzemsVar, zzfdw zzfdwVar, zzffm zzffmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchkVar;
        this.zzd = zzemsVar;
        this.zzh = zzffmVar;
        this.zze = zzfdwVar;
        this.zzg = zzchkVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        m9.a aVar = this.zzi;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zzb(o3 o3Var, String str, zzeng zzengVar, zzenh zzenhVar) {
        zzdgn zzdgnVarZzf;
        zzfkl zzfklVarZzf;
        if (str == null) {
            h.d("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        zzbce zzbceVar = zzbcn.zziz;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && o3Var.f3375f) {
            this.zzc.zzl().zzo(true);
        }
        q3 q3Var = ((zzfcp) zzengVar).zza;
        Pair pair = new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(o3Var.K));
        String strZza = zzdrv.DYNAMITE_ENTER.zza();
        p.C.f2983j.getClass();
        Bundle bundleZza = zzdrx.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
        zzffm zzffmVar = this.zzh;
        zzffmVar.zzt(str);
        zzffmVar.zzs(q3Var);
        zzffmVar.zzH(o3Var);
        zzffmVar.zzA(bundleZza);
        Context context = this.zza;
        zzffo zzffoVarZzJ = zzffmVar.zzJ();
        zzfka zzfkaVarZzb = zzfjz.zzb(context, zzfkk.zzf(zzffoVarZzJ), 4, o3Var);
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzhQ)).booleanValue()) {
            zzdgm zzdgmVarZzg = this.zzc.zzg();
            zzcvu zzcvuVar = new zzcvu();
            zzcvuVar.zze(this.zza);
            zzcvuVar.zzi(zzffoVarZzJ);
            zzdgmVarZzg.zze(zzcvuVar.zzj());
            zzdcd zzdcdVar = new zzdcd();
            zzdcdVar.zzj(this.zzd, this.zzb);
            zzdcdVar.zzk(this.zzd, this.zzb);
            zzdgmVarZzg.zzd(zzdcdVar.zzn());
            zzdgmVarZzg.zzc(new zzelb(this.zzf));
            zzdgnVarZzf = zzdgmVarZzg.zzh();
        } else {
            zzdcd zzdcdVar2 = new zzdcd();
            zzfdw zzfdwVar = this.zze;
            if (zzfdwVar != null) {
                zzdcdVar2.zze(zzfdwVar, this.zzb);
                zzdcdVar2.zzf(this.zze, this.zzb);
                zzdcdVar2.zzb(this.zze, this.zzb);
            }
            zzdgm zzdgmVarZzg2 = this.zzc.zzg();
            zzcvu zzcvuVar2 = new zzcvu();
            zzcvuVar2.zze(this.zza);
            zzcvuVar2.zzi(zzffoVarZzJ);
            zzdgmVarZzg2.zze(zzcvuVar2.zzj());
            zzdcdVar2.zzj(this.zzd, this.zzb);
            zzdcdVar2.zze(this.zzd, this.zzb);
            zzdcdVar2.zzf(this.zzd, this.zzb);
            zzdcdVar2.zzb(this.zzd, this.zzb);
            zzdcdVar2.zza(this.zzd, this.zzb);
            zzdcdVar2.zzl(this.zzd, this.zzb);
            zzdcdVar2.zzk(this.zzd, this.zzb);
            zzdcdVar2.zzi(this.zzd, this.zzb);
            zzdcdVar2.zzc(this.zzd, this.zzb);
            zzdgmVarZzg2.zzd(zzdcdVar2.zzn());
            zzdgmVarZzg2.zzc(new zzelb(this.zzf));
            zzdgnVarZzf = zzdgmVarZzg2.zzh();
        }
        zzdgn zzdgnVar = zzdgnVarZzf;
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzfklVarZzf = zzdgnVar.zzf();
            zzfklVarZzf.zzi(4);
            zzfklVarZzf.zzb(o3Var.A);
            zzfklVarZzf.zzf(o3Var.f3382x);
        } else {
            zzfklVarZzf = null;
        }
        zzfkl zzfklVar = zzfklVarZzf;
        zzcsy zzcsyVarZza = zzdgnVar.zza();
        m9.a aVarZzi = zzcsyVarZza.zzi(zzcsyVarZza.zzj());
        this.zzi = aVarZzi;
        zzgei.zzr(aVarZzi, new zzfcv(this, zzenhVar, zzfklVar, zzfkaVarZzb, zzdgnVar), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zzdB(zzfgq.zzd(6, null, null));
    }

    public final void zzi(zzbdi zzbdiVar) {
        this.zzf = zzbdiVar;
    }
}

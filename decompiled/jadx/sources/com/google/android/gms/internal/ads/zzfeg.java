package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import d6.p;
import e6.o3;
import e6.q3;
import e6.t;
import i6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfeg implements zzeni {
    private final Context zza;
    private final Executor zzb;
    private final zzchk zzc;
    private final zzfdw zzd;
    private final zzfck zze;
    private final zzffg zzf;
    private final zzfko zzg;
    private final zzffm zzh;
    private m9.a zzi;

    public zzfeg(Context context, Executor executor, zzchk zzchkVar, zzfck zzfckVar, zzfdw zzfdwVar, zzffm zzffmVar, zzffg zzffgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchkVar;
        this.zze = zzfckVar;
        this.zzd = zzfdwVar;
        this.zzh = zzffmVar;
        this.zzf = zzffgVar;
        this.zzg = zzchkVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdov zzk(zzfci zzfciVar) {
        zzdov zzdovVarZzi = this.zzc.zzi();
        zzcvu zzcvuVar = new zzcvu();
        zzcvuVar.zze(this.zza);
        zzcvuVar.zzi(((zzfee) zzfciVar).zza);
        zzcvuVar.zzh(this.zzf);
        zzdovVarZzi.zzd(zzcvuVar.zzj());
        zzdovVarZzi.zzc(new zzdcd().zzn());
        return zzdovVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zzb(o3 o3Var, String str, zzeng zzengVar, zzenh zzenhVar) throws RemoteException {
        zzfkl zzfklVarZzh;
        zzbwq zzbwqVar = new zzbwq(o3Var, str);
        if (zzbwqVar.zzb == null) {
            h.d("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
            return false;
        }
        m9.a aVar = this.zzi;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzfck zzfckVar = this.zze;
            if (zzfckVar.zzd() != null) {
                zzfklVarZzh = ((zzdow) zzfckVar.zzd()).zzh();
                zzfklVarZzh.zzi(5);
                zzfklVarZzh.zzb(zzbwqVar.zza.A);
                zzfklVarZzh.zzf(zzbwqVar.zza.f3382x);
            } else {
                zzfklVarZzh = null;
            }
        } else {
            zzfklVarZzh = null;
        }
        zzfgl.zza(this.zza, zzbwqVar.zza.f3375f);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziz)).booleanValue() && zzbwqVar.zza.f3375f) {
            this.zzc.zzl().zzo(true);
        }
        Pair pair = new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(zzbwqVar.zza.K));
        String strZza = zzdrv.DYNAMITE_ENTER.zza();
        p.C.f2983j.getClass();
        Bundle bundleZza = zzdrx.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
        zzffm zzffmVar = this.zzh;
        zzffmVar.zzt(zzbwqVar.zzb);
        zzffmVar.zzs(new q3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false));
        zzffmVar.zzH(zzbwqVar.zza);
        zzffmVar.zzA(bundleZza);
        Context context = this.zza;
        zzffo zzffoVarZzJ = zzffmVar.zzJ();
        zzfka zzfkaVarZzb = zzfjz.zzb(context, zzfkk.zzf(zzffoVarZzJ), 5, zzbwqVar.zza);
        zzfee zzfeeVar = new zzfee(null);
        zzfeeVar.zza = zzffoVarZzJ;
        m9.a aVarZzc = this.zze.zzc(new zzfcl(zzfeeVar, null), new zzfcj() { // from class: com.google.android.gms.internal.ads.zzfea
            @Override // com.google.android.gms.internal.ads.zzfcj
            public final zzcvs zza(zzfci zzfciVar) {
                return this.zza.zzk(zzfciVar);
            }
        }, null);
        this.zzi = aVarZzc;
        zzgei.zzr(aVarZzc, new zzfed(this, zzenhVar, zzfklVarZzh, zzfkaVarZzb, zzfeeVar), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zzdB(zzfgq.zzd(6, null, null));
    }

    public final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}

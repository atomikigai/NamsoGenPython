package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import d6.p;
import e6.o3;
import e6.t;
import e6.z0;
import h6.r0;
import i6.h;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzenp implements zzeni {
    private final zzffm zza;
    private final zzchk zzb;
    private final Context zzc;
    private final zzenf zzd;
    private final zzfko zze;
    private zzcsf zzf;

    public zzenp(zzchk zzchkVar, Context context, zzenf zzenfVar, zzffm zzffmVar) {
        this.zzb = zzchkVar;
        this.zzc = context;
        this.zzd = zzenfVar;
        this.zza = zzffmVar;
        this.zze = zzchkVar.zzz();
        zzffmVar.zzv(zzenfVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        zzcsf zzcsfVar = this.zzf;
        return zzcsfVar != null && zzcsfVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zzb(o3 o3Var, String str, zzeng zzengVar, zzenh zzenhVar) throws RemoteException {
        p pVar = p.C;
        r0 r0Var = pVar.f2979c;
        if (r0.f(this.zzc) && o3Var.D == null) {
            h.d("Failed to load the ad because app ID is missing.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            h.d("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            });
            return false;
        }
        zzfgl.zza(this.zzc, o3Var.f3375f);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziz)).booleanValue() && o3Var.f3375f) {
            this.zzb.zzl().zzo(true);
        }
        int i = ((zzenj) zzengVar).zza;
        pVar.f2983j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzdrv.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdrx.zza(new Pair(strZza, lValueOf), new Pair(zzdrv.DYNAMITE_ENTER.zza(), lValueOf));
        zzffm zzffmVar = this.zza;
        zzffmVar.zzH(o3Var);
        zzffmVar.zzA(bundleZza);
        zzffmVar.zzC(i);
        Context context = this.zzc;
        zzffo zzffoVarZzJ = zzffmVar.zzJ();
        zzfka zzfkaVarZzb = zzfjz.zzb(context, zzfkk.zzf(zzffoVarZzJ), 8, o3Var);
        z0 z0Var = zzffoVarZzJ.zzn;
        if (z0Var != null) {
            this.zzd.zzd().zzm(z0Var);
        }
        zzdhi zzdhiVarZzh = this.zzb.zzh();
        zzcvu zzcvuVar = new zzcvu();
        zzcvuVar.zze(this.zzc);
        zzcvuVar.zzi(zzffoVarZzJ);
        zzdhiVarZzh.zzf(zzcvuVar.zzj());
        zzdcd zzdcdVar = new zzdcd();
        zzdcdVar.zzk(this.zzd.zzd(), this.zzb.zzC());
        zzdhiVarZzh.zze(zzdcdVar.zzn());
        zzdhiVarZzh.zzd(this.zzd.zzc());
        zzfkl zzfklVarZzf = null;
        zzdhiVarZzh.zzc(new zzcpa(null));
        zzdhj zzdhjVarZzg = zzdhiVarZzh.zzg();
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzfklVarZzf = zzdhjVarZzg.zzf();
            zzfklVarZzf.zzi(8);
            zzfklVarZzf.zzb(o3Var.A);
            zzfklVarZzf.zzf(o3Var.f3382x);
        }
        zzfkl zzfklVar = zzfklVarZzf;
        this.zzb.zzy().zzc(1);
        zzchk zzchkVar = this.zzb;
        zzges zzgesVarZzc = zzfin.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzD = zzchkVar.zzD();
        zzcsy zzcsyVarZza = zzdhjVarZzg.zza();
        zzcsf zzcsfVar = new zzcsf(zzgesVarZzc, scheduledExecutorServiceZzD, zzcsyVarZza.zzi(zzcsyVarZza.zzj()));
        this.zzf = zzcsfVar;
        zzcsfVar.zze(new zzeno(this, zzenhVar, zzfklVar, zzfkaVarZzb, zzdhjVarZzg));
        return true;
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzdB(zzfgq.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzdB(zzfgq.zzd(6, null, null));
    }
}

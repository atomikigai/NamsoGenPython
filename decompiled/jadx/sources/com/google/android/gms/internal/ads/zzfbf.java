package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import d6.p;
import e6.h2;
import e6.o3;
import e6.q3;
import e6.t;
import e6.w;
import h6.k0;
import h6.r0;
import i6.h;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfbf implements zzeni {
    private final Context zza;
    private final Executor zzb;
    private final zzchk zzc;
    private final zzems zzd;
    private final zzemw zze;
    private final ViewGroup zzf;
    private zzbdi zzg;
    private final zzcze zzh;
    private final zzfko zzi;
    private final zzdbk zzj;
    private final zzffm zzk;
    private m9.a zzl;
    private boolean zzm;
    private h2 zzn;
    private zzenh zzo;

    public zzfbf(Context context, Executor executor, q3 q3Var, zzchk zzchkVar, zzems zzemsVar, zzemw zzemwVar, zzffm zzffmVar, zzdbk zzdbkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchkVar;
        this.zzd = zzemsVar;
        this.zze = zzemwVar;
        this.zzk = zzffmVar;
        this.zzh = zzchkVar.zzf();
        this.zzi = zzchkVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdbkVar;
        zzffmVar.zzs(q3Var);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        this.zzl = null;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhO)).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
        }
        zzenh zzenhVar = this.zzo;
        if (zzenhVar != null) {
            zzenhVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        m9.a aVar = this.zzl;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zzb(o3 o3Var, String str, zzeng zzengVar, zzenh zzenhVar) throws RemoteException {
        zzcqh zzcqhVarZzk;
        if (str == null) {
            h.d("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl();
                }
            });
            return false;
        }
        if (!zza()) {
            zzbce zzbceVar = zzbcn.zziz;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && o3Var.f3375f) {
                this.zzc.zzl().zzo(true);
            }
            Pair pair = new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(o3Var.K));
            String strZza = zzdrv.DYNAMITE_ENTER.zza();
            p.C.f2983j.getClass();
            Bundle bundleZza = zzdrx.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
            zzffm zzffmVar = this.zzk;
            zzffmVar.zzt(str);
            zzffmVar.zzH(o3Var);
            zzffmVar.zzA(bundleZza);
            Context context = this.zza;
            zzffo zzffoVarZzJ = zzffmVar.zzJ();
            zzfka zzfkaVarZzb = zzfjz.zzb(context, zzfkk.zzf(zzffoVarZzJ), 3, o3Var);
            zzfkl zzfklVarZzj = null;
            if (!((Boolean) zzbet.zze.zze()).booleanValue() || !this.zzk.zzh().f3415v) {
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzhO)).booleanValue()) {
                    zzcqg zzcqgVarZze = this.zzc.zze();
                    zzcvu zzcvuVar = new zzcvu();
                    zzcvuVar.zze(this.zza);
                    zzcvuVar.zzi(zzffoVarZzJ);
                    zzcqgVarZze.zzi(zzcvuVar.zzj());
                    zzdcd zzdcdVar = new zzdcd();
                    zzdcdVar.zzj(this.zzd, this.zzb);
                    zzdcdVar.zzk(this.zzd, this.zzb);
                    zzcqgVarZze.zzf(zzdcdVar.zzn());
                    zzcqgVarZze.zze(new zzelb(this.zzg));
                    zzcqgVarZze.zzd(new zzdhe(zzdjj.zza, null));
                    zzcqgVarZze.zzg(new zzcri(this.zzh, this.zzj));
                    zzcqgVarZze.zzc(new zzcpa(this.zzf));
                    zzcqhVarZzk = zzcqgVarZze.zzh();
                } else {
                    zzcqg zzcqgVarZze2 = this.zzc.zze();
                    zzcvu zzcvuVar2 = new zzcvu();
                    zzcvuVar2.zze(this.zza);
                    zzcvuVar2.zzi(zzffoVarZzJ);
                    zzcqgVarZze2.zzi(zzcvuVar2.zzj());
                    zzdcd zzdcdVar2 = new zzdcd();
                    zzdcdVar2.zzj(this.zzd, this.zzb);
                    zzdcdVar2.zza(this.zzd, this.zzb);
                    zzdcdVar2.zza(this.zze, this.zzb);
                    zzdcdVar2.zzl(this.zzd, this.zzb);
                    zzdcdVar2.zzd(this.zzd, this.zzb);
                    zzdcdVar2.zze(this.zzd, this.zzb);
                    zzdcdVar2.zzf(this.zzd, this.zzb);
                    zzdcdVar2.zzb(this.zzd, this.zzb);
                    zzdcdVar2.zzk(this.zzd, this.zzb);
                    zzdcdVar2.zzi(this.zzd, this.zzb);
                    zzcqgVarZze2.zzf(zzdcdVar2.zzn());
                    zzcqgVarZze2.zze(new zzelb(this.zzg));
                    zzcqgVarZze2.zzd(new zzdhe(zzdjj.zza, null));
                    zzcqgVarZze2.zzg(new zzcri(this.zzh, this.zzj));
                    zzcqgVarZze2.zzc(new zzcpa(this.zzf));
                    zzcqhVarZzk = zzcqgVarZze2.zzh();
                }
                if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
                    zzfklVarZzj = zzcqhVarZzk.zzj();
                    zzfklVarZzj.zzi(3);
                    zzfklVarZzj.zzb(o3Var.A);
                    zzfklVarZzj.zzf(o3Var.f3382x);
                }
                this.zzo = zzenhVar;
                zzcsy zzcsyVarZzd = zzcqhVarZzk.zzd();
                m9.a aVarZzi = zzcsyVarZzd.zzi(zzcsyVarZzd.zzj());
                this.zzl = aVarZzi;
                zzgei.zzr(aVarZzi, new zzfbe(this, zzfklVarZzj, zzfkaVarZzb, zzcqhVarZzk), this.zzb);
                return true;
            }
            zzems zzemsVar = this.zzd;
            if (zzemsVar != null) {
                zzemsVar.zzdB(zzfgq.zzd(7, null, null));
            }
        } else if (!this.zzk.zzS()) {
            this.zzm = true;
            return false;
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzffm zzg() {
        return this.zzk;
    }

    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(this.zzn);
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdB(zzfgq.zzd(6, null, null));
    }

    public final void zzm() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzn() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzo(w wVar) {
        this.zze.zza(wVar);
    }

    public final void zzp(zzcyy zzcyyVar) {
        this.zzh.zzo(zzcyyVar, this.zzb);
    }

    public final void zzq(zzbdi zzbdiVar) {
        this.zzg = zzbdiVar;
    }

    public final void zzr() {
        synchronized (this) {
            try {
                m9.a aVar = this.zzl;
                if (aVar != null && aVar.isDone()) {
                    try {
                        zzcpd zzcpdVar = (zzcpd) this.zzl.get();
                        this.zzl = null;
                        this.zzf.removeAllViews();
                        if (zzcpdVar.zzd() != null) {
                            ViewParent parent = zzcpdVar.zzd().getParent();
                            if (parent instanceof ViewGroup) {
                                h.g("Banner view provided from " + (zzcpdVar.zzm() != null ? zzcpdVar.zzm().zzg() : "") + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(zzcpdVar.zzd());
                            }
                        }
                        zzbce zzbceVar = zzbcn.zzhO;
                        t tVar = t.f3437d;
                        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                            zzdas zzdasVarZzo = zzcpdVar.zzo();
                            zzdasVarZzo.zza(this.zzd);
                            zzdasVarZzo.zzc(this.zze);
                        }
                        this.zzf.addView(zzcpdVar.zzd());
                        this.zzo.zzb(zzcpdVar);
                        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzems zzemsVar = this.zzd;
                            Objects.requireNonNull(zzemsVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzemsVar.zzs();
                                }
                            });
                        }
                        if (zzcpdVar.zza() >= 0) {
                            this.zzm = false;
                            this.zzh.zzd(zzcpdVar.zza());
                            this.zzh.zze(zzcpdVar.zzc());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzcpdVar.zzc());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        zzu();
                        k0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    } catch (ExecutionException e4) {
                        e = e4;
                        zzu();
                        k0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    }
                } else if (this.zzl != null) {
                    k0.k("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    k0.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzt() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        r0 r0Var = p.C.f2979c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return r0.o(view, powerManager, keyguardManager);
    }
}

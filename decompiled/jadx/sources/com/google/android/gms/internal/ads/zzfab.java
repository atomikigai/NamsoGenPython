package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.i0;
import d6.p;
import e6.o3;
import e6.q3;
import e6.t;
import e6.u3;
import i6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfab implements zzeni {
    protected final zzchk zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfar zzd;
    private final zzfck zze;
    private final i6.a zzf;
    private final ViewGroup zzg;
    private final zzfko zzh;
    private final zzffm zzi;
    private m9.a zzj;

    public zzfab(Context context, Executor executor, zzchk zzchkVar, zzfck zzfckVar, zzfar zzfarVar, zzffm zzffmVar, i6.a aVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzchkVar;
        this.zze = zzfckVar;
        this.zzd = zzfarVar;
        this.zzi = zzffmVar;
        this.zzf = aVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzchkVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcvs zzm(zzfci zzfciVar) {
        zzezz zzezzVar = (zzezz) zzfciVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhP)).booleanValue()) {
            zzcpa zzcpaVar = new zzcpa(this.zzg);
            zzcvu zzcvuVar = new zzcvu();
            zzcvuVar.zze(this.zzb);
            zzcvuVar.zzi(zzezzVar.zza);
            zzcvw zzcvwVarZzj = zzcvuVar.zzj();
            zzdcd zzdcdVar = new zzdcd();
            zzdcdVar.zzc(this.zzd, this.zzc);
            zzdcdVar.zzl(this.zzd, this.zzc);
            return zze(zzcpaVar, zzcvwVarZzj, zzdcdVar.zzn());
        }
        zzfar zzfarVarZzi = zzfar.zzi(this.zzd);
        zzdcd zzdcdVar2 = new zzdcd();
        zzdcdVar2.zzb(zzfarVarZzi, this.zzc);
        zzdcdVar2.zzg(zzfarVarZzi, this.zzc);
        zzdcdVar2.zzh(zzfarVarZzi, this.zzc);
        zzdcdVar2.zzi(zzfarVarZzi, this.zzc);
        zzdcdVar2.zzc(zzfarVarZzi, this.zzc);
        zzdcdVar2.zzl(zzfarVarZzi, this.zzc);
        zzdcdVar2.zzm(zzfarVarZzi);
        zzcpa zzcpaVar2 = new zzcpa(this.zzg);
        zzcvu zzcvuVar2 = new zzcvu();
        zzcvuVar2.zze(this.zzb);
        zzcvuVar2.zzi(zzezzVar.zza);
        return zze(zzcpaVar2, zzcvuVar2.zzj(), zzdcdVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        m9.a aVar = this.zzj;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    @Override // com.google.android.gms.internal.ads.zzeni
    public final synchronized boolean zzb(o3 o3Var, String str, zzeng zzengVar, zzenh zzenhVar) throws Throwable {
        Throwable th;
        boolean z4;
        zzfkl zzfklVar;
        try {
            try {
                if (!o3Var.f3373c.getBoolean("is_sdk_preload", false)) {
                    if (((Boolean) zzbel.zzd.zze()).booleanValue()) {
                        try {
                            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        z4 = false;
                    }
                    if (this.zzf.f5215c < ((Integer) t.f3437d.f3440c.zza(zzbcn.zzkQ)).intValue() || !z4) {
                        i0.d("loadAd must be called on the main UI thread.");
                    }
                }
                if (str == null) {
                    h.d("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzk();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
                    zzfck zzfckVar = this.zze;
                    if (zzfckVar.zzd() != null) {
                        zzfkl zzfklVarZzh = ((zzcon) zzfckVar.zzd()).zzh();
                        zzfklVarZzh.zzi(7);
                        zzfklVarZzh.zzb(o3Var.A);
                        zzfklVarZzh.zzf(o3Var.f3382x);
                        zzfklVar = zzfklVarZzh;
                    } else {
                        zzfklVar = null;
                    }
                } else {
                    zzfklVar = null;
                }
                zzfgl.zza(this.zzb, o3Var.f3375f);
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziz)).booleanValue() && o3Var.f3375f) {
                    this.zza.zzl().zzo(true);
                }
                Pair pair = new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(o3Var.K));
                String strZza = zzdrv.DYNAMITE_ENTER.zza();
                p.C.f2983j.getClass();
                Bundle bundleZza = zzdrx.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
                zzffm zzffmVar = this.zzi;
                zzffmVar.zzt(str);
                zzffmVar.zzs(q3.g());
                zzffmVar.zzH(o3Var);
                zzffmVar.zzA(bundleZza);
                Context context = this.zzb;
                zzffo zzffoVarZzJ = zzffmVar.zzJ();
                zzfka zzfkaVarZzb = zzfjz.zzb(context, zzfkk.zzf(zzffoVarZzJ), 7, o3Var);
                zzezz zzezzVar = new zzezz(null);
                zzezzVar.zza = zzffoVarZzJ;
                m9.a aVarZzc = this.zze.zzc(new zzfcl(zzezzVar, null), new zzfcj() { // from class: com.google.android.gms.internal.ads.zzezw
                    @Override // com.google.android.gms.internal.ads.zzfcj
                    public final zzcvs zza(zzfci zzfciVar) {
                        return this.zza.zzm(zzfciVar);
                    }
                }, null);
                this.zzj = aVarZzc;
                zzgei.zzr(aVarZzc, new zzezy(this, zzenhVar, zzfklVar, zzfkaVarZzb, zzezzVar), this.zzc);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    public abstract zzcvs zze(zzcpa zzcpaVar, zzcvw zzcvwVar, zzdcf zzdcfVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(zzfgq.zzd(6, null, null));
    }

    public final void zzl(u3 u3Var) {
        this.zzi.zzu(u3Var);
    }
}

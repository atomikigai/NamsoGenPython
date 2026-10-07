package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import h6.f0;
import h6.n0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o6.c0;
import o6.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzchk implements zzclo {
    private static zzchk zza;

    private static synchronized zzchk zzG(Context context, zzbpg zzbpgVar, int i, boolean z4, int i10, zzcio zzcioVar) {
        try {
            zzchk zzchkVar = zza;
            if (zzchkVar != null) {
                return zzchkVar;
            }
            p pVar = p.C;
            pVar.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbcn.zza(context);
            if (((Boolean) zzbef.zze.zze()).booleanValue()) {
                zzbbx.zzd(context);
            }
            zzfgk zzfgkVarZzd = zzfgk.zzd(context);
            i6.a aVarZzc = zzfgkVarZzd.zzc(243799000, false, i10);
            zzfgkVarZzd.zzf(zzbpgVar);
            zzcjj zzcjjVar = new zzcjj(null);
            zzchl zzchlVar = new zzchl();
            zzchlVar.zzf(aVarZzc);
            zzchlVar.zze(context);
            zzchlVar.zzd(jCurrentTimeMillis);
            zzcjjVar.zzb(new zzchn(zzchlVar, null));
            zzcjjVar.zzc(new zzcke(zzcioVar));
            zzchk zzchkVarZza = zzcjjVar.zza();
            pVar.f2982g.zzu(context, aVarZzc);
            pVar.i.zzi(context);
            pVar.f2979c.A(context);
            pVar.f2979c.z(context);
            android.support.v4.media.session.a.K(context);
            pVar.f2981f.zzd(context);
            pVar.f2999z.a(context);
            zzchkVarZza.zza().a();
            zzbyw.zzd(context);
            zzbce zzbceVar = zzbcn.zzgc;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                if (!((Boolean) tVar.f3440c.zza(zzbcn.zzaF)).booleanValue()) {
                    new zzedc(context, aVarZzc, new zzbbl(new zzbbr(context)), new zzech(new zzecd(context), zzchkVarZza.zzB())).zzb(((n0) pVar.f2982g.zzi()).k());
                }
            }
            zza = zzchkVarZza;
            return zzchkVarZza;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzchk zzb(Context context, zzbpg zzbpgVar, int i) {
        return zzG(context, zzbpgVar, 243799000, false, i, new zzcio());
    }

    public abstract zzfma zzA();

    public abstract zzges zzB();

    public abstract Executor zzC();

    public abstract ScheduledExecutorService zzD();

    public abstract zzbzo zzE();

    @Override // com.google.android.gms.internal.ads.zzclo
    public final zzbzo zzF() {
        return zzE();
    }

    public abstract f0 zza();

    public abstract zzckp zzc();

    public abstract zzcoq zzd();

    public abstract zzcqg zze();

    public abstract zzcze zzf();

    public abstract zzdgm zzg();

    public abstract zzdhi zzh();

    public abstract zzdov zzi();

    public abstract zzdsm zzj();

    public abstract zzdtv zzk();

    public abstract zzdvk zzl();

    public abstract zzdwh zzm();

    public abstract zzeea zzn();

    public abstract c0 zzo();

    public abstract o6.f0 zzp();

    public abstract i zzq();

    @Override // com.google.android.gms.internal.ads.zzclo
    public final zzexc zzr(zzbvx zzbvxVar, int i) {
        return zzs(new zzeyv(zzbvxVar, i));
    }

    public abstract zzexc zzs(zzeyv zzeyvVar);

    public abstract zzezt zzt();

    public abstract zzfbh zzu();

    public abstract zzfcy zzv();

    public abstract zzfem zzw();

    public abstract zzfgd zzx();

    public abstract zzfgn zzy();

    public abstract zzfko zzz();
}

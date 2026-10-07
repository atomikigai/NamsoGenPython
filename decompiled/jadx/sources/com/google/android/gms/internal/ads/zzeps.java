package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import d6.p;
import e6.t;
import h6.m0;
import h6.n0;
import h6.r0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeps implements zzevz {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final long zze;
    private final zzctk zzf;
    private final zzfgw zzg;
    private final zzffo zzh;
    private final m0 zzi = p.C.f2982g.zzi();
    private final zzdsh zzj;
    private final zzctx zzk;

    public zzeps(Context context, String str, String str2, zzctk zzctkVar, zzfgw zzfgwVar, zzffo zzffoVar, zzdsh zzdshVar, zzctx zzctxVar, long j4) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = zzctkVar;
        this.zzg = zzfgwVar;
        this.zzh = zzffoVar;
        this.zzj = zzdshVar;
        this.zzk = zzctxVar;
        this.zze = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        final Bundle bundle = new Bundle();
        this.zzj.zzb().put("seq_num", this.zzc);
        zzbce zzbceVar = zzbcn.zzci;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            zzdsh zzdshVar = this.zzj;
            p.C.f2983j.getClass();
            zzdshVar.zzc("tsacc", String.valueOf(System.currentTimeMillis() - this.zze));
            this.zzj.zzc("foreground", true != r0.e(this.zza) ? "1" : "0");
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzfA)).booleanValue()) {
            this.zzf.zzk(this.zzh.zzd);
            bundle.putAll(this.zzg.zzb());
        }
        return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzepr
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                this.zza.zzc(bundle, (Bundle) obj);
            }
        });
    }

    public final void zzc(Bundle bundle, Bundle bundle2) {
        zzbce zzbceVar = zzbcn.zzfA;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzfz)).booleanValue()) {
                synchronized (zzb) {
                    this.zzf.zzk(this.zzh.zzd);
                    bundle2.putBundle("quality_signals", this.zzg.zzb());
                }
            } else {
                this.zzf.zzk(this.zzh.zzd);
                bundle2.putBundle("quality_signals", this.zzg.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzc);
        if (!((n0) this.zzi).k()) {
            bundle2.putString("session_id", this.zzd);
        }
        bundle2.putBoolean("client_purpose_one", !((n0) this.zzi).k());
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzfB)).booleanValue()) {
            try {
                r0 r0Var = p.C.f2979c;
                bundle2.putString("_app_id", r0.E(this.zza));
            } catch (RemoteException | RuntimeException e) {
                p.C.f2982g.zzw(e, "AppStatsSignal_AppId");
            }
        }
        if (this.zzh.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.zzk.zzb(this.zzh.zzf));
            bundle3.putInt("pcc", this.zzk.zza(this.zzh.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjp)).booleanValue()) {
            p pVar = p.C;
            if (pVar.f2982g.zza() > 0) {
                bundle2.putInt("nrwv", pVar.f2982g.zza());
            }
        }
    }
}

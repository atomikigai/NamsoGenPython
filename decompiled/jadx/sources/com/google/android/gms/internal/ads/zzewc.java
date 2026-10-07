package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import d6.p;
import e6.t;
import h6.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzewc {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfkl zzd;
    private final zzdsm zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzewc(Context context, Executor executor, Set set, zzfkl zzfklVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfklVar;
        this.zze = zzdsmVar;
    }

    public final m9.a zza(final Object obj, final Bundle bundle) {
        zzfka zzfkaVarZza = zzfjz.zza(this.zza, 8);
        zzfkaVarZza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbce zzbceVar = zzbcn.zzlt;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (!((String) zzbclVar.zza(zzbceVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzbclVar2.zza(zzbceVar)).split(","));
        }
        p pVar = p.C;
        pVar.f2983j.getClass();
        this.zzf = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) zzbclVar2.zza(zzbcn.zzci)).booleanValue() && bundle != null) {
            pVar.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdrv.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdrv.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzevz zzevzVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzevzVar.zza()))) {
                p.C.f2983j.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                m9.a aVarZzb = zzevzVar.zzb();
                aVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb(jElapsedRealtime, zzevzVar, bundle2);
                    }
                }, zzcaj.zzf);
                arrayList.add(aVarZzb);
            }
        }
        m9.a aVarZza = zzgei.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzevy zzevyVar = (zzevy) ((m9.a) it.next()).get();
                    if (zzevyVar != null) {
                        zzevyVar.zzj(obj2);
                    }
                }
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    p.C.f2983j.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdrv.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong(zzdrv.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfko.zza()) {
            zzfkk.zza(aVarZza, this.zzd, zzfkaVarZza);
        }
        return aVarZza;
    }

    public final void zzb(long j4, zzevz zzevzVar, Bundle bundle) {
        p pVar = p.C;
        pVar.f2983j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j4;
        if (((Boolean) zzbep.zza.zze()).booleanValue()) {
            k0.k("Signal runtime (ms) : " + zzfxf.zzc(zzevzVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        zzbce zzbceVar = zzbcn.zzci;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzcm)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzevzVar.zza(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzcg)).booleanValue()) {
            zzdsl zzdslVarZza = this.zze.zza();
            zzdslVarZza.zzb("action", "lat_ms");
            zzdslVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdslVarZza.zzb("lat_id", String.valueOf(zzevzVar.zza()));
            zzdslVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzch)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdslVarZza.zzb("seq_num", pVar.f2982g.zzh().zzd());
                synchronized (this) {
                    try {
                        if (this.zzg == this.zzb.size() && this.zzf != 0) {
                            this.zzg = 0;
                            pVar.f2983j.getClass();
                            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.zzf);
                            if (zzevzVar.zza() <= 39 || zzevzVar.zza() >= 52) {
                                zzdslVarZza.zzb("lat_clsg", strValueOf);
                            } else {
                                zzdslVarZza.zzb("lat_gmssg", strValueOf);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzdslVarZza.zzg();
        }
    }
}

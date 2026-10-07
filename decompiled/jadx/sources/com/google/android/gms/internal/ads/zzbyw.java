package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import h6.n0;
import h6.r0;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbyw {
    static zzbyw zza;

    public static synchronized zzbyw zzd(Context context) {
        try {
            zzbyw zzbywVar = zza;
            if (zzbywVar != null) {
                return zzbywVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbcn.zza(applicationContext);
            p pVar = p.C;
            n0 n0Var = (n0) pVar.f2982g.zzi();
            n0Var.p(applicationContext);
            zzbyo zzbyoVar = new zzbyo(null);
            zzbyoVar.zzb(applicationContext);
            zzbyoVar.zzc(pVar.f2983j);
            zzbyoVar.zza(n0Var);
            zzbyoVar.zzd(pVar.f2998y);
            zzbyw zzbywVarZze = zzbyoVar.zze();
            zza = zzbywVarZze;
            zzbywVarZze.zza().zza();
            zzbza zzbzaVarZzc = zza.zzc();
            zzbce zzbceVar = zzbcn.zzaB;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                HashMap mapH = r0.H((String) tVar.f3440c.zza(zzbcn.zzaC));
                Iterator it = mapH.keySet().iterator();
                while (it.hasNext()) {
                    zzbzaVarZzc.zzc((String) it.next());
                }
                zzbzaVarZzc.zzd(new zzbyy(zzbzaVarZzc, mapH));
            }
            return zza;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzbyi zza();

    public abstract zzbym zzb();

    public abstract zzbza zzc();
}

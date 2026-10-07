package com.google.android.gms.internal.ads;

import e6.t;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdsm {
    private final zzdsr zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdsm(zzdsr zzdsrVar, Executor executor) {
        this.zza = zzdsrVar;
        this.zzc = zzdsrVar.zza();
        this.zzb = executor;
    }

    public final zzdsl zza() {
        zzdsl zzdslVar = new zzdsl(this);
        zzdsl.zza(zzdslVar);
        return zzdslVar;
    }

    public final void zze() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzln)).booleanValue()) {
            zzdsl zzdslVarZza = zza();
            zzdslVarZza.zzb("action", "pecr");
            zzdslVarZza.zzf();
        }
    }
}

package com.google.android.gms.internal.ads;

import e6.t;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfmi {
    private final Object zza;
    private final long zzb;
    private final n7.a zzc;
    private final long zzd;

    public zzfmi(Object obj, n7.a aVar) {
        this.zza = obj;
        this.zzc = aVar;
        ((b) aVar).getClass();
        this.zzb = System.currentTimeMillis();
        this.zzd = ((Long) t.f3437d.f3440c.zza(zzbcn.zzx)).longValue() * 1000;
    }

    public final long zza() {
        long jMin = this.zzd + Math.min(Math.max(((Long) t.f3437d.f3440c.zza(zzbcn.zzt)).longValue(), -900000L), 10000L);
        ((b) this.zzc).getClass();
        return jMin - (System.currentTimeMillis() - this.zzb);
    }

    public final Object zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        long j4 = this.zzb;
        long j10 = this.zzd;
        ((b) this.zzc).getClass();
        return System.currentTimeMillis() >= j4 + j10;
    }
}

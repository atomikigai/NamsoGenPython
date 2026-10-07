package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzafb {
    protected final zzadx zza;

    public zzafb(zzadx zzadxVar) {
        this.zza = zzadxVar;
    }

    public abstract boolean zza(zzed zzedVar) throws zzbh;

    public abstract boolean zzb(zzed zzedVar, long j4) throws zzbh;

    public final boolean zzf(zzed zzedVar, long j4) throws zzbh {
        return zza(zzedVar) && zzb(zzedVar, j4);
    }
}

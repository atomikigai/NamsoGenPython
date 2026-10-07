package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzxn implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxn(zzad zzadVar, int i) {
        this.zza = 1 == (zzadVar.zze & 1);
        this.zzb = zzlo.zza(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxn zzxnVar) {
        return zzfzd.zzj().zzd(this.zzb, zzxnVar.zzb).zzd(this.zza, zzxnVar.zza).zza();
    }
}

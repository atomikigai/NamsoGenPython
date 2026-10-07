package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzhbt {
    final Unsafe zza;

    public zzhbt(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j4);

    public abstract double zzb(Object obj, long j4);

    public abstract float zzc(Object obj, long j4);

    public abstract void zzd(long j4, byte[] bArr, long j10, long j11);

    public abstract void zze(Object obj, long j4, boolean z4);

    public abstract void zzf(Object obj, long j4, byte b10);

    public abstract void zzg(Object obj, long j4, double d10);

    public abstract void zzh(Object obj, long j4, float f10);

    public abstract boolean zzi(Object obj, long j4);
}

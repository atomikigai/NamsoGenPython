package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzlu {
    final Unsafe zza;

    public zzlu(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j4);

    public abstract float zzb(Object obj, long j4);

    public abstract void zzc(Object obj, long j4, boolean z4);

    public abstract void zzd(Object obj, long j4, byte b10);

    public abstract void zze(Object obj, long j4, double d10);

    public abstract void zzf(Object obj, long j4, float f10);

    public abstract boolean zzg(Object obj, long j4);
}

package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzhh {
    final Unsafe zza;

    public zzhh(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j4);

    public abstract float zzb(Object obj, long j4);

    public abstract void zzc(Object obj, long j4, boolean z4);

    public abstract void zzd(Object obj, long j4, double d10);

    public abstract void zze(Object obj, long j4, float f10);

    public abstract boolean zzf(Object obj, long j4);

    public final int zzg(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzh(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzi(Object obj, long j4) {
        return this.zza.getInt(obj, j4);
    }

    public final long zzj(Object obj, long j4) {
        return this.zza.getLong(obj, j4);
    }

    public final long zzk(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzl(Object obj, long j4) {
        return this.zza.getObject(obj, j4);
    }

    public final void zzm(Object obj, long j4, int i) {
        this.zza.putInt(obj, j4, i);
    }

    public final void zzn(Object obj, long j4, long j10) {
        this.zza.putLong(obj, j4, j10);
    }

    public final void zzo(Object obj, long j4, Object obj2) {
        this.zza.putObject(obj, j4, obj2);
    }
}

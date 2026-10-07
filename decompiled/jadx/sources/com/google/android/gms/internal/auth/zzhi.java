package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhi {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhh zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z4;
        boolean z10;
        zzhh zzhhVar;
        Unsafe unsafeZzg = zzg();
        zzb = unsafeZzg;
        zzc = zzdr.zza();
        Class cls = Long.TYPE;
        boolean zZzs = zzs(cls);
        zzd = zZzs;
        Class cls2 = Integer.TYPE;
        boolean zZzs2 = zzs(cls2);
        zzhh zzhfVar = null;
        if (unsafeZzg != null) {
            if (zZzs) {
                zzhfVar = new zzhg(unsafeZzg);
            } else if (zZzs2) {
                zzhfVar = new zzhf(unsafeZzg);
            }
        }
        zze = zzhfVar;
        if (zzhfVar == null) {
            z4 = false;
        } else {
            try {
                Class<?> cls3 = zzhfVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzy() == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } catch (Throwable th) {
                zzh(th);
            }
        }
        zzf = z4;
        zzhh zzhhVar2 = zze;
        if (zzhhVar2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = zzhhVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z10 = true;
            } catch (Throwable th2) {
                zzh(th2);
                z10 = false;
            }
        }
        zzg = z10;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        Field fieldZzy = zzy();
        if (fieldZzy != null && (zzhhVar = zze) != null) {
            zzhhVar.zzk(fieldZzy);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhi() {
    }

    public static double zza(Object obj, long j4) {
        return zze.zza(obj, j4);
    }

    public static float zzb(Object obj, long j4) {
        return zze.zzb(obj, j4);
    }

    public static int zzc(Object obj, long j4) {
        return zze.zzi(obj, j4);
    }

    public static long zzd(Object obj, long j4) {
        return zze.zzj(obj, j4);
    }

    public static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzf(Object obj, long j4) {
        return zze.zzl(obj, j4);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhe());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhi.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static /* synthetic */ void zzi(Object obj, long j4, boolean z4) {
        long j10 = (-4) & j4;
        zzhh zzhhVar = zze;
        int iZzi = zzhhVar.zzi(obj, j10);
        int i = ((~((int) j4)) & 3) << 3;
        zzhhVar.zzm(obj, j10, ((z4 ? 1 : 0) << i) | ((~(255 << i)) & iZzi));
    }

    public static /* synthetic */ void zzj(Object obj, long j4, boolean z4) {
        long j10 = (-4) & j4;
        zzhh zzhhVar = zze;
        int i = (((int) j4) & 3) << 3;
        zzhhVar.zzm(obj, j10, ((z4 ? 1 : 0) << i) | ((~(255 << i)) & zzhhVar.zzi(obj, j10)));
    }

    public static void zzk(Object obj, long j4, boolean z4) {
        zze.zzc(obj, j4, z4);
    }

    public static void zzl(Object obj, long j4, double d10) {
        zze.zzd(obj, j4, d10);
    }

    public static void zzm(Object obj, long j4, float f10) {
        zze.zze(obj, j4, f10);
    }

    public static void zzn(Object obj, long j4, int i) {
        zze.zzm(obj, j4, i);
    }

    public static void zzo(Object obj, long j4, long j10) {
        zze.zzn(obj, j4, j10);
    }

    public static void zzp(Object obj, long j4, Object obj2) {
        zze.zzo(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j4) {
        return ((byte) ((zze.zzi(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j4) {
        return ((byte) ((zze.zzi(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzs(Class cls) {
        int i = zzdr.zza;
        try {
            Class cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzt(Object obj, long j4) {
        return zze.zzf(obj, j4);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i = zzdr.zza;
        Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (fieldZzz != null) {
            return fieldZzz;
        }
        Field fieldZzz2 = zzz(Buffer.class, "address");
        if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}

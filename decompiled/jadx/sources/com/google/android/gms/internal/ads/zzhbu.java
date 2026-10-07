package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhbu {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhbt zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z4;
        boolean z10;
        zzhbt zzhbtVar;
        Unsafe unsafeZzi = zzi();
        zzc = unsafeZzi;
        int i = zzgxc.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzy = zzy(cls);
        zze = zZzy;
        Class cls2 = Integer.TYPE;
        boolean zZzy2 = zzy(cls2);
        zzhbt zzhbrVar = null;
        if (unsafeZzi != null) {
            if (zZzy) {
                zzhbrVar = new zzhbs(unsafeZzi);
            } else if (zZzy2) {
                zzhbrVar = new zzhbr(unsafeZzi);
            }
        }
        zzf = zzhbrVar;
        if (zzhbrVar == null) {
            z4 = false;
        } else {
            try {
                Class<?> cls3 = zzhbrVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzE() == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } catch (Throwable th) {
                zzj(th);
            }
        }
        zzg = z4;
        zzhbt zzhbtVar2 = zzf;
        if (zzhbtVar2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = zzhbtVar2.zza.getClass();
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
                zzj(th2);
                z10 = false;
            }
        }
        zzh = z10;
        zza = zzC(byte[].class);
        zzC(boolean[].class);
        zzD(boolean[].class);
        zzC(int[].class);
        zzD(int[].class);
        zzC(long[].class);
        zzD(long[].class);
        zzC(float[].class);
        zzD(float[].class);
        zzC(double[].class);
        zzD(double[].class);
        zzC(Object[].class);
        zzD(Object[].class);
        Field fieldZzE = zzE();
        long jObjectFieldOffset = -1;
        if (fieldZzE != null && (zzhbtVar = zzf) != null) {
            jObjectFieldOffset = zzhbtVar.zza.objectFieldOffset(fieldZzE);
        }
        zzi = jObjectFieldOffset;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhbu() {
    }

    public static boolean zzA() {
        return zzh;
    }

    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i = zzgxc.zza;
        Field fieldZzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (fieldZzF != null) {
            return fieldZzF;
        }
        Field fieldZzF2 = zzF(Buffer.class, "address");
        if (fieldZzF2 == null || fieldZzF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j4, byte b10) {
        zzhbt zzhbtVar = zzf;
        long j10 = (-4) & j4;
        int i = zzhbtVar.zza.getInt(obj, j10);
        int i10 = ((~((int) j4)) & 3) << 3;
        zzhbtVar.zza.putInt(obj, j10, ((255 & b10) << i10) | (i & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j4, byte b10) {
        zzhbt zzhbtVar = zzf;
        long j10 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        zzhbtVar.zza.putInt(obj, j10, ((255 & b10) << i) | (zzhbtVar.zza.getInt(obj, j10) & (~(255 << i))));
    }

    public static byte zza(long j4) {
        return zzf.zza(j4);
    }

    public static double zzb(Object obj, long j4) {
        return zzf.zzb(obj, j4);
    }

    public static float zzc(Object obj, long j4) {
        return zzf.zzc(obj, j4);
    }

    public static int zzd(Object obj, long j4) {
        return zzf.zza.getInt(obj, j4);
    }

    public static long zze(ByteBuffer byteBuffer) {
        zzhbt zzhbtVar = zzf;
        return zzhbtVar.zza.getLong(byteBuffer, zzi);
    }

    public static long zzf(Object obj, long j4) {
        return zzf.zza.getLong(obj, j4);
    }

    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzh(Object obj, long j4) {
        return zzf.zza.getObject(obj, j4);
    }

    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhbq());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzhbu.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzo(long j4, byte[] bArr, long j10, long j11) {
        zzf.zzd(j4, bArr, j10, j11);
    }

    public static void zzp(Object obj, long j4, boolean z4) {
        zzf.zze(obj, j4, z4);
    }

    public static void zzq(byte[] bArr, long j4, byte b10) {
        zzf.zzf(bArr, zza + j4, b10);
    }

    public static void zzr(Object obj, long j4, double d10) {
        zzf.zzg(obj, j4, d10);
    }

    public static void zzs(Object obj, long j4, float f10) {
        zzf.zzh(obj, j4, f10);
    }

    public static void zzt(Object obj, long j4, int i) {
        zzf.zza.putInt(obj, j4, i);
    }

    public static void zzu(Object obj, long j4, long j10) {
        zzf.zza.putLong(obj, j4, j10);
    }

    public static void zzv(Object obj, long j4, Object obj2) {
        zzf.zza.putObject(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j4) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j4) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzy(Class cls) {
        int i = zzgxc.zza;
        try {
            Class cls2 = zzd;
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

    public static boolean zzz(Object obj, long j4) {
        return zzf.zzi(obj, j4);
    }
}

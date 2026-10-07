package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f685a = Logger.getLogger(n1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f688d;
    public static final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f690g;
    public static final boolean h;

    static {
        boolean z4;
        boolean z10;
        m1 m1Var;
        Unsafe unsafeI = i();
        f686b = unsafeI;
        f687c = c.f615a;
        Class cls = Long.TYPE;
        boolean zE = e(cls);
        Class cls2 = Integer.TYPE;
        boolean zE2 = e(cls2);
        m1 l1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                l1Var = new l1(unsafeI);
            } else if (zE) {
                l1Var = new k1(unsafeI, 1);
            } else if (zE2) {
                l1Var = new k1(unsafeI, 0);
            }
        }
        f688d = l1Var;
        Class cls3 = Byte.TYPE;
        Class<Field> cls4 = Field.class;
        if (unsafeI == null) {
            z4 = false;
        } else {
            try {
                Class<?> cls5 = unsafeI.getClass();
                cls5.getMethod("objectFieldOffset", cls4);
                cls5.getMethod("getLong", Object.class, cls);
                if (d() == null) {
                    z4 = false;
                } else {
                    if (!c.a()) {
                        cls5.getMethod("getByte", cls);
                        cls5.getMethod("putByte", cls, cls3);
                        cls5.getMethod("getInt", cls);
                        cls5.getMethod("putInt", cls, cls2);
                        cls5.getMethod("getLong", cls);
                        cls5.getMethod("putLong", cls, cls);
                        cls5.getMethod("copyMemory", cls, cls, cls);
                        cls5.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    }
                    cls4 = cls4;
                    z4 = true;
                }
            } catch (Throwable th) {
                f685a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
        }
        e = z4;
        Unsafe unsafe = f686b;
        if (unsafe == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls6 = unsafe.getClass();
                cls6.getMethod("objectFieldOffset", cls4);
                cls6.getMethod("arrayBaseOffset", Class.class);
                cls6.getMethod("arrayIndexScale", Class.class);
                cls6.getMethod("getInt", Object.class, cls);
                cls6.getMethod("putInt", Object.class, cls, cls2);
                cls6.getMethod("getLong", Object.class, cls);
                cls6.getMethod("putLong", Object.class, cls, cls);
                cls6.getMethod("getObject", Object.class, cls);
                cls6.getMethod("putObject", Object.class, cls, Object.class);
                if (!c.a()) {
                    cls6.getMethod("getByte", Object.class, cls);
                    cls6.getMethod("putByte", Object.class, cls, cls3);
                    cls6.getMethod("getBoolean", Object.class, cls);
                    cls6.getMethod("putBoolean", Object.class, cls, Boolean.TYPE);
                    cls6.getMethod("getFloat", Object.class, cls);
                    cls6.getMethod("putFloat", Object.class, cls, Float.TYPE);
                    cls6.getMethod("getDouble", Object.class, cls);
                    cls6.getMethod("putDouble", Object.class, cls, Double.TYPE);
                }
                z10 = true;
            } catch (Throwable th2) {
                f685a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z10 = false;
            }
        }
        f689f = z10;
        f690g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field fieldD = d();
        if (fieldD != null && (m1Var = f688d) != null) {
            m1Var.j(fieldD);
        }
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return f686b.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int b(Class cls) {
        if (f689f) {
            return f688d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f689f) {
            f688d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean e(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f687c;
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

    public static byte f(byte[] bArr, long j4) {
        return f688d.d(f690g + j4, bArr);
    }

    public static byte g(long j4, Object obj) {
        return (byte) ((f688d.g((-4) & j4, obj) >>> ((int) (((~j4) & 3) << 3))) & 255);
    }

    public static byte h(long j4, Object obj) {
        return (byte) ((f688d.g((-4) & j4, obj) >>> ((int) ((j4 & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j4, byte b10) {
        f688d.l(bArr, f690g + j4, b10);
    }

    public static void k(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        int iG = f688d.g(j10, obj);
        int i = ((~((int) j4)) & 3) << 3;
        m(obj, j10, ((255 & b10) << i) | (iG & (~(255 << i))));
    }

    public static void l(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        m(obj, j10, ((255 & b10) << i) | (f688d.g(j10, obj) & (~(255 << i))));
    }

    public static void m(Object obj, long j4, int i) {
        f688d.o(obj, j4, i);
    }

    public static void n(Object obj, long j4, long j10) {
        f688d.p(obj, j4, j10);
    }

    public static void o(Object obj, long j4, Object obj2) {
        f688d.q(obj, j4, obj2);
    }
}

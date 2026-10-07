package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f669a;

    public m1(Unsafe unsafe) {
        this.f669a = unsafe;
    }

    public final int a(Class cls) {
        return this.f669a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f669a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j4, Object obj);

    public abstract byte d(long j4, Object obj);

    public abstract double e(long j4, Object obj);

    public abstract float f(long j4, Object obj);

    public final int g(long j4, Object obj) {
        return this.f669a.getInt(obj, j4);
    }

    public final long h(long j4, Object obj) {
        return this.f669a.getLong(obj, j4);
    }

    public final Object i(long j4, Object obj) {
        return this.f669a.getObject(obj, j4);
    }

    public final long j(Field field) {
        return this.f669a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j4, boolean z4);

    public abstract void l(Object obj, long j4, byte b10);

    public abstract void m(Object obj, long j4, double d10);

    public abstract void n(Object obj, long j4, float f10);

    public final void o(Object obj, long j4, int i) {
        this.f669a.putInt(obj, j4, i);
    }

    public final void p(Object obj, long j4, long j10) {
        this.f669a.putLong(obj, j4, j10);
    }

    public final void q(Object obj, long j4, Object obj2) {
        this.f669a.putObject(obj, j4, obj2);
    }
}

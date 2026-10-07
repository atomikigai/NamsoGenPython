package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends a {
    private static Map<Object, t> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected e1 unknownFields;

    public t() {
        this.memoizedHashCode = 0;
        this.unknownFields = e1.f626f;
        this.memoizedSerializedSize = -1;
    }

    public static t e(Class cls) {
        t tVar = defaultInstanceMap.get(cls);
        if (tVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                tVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = (t) ((t) n1.a(cls)).d(6);
        if (tVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, tVar2);
        return tVar2;
    }

    public static Object f(Method method, t tVar, Object... objArr) {
        try {
            return method.invoke(tVar, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void h(Class cls, t tVar) {
        defaultInstanceMap.put(cls, tVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            s0 s0Var = s0.f710c;
            s0Var.getClass();
            this.memoizedSerializedSize = s0Var.a(getClass()).c(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void c(j jVar) {
        s0 s0Var = s0.f710c;
        s0Var.getClass();
        v0 v0VarA = s0Var.a(getClass());
        f0 f0Var = jVar.f657c;
        if (f0Var == null) {
            f0Var = new f0(jVar);
        }
        v0VarA.a(this, f0Var);
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((t) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        s0 s0Var = s0.f710c;
        s0Var.getClass();
        return s0Var.a(getClass()).g(this, (t) obj);
    }

    public final boolean g() {
        byte bByteValue = ((Byte) d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        s0 s0Var = s0.f710c;
        s0Var.getClass();
        boolean zD = s0Var.a(getClass()).d(this);
        d(2);
        return zD;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        s0 s0Var = s0.f710c;
        s0Var.getClass();
        int iF = s0Var.a(getClass()).f(this);
        this.memoizedHashCode = iF;
        return iF;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        m0.k(this, sb2, 0);
        return sb2.toString();
    }
}

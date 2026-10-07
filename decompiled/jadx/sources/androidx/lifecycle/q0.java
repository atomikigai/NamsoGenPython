package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class q0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f1084a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f1085b = new q0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q0 f1086c;

    @Override // androidx.lifecycle.s0
    public p0 a(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            jc.i.d(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (p0) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }
}

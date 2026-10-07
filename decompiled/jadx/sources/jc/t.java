package jc;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static void a(int i, Object obj) {
        if (obj == null || b(i, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(v.u(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", "kotlin.jvm.functions.Function" + i));
        i.g(classCastException, t.class.getName());
        throw classCastException;
    }

    public static boolean b(int i, Object obj) {
        int arity;
        if (obj instanceof ub.a) {
            if (obj instanceof g) {
                arity = ((g) obj).getArity();
            } else if (obj instanceof ic.a) {
                arity = 0;
            } else if (obj instanceof ic.l) {
                arity = 1;
            } else if (obj instanceof ic.p) {
                arity = 2;
            } else if (obj instanceof ic.q) {
                arity = 3;
            } else {
                arity = obj instanceof i2.a ? 4 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static final a c(Object[] objArr) {
        i.e(objArr, "array");
        return new a(objArr);
    }
}

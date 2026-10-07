package vb;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends jd.d {
    public static ArrayList Q(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new f(objArr, true));
    }

    public static int R(List list) {
        jc.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List S(Object... objArr) {
        jc.i.e(objArr, "elements");
        return objArr.length > 0 ? h.H(objArr) : q.f9297a;
    }

    public static void T() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

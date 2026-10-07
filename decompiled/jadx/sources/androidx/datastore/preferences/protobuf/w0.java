package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1 f730d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f727a = cls;
        f728b = v(false);
        f729c = v(true);
        f730d = new f1();
    }

    public static void A(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                double dDoubleValue = ((Double) list.get(i10)).doubleValue();
                jVar.getClass();
                jVar.K(i, Double.doubleToRawLongBits(dDoubleValue));
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = j.h;
            i11 += 8;
        }
        jVar.T(i11);
        while (i10 < list.size()) {
            jVar.L(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void B(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.M(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int iW = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iW += j.w(((Integer) list.get(i11)).intValue());
        }
        jVar.T(iW);
        while (i10 < list.size()) {
            jVar.N(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void C(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.I(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = j.h;
            i11 += 4;
        }
        jVar.T(i11);
        while (i10 < list.size()) {
            jVar.J(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void D(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.K(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = j.h;
            i11 += 8;
        }
        jVar.T(i11);
        while (i10 < list.size()) {
            jVar.L(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void E(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                float fFloatValue = ((Float) list.get(i10)).floatValue();
                jVar.getClass();
                jVar.I(i, Float.floatToRawIntBits(fFloatValue));
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = j.h;
            i11 += 4;
        }
        jVar.T(i11);
        while (i10 < list.size()) {
            jVar.J(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void F(int i, List list, f0 f0Var, v0 v0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            f0Var.b(i, list.get(i10), v0Var);
        }
    }

    public static void G(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.M(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int iW = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iW += j.w(((Integer) list.get(i11)).intValue());
        }
        jVar.T(iW);
        while (i10 < list.size()) {
            jVar.N(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void H(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.U(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA += j.A(((Long) list.get(i11)).longValue());
        }
        jVar.T(iA);
        while (i10 < list.size()) {
            jVar.V(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void I(int i, List list, f0 f0Var, v0 v0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        f0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((j) f0Var.f636a).O(i, (a) list.get(i10), v0Var);
        }
    }

    public static void J(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.I(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = j.h;
            i11 += 4;
        }
        jVar.T(i11);
        while (i10 < list.size()) {
            jVar.J(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void K(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.K(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = j.h;
            i11 += 8;
        }
        jVar.T(i11);
        while (i10 < list.size()) {
            jVar.L(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void L(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                jVar.S(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int iZ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iZ += j.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        jVar.T(iZ);
        while (i10 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            jVar.T((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i10++;
        }
    }

    public static void M(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                jVar.U(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iA += j.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        jVar.T(iA);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            jVar.V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i10++;
        }
    }

    public static void N(int i, List list, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!(list instanceof a0)) {
            while (i10 < list.size()) {
                jVar.P(i, (String) list.get(i10));
                i10++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        while (i10 < list.size()) {
            Object objF = a0Var.f(i10);
            if (objF instanceof String) {
                jVar.P(i, (String) objF);
            } else {
                jVar.G(i, (f) objF);
            }
            i10++;
        }
    }

    public static void O(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.S(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int iZ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZ += j.z(((Integer) list.get(i11)).intValue());
        }
        jVar.T(iZ);
        while (i10 < list.size()) {
            jVar.T(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void P(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.U(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA += j.A(((Long) list.get(i11)).longValue());
        }
        jVar.T(iA);
        while (i10 < list.size()) {
            jVar.V(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = j.y(i) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iY += j.s((f) list.get(i10));
        }
        return iY;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i = 0; i < size; i++) {
            iW += j.w(((Integer) list.get(i)).intValue());
        }
        return iW;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.t(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.u(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i = 0; i < size; i++) {
            iW += j.w(((Integer) list.get(i)).intValue());
        }
        return iW;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (j.y(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < size; i++) {
            iA += j.A(((Long) list.get(i)).longValue());
        }
        return iA;
    }

    public static int l(int i, List list, v0 v0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = j.y(i) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int iB = ((a) list.get(i10)).b(v0Var);
            iY += j.z(iB) + iB;
        }
        return iY;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iZ += j.z((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iZ;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iA += j.A((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iA;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = j.y(i) * size;
        if (!(list instanceof a0)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof f) {
                    int size2 = ((f) obj).size();
                    iY = j.z(size2) + size2 + iY;
                } else {
                    iY = j.x((String) obj) + iY;
                }
                i10++;
            }
            return iY;
        }
        a0 a0Var = (a0) list;
        while (i10 < size) {
            Object objF = a0Var.f(i10);
            if (objF instanceof f) {
                int size3 = ((f) objF).size();
                iY = j.z(size3) + size3 + iY;
            } else {
                iY = j.x((String) objF) + iY;
            }
            i10++;
        }
        return iY;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = 0;
        for (int i = 0; i < size; i++) {
            iZ += j.z(((Integer) list.get(i)).intValue());
        }
        return iZ;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < size; i++) {
            iA += j.A(((Long) list.get(i)).longValue());
        }
        return iA;
    }

    public static f1 v(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (f1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(f1 f1Var, Object obj, Object obj2) {
        f1Var.getClass();
        t tVar = (t) obj;
        e1 e1Var = tVar.unknownFields;
        e1 e1Var2 = ((t) obj2).unknownFields;
        if (!e1Var2.equals(e1.f626f)) {
            int i = e1Var.f627a + e1Var2.f627a;
            int[] iArrCopyOf = Arrays.copyOf(e1Var.f628b, i);
            System.arraycopy(e1Var2.f628b, 0, iArrCopyOf, e1Var.f627a, e1Var2.f627a);
            Object[] objArrCopyOf = Arrays.copyOf(e1Var.f629c, i);
            System.arraycopy(e1Var2.f629c, 0, objArrCopyOf, e1Var.f627a, e1Var2.f627a);
            e1Var = new e1(i, iArrCopyOf, objArrCopyOf, true);
        }
        tVar.unknownFields = e1Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, f0 f0Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) f0Var.f636a;
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                jVar.F(i, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        jVar.R(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = j.h;
            i11++;
        }
        jVar.T(i11);
        while (i10 < list.size()) {
            jVar.D(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void z(int i, List list, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        f0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((j) f0Var.f636a).G(i, (f) list.get(i10));
        }
    }
}

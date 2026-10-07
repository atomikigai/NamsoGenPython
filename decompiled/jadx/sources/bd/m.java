package bd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f1618a;

    public m(String[] strArr) {
        this.f1618a = strArr;
    }

    public final String d(String str) {
        jc.i.e(str, "name");
        String[] strArr = this.f1618a;
        int length = strArr.length - 2;
        int iK = jd.l.k(length, 0, -2);
        if (iK > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iK) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Arrays.equals(this.f1618a, ((m) obj).f1618a);
        }
        return false;
    }

    public final String g(int i) {
        return this.f1618a[i * 2];
    }

    public final l h() {
        l lVar = new l(0);
        ArrayList arrayList = lVar.f1617a;
        jc.i.e(arrayList, "<this>");
        String[] strArr = this.f1618a;
        jc.i.e(strArr, "elements");
        arrayList.addAll(vb.h.H(strArr));
        return lVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1618a);
    }

    public final String i(int i) {
        return this.f1618a[(i * 2) + 1];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        ub.f[] fVarArr = new ub.f[size];
        for (int i = 0; i < size; i++) {
            fVarArr[i] = new ub.f(g(i), i(i));
        }
        return jc.t.c(fVarArr);
    }

    public final int size() {
        return this.f1618a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strG = g(i);
            String strI = i(i);
            sb2.append(strG);
            sb2.append(": ");
            if (cd.b.p(strG)) {
                strI = "██";
            }
            sb2.append(strI);
            sb2.append("\n");
        }
        String string = sb2.toString();
        jc.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

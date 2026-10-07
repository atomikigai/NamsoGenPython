package bc;

import java.io.Serializable;
import jc.i;
import vb.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends c implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f1538a;

    public b(Enum[] enumArr) {
        i.e(enumArr, "entries");
        this.f1538a = enumArr;
    }

    @Override // vb.c, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f1538a;
        i.e(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10;
    }

    @Override // vb.c
    public final int d() {
        return this.f1538a.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f1538a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(q1.a.i(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // vb.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f1538a;
        i.e(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // vb.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}

package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f631c = new f(v.f721b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f632d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f633a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f634b;

    static {
        f632d = c.a() ? new e(1) : new e(0);
    }

    public f(byte[] bArr) {
        bArr.getClass();
        this.f634b = bArr;
    }

    public static f d(int i, byte[] bArr, int i10) {
        byte[] bArrCopyOfRange;
        int i11 = i + i10;
        int length = bArr.length;
        if (((i11 - i) | i | i11 | (length - i11)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException(q1.a.j(i, "Beginning index: ", " < 0"));
            }
            if (i11 < i) {
                throw new IndexOutOfBoundsException(q1.a.i(i, i11, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(q1.a.i(i11, length, "End index: ", " >= "));
        }
        switch (f632d.f624a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i10 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i10];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i10);
                break;
        }
        return new f(bArrCopyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || size() != ((f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof f)) {
            return obj.equals(this);
        }
        f fVar = (f) obj;
        int i = this.f633a;
        int i10 = fVar.f633a;
        if (i != 0 && i10 != 0 && i != i10) {
            return false;
        }
        int size = size();
        if (size > fVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > fVar.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + fVar.size());
        }
        byte[] bArr = fVar.f634b;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = fVar.g();
        while (iG2 < iG) {
            if (this.f634b[iG2] != bArr[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    public final int hashCode() {
        int i = this.f633a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iG = g();
        int i10 = size;
        for (int i11 = iG; i11 < iG + size; i11++) {
            i10 = (i10 * 31) + this.f634b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f633a = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.f634b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}

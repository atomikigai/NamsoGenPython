package r;

import da.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f8092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f8093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f8094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f8095d;

    public h() {
        int i;
        int i10 = 4;
        while (true) {
            i = 80;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (80 <= i11) {
                i = i11;
                break;
            }
            i10++;
        }
        int i12 = i / 8;
        this.f8093b = new long[i12];
        this.f8094c = new Object[i12];
    }

    public final void a() {
        int i = this.f8095d;
        Object[] objArr = this.f8094c;
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = null;
        }
        this.f8095d = 0;
        this.f8092a = false;
    }

    public final Object b(long j4) {
        Object obj;
        int iB = s.a.b(this.f8093b, this.f8095d, j4);
        if (iB < 0 || (obj = this.f8094c[iB]) == i.f8096a) {
            return null;
        }
        return obj;
    }

    public final int c(long j4) {
        if (this.f8092a) {
            int i = this.f8095d;
            long[] jArr = this.f8093b;
            Object[] objArr = this.f8094c;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != i.f8096a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f8092a = false;
            this.f8095d = i10;
        }
        return s.a.b(this.f8093b, this.f8095d, j4);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        jc.i.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) objClone;
        hVar.f8093b = (long[]) this.f8093b.clone();
        hVar.f8094c = (Object[]) this.f8094c.clone();
        return hVar;
    }

    public final long d(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f8095d)) {
            throw new IllegalArgumentException(v.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f8092a) {
            long[] jArr = this.f8093b;
            Object[] objArr = this.f8094c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.f8096a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f8092a = false;
            this.f8095d = i11;
        }
        return this.f8093b[i];
    }

    public final void e(long j4, Object obj) {
        Object obj2 = i.f8096a;
        int iB = s.a.b(this.f8093b, this.f8095d, j4);
        if (iB >= 0) {
            this.f8094c[iB] = obj;
            return;
        }
        int i = ~iB;
        int i10 = this.f8095d;
        if (i < i10) {
            Object[] objArr = this.f8094c;
            if (objArr[i] == obj2) {
                this.f8093b[i] = j4;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f8092a) {
            long[] jArr = this.f8093b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f8094c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f8092a = false;
                this.f8095d = i11;
                i = ~s.a.b(this.f8093b, i11, j4);
            }
        }
        int i13 = this.f8095d;
        if (i13 >= this.f8093b.length) {
            int i14 = (i13 + 1) * 8;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f8093b, i17);
            jc.i.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f8093b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8094c, i17);
            jc.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8094c = objArrCopyOf;
        }
        int i18 = this.f8095d - i;
        if (i18 != 0) {
            long[] jArr2 = this.f8093b;
            int i19 = i + 1;
            jc.i.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i19, i18);
            Object[] objArr3 = this.f8094c;
            vb.h.K(objArr3, i19, objArr3, i, this.f8095d);
        }
        this.f8093b[i] = j4;
        this.f8094c[i] = obj;
        this.f8095d++;
    }

    public final void f(long j4) {
        int iB = s.a.b(this.f8093b, this.f8095d, j4);
        if (iB >= 0) {
            Object[] objArr = this.f8094c;
            Object obj = objArr[iB];
            Object obj2 = i.f8096a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f8092a = true;
            }
        }
    }

    public final int g() {
        if (this.f8092a) {
            int i = this.f8095d;
            long[] jArr = this.f8093b;
            Object[] objArr = this.f8094c;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != i.f8096a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f8092a = false;
            this.f8095d = i10;
        }
        return this.f8095d;
    }

    public final Object h(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f8095d)) {
            throw new IllegalArgumentException(v.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f8092a) {
            long[] jArr = this.f8093b;
            Object[] objArr = this.f8094c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.f8096a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f8092a = false;
            this.f8095d = i11;
        }
        return this.f8094c[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8095d * 28);
        sb2.append('{');
        int i = this.f8095d;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i10));
            sb2.append('=');
            Object objH = h(i10);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        jc.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}

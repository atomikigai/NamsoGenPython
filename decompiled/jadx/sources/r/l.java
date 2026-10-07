package r;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f8101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f8102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f8103c;

    public l() {
        int i;
        int i10 = 4;
        while (true) {
            i = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i = i11;
                break;
            }
            i10++;
        }
        int i12 = i / 4;
        this.f8101a = new int[i12];
        this.f8102b = new Object[i12];
    }

    public final void a(int i, Object obj) {
        int i10 = this.f8103c;
        if (i10 != 0 && i <= this.f8101a[i10 - 1]) {
            c(i, obj);
            return;
        }
        if (i10 >= this.f8101a.length) {
            int i11 = (i10 + 1) * 4;
            for (int i12 = 4; i12 < 32; i12++) {
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
            }
            int i14 = i11 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f8101a, i14);
            jc.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8101a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8102b, i14);
            jc.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8102b = objArrCopyOf;
        }
        this.f8101a[i10] = i;
        this.f8102b[i10] = obj;
        this.f8103c = i10 + 1;
    }

    public final Object b(int i) {
        Object obj;
        int iA = s.a.a(this.f8101a, this.f8103c, i);
        if (iA < 0 || (obj = this.f8102b[iA]) == i.f8097b) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int iA = s.a.a(this.f8101a, this.f8103c, i);
        if (iA >= 0) {
            this.f8102b[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f8103c;
        if (i10 < i11) {
            Object[] objArr = this.f8102b;
            if (objArr[i10] == i.f8097b) {
                this.f8101a[i10] = i;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f8101a.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f8101a, i15);
            jc.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8101a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8102b, i15);
            jc.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8102b = objArrCopyOf;
        }
        int i16 = this.f8103c;
        if (i16 - i10 != 0) {
            int[] iArr = this.f8101a;
            int i17 = i10 + 1;
            vb.h.I(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f8102b;
            vb.h.K(objArr2, i17, objArr2, i10, this.f8103c);
        }
        this.f8101a[i10] = i;
        this.f8102b[i10] = obj;
        this.f8103c++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        jc.i.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) objClone;
        lVar.f8101a = (int[]) this.f8101a.clone();
        lVar.f8102b = (Object[]) this.f8102b.clone();
        return lVar;
    }

    public final String toString() {
        int i = this.f8103c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i * 28);
        sb2.append('{');
        int i10 = this.f8103c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f8101a[i11]);
            sb2.append('=');
            Object obj = this.f8102b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        jc.i.d(string, "buffer.toString()");
        return string;
    }
}

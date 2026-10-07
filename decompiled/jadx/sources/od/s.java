package od;

import fa.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends i {
    public final transient byte[][] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int[] f7765f;

    public s(byte[][] bArr, int[] iArr) {
        super(i.f7735d.f7736a);
        this.e = bArr;
        this.f7765f = iArr;
    }

    @Override // od.i
    public final int a() {
        return this.f7765f[this.e.length - 1];
    }

    @Override // od.i
    public final String b() {
        return new i(j()).b();
    }

    @Override // od.i
    public final byte[] c() {
        return j();
    }

    @Override // od.i
    public final byte d(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f7765f;
        c1.k(iArr[length], i, 1L);
        int iB = pd.b.b(this, i);
        return bArr[iB][(i - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // od.i
    public final boolean e(int i, byte[] bArr, int i10, int i11) {
        jc.i.e(bArr, "other");
        if (i < 0 || i > a() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i;
        int iB = pd.b.b(this, i);
        while (i < i12) {
            int[] iArr = this.f7765f;
            int i13 = iB == 0 ? 0 : iArr[iB - 1];
            int i14 = iArr[iB] - i13;
            byte[][] bArr2 = this.e;
            int i15 = iArr[bArr2.length + iB];
            int iMin = Math.min(i12, i14 + i13) - i;
            if (!c1.e(bArr2[iB], (i - i13) + i15, bArr, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i += iMin;
            iB++;
        }
        return true;
    }

    @Override // od.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.a() == a() && f(iVar, a());
    }

    @Override // od.i
    public final boolean f(i iVar, int i) {
        jc.i.e(iVar, "other");
        if (a() - i >= 0) {
            int iB = pd.b.b(this, 0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < i) {
                int[] iArr = this.f7765f;
                int i12 = iB == 0 ? 0 : iArr[iB - 1];
                int i13 = iArr[iB] - i12;
                byte[][] bArr = this.e;
                int i14 = iArr[bArr.length + iB];
                int iMin = Math.min(i, i13 + i12) - i10;
                if (iVar.e(i11, bArr[iB], (i10 - i12) + i14, iMin)) {
                    i11 += iMin;
                    i10 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // od.i
    public final i g() {
        return new i(j()).g();
    }

    @Override // od.i
    public final int hashCode() {
        int i = this.f7737b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f7765f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f7737b = i11;
        return i11;
    }

    @Override // od.i
    public final void i(f fVar, int i) {
        int iB = pd.b.b(this, 0);
        int i10 = 0;
        while (i10 < i) {
            int[] iArr = this.f7765f;
            int i11 = iB == 0 ? 0 : iArr[iB - 1];
            int i12 = iArr[iB] - i11;
            byte[][] bArr = this.e;
            int i13 = iArr[bArr.length + iB];
            int iMin = Math.min(i, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            q qVar = new q(bArr[iB], i14, i14 + iMin, true);
            q qVar2 = fVar.f7733a;
            if (qVar2 == null) {
                qVar.f7761g = qVar;
                qVar.f7760f = qVar;
                fVar.f7733a = qVar;
            } else {
                q qVar3 = qVar2.f7761g;
                jc.i.b(qVar3);
                qVar3.b(qVar);
            }
            i10 += iMin;
            iB++;
        }
        fVar.f7734b += (long) i;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (i < length) {
            int[] iArr = this.f7765f;
            int i12 = iArr[length + i];
            int i13 = iArr[i];
            int i14 = i13 - i10;
            vb.h.J(bArr2[i], i11, bArr, i12, i12 + i14);
            i11 += i14;
            i++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // od.i
    public final String toString() {
        return new i(j()).toString();
    }
}

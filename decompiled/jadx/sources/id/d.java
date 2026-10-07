package id;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.f f5272a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5274c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5277g;
    public int h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5273b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5275d = 4096;
    public b[] e = new b[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5276f = 7;

    public d(od.f fVar) {
        this.f5272a = fVar;
    }

    public final void a(int i) {
        int i10;
        if (i > 0) {
            int length = this.e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f5276f;
                if (length < i10 || i <= 0) {
                    break;
                }
                b bVar = this.e[length];
                jc.i.b(bVar);
                i -= bVar.f5264c;
                int i12 = this.h;
                b bVar2 = this.e[length];
                jc.i.b(bVar2);
                this.h = i12 - bVar2.f5264c;
                this.f5277g--;
                i11++;
                length--;
            }
            b[] bVarArr = this.e;
            int i13 = i10 + 1;
            System.arraycopy(bVarArr, i13, bVarArr, i13 + i11, this.f5277g);
            b[] bVarArr2 = this.e;
            int i14 = this.f5276f + 1;
            Arrays.fill(bVarArr2, i14, i14 + i11, (Object) null);
            this.f5276f += i11;
        }
    }

    public final void b(b bVar) {
        int i = bVar.f5264c;
        int i10 = this.f5275d;
        if (i > i10) {
            b[] bVarArr = this.e;
            vb.h.N(bVarArr, 0, bVarArr.length);
            this.f5276f = this.e.length - 1;
            this.f5277g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i10);
        int i11 = this.f5277g + 1;
        b[] bVarArr2 = this.e;
        if (i11 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f5276f = this.e.length - 1;
            this.e = bVarArr3;
        }
        int i12 = this.f5276f;
        this.f5276f = i12 - 1;
        this.e[i12] = bVar;
        this.f5277g++;
        this.h += i;
    }

    public final void c(od.i iVar) throws EOFException {
        jc.i.e(iVar, "data");
        int[] iArr = y.f5352a;
        int iA = iVar.a();
        long j4 = 0;
        long j10 = 0;
        for (int i = 0; i < iA; i++) {
            byte bD = iVar.d(i);
            byte[] bArr = cd.b.f1822a;
            j10 += (long) y.f5353b[bD & 255];
        }
        int i10 = (int) ((j10 + ((long) 7)) >> 3);
        int iA2 = iVar.a();
        od.f fVar = this.f5272a;
        if (i10 >= iA2) {
            e(iVar.a(), 127, 0);
            fVar.T(iVar);
            return;
        }
        od.f fVar2 = new od.f();
        int[] iArr2 = y.f5352a;
        int iA3 = iVar.a();
        int i11 = 0;
        for (int i12 = 0; i12 < iA3; i12++) {
            byte bD2 = iVar.d(i12);
            byte[] bArr2 = cd.b.f1822a;
            int i13 = bD2 & 255;
            int i14 = y.f5352a[i13];
            byte b10 = y.f5353b[i13];
            j4 = (j4 << b10) | ((long) i14);
            i11 += b10;
            while (i11 >= 8) {
                i11 -= 8;
                fVar2.V((int) (j4 >> i11));
            }
        }
        if (i11 > 0) {
            fVar2.V((int) ((j4 << (8 - i11)) | (255 >>> i11)));
        }
        od.i iVarH = fVar2.h(fVar2.f7734b);
        e(iVarH.a(), 127, 128);
        fVar.T(iVarH);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f5274c) {
            int i = this.f5273b;
            if (i < this.f5275d) {
                e(i, 31, 32);
            }
            this.f5274c = false;
            this.f5273b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            e(this.f5275d, 31, 32);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            od.i iVarG = bVar.f5262a.g();
            od.i iVar = bVar.f5263b;
            Integer num = (Integer) e.f5279b.get(iVarG);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    b[] bVarArr = e.f5278a;
                    if (jc.i.a(bVarArr[iIntValue].f5263b, iVar)) {
                        length = length2;
                    } else if (jc.i.a(bVarArr[length2].f5263b, iVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i11 = this.f5276f + 1; i11 < length3; i11++) {
                    b bVar2 = this.e[i11];
                    jc.i.b(bVar2);
                    if (jc.i.a(bVar2.f5262a, iVarG)) {
                        b bVar3 = this.e[i11];
                        jc.i.b(bVar3);
                        if (jc.i.a(bVar3.f5263b, iVar)) {
                            length2 = e.f5278a.length + (i11 - this.f5276f);
                            break;
                        } else if (length == -1) {
                            length = (i11 - this.f5276f) + e.f5278a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.f5272a.V(64);
                c(iVarG);
                c(iVar);
                b(bVar);
            } else {
                od.i iVar2 = b.f5259d;
                iVarG.getClass();
                jc.i.e(iVar2, "prefix");
                if (!iVarG.f(iVar2, iVar2.a()) || jc.i.a(b.i, iVarG)) {
                    e(length, 63, 64);
                    c(iVar);
                    b(bVar);
                } else {
                    e(length, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i10, int i11) {
        od.f fVar = this.f5272a;
        if (i < i10) {
            fVar.V(i | i11);
            return;
        }
        fVar.V(i11 | i10);
        int i12 = i - i10;
        while (i12 >= 128) {
            fVar.V(128 | (i12 & 127));
            i12 >>>= 7;
        }
        fVar.V(i12);
    }
}

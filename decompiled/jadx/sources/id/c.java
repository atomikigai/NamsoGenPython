package id;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od.p f5268c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5271g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5266a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5267b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b[] f5269d = new b[8];
    public int e = 7;

    public c(r rVar) {
        this.f5268c = new od.p(rVar);
    }

    public final int a(int i) {
        int i10;
        int i11 = 0;
        if (i > 0) {
            int length = this.f5269d.length;
            while (true) {
                length--;
                i10 = this.e;
                if (length < i10 || i <= 0) {
                    break;
                }
                b bVar = this.f5269d[length];
                jc.i.b(bVar);
                int i12 = bVar.f5264c;
                i -= i12;
                this.f5271g -= i12;
                this.f5270f--;
                i11++;
            }
            b[] bVarArr = this.f5269d;
            System.arraycopy(bVarArr, i10 + 1, bVarArr, i10 + 1 + i11, this.f5270f);
            this.e += i11;
        }
        return i11;
    }

    public final od.i b(int i) throws IOException {
        if (i >= 0) {
            b[] bVarArr = e.f5278a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f5262a;
            }
        }
        int length = this.e + 1 + (i - e.f5278a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f5269d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                jc.i.b(bVar);
                return bVar.f5262a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(b bVar) {
        this.f5267b.add(bVar);
        int i = bVar.f5264c;
        int i10 = this.f5266a;
        if (i > i10) {
            b[] bVarArr = this.f5269d;
            vb.h.N(bVarArr, 0, bVarArr.length);
            this.e = this.f5269d.length - 1;
            this.f5270f = 0;
            this.f5271g = 0;
            return;
        }
        a((this.f5271g + i) - i10);
        int i11 = this.f5270f + 1;
        b[] bVarArr2 = this.f5269d;
        if (i11 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.e = this.f5269d.length - 1;
            this.f5269d = bVarArr3;
        }
        int i12 = this.e;
        this.e = i12 - 1;
        this.f5269d[i12] = bVar;
        this.f5270f++;
        this.f5271g += i;
    }

    public final od.i d() {
        od.p pVar = this.f5268c;
        byte b10 = pVar.readByte();
        byte[] bArr = cd.b.f1822a;
        int i = b10 & 255;
        int i10 = 0;
        boolean z4 = (b10 & 128) == 128;
        long jE = e(i, 127);
        if (!z4) {
            return pVar.h(jE);
        }
        od.f fVar = new od.f();
        int[] iArr = y.f5352a;
        jc.i.e(pVar, "source");
        f7.l lVar = y.f5354c;
        f7.l lVar2 = lVar;
        int i11 = 0;
        for (long j4 = 0; j4 < jE; j4++) {
            byte b11 = pVar.readByte();
            byte[] bArr2 = cd.b.f1822a;
            i10 = (i10 << 8) | (b11 & 255);
            i11 += 8;
            while (i11 >= 8) {
                f7.l[] lVarArr = (f7.l[]) lVar2.f3644c;
                jc.i.b(lVarArr);
                lVar2 = lVarArr[(i10 >>> (i11 - 8)) & 255];
                jc.i.b(lVar2);
                if (((f7.l[]) lVar2.f3644c) == null) {
                    fVar.V(lVar2.f3642a);
                    i11 -= lVar2.f3643b;
                    lVar2 = lVar;
                } else {
                    i11 -= 8;
                }
            }
        }
        while (i11 > 0) {
            f7.l[] lVarArr2 = (f7.l[]) lVar2.f3644c;
            jc.i.b(lVarArr2);
            f7.l lVar3 = lVarArr2[(i10 << (8 - i11)) & 255];
            jc.i.b(lVar3);
            int i12 = lVar3.f3643b;
            if (((f7.l[]) lVar3.f3644c) != null || i12 > i11) {
                break;
            }
            fVar.V(lVar3.f3642a);
            i11 -= i12;
            lVar2 = lVar;
        }
        return fVar.h(fVar.f7734b);
    }

    public final int e(int i, int i10) {
        int i11 = i & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte b10 = this.f5268c.readByte();
            byte[] bArr = cd.b.f1822a;
            int i13 = b10 & 255;
            if ((b10 & 128) == 0) {
                return i10 + (i13 << i12);
            }
            i10 += (b10 & 127) << i12;
            i12 += 7;
        }
    }
}

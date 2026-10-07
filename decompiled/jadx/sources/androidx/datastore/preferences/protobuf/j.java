package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m0 {
    public static final Logger h = Logger.getLogger(j.class.getName());
    public static final boolean i = n1.f689f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0 f657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f658d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0.l f660g;

    public j(z0.l lVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f658d = new byte[iMax];
        this.e = iMax;
        this.f660g = lVar;
    }

    public static int A(long j4) {
        int i10;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j4) != 0) {
            i10 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int r(int i10, f fVar) {
        return s(fVar) + y(i10);
    }

    public static int s(f fVar) {
        int size = fVar.size();
        return z(size) + size;
    }

    public static int t(int i10) {
        return y(i10) + 4;
    }

    public static int u(int i10) {
        return y(i10) + 8;
    }

    public static int v(int i10, a aVar, v0 v0Var) {
        return aVar.b(v0Var) + (y(i10) * 2);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return z(i10);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = q1.b(str);
        } catch (p1 unused) {
            length = str.getBytes(v.f720a).length;
        }
        return z(length) + length;
    }

    public static int y(int i10) {
        return z(i10 << 3);
    }

    public static int z(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void B() throws IOException {
        this.f660g.write(this.f658d, 0, this.f659f);
        this.f659f = 0;
    }

    public final void C(int i10) throws IOException {
        if (this.e - this.f659f < i10) {
            B();
        }
    }

    public final void D(byte b10) throws IOException {
        if (this.f659f == this.e) {
            B();
        }
        int i10 = this.f659f;
        this.f659f = i10 + 1;
        this.f658d[i10] = b10;
    }

    public final void E(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f659f;
        int i13 = this.e;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f658d;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f659f += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f659f = i13;
        B();
        if (i16 > i13) {
            this.f660g.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f659f = i16;
        }
    }

    public final void F(int i10, boolean z4) throws IOException {
        C(11);
        o(i10, 0);
        byte b10 = z4 ? (byte) 1 : (byte) 0;
        int i11 = this.f659f;
        this.f659f = i11 + 1;
        this.f658d[i11] = b10;
    }

    public final void G(int i10, f fVar) throws IOException {
        R(i10, 2);
        H(fVar);
    }

    public final void H(f fVar) throws IOException {
        T(fVar.size());
        l(fVar.g(), fVar.f634b, fVar.size());
    }

    public final void I(int i10, int i11) {
        C(14);
        o(i10, 5);
        m(i11);
    }

    public final void J(int i10) throws IOException {
        C(4);
        m(i10);
    }

    public final void K(int i10, long j4) {
        C(18);
        o(i10, 1);
        n(j4);
    }

    public final void L(long j4) throws IOException {
        C(8);
        n(j4);
    }

    public final void M(int i10, int i11) throws IOException {
        C(20);
        o(i10, 0);
        if (i11 >= 0) {
            p(i11);
        } else {
            q(i11);
        }
    }

    public final void N(int i10) throws IOException {
        if (i10 >= 0) {
            T(i10);
        } else {
            V(i10);
        }
    }

    public final void O(int i10, a aVar, v0 v0Var) throws IOException {
        R(i10, 2);
        T(aVar.b(v0Var));
        v0Var.a(aVar, this.f657c);
    }

    public final void P(int i10, String str) throws IOException {
        R(i10, 2);
        Q(str);
    }

    public final void Q(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iZ = z(length);
            int i10 = iZ + length;
            int i11 = this.e;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iF = q1.f706a.f(str, bArr, 0, length);
                T(iF);
                E(bArr, 0, iF);
                return;
            }
            if (i10 > i11 - this.f659f) {
                B();
            }
            int iZ2 = z(str.length());
            int i12 = this.f659f;
            byte[] bArr2 = this.f658d;
            try {
                if (iZ2 == iZ) {
                    int i13 = i12 + iZ2;
                    this.f659f = i13;
                    int iF2 = q1.f706a.f(str, bArr2, i13, i11 - i13);
                    this.f659f = i12;
                    p((iF2 - i12) - iZ2);
                    this.f659f = iF2;
                } else {
                    int iB = q1.b(str);
                    p(iB);
                    this.f659f = q1.f706a.f(str, bArr2, this.f659f, iB);
                }
            } catch (p1 e) {
                this.f659f = i12;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new i(e4);
            }
        } catch (p1 e10) {
            h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(v.f720a);
            try {
                T(bytes.length);
                l(0, bytes, bytes.length);
            } catch (i e11) {
                throw e11;
            } catch (IndexOutOfBoundsException e12) {
                throw new i(e12);
            }
        }
    }

    public final void R(int i10, int i11) {
        T((i10 << 3) | i11);
    }

    public final void S(int i10, int i11) throws IOException {
        C(20);
        o(i10, 0);
        p(i11);
    }

    public final void T(int i10) throws IOException {
        C(5);
        p(i10);
    }

    public final void U(int i10, long j4) {
        C(20);
        o(i10, 0);
        q(j4);
    }

    public final void V(long j4) throws IOException {
        C(10);
        q(j4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void l(int i10, byte[] bArr, int i11) throws IOException {
        E(bArr, i10, i11);
    }

    public final void m(int i10) {
        int i11 = this.f659f;
        int i12 = i11 + 1;
        this.f659f = i12;
        byte[] bArr = this.f658d;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f659f = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f659f = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f659f = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void n(long j4) {
        int i10 = this.f659f;
        int i11 = i10 + 1;
        this.f659f = i11;
        byte[] bArr = this.f658d;
        bArr[i10] = (byte) (j4 & 255);
        int i12 = i10 + 2;
        this.f659f = i12;
        bArr[i11] = (byte) ((j4 >> 8) & 255);
        int i13 = i10 + 3;
        this.f659f = i13;
        bArr[i12] = (byte) ((j4 >> 16) & 255);
        int i14 = i10 + 4;
        this.f659f = i14;
        bArr[i13] = (byte) (255 & (j4 >> 24));
        int i15 = i10 + 5;
        this.f659f = i15;
        bArr[i14] = (byte) (((int) (j4 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f659f = i16;
        bArr[i15] = (byte) (((int) (j4 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f659f = i17;
        bArr[i16] = (byte) (((int) (j4 >> 48)) & 255);
        this.f659f = i10 + 8;
        bArr[i17] = (byte) (((int) (j4 >> 56)) & 255);
    }

    public final void o(int i10, int i11) {
        p((i10 << 3) | i11);
    }

    public final void p(int i10) {
        boolean z4 = i;
        byte[] bArr = this.f658d;
        if (z4) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f659f;
                this.f659f = i11 + 1;
                n1.j(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f659f;
            this.f659f = i12 + 1;
            n1.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f659f;
            this.f659f = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f659f;
        this.f659f = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void q(long j4) {
        boolean z4 = i;
        byte[] bArr = this.f658d;
        if (z4) {
            while ((j4 & (-128)) != 0) {
                int i10 = this.f659f;
                this.f659f = i10 + 1;
                n1.j(bArr, i10, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            int i11 = this.f659f;
            this.f659f = i11 + 1;
            n1.j(bArr, i11, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            int i12 = this.f659f;
            this.f659f = i12 + 1;
            bArr[i12] = (byte) ((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        int i13 = this.f659f;
        this.f659f = i13 + 1;
        bArr[i13] = (byte) j4;
    }
}

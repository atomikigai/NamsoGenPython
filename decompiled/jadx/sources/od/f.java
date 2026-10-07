package od;

import fa.c1;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f7733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7734b;

    @Override // od.h
    public final String A(Charset charset) {
        return E(this.f7734b, charset);
    }

    public final byte[] B(long j4) throws EOFException {
        int iMin;
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(da.v.g("byteCount: ", j4).toString());
        }
        if (this.f7734b < j4) {
            throw new EOFException();
        }
        int i = (int) j4;
        byte[] bArr = new byte[i];
        int i10 = 0;
        while (i10 < i) {
            int i11 = i - i10;
            c1.k(i, i10, i11);
            q qVar = this.f7733a;
            if (qVar == null) {
                iMin = -1;
            } else {
                iMin = Math.min(i11, qVar.f7758c - qVar.f7757b);
                byte[] bArr2 = qVar.f7756a;
                int i12 = qVar.f7757b;
                vb.h.J(bArr2, i10, bArr, i12, i12 + iMin);
                int i13 = qVar.f7757b + iMin;
                qVar.f7757b = i13;
                this.f7734b -= (long) iMin;
                if (i13 == qVar.f7758c) {
                    this.f7733a = qVar.a();
                    r.a(qVar);
                }
            }
            if (iMin == -1) {
                throw new EOFException();
            }
            i10 += iMin;
        }
        return bArr;
    }

    @Override // od.g
    public final /* bridge */ /* synthetic */ g D(long j4) {
        W(j4);
        return this;
    }

    public final String E(long j4, Charset charset) throws EOFException {
        jc.i.e(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(da.v.g("byteCount: ", j4).toString());
        }
        if (this.f7734b < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        q qVar = this.f7733a;
        jc.i.b(qVar);
        int i = qVar.f7757b;
        if (((long) i) + j4 > qVar.f7758c) {
            return new String(B(j4), charset);
        }
        int i10 = (int) j4;
        String str = new String(qVar.f7756a, i, i10, charset);
        int i11 = qVar.f7757b + i10;
        qVar.f7757b = i11;
        this.f7734b -= j4;
        if (i11 == qVar.f7758c) {
            this.f7733a = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final i G(int i) {
        if (i == 0) {
            return i.f7735d;
        }
        c1.k(this.f7734b, 0L, i);
        q qVar = this.f7733a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            jc.i.b(qVar);
            int i13 = qVar.f7758c;
            int i14 = qVar.f7757b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            qVar = qVar.f7760f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        q qVar2 = this.f7733a;
        int i15 = 0;
        while (i10 < i) {
            jc.i.b(qVar2);
            bArr[i15] = qVar2.f7756a;
            i10 += qVar2.f7758c - qVar2.f7757b;
            iArr[i15] = Math.min(i10, i);
            iArr[i15 + i12] = qVar2.f7757b;
            qVar2.f7759d = true;
            i15++;
            qVar2 = qVar2.f7760f;
        }
        return new s(bArr, iArr);
    }

    public final q H(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f7733a;
        if (qVar == null) {
            q qVarB = r.b();
            this.f7733a = qVarB;
            qVarB.f7761g = qVarB;
            qVarB.f7760f = qVarB;
            return qVarB;
        }
        q qVar2 = qVar.f7761g;
        jc.i.b(qVar2);
        if (qVar2.f7758c + i <= 8192 && qVar2.e) {
            return qVar2;
        }
        q qVarB2 = r.b();
        qVar2.b(qVarB2);
        return qVarB2;
    }

    @Override // od.h
    public final String K() {
        return r(Long.MAX_VALUE);
    }

    @Override // od.h
    public final int L(n nVar) throws EOFException {
        jc.i.e(nVar, "options");
        int iB = pd.a.b(this, nVar, false);
        if (iB == -1) {
            return -1;
        }
        skip(nVar.f7748a[iB].a());
        return iB;
    }

    @Override // od.h
    public final void P(long j4) throws EOFException {
        if (this.f7734b < j4) {
            throw new EOFException();
        }
    }

    @Override // od.h
    public final long Q() throws EOFException {
        int i;
        if (this.f7734b == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z4 = false;
        long j4 = 0;
        do {
            q qVar = this.f7733a;
            jc.i.b(qVar);
            byte[] bArr = qVar.f7756a;
            int i11 = qVar.f7757b;
            int i12 = qVar.f7758c;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    i = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        z4 = true;
                        if (i10 != 0) {
                            break;
                        }
                        char[] cArr = pd.b.f7867a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]})));
                    }
                    i = b10 - 55;
                }
                if (((-1152921504606846976L) & j4) != 0) {
                    f fVar = new f();
                    fVar.W(j4);
                    fVar.V(b10);
                    throw new NumberFormatException("Number too large: ".concat(fVar.E(fVar.f7734b, pc.a.f7846a)));
                }
                j4 = (j4 << 4) | ((long) i);
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f7733a = qVar.a();
                r.a(qVar);
            } else {
                qVar.f7757b = i11;
            }
            if (z4) {
                break;
            }
        } while (this.f7733a != null);
        this.f7734b -= (long) i10;
        return j4;
    }

    public final void S(int i, byte[] bArr) {
        jc.i.e(bArr, "source");
        int i10 = 0;
        long j4 = i;
        c1.k(bArr.length, 0, j4);
        while (i10 < i) {
            q qVarH = H(1);
            int iMin = Math.min(i - i10, 8192 - qVarH.f7758c);
            int i11 = i10 + iMin;
            vb.h.J(bArr, qVarH.f7758c, qVarH.f7756a, i10, i11);
            qVarH.f7758c += iMin;
            i10 = i11;
        }
        this.f7734b += j4;
    }

    public final void T(i iVar) {
        jc.i.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void U(v vVar) {
        jc.i.e(vVar, "source");
        while (vVar.t(8192L, this) != -1) {
        }
    }

    public final void V(int i) {
        q qVarH = H(1);
        byte[] bArr = qVarH.f7756a;
        int i10 = qVarH.f7758c;
        qVarH.f7758c = i10 + 1;
        bArr[i10] = (byte) i;
        this.f7734b++;
    }

    public final void W(long j4) {
        if (j4 == 0) {
            V(48);
            return;
        }
        long j10 = (j4 >>> 1) | j4;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        q qVarH = H(i);
        byte[] bArr = qVarH.f7756a;
        int i10 = qVarH.f7758c;
        for (int i11 = (i10 + i) - 1; i11 >= i10; i11--) {
            bArr[i11] = pd.a.f7866a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        qVarH.f7758c += i;
        this.f7734b += (long) i;
    }

    public final void X(int i) {
        q qVarH = H(4);
        byte[] bArr = qVarH.f7756a;
        int i10 = qVarH.f7758c;
        bArr[i10] = (byte) ((i >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i & 255);
        qVarH.f7758c = i10 + 4;
        this.f7734b += 4;
    }

    public final void Y(int i) {
        q qVarH = H(2);
        byte[] bArr = qVarH.f7756a;
        int i10 = qVarH.f7758c;
        bArr[i10] = (byte) ((i >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i & 255);
        qVarH.f7758c = i10 + 2;
        this.f7734b += 2;
    }

    public final void Z(int i, int i10, String str) {
        char cCharAt;
        jc.i.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(da.v.f(i, "beginIndex < 0: ").toString());
        }
        if (i10 < i) {
            throw new IllegalArgumentException(q1.a.i(i10, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i10 + " > " + str.length()).toString());
        }
        while (i < i10) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                q qVarH = H(1);
                byte[] bArr = qVarH.f7756a;
                int i11 = qVarH.f7758c - i;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i + 1;
                bArr[i + i11] = (byte) cCharAt2;
                while (true) {
                    i = i12;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i12 = i + 1;
                    bArr[i + i11] = (byte) cCharAt;
                }
                int i13 = qVarH.f7758c;
                int i14 = (i11 + i) - i13;
                qVarH.f7758c = i13 + i14;
                this.f7734b += (long) i14;
            } else {
                if (cCharAt2 < 2048) {
                    q qVarH2 = H(2);
                    byte[] bArr2 = qVarH2.f7756a;
                    int i15 = qVarH2.f7758c;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    qVarH2.f7758c = i15 + 2;
                    this.f7734b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    q qVarH3 = H(3);
                    byte[] bArr3 = qVarH3.f7756a;
                    int i16 = qVarH3.f7758c;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    qVarH3.f7758c = i16 + 3;
                    this.f7734b += 3;
                } else {
                    int i17 = i + 1;
                    char cCharAt3 = i17 < i10 ? str.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        V(63);
                        i = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        q qVarH4 = H(4);
                        byte[] bArr4 = qVarH4.f7756a;
                        int i19 = qVarH4.f7758c;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        qVarH4.f7758c = i19 + 4;
                        this.f7734b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // od.v
    public final x a() {
        return x.f7767d;
    }

    public final void a0(String str) {
        jc.i.e(str, "string");
        Z(0, str.length(), str);
    }

    public final void b0(int i) {
        String str;
        if (i < 128) {
            V(i);
            return;
        }
        if (i < 2048) {
            q qVarH = H(2);
            byte[] bArr = qVarH.f7756a;
            int i10 = qVarH.f7758c;
            bArr[i10] = (byte) ((i >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i & 63) | 128);
            qVarH.f7758c = i10 + 2;
            this.f7734b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            V(63);
            return;
        }
        if (i < 65536) {
            q qVarH2 = H(3);
            byte[] bArr2 = qVarH2.f7756a;
            int i11 = qVarH2.f7758c;
            bArr2[i11] = (byte) ((i >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i & 63) | 128);
            qVarH2.f7758c = i11 + 3;
            this.f7734b += 3;
            return;
        }
        if (i <= 1114111) {
            q qVarH3 = H(4);
            byte[] bArr3 = qVarH3.f7756a;
            int i12 = qVarH3.f7758c;
            bArr3[i12] = (byte) ((i >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i12 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i12 + 3] = (byte) ((i & 63) | 128);
            qVarH3.f7758c = i12 + 4;
            this.f7734b += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = pd.b.f7867a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i13 = 0;
            while (i13 < 8 && cArr2[i13] == '0') {
                i13++;
            }
            if (i13 < 0) {
                throw new IndexOutOfBoundsException(q1.a.j(i13, "startIndex: ", ", endIndex: 8, size: 8"));
            }
            if (i13 > 8) {
                throw new IllegalArgumentException(q1.a.j(i13, "startIndex: ", " > endIndex: 8"));
            }
            str = new String(cArr2, i13, 8 - i13);
        } else {
            str = "0";
        }
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void c(f fVar, long j4, long j10) {
        jc.i.e(fVar, "out");
        long j11 = j4;
        c1.k(this.f7734b, j11, j10);
        if (j10 == 0) {
            return;
        }
        fVar.f7734b += j10;
        q qVar = this.f7733a;
        while (true) {
            jc.i.b(qVar);
            long j12 = qVar.f7758c - qVar.f7757b;
            if (j11 < j12) {
                break;
            }
            j11 -= j12;
            qVar = qVar.f7760f;
        }
        q qVar2 = qVar;
        long j13 = j10;
        while (j13 > 0) {
            jc.i.b(qVar2);
            q qVarC = qVar2.c();
            int i = qVarC.f7757b + ((int) j11);
            qVarC.f7757b = i;
            qVarC.f7758c = Math.min(i + ((int) j13), qVarC.f7758c);
            q qVar3 = fVar.f7733a;
            if (qVar3 == null) {
                qVarC.f7761g = qVarC;
                qVarC.f7760f = qVarC;
                fVar.f7733a = qVarC;
            } else {
                q qVar4 = qVar3.f7761g;
                jc.i.b(qVar4);
                qVar4.b(qVarC);
            }
            j13 -= (long) (qVarC.f7758c - qVarC.f7757b);
            qVar2 = qVar2.f7760f;
            j11 = 0;
        }
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f7734b == 0) {
            return fVar;
        }
        q qVar = this.f7733a;
        jc.i.b(qVar);
        q qVarC = qVar.c();
        fVar.f7733a = qVarC;
        qVarC.f7761g = qVarC;
        qVarC.f7760f = qVarC;
        for (q qVar2 = qVar.f7760f; qVar2 != qVar; qVar2 = qVar2.f7760f) {
            q qVar3 = qVarC.f7761g;
            jc.i.b(qVar3);
            jc.i.b(qVar2);
            qVar3.b(qVar2.c());
        }
        fVar.f7734b = this.f7734b;
        return fVar;
    }

    public final boolean d() {
        return this.f7734b == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j4 = this.f7734b;
        f fVar = (f) obj;
        if (j4 != fVar.f7734b) {
            return false;
        }
        if (j4 == 0) {
            return true;
        }
        q qVar = this.f7733a;
        jc.i.b(qVar);
        q qVar2 = fVar.f7733a;
        jc.i.b(qVar2);
        int i = qVar.f7757b;
        int i10 = qVar2.f7757b;
        long j10 = 0;
        while (j10 < this.f7734b) {
            long jMin = Math.min(qVar.f7758c - i, qVar2.f7758c - i10);
            long j11 = 0;
            while (j11 < jMin) {
                int i11 = i + 1;
                int i12 = i10 + 1;
                if (qVar.f7756a[i] != qVar2.f7756a[i10]) {
                    return false;
                }
                j11++;
                i = i11;
                i10 = i12;
            }
            if (i == qVar.f7758c) {
                qVar = qVar.f7760f;
                jc.i.b(qVar);
                i = qVar.f7757b;
            }
            if (i10 == qVar2.f7758c) {
                qVar2 = qVar2.f7760f;
                jc.i.b(qVar2);
                i10 = qVar2.f7757b;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // od.t
    public final void f(long j4, f fVar) {
        q qVarB;
        jc.i.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        c1.k(fVar.f7734b, 0L, j4);
        while (j4 > 0) {
            q qVar = fVar.f7733a;
            jc.i.b(qVar);
            int i = qVar.f7758c;
            q qVar2 = fVar.f7733a;
            jc.i.b(qVar2);
            long j10 = i - qVar2.f7757b;
            int i10 = 0;
            if (j4 < j10) {
                q qVar3 = this.f7733a;
                q qVar4 = qVar3 != null ? qVar3.f7761g : null;
                if (qVar4 != null && qVar4.e) {
                    if ((((long) qVar4.f7758c) + j4) - ((long) (qVar4.f7759d ? 0 : qVar4.f7757b)) <= 8192) {
                        q qVar5 = fVar.f7733a;
                        jc.i.b(qVar5);
                        qVar5.d(qVar4, (int) j4);
                        fVar.f7734b -= j4;
                        this.f7734b += j4;
                        return;
                    }
                }
                q qVar6 = fVar.f7733a;
                jc.i.b(qVar6);
                int i11 = (int) j4;
                if (i11 <= 0 || i11 > qVar6.f7758c - qVar6.f7757b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i11 >= 1024) {
                    qVarB = qVar6.c();
                } else {
                    qVarB = r.b();
                    byte[] bArr = qVar6.f7756a;
                    byte[] bArr2 = qVarB.f7756a;
                    int i12 = qVar6.f7757b;
                    vb.h.J(bArr, 0, bArr2, i12, i12 + i11);
                }
                qVarB.f7758c = qVarB.f7757b + i11;
                qVar6.f7757b += i11;
                q qVar7 = qVar6.f7761g;
                jc.i.b(qVar7);
                qVar7.b(qVarB);
                fVar.f7733a = qVarB;
            }
            q qVar8 = fVar.f7733a;
            jc.i.b(qVar8);
            long j11 = qVar8.f7758c - qVar8.f7757b;
            fVar.f7733a = qVar8.a();
            q qVar9 = this.f7733a;
            if (qVar9 == null) {
                this.f7733a = qVar8;
                qVar8.f7761g = qVar8;
                qVar8.f7760f = qVar8;
            } else {
                q qVar10 = qVar9.f7761g;
                jc.i.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f7761g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                jc.i.b(qVar11);
                if (qVar11.e) {
                    int i13 = qVar8.f7758c - qVar8.f7757b;
                    q qVar12 = qVar8.f7761g;
                    jc.i.b(qVar12);
                    int i14 = 8192 - qVar12.f7758c;
                    q qVar13 = qVar8.f7761g;
                    jc.i.b(qVar13);
                    if (!qVar13.f7759d) {
                        q qVar14 = qVar8.f7761g;
                        jc.i.b(qVar14);
                        i10 = qVar14.f7757b;
                    }
                    if (i13 <= i14 + i10) {
                        q qVar15 = qVar8.f7761g;
                        jc.i.b(qVar15);
                        qVar8.d(qVar15, i13);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.f7734b -= j11;
            this.f7734b += j11;
            j4 -= j11;
        }
    }

    public final byte g(long j4) {
        c1.k(this.f7734b, j4, 1L);
        q qVar = this.f7733a;
        if (qVar == null) {
            jc.i.b(null);
            throw null;
        }
        long j10 = this.f7734b;
        if (j10 - j4 < j4) {
            while (j10 > j4) {
                qVar = qVar.f7761g;
                jc.i.b(qVar);
                j10 -= (long) (qVar.f7758c - qVar.f7757b);
            }
            return qVar.f7756a[(int) ((((long) qVar.f7757b) + j4) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i = qVar.f7758c;
            int i10 = qVar.f7757b;
            long j12 = ((long) (i - i10)) + j11;
            if (j12 > j4) {
                return qVar.f7756a[(int) ((((long) i10) + j4) - j11)];
            }
            qVar = qVar.f7760f;
            jc.i.b(qVar);
            j11 = j12;
        }
    }

    @Override // od.h
    public final i h(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(da.v.g("byteCount: ", j4).toString());
        }
        if (this.f7734b < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new i(B(j4));
        }
        i iVarG = G((int) j4);
        skip(j4);
        return iVarG;
    }

    public final int hashCode() {
        q qVar = this.f7733a;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i10 = qVar.f7758c;
            for (int i11 = qVar.f7757b; i11 < i10; i11++) {
                i = (i * 31) + qVar.f7756a[i11];
            }
            qVar = qVar.f7760f;
            jc.i.b(qVar);
        } while (qVar != this.f7733a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long o(byte b10, long j4, long j10) {
        q qVar;
        long j11 = 0;
        if (0 > j4 || j4 > j10) {
            throw new IllegalArgumentException(("size=" + this.f7734b + " fromIndex=" + j4 + " toIndex=" + j10).toString());
        }
        long j12 = this.f7734b;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j4 == j10 || (qVar = this.f7733a) == null) {
            return -1L;
        }
        if (j12 - j4 < j4) {
            while (j12 > j4) {
                qVar = qVar.f7761g;
                jc.i.b(qVar);
                j12 -= (long) (qVar.f7758c - qVar.f7757b);
            }
            while (j12 < j10) {
                byte[] bArr = qVar.f7756a;
                int iMin = (int) Math.min(qVar.f7758c, (((long) qVar.f7757b) + j10) - j12);
                for (int i = (int) ((((long) qVar.f7757b) + j4) - j12); i < iMin; i++) {
                    if (bArr[i] == b10) {
                        return ((long) (i - qVar.f7757b)) + j12;
                    }
                }
                j12 += (long) (qVar.f7758c - qVar.f7757b);
                qVar = qVar.f7760f;
                jc.i.b(qVar);
                j4 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = ((long) (qVar.f7758c - qVar.f7757b)) + j11;
            if (j13 > j4) {
                break;
            }
            qVar = qVar.f7760f;
            jc.i.b(qVar);
            j11 = j13;
        }
        while (j11 < j10) {
            byte[] bArr2 = qVar.f7756a;
            int iMin2 = (int) Math.min(qVar.f7758c, (((long) qVar.f7757b) + j10) - j11);
            for (int i10 = (int) ((((long) qVar.f7757b) + j4) - j11); i10 < iMin2; i10++) {
                if (bArr2[i10] == b10) {
                    return ((long) (i10 - qVar.f7757b)) + j11;
                }
            }
            j11 += (long) (qVar.f7758c - qVar.f7757b);
            qVar = qVar.f7760f;
            jc.i.b(qVar);
            j4 = j11;
        }
        return -1L;
    }

    @Override // od.h
    public final String r(long j4) throws EOFException {
        if (j4 < 0) {
            throw new IllegalArgumentException(da.v.g("limit < 0: ", j4).toString());
        }
        long j10 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long jO = o((byte) 10, 0L, j10);
        if (jO != -1) {
            return pd.a.a(jO, this);
        }
        if (j10 < this.f7734b && g(j10 - 1) == 13 && g(j10) == 10) {
            return pd.a.a(j10, this);
        }
        f fVar = new f();
        c(fVar, 0L, Math.min(32, this.f7734b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f7734b, j4) + " content=" + fVar.h(fVar.f7734b).b() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        jc.i.e(byteBuffer, "sink");
        q qVar = this.f7733a;
        if (qVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), qVar.f7758c - qVar.f7757b);
        byteBuffer.put(qVar.f7756a, qVar.f7757b, iMin);
        int i = qVar.f7757b + iMin;
        qVar.f7757b = i;
        this.f7734b -= (long) iMin;
        if (i == qVar.f7758c) {
            this.f7733a = qVar.a();
            r.a(qVar);
        }
        return iMin;
    }

    @Override // od.h
    public final byte readByte() throws EOFException {
        if (this.f7734b == 0) {
            throw new EOFException();
        }
        q qVar = this.f7733a;
        jc.i.b(qVar);
        int i = qVar.f7757b;
        int i10 = qVar.f7758c;
        int i11 = i + 1;
        byte b10 = qVar.f7756a[i];
        this.f7734b--;
        if (i11 != i10) {
            qVar.f7757b = i11;
            return b10;
        }
        this.f7733a = qVar.a();
        r.a(qVar);
        return b10;
    }

    @Override // od.h
    public final int readInt() throws EOFException {
        if (this.f7734b < 4) {
            throw new EOFException();
        }
        q qVar = this.f7733a;
        jc.i.b(qVar);
        int i = qVar.f7757b;
        int i10 = qVar.f7758c;
        if (i10 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = qVar.f7756a;
        int i11 = i + 3;
        int i12 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i13 = i + 4;
        int i14 = (bArr[i11] & 255) | i12;
        this.f7734b -= 4;
        if (i13 != i10) {
            qVar.f7757b = i13;
            return i14;
        }
        this.f7733a = qVar.a();
        r.a(qVar);
        return i14;
    }

    @Override // od.h
    public final short readShort() throws EOFException {
        if (this.f7734b < 2) {
            throw new EOFException();
        }
        q qVar = this.f7733a;
        jc.i.b(qVar);
        int i = qVar.f7757b;
        int i10 = qVar.f7758c;
        if (i10 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = qVar.f7756a;
        int i11 = i + 1;
        int i12 = (bArr[i] & 255) << 8;
        int i13 = i + 2;
        int i14 = (bArr[i11] & 255) | i12;
        this.f7734b -= 2;
        if (i13 == i10) {
            this.f7733a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f7757b = i13;
        }
        return (short) i14;
    }

    @Override // od.h
    public final void skip(long j4) throws EOFException {
        while (j4 > 0) {
            q qVar = this.f7733a;
            if (qVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j4, qVar.f7758c - qVar.f7757b);
            long j10 = iMin;
            this.f7734b -= j10;
            j4 -= j10;
            int i = qVar.f7757b + iMin;
            qVar.f7757b = i;
            if (i == qVar.f7758c) {
                this.f7733a = qVar.a();
                r.a(qVar);
            }
        }
    }

    @Override // od.v
    public final long t(long j4, f fVar) {
        jc.i.e(fVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(da.v.g("byteCount < 0: ", j4).toString());
        }
        long j10 = this.f7734b;
        if (j10 == 0) {
            return -1L;
        }
        if (j4 > j10) {
            j4 = j10;
        }
        fVar.f(j4, this);
        return j4;
    }

    public final String toString() {
        long j4 = this.f7734b;
        if (j4 <= 2147483647L) {
            return G((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f7734b).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        jc.i.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            q qVarH = H(1);
            int iMin = Math.min(i, 8192 - qVarH.f7758c);
            byteBuffer.get(qVarH.f7756a, qVarH.f7758c, iMin);
            i -= iMin;
            qVarH.f7758c += iMin;
        }
        this.f7734b += (long) iRemaining;
        return iRemaining;
    }

    @Override // od.g
    public final /* bridge */ /* synthetic */ g writeByte(int i) {
        V(i);
        return this;
    }

    @Override // od.g
    public final /* bridge */ /* synthetic */ g writeInt(int i) {
        X(i);
        return this;
    }

    @Override // od.g
    public final /* bridge */ /* synthetic */ g writeShort(int i) {
        Y(i);
        return this;
    }

    @Override // od.g
    public final /* bridge */ /* synthetic */ g x(i iVar) {
        T(iVar);
        return this;
    }

    @Override // od.g
    public final /* bridge */ /* synthetic */ g y(String str) {
        a0(str);
        return this;
    }

    @Override // od.g
    public final g write(byte[] bArr) {
        S(bArr.length, bArr);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, od.t
    public final void close() {
    }

    @Override // od.g, od.t, java.io.Flushable
    public final void flush() {
    }
}

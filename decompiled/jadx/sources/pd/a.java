package pd;

import java.io.EOFException;
import jc.i;
import od.f;
import od.n;
import od.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7866a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(pc.a.f7846a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        f7866a = bytes;
    }

    public static final String a(long j4, f fVar) throws EOFException {
        if (j4 > 0) {
            long j10 = j4 - 1;
            if (fVar.g(j10) == 13) {
                String strE = fVar.E(j10, pc.a.f7846a);
                fVar.skip(2L);
                return strE;
            }
        }
        String strE2 = fVar.E(j4, pc.a.f7846a);
        fVar.skip(1L);
        return strE2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a3 A[LOOP:0: B:8:0x001e->B:49:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    public static final int b(f fVar, n nVar, boolean z4) {
        int i;
        int i10;
        int i11;
        q qVar;
        int i12;
        i.e(nVar, "options");
        q qVar2 = fVar.f7733a;
        if (qVar2 == null) {
            return z4 ? -2 : -1;
        }
        byte[] bArr = qVar2.f7756a;
        int i13 = qVar2.f7757b;
        int i14 = qVar2.f7758c;
        int[] iArr = nVar.f7749b;
        q qVar3 = qVar2;
        int i15 = -1;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i16 + 1;
            int i18 = iArr[i16];
            int i19 = i16 + 2;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (qVar3 == null) {
                break;
            }
            if (i18 >= 0) {
                int i21 = i13 + 1;
                int i22 = bArr[i13] & 255;
                int i23 = i19 + i18;
                while (i19 != i23) {
                    if (i22 == iArr[i19]) {
                        i = iArr[i19 + i18];
                        if (i21 == i14) {
                            qVar3 = qVar3.f7760f;
                            i.b(qVar3);
                            int i24 = qVar3.f7757b;
                            byte[] bArr2 = qVar3.f7756a;
                            i10 = qVar3.f7758c;
                            if (qVar3 == qVar2) {
                                i11 = i24;
                                bArr = bArr2;
                                qVar3 = null;
                            } else {
                                i11 = i24;
                                bArr = bArr2;
                            }
                        } else {
                            i10 = i14;
                            i11 = i21;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i25 = i10;
                        i16 = -i;
                        i13 = i11;
                        i14 = i25;
                    } else {
                        i19++;
                    }
                }
                return i15;
            }
            int i26 = (i18 * (-1)) + i19;
            while (true) {
                int i27 = i13 + 1;
                int i28 = i19 + 1;
                if ((bArr[i13] & 255) == iArr[i19]) {
                    boolean z10 = i28 == i26;
                    if (i27 == i14) {
                        i.b(qVar3);
                        q qVar4 = qVar3.f7760f;
                        i.b(qVar4);
                        i11 = qVar4.f7757b;
                        byte[] bArr3 = qVar4.f7756a;
                        i12 = qVar4.f7758c;
                        if (qVar4 != qVar2) {
                            qVar = qVar4;
                            bArr = bArr3;
                        } else {
                            if (!z10) {
                                break loop0;
                            }
                            bArr = bArr3;
                            qVar = null;
                        }
                    } else {
                        qVar = qVar3;
                        i12 = i14;
                        i11 = i27;
                    }
                    if (z10) {
                        i = iArr[i28];
                        int i29 = i12;
                        qVar3 = qVar;
                        i10 = i29;
                        break;
                    }
                    i13 = i11;
                    i14 = i12;
                    qVar3 = qVar;
                    i19 = i28;
                }
                return i15;
            }
            if (i >= 0) {
                return i;
            }
            int i210 = i10;
            i16 = -i;
            i13 = i11;
            i14 = i210;
        }
        if (z4) {
            return -2;
        }
        return i15;
    }
}

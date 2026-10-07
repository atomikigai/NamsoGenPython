package od;

import fa.c1;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f7735d = new i(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f7737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f7738c;

    public i(byte[] bArr) {
        jc.i.e(bArr, "data");
        this.f7736a = bArr;
    }

    public int a() {
        return this.f7736a.length;
    }

    public String b() {
        byte[] bArr = this.f7736a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b10 : bArr) {
            int i10 = i + 1;
            char[] cArr2 = pd.b.f7867a;
            cArr[i] = cArr2[(b10 >> 4) & 15];
            i += 2;
            cArr[i10] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f7736a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        jc.i.e(iVar, "other");
        int iA = a();
        int iA2 = iVar.a();
        int iMin = Math.min(iA, iA2);
        for (int i = 0; i < iMin; i++) {
            int iD = d(i) & 255;
            int iD2 = iVar.d(i) & 255;
            if (iD != iD2) {
                return iD < iD2 ? -1 : 1;
            }
        }
        if (iA == iA2) {
            return 0;
        }
        return iA < iA2 ? -1 : 1;
    }

    public byte d(int i) {
        return this.f7736a[i];
    }

    public boolean e(int i, byte[] bArr, int i10, int i11) {
        jc.i.e(bArr, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f7736a;
        return i <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && c1.e(bArr2, i, bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int iA = iVar.a();
            byte[] bArr = this.f7736a;
            if (iA == bArr.length && iVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(i iVar, int i) {
        jc.i.e(iVar, "other");
        return iVar.e(0, this.f7736a, 0, i);
    }

    public i g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f7736a;
            if (i >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                jc.i.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b10 + 32);
                for (int i10 = i + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i10] = (byte) (b11 + 32);
                    }
                }
                return new i(bArrCopyOf);
            }
            i++;
        }
    }

    public final String h() {
        String str = this.f7738c;
        if (str != null) {
            return str;
        }
        byte[] bArrC = c();
        jc.i.e(bArrC, "<this>");
        String str2 = new String(bArrC, pc.a.f7846a);
        this.f7738c = str2;
        return str2;
    }

    public int hashCode() {
        int i = this.f7737b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f7736a);
        this.f7737b = iHashCode;
        return iHashCode;
    }

    public void i(f fVar, int i) {
        fVar.S(i, this.f7736a);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        i iVar;
        byte b10;
        int i;
        byte[] bArr = this.f7736a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (i10 < length) {
            byte b11 = bArr[i10];
            if (b11 < 0) {
                if ((b11 >> 5) != -2) {
                    if ((b11 >> 4) != -2) {
                        if ((b11 >> 3) != -2) {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                        int i13 = i10 + 3;
                        if (length > i13) {
                            byte b12 = bArr[i10 + 1];
                            if ((b12 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b13 = bArr[i10 + 2];
                            if ((b13 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b14 = bArr[i13];
                            if ((b14 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            int i14 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
                            if (i14 <= 1114111) {
                                if (55296 <= i14 && i14 < 57344) {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                                if (i14 >= 65536) {
                                    i = i12 + 1;
                                    if (i12 == 64) {
                                        break;
                                    }
                                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                        i11 = -1;
                                        break;
                                    }
                                    i11 += i14 < 65536 ? 1 : 2;
                                    i10 += 4;
                                    i12 = i;
                                } else {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                            } else {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    } else {
                        int i15 = i10 + 2;
                        if (length > i15) {
                            byte b15 = bArr[i10 + 1];
                            if ((b15 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b16 = bArr[i15];
                            if ((b16 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            int i16 = ((b16 ^ (-123008)) ^ (b15 << 6)) ^ (b11 << 12);
                            if (i16 >= 2048) {
                                if (55296 <= i16 && i16 < 57344) {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                                i = i12 + 1;
                                if (i12 == 64) {
                                    break;
                                }
                                if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                    i11 = -1;
                                    break;
                                }
                                i11 += i16 < 65536 ? 1 : 2;
                                i10 += 3;
                                i12 = i;
                            } else {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    }
                } else {
                    int i17 = i10 + 1;
                    if (length > i17) {
                        byte b17 = bArr[i17];
                        if ((b17 & 192) != 128) {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                        int i18 = (b17 ^ 3968) ^ (b11 << 6);
                        if (i18 >= 128) {
                            i = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                i11 = -1;
                                break;
                            }
                            i11 += i18 < 65536 ? 1 : 2;
                            i10 += 2;
                            i12 = i;
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    } else {
                        if (i12 == 64) {
                            break;
                        }
                        i11 = -1;
                        break;
                    }
                }
            } else {
                int i19 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b11 == 10 || b11 == 13 || ((b11 < 0 || b11 >= 32) && (127 > b11 || b11 >= 160))) && b11 != 65533) {
                    i11 += b11 < 65536 ? 1 : 2;
                    i10++;
                    while (true) {
                        i12 = i19;
                        if (i10 < length && (b10 = bArr[i10]) >= 0) {
                            i10++;
                            i19 = i12 + 1;
                            if (i12 == 64) {
                                break loop0;
                            }
                            if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                                i11 += b10 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i11 = -1;
                break;
            }
        }
        if (i11 != -1) {
            String strH = h();
            String strSubstring = strH.substring(0, i11);
            jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strC0 = pc.o.c0(pc.o.c0(pc.o.c0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i11 >= strH.length()) {
                return "[text=" + strC0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strC0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            iVar = this;
        } else {
            c1.n(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            jc.i.d(bArrCopyOfRange, "copyOfRange(...)");
            iVar = new i(bArrCopyOfRange);
        }
        sb2.append(iVar.b());
        sb2.append("…]");
        return sb2.toString();
    }
}

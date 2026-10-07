package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f697c;

    public /* synthetic */ o1(int i) {
        this.f697c = i;
    }

    public static int m(long j4, byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            m0 m0Var = q1.f706a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i10 == 1) {
            return q1.c(i, n1.f(bArr, j4));
        }
        if (i10 == 2) {
            return q1.d(i, n1.f(bArr, j4), n1.f(bArr, j4 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f A[LOOP:2: B:16:0x0036->B:19:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104 A[LOOP:5: B:55:0x00fe->B:58:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0068 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.m0
    public final String e(int i, byte[] bArr, int i10) throws x {
        int i11;
        int i12;
        byte b10;
        int i13;
        int i14;
        byte b11;
        int i15;
        int i16;
        byte bF;
        int i17;
        byte bF2;
        switch (this.f697c) {
            case 0:
                if ((i | i10 | ((bArr.length - i) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i10)));
                }
                int i18 = i + i10;
                char[] cArr = new char[i10];
                int i19 = 0;
                while (i < i18) {
                    byte b12 = bArr[i];
                    if (b12 < 0) {
                        i11 = i19;
                        while (i < i18) {
                            i12 = i + 1;
                            b10 = bArr[i];
                            if (b10 >= 0) {
                                i13 = i11 + 1;
                                cArr[i11] = (char) b10;
                                i14 = i12;
                                while (i14 < i18) {
                                    b11 = bArr[i14];
                                    if (b11 >= 0) {
                                        i14++;
                                        cArr[i13] = (char) b11;
                                        i13++;
                                    } else {
                                        i11 = i13;
                                        i = i14;
                                    }
                                }
                                i11 = i13;
                                i = i14;
                            } else if (b10 < -32) {
                                if (i12 < i18) {
                                    throw x.a();
                                }
                                i += 2;
                                m0.b(b10, bArr[i12], cArr, i11);
                                i11++;
                            } else if (b10 < -16) {
                                if (i12 < i18 - 1) {
                                    throw x.a();
                                }
                                int i20 = i + 2;
                                i += 3;
                                m0.c(b10, bArr[i12], bArr[i20], cArr, i11);
                                i11++;
                            } else {
                                if (i12 < i18 - 2) {
                                    throw x.a();
                                }
                                byte b13 = bArr[i12];
                                int i21 = i + 3;
                                byte b14 = bArr[i + 2];
                                i += 4;
                                m0.a(b10, b13, b14, bArr[i21], cArr, i11);
                                i11 += 2;
                            }
                        }
                        return new String(cArr, 0, i11);
                    }
                    i++;
                    cArr[i19] = (char) b12;
                    i19++;
                }
                i11 = i19;
                while (i < i18) {
                    i12 = i + 1;
                    b10 = bArr[i];
                    if (b10 >= 0) {
                        i13 = i11 + 1;
                        cArr[i11] = (char) b10;
                        i14 = i12;
                        while (i14 < i18) {
                            b11 = bArr[i14];
                            if (b11 >= 0) {
                                i14++;
                                cArr[i13] = (char) b11;
                                i13++;
                            } else {
                                i11 = i13;
                                i = i14;
                            }
                        }
                        i11 = i13;
                        i = i14;
                    } else if (b10 < -32) {
                        if (i12 < i18) {
                            throw x.a();
                        }
                        i += 2;
                        m0.b(b10, bArr[i12], cArr, i11);
                        i11++;
                    } else if (b10 < -16) {
                        if (i12 < i18 - 1) {
                            throw x.a();
                        }
                        int i22 = i + 2;
                        i += 3;
                        m0.c(b10, bArr[i12], bArr[i22], cArr, i11);
                        i11++;
                    } else {
                        if (i12 < i18 - 2) {
                            throw x.a();
                        }
                        byte b15 = bArr[i12];
                        int i23 = i + 3;
                        byte b16 = bArr[i + 2];
                        i += 4;
                        m0.a(b10, b15, b16, bArr[i23], cArr, i11);
                        i11 += 2;
                    }
                }
                return new String(cArr, 0, i11);
            default:
                if ((i | i10 | ((bArr.length - i) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i10)));
                }
                int i24 = i + i10;
                char[] cArr2 = new char[i10];
                int i25 = 0;
                while (i < i24) {
                    byte bF3 = n1.f(bArr, i);
                    if (bF3 < 0) {
                        i15 = i25;
                        while (i < i24) {
                            i16 = i + 1;
                            bF = n1.f(bArr, i);
                            if (bF >= 0) {
                                i17 = i15 + 1;
                                cArr2[i15] = (char) bF;
                                while (i16 < i24) {
                                    bF2 = n1.f(bArr, i16);
                                    if (bF2 >= 0) {
                                        i16++;
                                        cArr2[i17] = (char) bF2;
                                        i17++;
                                    } else {
                                        i15 = i17;
                                        i = i16;
                                    }
                                }
                                i15 = i17;
                                i = i16;
                            } else if (bF < -32) {
                                if (i16 < i24) {
                                    throw x.a();
                                }
                                i += 2;
                                m0.b(bF, n1.f(bArr, i16), cArr2, i15);
                                i15++;
                            } else if (bF < -16) {
                                if (i16 < i24 - 1) {
                                    throw x.a();
                                }
                                int i26 = i + 2;
                                i += 3;
                                m0.c(bF, n1.f(bArr, i16), n1.f(bArr, i26), cArr2, i15);
                                i15++;
                            } else {
                                if (i16 < i24 - 2) {
                                    throw x.a();
                                }
                                byte bF4 = n1.f(bArr, i16);
                                int i27 = i + 3;
                                byte bF5 = n1.f(bArr, i + 2);
                                i += 4;
                                m0.a(bF, bF4, bF5, n1.f(bArr, i27), cArr2, i15);
                                i15 += 2;
                            }
                        }
                        return new String(cArr2, 0, i15);
                    }
                    i++;
                    cArr2[i25] = (char) bF3;
                    i25++;
                }
                i15 = i25;
                while (i < i24) {
                    i16 = i + 1;
                    bF = n1.f(bArr, i);
                    if (bF >= 0) {
                        i17 = i15 + 1;
                        cArr2[i15] = (char) bF;
                        while (i16 < i24) {
                            bF2 = n1.f(bArr, i16);
                            if (bF2 >= 0) {
                                i16++;
                                cArr2[i17] = (char) bF2;
                                i17++;
                            } else {
                                i15 = i17;
                                i = i16;
                            }
                        }
                        i15 = i17;
                        i = i16;
                    } else if (bF < -32) {
                        if (i16 < i24) {
                            throw x.a();
                        }
                        i += 2;
                        m0.b(bF, n1.f(bArr, i16), cArr2, i15);
                        i15++;
                    } else if (bF < -16) {
                        if (i16 < i24 - 1) {
                            throw x.a();
                        }
                        int i28 = i + 2;
                        i += 3;
                        m0.c(bF, n1.f(bArr, i16), n1.f(bArr, i28), cArr2, i15);
                        i15++;
                    } else {
                        if (i16 < i24 - 2) {
                            throw x.a();
                        }
                        byte bF6 = n1.f(bArr, i16);
                        int i29 = i + 3;
                        byte bF7 = n1.f(bArr, i + 2);
                        i += 4;
                        m0.a(bF, bF6, bF7, n1.f(bArr, i29), cArr2, i15);
                        i15 += 2;
                    }
                }
                return new String(cArr2, 0, i15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int f(String str, byte[] bArr, int i, int i10) {
        int i11;
        int i12;
        char cCharAt;
        long j4;
        char c10;
        long j10;
        long j11;
        char c11;
        int i13;
        char cCharAt2;
        switch (this.f697c) {
            case 0:
                int length = str.length();
                int i14 = i10 + i;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) cCharAt;
                    i15++;
                }
                if (i15 == length) {
                    return i + length;
                }
                int i16 = i + i15;
                while (i15 < length) {
                    char cCharAt3 = str.charAt(i15);
                    if (cCharAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) cCharAt3;
                        i16++;
                    } else if (cCharAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((cCharAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i11)))) {
                                    throw new p1(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char cCharAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new p1(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j12 = i;
                long j13 = ((long) i10) + j12;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i10));
                }
                int i21 = 0;
                while (true) {
                    j4 = 1;
                    c10 = 128;
                    if (i21 < length2 && (cCharAt2 = str.charAt(i21)) < 128) {
                        n1.j(bArr, j12, (byte) cCharAt2);
                        i21++;
                        j12 = 1 + j12;
                    }
                }
                if (i21 == length2) {
                    return (int) j12;
                }
                while (i21 < length2) {
                    char cCharAt5 = str.charAt(i21);
                    if (cCharAt5 < c10 && j12 < j13) {
                        n1.j(bArr, j12, (byte) cCharAt5);
                        c11 = c10;
                        j10 = j4;
                        j11 = j12 + j4;
                    } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                        j10 = j4;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                            long j14 = j12;
                            if (j14 > j13 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i13)))) {
                                    throw new p1(i21, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j14);
                            }
                            int i22 = i21 + 1;
                            if (i22 != length2) {
                                char cCharAt6 = str.charAt(i22);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    n1.j(bArr, j14, (byte) ((codePoint2 >>> 18) | 240));
                                    c11 = 128;
                                    n1.j(bArr, j14 + j10, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    n1.j(bArr, j14 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    n1.j(bArr, j14 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j11 = j14 + 4;
                                    i21 = i22;
                                } else {
                                    i21 = i22;
                                }
                            }
                            throw new p1(i21 - 1, length2);
                        }
                        n1.j(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j15 = j12;
                        n1.j(bArr, j12 + j10, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j11 = j15 + 3;
                        n1.j(bArr, j15 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c11 = 128;
                    } else {
                        j10 = j4;
                        n1.j(bArr, j12, (byte) ((cCharAt5 >>> 6) | 960));
                        n1.j(bArr, j12 + j10, (byte) ((cCharAt5 & '?') | c10));
                        j11 = j12 + 2;
                        c11 = c10;
                    }
                    i21++;
                    c10 = c11;
                    j12 = j11;
                    j4 = j10;
                }
                return (int) j12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    @Override // androidx.datastore.preferences.protobuf.m0
    public final int i(int i, byte[] bArr, int i10) {
        int i11;
        int i12;
        long j4;
        long j10;
        byte bF;
        long j11;
        byte bF2;
        long j12;
        int i13 = i;
        switch (this.f697c) {
            case 0:
                break;
            default:
                if ((i13 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i10)));
                }
                long j13 = i13;
                int i14 = (int) (((long) i10) - j13);
                long j14 = 1;
                if (i14 < 16) {
                    i11 = 0;
                } else {
                    long j15 = j13;
                    i11 = 0;
                    while (true) {
                        if (i11 < i14) {
                            long j16 = j15 + 1;
                            if (n1.f(bArr, j15) >= 0) {
                                i11++;
                                j15 = j16;
                            }
                        } else {
                            i11 = i14;
                        }
                    }
                }
                int i15 = i14 - i11;
                long j17 = j13 + ((long) i11);
                while (true) {
                    byte bF3 = 0;
                    while (i15 > 0) {
                        long j18 = j17 + j14;
                        bF3 = n1.f(bArr, j17);
                        if (bF3 < 0) {
                            j17 = j18;
                            if (i15 == 0) {
                                return 0;
                            }
                            i12 = i15 - 1;
                            if (bF3 < -32) {
                                if (i12 == 0) {
                                    return bF3;
                                }
                                i15 -= 2;
                                if (bF3 >= -62) {
                                    j12 = j17 + j14;
                                    if (n1.f(bArr, j17) > -65) {
                                        j4 = j14;
                                        j17 = j12;
                                        j14 = j4;
                                    }
                                }
                                return -1;
                            }
                            if (bF3 < -16) {
                                if (i12 < 2) {
                                    return m(j17, bArr, bF3, i12);
                                }
                                i15 -= 3;
                                j4 = j14;
                                long j19 = j17 + j4;
                                bF2 = n1.f(bArr, j17);
                                if (bF2 > -65 && ((bF3 != -32 || bF2 >= -96) && (bF3 != -19 || bF2 < -96))) {
                                    j17 += 2;
                                    if (n1.f(bArr, j19) <= -65) {
                                        j14 = j4;
                                    }
                                }
                                return -1;
                            }
                            j4 = j14;
                            if (i12 < 3) {
                                return m(j17, bArr, bF3, i12);
                            }
                            i15 -= 4;
                            j10 = j17 + j4;
                            bF = n1.f(bArr, j17);
                            if (bF <= -65) {
                                if ((((bF + 112) + (bF3 << 28)) >> 30) == 0) {
                                    j11 = 2 + j17;
                                    if (n1.f(bArr, j10) <= -65) {
                                        j17 += 3;
                                        if (n1.f(bArr, j11) > -65) {
                                            j14 = j4;
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i15--;
                        j17 = j18;
                    }
                    if (i15 == 0) {
                        return 0;
                    }
                    i12 = i15 - 1;
                    if (bF3 < -32) {
                        if (i12 == 0) {
                            return bF3;
                        }
                        i15 -= 2;
                        if (bF3 >= -62) {
                            j12 = j17 + j14;
                            if (n1.f(bArr, j17) > -65) {
                                j4 = j14;
                                j17 = j12;
                                j14 = j4;
                            }
                        }
                        return -1;
                    }
                    if (bF3 < -16) {
                        if (i12 < 2) {
                            return m(j17, bArr, bF3, i12);
                        }
                        i15 -= 3;
                        j4 = j14;
                        long j110 = j17 + j4;
                        bF2 = n1.f(bArr, j17);
                        if (bF2 > -65) {
                        }
                        return -1;
                    }
                    j4 = j14;
                    if (i12 < 3) {
                        return m(j17, bArr, bF3, i12);
                    }
                    i15 -= 4;
                    j10 = j17 + j4;
                    bF = n1.f(bArr, j17);
                    if (bF <= -65) {
                        if ((((bF + 112) + (bF3 << 28)) >> 30) == 0) {
                            j11 = 2 + j17;
                            if (n1.f(bArr, j10) <= -65) {
                                j17 += 3;
                                if (n1.f(bArr, j11) > -65) {
                                    j14 = j4;
                                }
                            }
                        }
                    }
                    return -1;
                }
        }
        while (i13 < i10 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 < i10) {
            while (i13 < i10) {
                int i16 = i13 + 1;
                byte b10 = bArr[i13];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i16 >= i10) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i13 += 2;
                            if (bArr[i16] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i16 >= i10 - 1) {
                            return q1.a(i16, bArr, i10);
                        }
                        int i17 = i13 + 2;
                        byte b11 = bArr[i16];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i13 += 3;
                            if (bArr[i17] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i16 >= i10 - 2) {
                        return q1.a(i16, bArr, i10);
                    }
                    int i18 = i13 + 2;
                    byte b12 = bArr[i16];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i19 = i13 + 3;
                            if (bArr[i18] <= -65) {
                                i13 += 4;
                                if (bArr[i19] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i13 = i16;
            }
        }
        return 0;
    }
}

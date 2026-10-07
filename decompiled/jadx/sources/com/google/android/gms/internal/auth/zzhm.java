package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i = zzdr.zza;
        }
        zza = new zzhl();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i10) {
        byte b10 = bArr[i - 1];
        int i11 = i10 - i;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            byte b11 = bArr[i];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i];
        byte b13 = bArr[i + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }

    public static String zzb(byte[] bArr, int i, int i10) throws zzfa {
        int length = bArr.length;
        if ((i | i10 | ((length - i) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i10)));
        }
        int i11 = i + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i < i11) {
            byte b10 = bArr[i];
            if (!zzhj.zzd(b10)) {
                break;
            }
            i++;
            cArr[i12] = (char) b10;
            i12++;
        }
        int i13 = i12;
        while (i < i11) {
            int i14 = i + 1;
            byte b11 = bArr[i];
            if (zzhj.zzd(b11)) {
                cArr[i13] = (char) b11;
                i13++;
                i = i14;
                while (i < i11) {
                    byte b12 = bArr[i];
                    if (!zzhj.zzd(b12)) {
                        break;
                    }
                    i++;
                    cArr[i13] = (char) b12;
                    i13++;
                }
            } else if (b11 < -32) {
                if (i14 >= i11) {
                    throw zzfa.zzb();
                }
                i += 2;
                zzhj.zzc(b11, bArr[i14], cArr, i13);
                i13++;
            } else if (b11 < -16) {
                if (i14 >= i11 - 1) {
                    throw zzfa.zzb();
                }
                int i15 = i + 2;
                i += 3;
                zzhj.zzb(b11, bArr[i14], bArr[i15], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw zzfa.zzb();
                }
                int i16 = i + 2;
                int i17 = i + 3;
                i += 4;
                zzhj.zza(b11, bArr[i14], bArr[i16], bArr[i17], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i, int i10) {
        return zza.zzb(bArr, i, i10);
    }
}

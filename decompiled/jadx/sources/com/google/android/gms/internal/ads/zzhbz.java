package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhbz {
    private static final zzhbw zza;

    static {
        if (zzhbu.zzA() && zzhbu.zzB()) {
            int i = zzgxc.zza;
        }
        zza = new zzhbx();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i, int i10) {
        int i11 = i10 - i;
        byte b10 = bArr[i - 1];
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            return zzj(b10, bArr[i]);
        }
        if (i11 == 2) {
            return zzk(b10, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int zzd(String str, byte[] bArr, int i, int i10) {
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int length = str.length();
        int i14 = 0;
        while (true) {
            i11 = i + i10;
            if (i14 >= length || (i13 = i14 + i) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i + length;
        }
        int i15 = i + i14;
        while (i14 < length) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 > i11 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i12 = i14 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new zzhby(i14, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                    }
                    int i16 = i14 + 1;
                    if (i16 != str.length()) {
                        char cCharAt3 = str.charAt(i16);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i17 = i15 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i14 = i16;
                        } else {
                            i14 = i16;
                        }
                    }
                    throw new zzhby(i14 - 1, length);
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static int zze(String str) {
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new zzhby(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i;
                break;
            }
            i11 += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + 4294967296L));
    }

    public static int zzf(int i, byte[] bArr, int i10, int i11) {
        return zza.zza(i, bArr, i10, i11);
    }

    public static String zzg(ByteBuffer byteBuffer, int i, int i10) throws zzgzm {
        zzhbw zzhbwVar = zza;
        if (byteBuffer.hasArray()) {
            return zzhbwVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i, i10);
        }
        return byteBuffer.isDirect() ? zzhbw.zzc(byteBuffer, i, i10) : zzhbw.zzc(byteBuffer, i, i10);
    }

    public static String zzh(byte[] bArr, int i, int i10) throws zzgzm {
        return zza.zzb(bArr, i, i10);
    }

    public static boolean zzi(byte[] bArr, int i, int i10) {
        return zza.zza(0, bArr, i, i10) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i, int i10) {
        if (i > -12 || i10 > -65) {
            return -1;
        }
        return i ^ (i10 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i, int i10, int i11) {
        if (i > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i ^ (i10 << 8)) ^ (i11 << 16);
    }
}

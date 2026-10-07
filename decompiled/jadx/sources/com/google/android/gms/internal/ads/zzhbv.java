package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhbv {
    public static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i) throws zzgzm {
        if (!zzg(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !zzg(b12) && !zzg(b13)) {
                int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i] = (char) ((i10 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw new zzgzm("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* bridge */ /* synthetic */ void zzb(byte b10, byte b11, byte b12, char[] cArr, int i) throws zzgzm {
        if (!zzg(b11)) {
            if (b10 != -32) {
                if (b10 != -19) {
                    if (!zzg(b12)) {
                        cArr[i] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!zzg(b12)) {
                        cArr[i] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            } else if (b11 >= -96) {
                b10 = -32;
                if (b10 != -19) {
                    if (!zzg(b12)) {
                        cArr[i] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!zzg(b12)) {
                        cArr[i] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            }
        }
        throw new zzgzm("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i) throws zzgzm {
        if (b10 < -62 || zzg(b11)) {
            throw new zzgzm("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean zze(byte b10) {
        return b10 < -16;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(byte b10) {
        return b10 < -32;
    }

    private static boolean zzg(byte b10) {
        return b10 > -65;
    }
}

package com.google.android.gms.internal.ads;

import da.v;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgbw {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgbw(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c10 = cArr[i];
            boolean z4 = true;
            zzfwq.zzg(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z4 = false;
            }
            zzfwq.zzg(z4, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgbw) {
            zzgbw zzgbwVar = (zzgbw) obj;
            if (this.zzi == zzgbwVar.zzi && Arrays.equals(this.zzf, zzgbwVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i) {
        return this.zzf[i];
    }

    public final int zzb(char c10) throws zzgbz {
        if (c10 > 127) {
            throw new zzgbz("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b10 = this.zzg[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzgbz("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzgbz("Unrecognized character: " + c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    public final zzgbw zzc() {
        boolean z4;
        int i = 0;
        int i10 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i10 >= cArr.length) {
                return this;
            }
            if (zzfwa.zze(cArr[i10])) {
                int i11 = 0;
                while (true) {
                    if (i11 >= cArr.length) {
                        z4 = false;
                        break;
                    }
                    if (zzfwa.zzd(cArr[i11])) {
                        z4 = true;
                        break;
                    }
                    i11++;
                }
                zzfwq.zzl(!z4, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i >= cArr3.length) {
                        break;
                    }
                    char c10 = cArr3[i];
                    if (zzfwa.zze(c10)) {
                        c10 ^= 32;
                    }
                    cArr2[i] = (char) c10;
                    i++;
                }
                zzgbw zzgbwVar = new zzgbw(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzgbwVar.zzi) {
                    return zzgbwVar;
                }
                byte[] bArr = zzgbwVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i12 = 65; i12 <= 90; i12++) {
                    int i13 = i12 | 32;
                    byte[] bArr2 = zzgbwVar.zzg;
                    byte b10 = bArr2[i12];
                    byte b11 = bArr2[i13];
                    if (b10 == -1) {
                        bArrCopyOf[i12] = b11;
                    } else {
                        char c11 = (char) i12;
                        char c12 = (char) i13;
                        if (b11 != -1) {
                            throw new IllegalStateException(zzfxf.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                        }
                        bArrCopyOf[i13] = b10;
                    }
                }
                return new zzgbw(zzgbwVar.zze.concat(".ignoreCase()"), zzgbwVar.zzf, bArrCopyOf, true);
            }
            i10++;
        }
    }

    public final boolean zzd(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zze(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgbw(String str, char[] cArr, byte[] bArr, boolean z4) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzc = zzgck.zzc(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzc;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzc);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i;
            this.zzd = iZzc >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzgck.zzb(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z4;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(v.f(cArr.length, "Illegal alphabet length "), e);
        }
    }
}

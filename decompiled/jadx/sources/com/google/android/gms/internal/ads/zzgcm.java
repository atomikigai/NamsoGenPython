package com.google.android.gms.internal.ads;

import da.v;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgcm {
    public static long zza(long j4, long j10) {
        long j11 = j4 + j10;
        if (((j4 ^ j10) < 0) || ((j4 ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException(q1.a.l(v.l("overflow: checkedAdd(", ", ", j4), j10, ")"));
    }

    public static long zzb(long j4, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j4 / j10;
        long j12 = j4 - (j10 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i = ((int) ((j4 ^ j10) >> 63)) | 1;
        switch (zzgcl.zza[roundingMode.ordinal()]) {
            case 1:
                zzgcn.zzb(false);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i >= 0) {
                    return j11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j11;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j12);
                long jAbs2 = jAbs - (Math.abs(j10) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (jAbs2 <= 0) {
                    return j11;
                }
            default:
                throw new AssertionError();
        }
        return j11 + ((long) i);
    }

    public static long zzc(long j4, long j10) {
        zzgcn.zza("a", j4);
        zzgcn.zza("b", j10);
        if (j4 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j4;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
        long jNumberOfTrailingZeros = j4 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j11) {
            long j12 = jNumberOfTrailingZeros - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            jNumberOfTrailingZeros = j14 >> Long.numberOfTrailingZeros(j14);
            j11 += j13;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzd(long j4, long j10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4);
        if (iNumberOfLeadingZeros > 65) {
            return j4 * j10;
        }
        long j11 = j4 ^ j10;
        long j12 = (j11 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j10 == Long.MIN_VALUE) & (j4 < 0)))) {
            long j13 = j4 * j10;
            if (j4 == 0 || j13 / j4 == j10) {
                return j13;
            }
        }
        return j12;
    }
}

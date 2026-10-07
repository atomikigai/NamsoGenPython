package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgch {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static int zza(double d10, RoundingMode roundingMode) {
        boolean zZzd;
        boolean z4 = false;
        zzfwq.zzf(d10 > 0.0d && zzgci.zzb(d10), "x must be positive and finite");
        int exponent = Math.getExponent(d10);
        if (Math.getExponent(d10) < -1022) {
            return zza(d10 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (zzgcg.zza[roundingMode.ordinal()]) {
            case 1:
                zzgcn.zzb(zzd(d10));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z4 = !zzd(d10);
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z4 = exponent < 0;
                zZzd = zzd(d10);
                z4 &= !zZzd;
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z4 = exponent >= 0;
                zZzd = zzd(d10);
                z4 &= !zZzd;
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z4 = true;
                }
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0099, please report this as an issue */
    public static long zzb(double d10, RoundingMode roundingMode) {
        double dRint;
        long j4;
        long j10;
        boolean z4;
        if (!zzgci.zzb(d10)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzgcg.zza[roundingMode.ordinal()]) {
            case 1:
                zzgcn.zzb(zzc(d10));
                dRint = d10;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d10 >= 0.0d || zzc(d10)) {
                    dRint = d10;
                } else {
                    j4 = (long) d10;
                    j10 = -1;
                    dRint = j4 + j10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + String.valueOf(roundingMode));
            case 3:
                if (d10 <= 0.0d || zzc(d10)) {
                    dRint = d10;
                } else {
                    j4 = (long) d10;
                    j10 = 1;
                    dRint = j4 + j10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + String.valueOf(roundingMode));
            case 4:
                dRint = d10;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + String.valueOf(roundingMode));
            case 5:
                if (zzc(d10)) {
                    dRint = d10;
                } else {
                    dRint = ((long) d10) + ((long) (d10 > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + String.valueOf(roundingMode));
            case 6:
                dRint = Math.rint(d10);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + String.valueOf(roundingMode));
            case 7:
                dRint = Math.rint(d10);
                if (Math.abs(d10 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d10) + d10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + String.valueOf(roundingMode));
            case 8:
                dRint = Math.rint(d10);
                if (Math.abs(d10 - dRint) == 0.5d) {
                    dRint = d10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + String.valueOf(roundingMode));
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzc(double d10) {
        if (zzgci.zzb(d10)) {
            return d10 == 0.0d || 52 - Long.numberOfTrailingZeros(zzgci.zza(d10)) <= Math.getExponent(d10);
        }
        return false;
    }

    public static boolean zzd(double d10) {
        if (d10 > 0.0d && zzgci.zzb(d10)) {
            long jZza = zzgci.zza(d10);
            if ((jZza & ((-1) + jZza)) == 0) {
                return true;
            }
        }
        return false;
    }
}

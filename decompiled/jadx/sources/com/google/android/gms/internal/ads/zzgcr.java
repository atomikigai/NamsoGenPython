package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgcr extends zzgcs {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int zzb(long j4) {
        int i = (int) j4;
        zzfwq.zzh(((long) i) == j4, "Out of range: %s", j4);
        return i;
    }

    public static int zzc(int i, int i10, int i11) {
        zzfwq.zzi(true, "min (%s) must be less than or equal to max (%s)", i10, 1073741823);
        return Math.min(Math.max(i, i10), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzfwq.zzi(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j4) {
        if (j4 > 2147483647L) {
            return f.API_PRIORITY_OTHER;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer zzf(String str, int i) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i10 = cCharAt == '-' ? 1 : 0;
            if (i10 != str.length()) {
                int i11 = i10 + 1;
                int iZza = zzgct.zza(str.charAt(i10));
                if (iZza >= 0 && iZza < 10) {
                    long j4 = -iZza;
                    while (true) {
                        if (i11 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j4 != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j4);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j4);
                            break;
                        }
                        int i12 = i11 + 1;
                        int iZza2 = zzgct.zza(str.charAt(i11));
                        if (iZza2 >= 0 && iZza2 < 10 && j4 >= -922337203685477580L) {
                            long j10 = j4 * 10;
                            long j11 = iZza2;
                            if (j10 >= Long.MIN_VALUE + j11) {
                                j4 = j10 - j11;
                                i11 = i12;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzgcq(iArr, 0, length);
    }

    public static int[] zzh(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}

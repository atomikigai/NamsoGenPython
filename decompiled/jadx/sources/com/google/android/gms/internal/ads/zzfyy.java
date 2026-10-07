package com.google.android.gms.internal.ads;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfyy {
    public static int zza(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZzb = zzfzg.zzb(obj);
        int i10 = iZzb & i;
        int iZzc = zzc(obj3, i10);
        if (iZzc != 0) {
            int i11 = ~i;
            int i12 = iZzb & i11;
            int i13 = -1;
            while (true) {
                int i14 = iZzc - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i;
                if ((i15 & i11) != i12 || !zzfwn.zza(obj, objArr[i14]) || (objArr2 != null && !zzfwn.zza(obj2, objArr2[i14]))) {
                    if (i16 == 0) {
                        break;
                    }
                    i13 = i14;
                    iZzc = i16;
                } else {
                    if (i13 == -1) {
                        zze(obj3, i10, i16);
                        return i14;
                    }
                    iArr[i13] = (iArr[i13] & i11) | (i16 & i);
                    return i14;
                }
            }
        }
        return -1;
    }

    public static int zzc(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(v.f(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static void zze(Object obj, int i, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwj {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzwj(int i) {
        this(0, new Random());
    }

    public final int zza() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int zzb() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zzc() {
        return this.zzb.length;
    }

    public final int zzd(int i) {
        int i10 = this.zzc[i] + 1;
        int[] iArr = this.zzb;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int zze(int i) {
        int i10 = this.zzc[i] - 1;
        if (i10 >= 0) {
            return this.zzb[i10];
        }
        return -1;
    }

    public final zzwj zzf() {
        return new zzwj(0, new Random(this.zza.nextLong()));
    }

    public final zzwj zzg(int i, int i10) {
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i10) {
            iArr[i12] = this.zza.nextInt(this.zzb.length + 1);
            int i13 = i12 + 1;
            int iNextInt = this.zza.nextInt(i13);
            iArr2[i12] = iArr2[iNextInt];
            iArr2[iNextInt] = i12;
            i12 = i13;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.zzb.length + i10];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr4 = this.zzb;
            if (i11 >= iArr4.length + i10) {
                return new zzwj(iArr3, new Random(this.zza.nextLong()));
            }
            if (i14 >= i10 || i15 != iArr[i14]) {
                int i16 = i15 + 1;
                int i17 = iArr4[i15];
                iArr3[i11] = i17;
                if (i17 >= 0) {
                    iArr3[i11] = i17 + i10;
                }
                i15 = i16;
            } else {
                iArr3[i11] = iArr2[i14];
                i14++;
            }
            i11++;
        }
    }

    public final zzwj zzh(int i, int i10) {
        int[] iArr = new int[this.zzb.length - i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.zzb;
            if (i11 >= iArr2.length) {
                return new zzwj(iArr, new Random(this.zza.nextLong()));
            }
            int i13 = iArr2[i11];
            if (i13 < 0 || i13 >= i10) {
                int i14 = i11 - i12;
                if (i13 >= 0) {
                    i13 -= i10;
                }
                iArr[i14] = i13;
            } else {
                i12++;
            }
            i11++;
        }
    }

    private zzwj(int i, Random random) {
        this(new int[0], random);
    }

    private zzwj(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.zzc[iArr[i]] = i;
        }
    }
}

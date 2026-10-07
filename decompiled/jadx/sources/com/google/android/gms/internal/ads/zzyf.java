package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyf {
    private final int[] zza;
    private final zzwr[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzwr zze;

    public zzyf(String[] strArr, int[] iArr, zzwr[] zzwrVarArr, int[] iArr2, int[][][] iArr3, zzwr zzwrVar) {
        this.zza = iArr;
        this.zzb = zzwrVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzwrVar;
    }

    public final int zza(int i, int i10, boolean z4) {
        int i11 = this.zzb[i].zzb(i10).zza;
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if ((this.zzd[i][i10][i14] & 7) == 4) {
                iArr[i13] = i14;
                i13++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
        String str = null;
        int i15 = 0;
        int iMin = 16;
        boolean z10 = false;
        while (i12 < iArrCopyOf.length) {
            String str2 = this.zzb[i].zzb(i10).zzb(iArrCopyOf[i12]).zzo;
            int i16 = i15 + 1;
            if (i15 == 0) {
                str = str2;
            } else {
                z10 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i][i10][i12] & 24);
            i12++;
            i15 = i16;
        }
        return z10 ? Math.min(iMin, this.zzc[i]) : iMin;
    }

    public final int zzb(int i, int i10, int i11) {
        return this.zzd[i][i10][i11];
    }

    public final int zzc(int i) {
        return this.zza[i];
    }

    public final zzwr zzd(int i) {
        return this.zzb[i];
    }

    public final zzwr zze() {
        return this.zze;
    }
}

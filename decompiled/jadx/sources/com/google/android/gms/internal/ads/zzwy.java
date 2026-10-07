package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwy extends zzxa {
    public zzwy(zzbw zzbwVar, int[] iArr, int i, zzyr zzyrVar, long j4, long j10, long j11, int i10, int i11, float f10, float f11, List list, zzdc zzdcVar) {
        super(zzbwVar, iArr, 0);
        zzfzo.zzl(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ zzfzo zzf(zzyc[] zzycVarArr) {
        int i;
        int i10;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i = 1;
            if (i12 >= 2) {
                break;
            }
            zzyc zzycVar = zzycVarArr[i12];
            if (zzycVar == null || zzycVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfzl zzfzlVar = new zzfzl();
                zzfzlVar.zzf(new zzww(0L, 0L));
                arrayList.add(zzfzlVar);
            }
            i12++;
        }
        long[][] jArr2 = new long[2][];
        for (int i13 = 0; i13 < 2; i13++) {
            zzyc zzycVar2 = zzycVarArr[i13];
            if (zzycVar2 == null) {
                jArr2[i13] = new long[0];
            } else {
                jArr2[i13] = new long[zzycVar2.zzb.length];
                int i14 = 0;
                while (true) {
                    int[] iArr = zzycVar2.zzb;
                    if (i14 >= iArr.length) {
                        break;
                    }
                    long j4 = zzycVar2.zza.zzb(iArr[i14]).zzj;
                    long[] jArr3 = jArr2[i13];
                    if (j4 == -1) {
                        j4 = 0;
                    }
                    jArr3[i14] = j4;
                    i14++;
                }
                Arrays.sort(jArr2[i13]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i15 = 0; i15 < 2; i15++) {
            long[] jArr5 = jArr2[i15];
            jArr4[i15] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzg(arrayList, jArr4);
        zzfzz zzfzzVarZza = zzgau.zzc(zzgaz.zzc()).zzb(2).zza();
        int i16 = 0;
        while (i16 < 2) {
            int length = jArr2[i16].length;
            if (length <= i) {
                i10 = i11;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i17 = i11;
                while (true) {
                    long[] jArr6 = jArr2[i16];
                    double dLog = 0.0d;
                    if (i17 >= jArr6.length) {
                        break;
                    }
                    int i18 = i11;
                    long[][] jArr7 = jArr2;
                    long j10 = jArr6[i17];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i17] = dLog;
                    i17++;
                    i11 = i18;
                    jArr2 = jArr7;
                }
                i10 = i11;
                jArr = jArr2;
                int i19 = length - 1;
                double d10 = dArr[i19] - dArr[i10];
                int i20 = i10;
                while (i20 < i19) {
                    double d11 = dArr[i20];
                    i20++;
                    zzfzzVarZza.zzq(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i20]) * 0.5d) - dArr[i10]) / d10), Integer.valueOf(i16));
                    i = i;
                }
            }
            i16++;
            i11 = i10;
            jArr2 = jArr;
            i = i;
        }
        int i21 = i11;
        long[][] jArr8 = jArr2;
        zzfzo zzfzoVarZzl = zzfzo.zzl(zzfzzVarZza.zzr());
        for (int i22 = i21; i22 < zzfzoVarZzl.size(); i22++) {
            int iIntValue = ((Integer) zzfzoVarZzl.get(i22)).intValue();
            int i23 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i23;
            jArr4[iIntValue] = jArr8[iIntValue][i23];
            zzg(arrayList, jArr4);
        }
        for (int i24 = i21; i24 < 2; i24++) {
            if (arrayList.get(i24) != null) {
                long j11 = jArr4[i24];
                jArr4[i24] = j11 + j11;
            }
        }
        zzg(arrayList, jArr4);
        zzfzl zzfzlVar2 = new zzfzl();
        while (i21 < arrayList.size()) {
            zzfzl zzfzlVar3 = (zzfzl) arrayList.get(i21);
            zzfzlVar2.zzf(zzfzlVar3 == null ? zzfzo.zzn() : zzfzlVar3.zzi());
            i21++;
        }
        return zzfzlVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j4 = 0;
        for (int i = 0; i < 2; i++) {
            j4 += jArr[i];
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzfzl zzfzlVar = (zzfzl) list.get(i10);
            if (zzfzlVar != null) {
                zzfzlVar.zzf(new zzww(j4, jArr[i10]));
            }
        }
    }
}

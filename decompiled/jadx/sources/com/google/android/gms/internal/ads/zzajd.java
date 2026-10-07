package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzajd {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzadu zza(zzacs zzacsVar) throws IOException {
        return zzc(zzacsVar, true, false);
    }

    public static zzadu zzb(zzacs zzacsVar, boolean z4) throws IOException {
        return zzc(zzacsVar, false, z4);
    }

    private static zzadu zzc(zzacs zzacsVar, boolean z4, boolean z10) throws IOException {
        zzadu zzaduVar;
        int i;
        int i10;
        int[] iArr;
        long jZzd = zzacsVar.zzd();
        long j4 = -1;
        long j10 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j10 = jZzd;
        }
        zzed zzedVar = new zzed(64);
        int i11 = (int) j10;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        while (true) {
            if (i13 < i11) {
                zzedVar.zzI(8);
                boolean z12 = true;
                if (zzacsVar.zzm(zzedVar.zzN(), i12, 8, true)) {
                    long jZzu = zzedVar.zzu();
                    int iZzg = zzedVar.zzg();
                    if (jZzu == 1) {
                        j4 = j4;
                        zzacsVar.zzh(zzedVar.zzN(), 8, 8);
                        i = 16;
                        zzedVar.zzK(16);
                        jZzu = zzedVar.zzt();
                    } else {
                        j4 = j4;
                        if (jZzu == 0) {
                            long jZzd2 = zzacsVar.zzd();
                            if (jZzd2 != j4) {
                                jZzu = (jZzd2 - zzacsVar.zze()) + 8;
                            }
                        }
                        i = 8;
                    }
                    long j11 = jZzu;
                    zzaduVar = null;
                    long j12 = i;
                    if (j11 < j12) {
                        return new zzaic(iZzg, j11, i);
                    }
                    i13 += i;
                    if (iZzg == 1836019574) {
                        i11 += (int) j11;
                        if (jZzd != -1 && i11 > jZzd) {
                            i11 = (int) jZzd;
                        }
                        i12 = 0;
                    } else {
                        if (iZzg == 1836019558 || iZzg == 1836475768) {
                            i12 = 1;
                            break;
                        }
                        z11 |= !(iZzg != 1835295092);
                        long j13 = jZzd;
                        if ((((long) i13) + j11) - j12 >= i11) {
                            i12 = 0;
                            break;
                        }
                        int i14 = (int) (j11 - j12);
                        i13 += i14;
                        if (iZzg != 1718909296) {
                            i10 = 0;
                            if (i14 != 0) {
                                zzacsVar.zzg(i14);
                            }
                        } else {
                            if (i14 < 8) {
                                return new zzaic(1718909296, i14, 8);
                            }
                            zzedVar.zzI(i14);
                            i10 = 0;
                            zzacsVar.zzh(zzedVar.zzN(), 0, i14);
                            int iZzg2 = zzedVar.zzg();
                            boolean zZzd = zzd(iZzg2, z10) | z11;
                            zzedVar.zzM(4);
                            int iZzb = zzedVar.zzb() / 4;
                            if (!zZzd && iZzb > 0) {
                                iArr = new int[iZzb];
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= iZzb) {
                                        z12 = zZzd;
                                        break;
                                    }
                                    int iZzg3 = zzedVar.zzg();
                                    iArr[i15] = iZzg3;
                                    if (zzd(iZzg3, z10)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                z12 = zZzd;
                                iArr = null;
                            }
                            if (!z12) {
                                return new zzaji(iZzg2, iArr);
                            }
                            z11 = z12;
                        }
                        i12 = i10;
                        jZzd = j13;
                    }
                }
            }
            zzaduVar = null;
            break;
        }
        if (!z11) {
            return zzaiz.zza;
        }
        if (z4 != i12) {
            return i12 != 0 ? zzaiu.zza : zzaiu.zzb;
        }
        return zzaduVar;
    }

    private static boolean zzd(int i, boolean z4) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z4) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i10 = 0; i10 < 29; i10++) {
            if (iArr[i10] == i) {
                return true;
            }
        }
        return false;
    }
}

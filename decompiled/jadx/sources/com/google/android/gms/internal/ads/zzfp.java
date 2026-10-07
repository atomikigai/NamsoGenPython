package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfp {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i10, boolean[] zArr) {
        int i11 = i10 - i;
        zzdb.zzf(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            zzh(zArr);
            return i - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i] == 1) {
            zzh(zArr);
            return i - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzh(zArr);
            return i - 1;
        }
        int i12 = i10 - 1;
        int i13 = i + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    zzh(zArr);
                    return i14;
                }
                i13 = i14;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static int zzb(byte[] bArr, int i) {
        int i10;
        synchronized (zzc) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i) {
                while (true) {
                    try {
                        if (i11 >= i - 2) {
                            i11 = i;
                            break;
                        }
                        int i13 = i11 + 1;
                        if (bArr[i11] == 0 && bArr[i13] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11 = i13;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i12) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i - i12;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = zzd[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i10 - i15);
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:155:0x02de  */
    /* JADX WARN: Code duplicated, block: B:161:0x030b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0312 A[LOOP:12: B:162:0x0310->B:163:0x0312, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x0326  */
    /* JADX WARN: Code duplicated, block: B:168:0x032c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0336  */
    /* JADX WARN: Code duplicated, block: B:172:0x0342 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x0348  */
    /* JADX WARN: Code duplicated, block: B:176:0x034c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0351  */
    /* JADX WARN: Code duplicated, block: B:180:0x035e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0367  */
    /* JADX WARN: Code duplicated, block: B:185:0x0372  */
    /* JADX WARN: Code duplicated, block: B:186:0x0374  */
    /* JADX WARN: Code duplicated, block: B:189:0x037b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0391  */
    /* JADX WARN: Code duplicated, block: B:191:0x0394  */
    /* JADX WARN: Code duplicated, block: B:192:0x0396  */
    /* JADX WARN: Code duplicated, block: B:197:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:203:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:206:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118 A[LOOP:0: B:55:0x0116->B:56:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x015a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:75:0x016f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0176  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190 A[LOOP:3: B:81:0x018e->B:82:0x0190, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0198  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfj zzc(byte[] bArr, int i, int i10, zzfm zzfmVar) {
        boolean z4;
        int iZzc;
        int i11;
        int iZzj;
        int i12;
        int iZzc2;
        int iZzc3;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzc4;
        int iMax;
        boolean z10;
        int i17;
        int iZzc5;
        int i18;
        int[] iArr;
        int[] iArrCopyOf;
        int i19;
        int i20;
        float f10;
        int i21;
        int i22;
        int i23;
        int i24;
        int iZza;
        int iZzb;
        int i25;
        zzfl zzflVar;
        int i26;
        int iZza2;
        int iZza3;
        int iZza4;
        int iZzc6;
        int i27;
        int iZzc7;
        int iZzc8;
        int[] iArr2;
        int i28;
        int[] iArr3;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int iMin;
        int i37;
        int i38;
        int i39;
        zzfh zzfhVar;
        zzfd zzfdVarZzl = zzl(new zzfq(bArr, i, i10));
        zzfq zzfqVar = new zzfq(bArr, i + 2, i10);
        zzfqVar.zzf(4);
        int iZza5 = zzfqVar.zza(3);
        if (zzfdVarZzl.zzb == 0 || iZza5 != 7) {
            z4 = false;
        } else {
            iZza5 = 7;
            z4 = true;
        }
        int i40 = (zzfmVar == null || zzfmVar.zza.isEmpty()) ? 0 : ((zzfc) zzfmVar.zza.get(Math.min(zzfdVarZzl.zzb, zzfmVar.zza.size() - 1))).zza;
        zzfe zzfeVarZzm = null;
        if (!z4) {
            zzfqVar.zze();
            zzfeVarZzm = zzm(zzfqVar, true, iZza5, null);
        } else if (zzfmVar != null) {
            zzff zzffVar = zzfmVar.zzb;
            int i41 = zzffVar.zzb[i40];
            if (zzffVar.zza.size() > i41) {
                zzfeVarZzm = (zzfe) zzfmVar.zzb.zza.get(i41);
            }
        }
        int i42 = i40;
        int iZzc9 = zzfqVar.zzc();
        if (z4) {
            int iZza6 = zzfqVar.zzh() ? zzfqVar.zza(8) : -1;
            if (zzfmVar != null && (zzfhVar = zzfmVar.zzc) != null) {
                if (iZza6 == -1) {
                    iZza6 = zzfhVar.zzb[i42];
                }
                if (iZza6 != -1 && zzfhVar.zza.size() > iZza6) {
                    zzfg zzfgVar = (zzfg) zzfmVar.zzc.zza.get(iZza6);
                    iZzc = zzfgVar.zza;
                    i12 = zzfgVar.zzd;
                    iZzj = zzfgVar.zze;
                    iZzc2 = zzfgVar.zzb;
                    iZzc3 = zzfgVar.zzc;
                }
                iZzc4 = zzfqVar.zzc();
                if (z4 == 0) {
                    if (true != zzfqVar.zzh()) {
                        i39 = iZza5;
                    } else {
                        i39 = 0;
                    }
                    iMax = -1;
                    while (i39 <= iZza5) {
                        zzfqVar.zzc();
                        iMax = Math.max(zzfqVar.zzc(), iMax);
                        zzfqVar.zzc();
                        i39++;
                        z4 = z4;
                    }
                } else {
                    iMax = -1;
                }
                z10 = z4;
                zzfqVar.zzc();
                zzfqVar.zzc();
                zzfqVar.zzc();
                zzfqVar.zzc();
                zzfqVar.zzc();
                zzfqVar.zzc();
                if (zzfqVar.zzh()) {
                    i33 = 6;
                    if (!z10 && zzfqVar.zzh()) {
                        zzfqVar.zzf(6);
                    } else if (zzfqVar.zzh()) {
                        i34 = 0;
                        i35 = 4;
                        while (i34 < i35) {
                            int i43 = i35;
                            i36 = 0;
                            while (i36 < i33) {
                                if (zzfqVar.zzh()) {
                                    iMin = Math.min(64, 1 << ((i34 + i34) + 4));
                                    if (i34 > 1) {
                                        zzfqVar.zzb();
                                    }
                                    for (i37 = 0; i37 < iMin; i37++) {
                                        zzfqVar.zzb();
                                    }
                                } else {
                                    zzfqVar.zzc();
                                }
                                if (i34 == 3) {
                                    i38 = 3;
                                } else {
                                    i38 = 1;
                                }
                                i36 += i38;
                                iZzc4 = iZzc4;
                                i33 = 6;
                            }
                            i34++;
                            i35 = i43;
                            i33 = 6;
                        }
                    }
                }
                i17 = iZzc4;
                zzfqVar.zzf(2);
                if (zzfqVar.zzh()) {
                    zzfqVar.zzf(8);
                    zzfqVar.zzc();
                    zzfqVar.zzc();
                    zzfqVar.zze();
                }
                iZzc5 = zzfqVar.zzc();
                i18 = 0;
                iArr = new int[0];
                iArrCopyOf = new int[0];
                i19 = -1;
                i20 = -1;
                while (i18 < iZzc5) {
                    if (i18 == 0 && zzfqVar.zzh()) {
                        int i44 = i19 + i20;
                        boolean zZzh = zzfqVar.zzh();
                        boolean z11 = true;
                        int iZzc10 = zzfqVar.zzc() + 1;
                        int i45 = 1 - ((zZzh ? 1 : 0) + (zZzh ? 1 : 0));
                        int i46 = i44 + 1;
                        boolean[] zArr = new boolean[i46];
                        int i47 = 0;
                        while (i47 <= i44) {
                            if (zzfqVar.zzh()) {
                                zArr[i47] = z11;
                            } else {
                                zArr[i47] = zzfqVar.zzh();
                            }
                            i47++;
                            z11 = true;
                        }
                        int i48 = i20 - 1;
                        int[] iArr4 = new int[i46];
                        int[] iArr5 = new int[i46];
                        int i49 = 0;
                        while (true) {
                            i32 = i45 * iZzc10;
                            if (i48 < 0) {
                                break;
                            }
                            int i50 = iArrCopyOf[i48] + i32;
                            if (i50 < 0 && zArr[i19 + i48]) {
                                iArr4[i49] = i50;
                                i49++;
                            }
                            i48--;
                        }
                        if (i32 < 0 && zArr[i44]) {
                            iArr4[i49] = i32;
                            i49++;
                        }
                        int i51 = i49;
                        for (int i52 = 0; i52 < i19; i52++) {
                            int i53 = iArr[i52] + i32;
                            if (i53 < 0 && zArr[i52]) {
                                iArr4[i51] = i53;
                                i51++;
                            }
                        }
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i51);
                        int i54 = 0;
                        for (int i55 = i19 - 1; i55 >= 0; i55--) {
                            int i56 = iArr[i55] + i32;
                            if (i56 > 0 && zArr[i55]) {
                                iArr5[i54] = i56;
                                i54++;
                            }
                        }
                        if (i32 > 0 && zArr[i44]) {
                            iArr5[i54] = i32;
                            i54++;
                        }
                        iArr = iArrCopyOf2;
                        int i57 = i54;
                        for (int i58 = 0; i58 < i20; i58++) {
                            int i59 = iArrCopyOf[i58] + i32;
                            if (i59 > 0 && zArr[i19 + i58]) {
                                iArr5[i57] = i59;
                                i57++;
                            }
                        }
                        iArrCopyOf = Arrays.copyOf(iArr5, i57);
                        i19 = i51;
                        i20 = i57;
                    } else {
                        iZzc7 = zzfqVar.zzc();
                        iZzc8 = zzfqVar.zzc();
                        iArr2 = new int[iZzc7];
                        for (i28 = 0; i28 < iZzc7; i28++) {
                            if (i28 > 0) {
                                i31 = iArr2[i28 - 1];
                            } else {
                                i31 = 0;
                            }
                            iArr2[i28] = i31 - (zzfqVar.zzc() + 1);
                            zzfqVar.zze();
                        }
                        iArr3 = new int[iZzc8];
                        for (i29 = 0; i29 < iZzc8; i29++) {
                            if (i29 > 0) {
                                i30 = iArr3[i29 - 1];
                            } else {
                                i30 = 0;
                            }
                            iArr3[i29] = zzfqVar.zzc() + 1 + i30;
                            zzfqVar.zze();
                        }
                        iArr = iArr2;
                        iArrCopyOf = iArr3;
                        i19 = iZzc7;
                        i20 = iZzc8;
                    }
                    i18++;
                    iZzc5 = iZzc5;
                    zzfeVarZzm = zzfeVarZzm;
                    zzfdVarZzl = zzfdVarZzl;
                }
                zzfd zzfdVar = zzfdVarZzl;
                zzfe zzfeVar = zzfeVarZzm;
                if (zzfqVar.zzh()) {
                    iZzc6 = zzfqVar.zzc();
                    for (i27 = 0; i27 < iZzc6; i27++) {
                        zzfqVar.zzf(i17 + 5);
                    }
                }
                zzfqVar.zzf(2);
                f10 = 1.0f;
                if (zzfqVar.zzh()) {
                    if (zzfqVar.zzh()) {
                        iZza2 = zzfqVar.zza(8);
                        if (iZza2 == 255) {
                            iZza3 = zzfqVar.zza(16);
                            iZza4 = zzfqVar.zza(16);
                            if (iZza3 != 0 && iZza4 != 0) {
                                f10 = iZza3 / iZza4;
                            }
                        } else if (iZza2 < 17) {
                            f10 = zzb[iZza2];
                        } else {
                            q1.a.o(iZza2, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (zzfqVar.zzh()) {
                        zzfqVar.zze();
                    }
                    if (zzfqVar.zzh()) {
                        zzfqVar.zzf(3);
                        if (true != zzfqVar.zzh()) {
                            i25 = 2;
                        } else {
                            i25 = 1;
                        }
                        if (zzfqVar.zzh()) {
                            int iZza7 = zzfqVar.zza(8);
                            int iZza8 = zzfqVar.zza(8);
                            zzfqVar.zzf(8);
                            iZza = zzm.zza(iZza7);
                            iZzb = zzm.zzb(iZza8);
                        } else {
                            iZza = -1;
                            iZzb = -1;
                        }
                    } else if (zzfmVar != null || (zzflVar = zzfmVar.zzd) == null || zzflVar.zza.size() <= (i26 = zzflVar.zzb[i42])) {
                        iZza = -1;
                        iZzb = -1;
                        i25 = -1;
                    } else {
                        zzfk zzfkVar = (zzfk) zzfmVar.zzd.zza.get(i26);
                        int i60 = zzfkVar.zza;
                        int i61 = zzfkVar.zzb;
                        iZzb = zzfkVar.zzc;
                        iZza = i60;
                        i25 = i61;
                    }
                    if (zzfqVar.zzh()) {
                        zzfqVar.zzc();
                        zzfqVar.zzc();
                    }
                    zzfqVar.zze();
                    if (zzfqVar.zzh()) {
                        iZzj += iZzj;
                    }
                    i22 = iZza;
                    i24 = iZzb;
                    i23 = i25;
                    i21 = iZzj;
                } else {
                    i21 = iZzj;
                    i22 = -1;
                    i23 = -1;
                    i24 = -1;
                }
                return new zzfj(zzfdVar, zzfeVar, i16, i15, i14, iZzc9, i13, i21, f10, iMax, i22, i23, i24);
            }
            i16 = 0;
            i15 = 0;
            i14 = 0;
            i13 = 0;
            iZzj = 0;
            iZzc4 = zzfqVar.zzc();
            if (z4 == 0) {
                if (true != zzfqVar.zzh()) {
                    i39 = iZza5;
                } else {
                    i39 = 0;
                }
                iMax = -1;
                while (i39 <= iZza5) {
                    zzfqVar.zzc();
                    iMax = Math.max(zzfqVar.zzc(), iMax);
                    zzfqVar.zzc();
                    i39++;
                    z4 = z4;
                }
            } else {
                iMax = -1;
            }
            z10 = z4;
            zzfqVar.zzc();
            zzfqVar.zzc();
            zzfqVar.zzc();
            zzfqVar.zzc();
            zzfqVar.zzc();
            zzfqVar.zzc();
            if (zzfqVar.zzh()) {
                i33 = 6;
                if (!z10) {
                    if (zzfqVar.zzh()) {
                        i34 = 0;
                        i35 = 4;
                        while (i34 < i35) {
                            int i410 = i35;
                            i36 = 0;
                            while (i36 < i33) {
                                if (zzfqVar.zzh()) {
                                    zzfqVar.zzc();
                                } else {
                                    iMin = Math.min(64, 1 << ((i34 + i34) + 4));
                                    if (i34 > 1) {
                                        zzfqVar.zzb();
                                    }
                                    while (i37 < iMin) {
                                        zzfqVar.zzb();
                                    }
                                }
                                if (i34 == 3) {
                                    i38 = 3;
                                } else {
                                    i38 = 1;
                                }
                                i36 += i38;
                                iZzc4 = iZzc4;
                                i33 = 6;
                            }
                            i34++;
                            i35 = i410;
                            i33 = 6;
                        }
                    }
                } else if (zzfqVar.zzh()) {
                    i34 = 0;
                    i35 = 4;
                    while (i34 < i35) {
                        int i411 = i35;
                        i36 = 0;
                        while (i36 < i33) {
                            if (zzfqVar.zzh()) {
                                zzfqVar.zzc();
                            } else {
                                iMin = Math.min(64, 1 << ((i34 + i34) + 4));
                                if (i34 > 1) {
                                    zzfqVar.zzb();
                                }
                                while (i37 < iMin) {
                                    zzfqVar.zzb();
                                }
                            }
                            if (i34 == 3) {
                                i38 = 3;
                            } else {
                                i38 = 1;
                            }
                            i36 += i38;
                            iZzc4 = iZzc4;
                            i33 = 6;
                        }
                        i34++;
                        i35 = i411;
                        i33 = 6;
                    }
                }
            }
            i17 = iZzc4;
            zzfqVar.zzf(2);
            if (zzfqVar.zzh()) {
                zzfqVar.zzf(8);
                zzfqVar.zzc();
                zzfqVar.zzc();
                zzfqVar.zze();
            }
            iZzc5 = zzfqVar.zzc();
            i18 = 0;
            iArr = new int[0];
            iArrCopyOf = new int[0];
            i19 = -1;
            i20 = -1;
            while (i18 < iZzc5) {
                if (i18 == 0) {
                    iZzc7 = zzfqVar.zzc();
                    iZzc8 = zzfqVar.zzc();
                    iArr2 = new int[iZzc7];
                    while (i28 < iZzc7) {
                        if (i28 > 0) {
                            i31 = iArr2[i28 - 1];
                        } else {
                            i31 = 0;
                        }
                        iArr2[i28] = i31 - (zzfqVar.zzc() + 1);
                        zzfqVar.zze();
                    }
                    iArr3 = new int[iZzc8];
                    while (i29 < iZzc8) {
                        if (i29 > 0) {
                            i30 = iArr3[i29 - 1];
                        } else {
                            i30 = 0;
                        }
                        iArr3[i29] = zzfqVar.zzc() + 1 + i30;
                        zzfqVar.zze();
                    }
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i19 = iZzc7;
                    i20 = iZzc8;
                } else {
                    iZzc7 = zzfqVar.zzc();
                    iZzc8 = zzfqVar.zzc();
                    iArr2 = new int[iZzc7];
                    while (i28 < iZzc7) {
                        if (i28 > 0) {
                            i31 = iArr2[i28 - 1];
                        } else {
                            i31 = 0;
                        }
                        iArr2[i28] = i31 - (zzfqVar.zzc() + 1);
                        zzfqVar.zze();
                    }
                    iArr3 = new int[iZzc8];
                    while (i29 < iZzc8) {
                        if (i29 > 0) {
                            i30 = iArr3[i29 - 1];
                        } else {
                            i30 = 0;
                        }
                        iArr3[i29] = zzfqVar.zzc() + 1 + i30;
                        zzfqVar.zze();
                    }
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i19 = iZzc7;
                    i20 = iZzc8;
                }
                i18++;
                iZzc5 = iZzc5;
                zzfeVarZzm = zzfeVarZzm;
                zzfdVarZzl = zzfdVarZzl;
            }
            zzfd zzfdVar2 = zzfdVarZzl;
            zzfe zzfeVar2 = zzfeVarZzm;
            if (zzfqVar.zzh()) {
                iZzc6 = zzfqVar.zzc();
                while (i27 < iZzc6) {
                    zzfqVar.zzf(i17 + 5);
                }
            }
            zzfqVar.zzf(2);
            f10 = 1.0f;
            if (zzfqVar.zzh()) {
                if (zzfqVar.zzh()) {
                    iZza2 = zzfqVar.zza(8);
                    if (iZza2 == 255) {
                        iZza3 = zzfqVar.zza(16);
                        iZza4 = zzfqVar.zza(16);
                        if (iZza3 != 0) {
                            f10 = iZza3 / iZza4;
                        }
                    } else if (iZza2 < 17) {
                        f10 = zzb[iZza2];
                    } else {
                        q1.a.o(iZza2, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (zzfqVar.zzh()) {
                    zzfqVar.zze();
                }
                if (zzfqVar.zzh()) {
                    zzfqVar.zzf(3);
                    if (true != zzfqVar.zzh()) {
                        i25 = 2;
                    } else {
                        i25 = 1;
                    }
                    if (zzfqVar.zzh()) {
                        int iZza9 = zzfqVar.zza(8);
                        int iZza10 = zzfqVar.zza(8);
                        zzfqVar.zzf(8);
                        iZza = zzm.zza(iZza9);
                        iZzb = zzm.zzb(iZza10);
                    } else {
                        iZza = -1;
                        iZzb = -1;
                    }
                } else if (zzfmVar != null) {
                    iZza = -1;
                    iZzb = -1;
                    i25 = -1;
                } else {
                    iZza = -1;
                    iZzb = -1;
                    i25 = -1;
                }
                if (zzfqVar.zzh()) {
                    zzfqVar.zzc();
                    zzfqVar.zzc();
                }
                zzfqVar.zze();
                if (zzfqVar.zzh()) {
                    iZzj += iZzj;
                }
                i22 = iZza;
                i24 = iZzb;
                i23 = i25;
                i21 = iZzj;
            } else {
                i21 = iZzj;
                i22 = -1;
                i23 = -1;
                i24 = -1;
            }
            return new zzfj(zzfdVar2, zzfeVar2, i16, i15, i14, iZzc9, i13, i21, f10, iMax, i22, i23, i24);
        }
        iZzc = zzfqVar.zzc();
        if (iZzc == 3) {
            zzfqVar.zze();
            i11 = 3;
        } else {
            i11 = iZzc;
        }
        int iZzc11 = zzfqVar.zzc();
        int iZzc12 = zzfqVar.zzc();
        if (zzfqVar.zzh()) {
            int iZzc13 = zzfqVar.zzc();
            int iZzc14 = zzfqVar.zzc();
            int iZzc15 = zzfqVar.zzc();
            int iZzc16 = zzfqVar.zzc();
            int iZzk = zzk(iZzc11, i11, iZzc13, iZzc14);
            iZzj = zzj(iZzc12, i11, iZzc15, iZzc16);
            i12 = iZzk;
        } else {
            iZzj = iZzc12;
            i12 = iZzc11;
        }
        iZzc2 = zzfqVar.zzc();
        iZzc3 = zzfqVar.zzc();
        i16 = iZzc;
        i13 = i12;
        i14 = iZzc3;
        i15 = iZzc2;
        iZzc4 = zzfqVar.zzc();
        if (z4 == 0) {
            if (true != zzfqVar.zzh()) {
                i39 = iZza5;
            } else {
                i39 = 0;
            }
            iMax = -1;
            while (i39 <= iZza5) {
                zzfqVar.zzc();
                iMax = Math.max(zzfqVar.zzc(), iMax);
                zzfqVar.zzc();
                i39++;
                z4 = z4;
            }
        } else {
            iMax = -1;
        }
        z10 = z4;
        zzfqVar.zzc();
        zzfqVar.zzc();
        zzfqVar.zzc();
        zzfqVar.zzc();
        zzfqVar.zzc();
        zzfqVar.zzc();
        if (zzfqVar.zzh()) {
            i33 = 6;
            if (!z10) {
                if (zzfqVar.zzh()) {
                    i34 = 0;
                    i35 = 4;
                    while (i34 < i35) {
                        int i412 = i35;
                        i36 = 0;
                        while (i36 < i33) {
                            if (zzfqVar.zzh()) {
                                zzfqVar.zzc();
                            } else {
                                iMin = Math.min(64, 1 << ((i34 + i34) + 4));
                                if (i34 > 1) {
                                    zzfqVar.zzb();
                                }
                                while (i37 < iMin) {
                                    zzfqVar.zzb();
                                }
                            }
                            if (i34 == 3) {
                                i38 = 3;
                            } else {
                                i38 = 1;
                            }
                            i36 += i38;
                            iZzc4 = iZzc4;
                            i33 = 6;
                        }
                        i34++;
                        i35 = i412;
                        i33 = 6;
                    }
                }
            } else if (zzfqVar.zzh()) {
                i34 = 0;
                i35 = 4;
                while (i34 < i35) {
                    int i413 = i35;
                    i36 = 0;
                    while (i36 < i33) {
                        if (zzfqVar.zzh()) {
                            zzfqVar.zzc();
                        } else {
                            iMin = Math.min(64, 1 << ((i34 + i34) + 4));
                            if (i34 > 1) {
                                zzfqVar.zzb();
                            }
                            while (i37 < iMin) {
                                zzfqVar.zzb();
                            }
                        }
                        if (i34 == 3) {
                            i38 = 3;
                        } else {
                            i38 = 1;
                        }
                        i36 += i38;
                        iZzc4 = iZzc4;
                        i33 = 6;
                    }
                    i34++;
                    i35 = i413;
                    i33 = 6;
                }
            }
        }
        i17 = iZzc4;
        zzfqVar.zzf(2);
        if (zzfqVar.zzh()) {
            zzfqVar.zzf(8);
            zzfqVar.zzc();
            zzfqVar.zzc();
            zzfqVar.zze();
        }
        iZzc5 = zzfqVar.zzc();
        i18 = 0;
        iArr = new int[0];
        iArrCopyOf = new int[0];
        i19 = -1;
        i20 = -1;
        while (i18 < iZzc5) {
            if (i18 == 0) {
                iZzc7 = zzfqVar.zzc();
                iZzc8 = zzfqVar.zzc();
                iArr2 = new int[iZzc7];
                while (i28 < iZzc7) {
                    if (i28 > 0) {
                        i31 = iArr2[i28 - 1];
                    } else {
                        i31 = 0;
                    }
                    iArr2[i28] = i31 - (zzfqVar.zzc() + 1);
                    zzfqVar.zze();
                }
                iArr3 = new int[iZzc8];
                while (i29 < iZzc8) {
                    if (i29 > 0) {
                        i30 = iArr3[i29 - 1];
                    } else {
                        i30 = 0;
                    }
                    iArr3[i29] = zzfqVar.zzc() + 1 + i30;
                    zzfqVar.zze();
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i19 = iZzc7;
                i20 = iZzc8;
            } else {
                iZzc7 = zzfqVar.zzc();
                iZzc8 = zzfqVar.zzc();
                iArr2 = new int[iZzc7];
                while (i28 < iZzc7) {
                    if (i28 > 0) {
                        i31 = iArr2[i28 - 1];
                    } else {
                        i31 = 0;
                    }
                    iArr2[i28] = i31 - (zzfqVar.zzc() + 1);
                    zzfqVar.zze();
                }
                iArr3 = new int[iZzc8];
                while (i29 < iZzc8) {
                    if (i29 > 0) {
                        i30 = iArr3[i29 - 1];
                    } else {
                        i30 = 0;
                    }
                    iArr3[i29] = zzfqVar.zzc() + 1 + i30;
                    zzfqVar.zze();
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i19 = iZzc7;
                i20 = iZzc8;
            }
            i18++;
            iZzc5 = iZzc5;
            zzfeVarZzm = zzfeVarZzm;
            zzfdVarZzl = zzfdVarZzl;
        }
        zzfd zzfdVar3 = zzfdVarZzl;
        zzfe zzfeVar3 = zzfeVarZzm;
        if (zzfqVar.zzh()) {
            iZzc6 = zzfqVar.zzc();
            while (i27 < iZzc6) {
                zzfqVar.zzf(i17 + 5);
            }
        }
        zzfqVar.zzf(2);
        f10 = 1.0f;
        if (zzfqVar.zzh()) {
            if (zzfqVar.zzh()) {
                iZza2 = zzfqVar.zza(8);
                if (iZza2 == 255) {
                    iZza3 = zzfqVar.zza(16);
                    iZza4 = zzfqVar.zza(16);
                    if (iZza3 != 0) {
                        f10 = iZza3 / iZza4;
                    }
                } else if (iZza2 < 17) {
                    f10 = zzb[iZza2];
                } else {
                    q1.a.o(iZza2, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (zzfqVar.zzh()) {
                zzfqVar.zze();
            }
            if (zzfqVar.zzh()) {
                zzfqVar.zzf(3);
                if (true != zzfqVar.zzh()) {
                    i25 = 2;
                } else {
                    i25 = 1;
                }
                if (zzfqVar.zzh()) {
                    int iZza11 = zzfqVar.zza(8);
                    int iZza12 = zzfqVar.zza(8);
                    zzfqVar.zzf(8);
                    iZza = zzm.zza(iZza11);
                    iZzb = zzm.zzb(iZza12);
                } else {
                    iZza = -1;
                    iZzb = -1;
                }
            } else if (zzfmVar != null) {
                iZza = -1;
                iZzb = -1;
                i25 = -1;
            } else {
                iZza = -1;
                iZzb = -1;
                i25 = -1;
            }
            if (zzfqVar.zzh()) {
                zzfqVar.zzc();
                zzfqVar.zzc();
            }
            zzfqVar.zze();
            if (zzfqVar.zzh()) {
                iZzj += iZzj;
            }
            i22 = iZza;
            i24 = iZzb;
            i23 = i25;
            i21 = iZzj;
        } else {
            i21 = iZzj;
            i22 = -1;
            i23 = -1;
            i24 = -1;
        }
        return new zzfj(zzfdVar3, zzfeVar3, i16, i15, i14, iZzc9, i13, i21, f10, iMax, i22, i23, i24);
    }

    /* JADX WARN: Code duplicated, block: B:458:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfm zzd(byte[] bArr, int i, int i10) {
        int i11;
        zzfl zzflVar;
        boolean z4;
        int iZza;
        int iZza2;
        int iZza3;
        int iZza4;
        int i12;
        int i13;
        int i14;
        boolean[][] zArr;
        int[] iArr;
        boolean[][] zArr2;
        int[] iArr2;
        int i15;
        int i16;
        boolean zZzh;
        int i17;
        int i18;
        int i19;
        int iZzc;
        int i20;
        int i21;
        int i22;
        boolean z10;
        boolean z11;
        zzfq zzfqVar = new zzfq(bArr, i, i10);
        zzfd zzfdVarZzl = zzl(zzfqVar);
        zzfqVar.zzf(4);
        boolean zZzh2 = zzfqVar.zzh();
        boolean zZzh3 = zzfqVar.zzh();
        int iZza5 = zzfqVar.zza(6);
        int i23 = iZza5 + 1;
        int iZza6 = zzfqVar.zza(3);
        zzfqVar.zzf(17);
        zzfe zzfeVarZzm = zzm(zzfqVar, true, iZza6, null);
        for (int i24 = true != zzfqVar.zzh() ? iZza6 : 0; i24 <= iZza6; i24++) {
            zzfqVar.zzc();
            zzfqVar.zzc();
            zzfqVar.zzc();
        }
        int iZza7 = zzfqVar.zza(6);
        int iZzc2 = zzfqVar.zzc() + 1;
        int i25 = 6;
        zzff zzffVar = new zzff(zzfzo.zzo(zzfeVarZzm), new int[1]);
        boolean z12 = i23 >= 2 && iZzc2 >= 2;
        boolean z13 = zZzh2 && zZzh3;
        int i26 = 1;
        int i27 = iZza7 + 1;
        if (!z12 || !z13 || i27 < i23) {
            return new zzfm(zzfdVarZzl, null, zzffVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iZzc2, i27);
        int[] iArr4 = new int[iZzc2];
        int[] iArr5 = new int[iZzc2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i28 = 1; i28 < iZzc2; i28++) {
            int i29 = 0;
            for (int i30 = 0; i30 <= iZza7; i30++) {
                if (zzfqVar.zzh()) {
                    iArr3[i28][i29] = i30;
                    iArr5[i28] = i30;
                    i29++;
                }
                iArr4[i28] = i29;
            }
        }
        if (zzfqVar.zzh()) {
            zzfqVar.zzf(64);
            if (zzfqVar.zzh()) {
                zzfqVar.zzc();
            }
            int iZzc3 = zzfqVar.zzc();
            int i31 = 0;
            while (i31 < iZzc3) {
                zzfqVar.zzc();
                if (i31 == 0 || zzfqVar.zzh()) {
                    boolean zZzh4 = zzfqVar.zzh();
                    boolean zZzh5 = zzfqVar.zzh();
                    if (zZzh4 || zZzh5) {
                        zZzh = zzfqVar.zzh();
                        iZzc3 = iZzc3;
                        if (zZzh) {
                            zzfqVar.zzf(19);
                        }
                        zzfqVar.zzf(8);
                        if (zZzh) {
                            zzfqVar.zzf(4);
                        }
                        zzfqVar.zzf(15);
                        i18 = zZzh4;
                        i17 = zZzh5;
                    } else {
                        z11 = zZzh4;
                        z10 = zZzh5;
                    }
                    i19 = 0;
                    while (i19 <= iZza6) {
                        if (!zzfqVar.zzh() || zzfqVar.zzh()) {
                            zzfqVar.zzc();
                        } else {
                            if (zzfqVar.zzh()) {
                                iZzc = 0;
                            }
                            zzfd zzfdVar = zzfdVarZzl;
                            i20 = i18 + i17;
                            int[][] iArr6 = iArr3;
                            i21 = 0;
                            while (i21 < i20) {
                                int i32 = i20;
                                for (i22 = 0; i22 <= iZzc; i22++) {
                                    zzfqVar.zzc();
                                    zzfqVar.zzc();
                                    if (zZzh) {
                                        zzfqVar.zzc();
                                        zzfqVar.zzc();
                                    }
                                    zzfqVar.zze();
                                }
                                i21++;
                                i20 = i32;
                            }
                            i19++;
                            zzfdVarZzl = zzfdVar;
                            iArr3 = iArr6;
                        }
                        iZzc = zzfqVar.zzc();
                        zzfd zzfdVar2 = zzfdVarZzl;
                        i20 = i18 + i17;
                        int[][] iArr7 = iArr3;
                        i21 = 0;
                        while (i21 < i20) {
                            int i33 = i20;
                            while (i22 <= iZzc) {
                                zzfqVar.zzc();
                                zzfqVar.zzc();
                                if (zZzh) {
                                    zzfqVar.zzc();
                                    zzfqVar.zzc();
                                }
                                zzfqVar.zze();
                            }
                            i21++;
                            i20 = i33;
                        }
                        i19++;
                        zzfdVarZzl = zzfdVar2;
                        iArr3 = iArr7;
                    }
                    i31++;
                    iZzc3 = iZzc3;
                } else {
                    z11 = false;
                    z10 = false;
                }
                zZzh = false;
                i18 = z11;
                i17 = z10;
                i19 = 0;
                while (i19 <= iZza6) {
                    if (zzfqVar.zzh()) {
                        zzfqVar.zzc();
                        iZzc = zzfqVar.zzc();
                    } else {
                        zzfqVar.zzc();
                        iZzc = zzfqVar.zzc();
                    }
                    zzfd zzfdVar3 = zzfdVarZzl;
                    i20 = i18 + i17;
                    int[][] iArr8 = iArr3;
                    i21 = 0;
                    while (i21 < i20) {
                        int i34 = i20;
                        while (i22 <= iZzc) {
                            zzfqVar.zzc();
                            zzfqVar.zzc();
                            if (zZzh) {
                                zzfqVar.zzc();
                                zzfqVar.zzc();
                            }
                            zzfqVar.zze();
                        }
                        i21++;
                        i20 = i34;
                    }
                    i19++;
                    zzfdVarZzl = zzfdVar3;
                    iArr3 = iArr8;
                }
                i31++;
                iZzc3 = iZzc3;
            }
        }
        zzfd zzfdVar4 = zzfdVarZzl;
        int[][] iArr9 = iArr3;
        if (!zzfqVar.zzh()) {
            return new zzfm(zzfdVar4, null, zzffVar, null, null);
        }
        zzfqVar.zzd();
        zzfe zzfeVarZzm2 = zzm(zzfqVar, false, iZza6, zzfeVarZzm);
        boolean zZzh6 = zzfqVar.zzh();
        boolean[] zArr3 = new boolean[16];
        int i35 = 0;
        for (int i36 = 0; i36 < 16; i36++) {
            boolean zZzh7 = zzfqVar.zzh();
            zArr3[i36] = zZzh7;
            if (zZzh7) {
                i35++;
            }
        }
        if (i35 == 0 || !zArr3[1]) {
            return new zzfm(zzfdVar4, null, zzffVar, null, null);
        }
        int i37 = i35 + 1;
        int[] iArr10 = new int[i35];
        for (int i38 = 0; i38 < i35 - (zZzh6 ? 1 : 0); i38++) {
            iArr10[i38] = zzfqVar.zza(3);
        }
        int[] iArr11 = new int[i37];
        if (zZzh6) {
            for (int i39 = 1; i39 < i35; i39++) {
                for (int i40 = 0; i40 < i39; i40++) {
                    iArr11[i39] = iArr10[i40] + 1 + iArr11[i39];
                }
            }
            iArr11[i35] = 6;
        }
        int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) cls, i23, i35);
        int[] iArr13 = new int[i23];
        iArr13[0] = 0;
        boolean zZzh8 = zzfqVar.zzh();
        int i41 = 1;
        while (i41 < i23) {
            if (zZzh8) {
                iArr13[i41] = zzfqVar.zza(i25);
            } else {
                iArr13[i41] = i41;
            }
            if (zZzh6) {
                i16 = i41;
                int i42 = 0;
                while (i42 < i35) {
                    int i43 = i42 + 1;
                    iArr12[i16][i42] = (iArr13[i16] & ((1 << iArr11[i43]) - 1)) >> iArr11[i42];
                    i42 = i43;
                }
            } else {
                int i44 = 0;
                while (i44 < i35) {
                    iArr12[i41][i44] = zzfqVar.zza(iArr10[i44] + 1);
                    i44++;
                    i41 = i41;
                }
                i16 = i41;
            }
            i41 = i16 + 1;
            i25 = 6;
        }
        int[] iArr14 = new int[i27];
        int i45 = 1;
        int i46 = 0;
        while (i46 < i23) {
            iArr14[iArr13[i46]] = -1;
            int[] iArr15 = iArr14;
            int i47 = 0;
            int i48 = 0;
            while (i47 < 16) {
                if (zArr3[i47]) {
                    i15 = i26;
                    if (i47 == i15) {
                        iArr15[iArr13[i46]] = iArr12[i46][i48];
                        i47 = i15;
                    }
                    i48++;
                } else {
                    i15 = i26;
                }
                i47 += i15;
                i26 = i15;
            }
            if (i46 > 0) {
                int i49 = 0;
                while (true) {
                    if (i49 >= i46) {
                        i45++;
                        break;
                    }
                    if (iArr15[iArr13[i46]] == iArr15[iArr13[i49]]) {
                        break;
                    }
                    i49++;
                }
            }
            i46++;
            iArr14 = iArr15;
            i26 = 1;
        }
        int[] iArr16 = iArr14;
        int iZza8 = zzfqVar.zza(4);
        if (i45 < 2 || iZza8 == 0) {
            return new zzfm(zzfdVar4, null, zzffVar, null, null);
        }
        int[] iArr17 = new int[i45];
        for (int i50 = 0; i50 < i45; i50++) {
            iArr17[i50] = zzfqVar.zza(iZza8);
        }
        int[] iArr18 = new int[i27];
        for (int i51 = 0; i51 < i23; i51++) {
            iArr18[Math.min(iArr13[i51], iZza7)] = i51;
        }
        zzfzl zzfzlVar = new zzfzl();
        int i52 = 0;
        while (i52 <= iZza7) {
            int[] iArr19 = iArr17;
            int i53 = i45;
            int iMin = Math.min(iArr16[i52], i53 - 1);
            int[] iArr20 = iArr18;
            zzfzlVar.zzf(new zzfc(iArr20[i52], iMin >= 0 ? iArr19[iMin] : -1));
            i52++;
            i45 = i53;
            iArr17 = iArr19;
            iArr18 = iArr20;
        }
        zzfzo zzfzoVarZzi = zzfzlVar.zzi();
        if (((zzfc) zzfzoVarZzi.get(0)).zzb == -1) {
            return new zzfm(zzfdVar4, null, zzffVar, null, null);
        }
        int i54 = 1;
        while (true) {
            zzfd zzfdVar5 = zzfdVar4;
            if (i54 > iZza7) {
                zzfdVar4 = zzfdVar5;
                i11 = -1;
                i54 = -1;
                break;
            }
            zzfdVar4 = zzfdVar5;
            i11 = -1;
            if (((zzfc) zzfzoVarZzi.get(i54)).zzb != -1) {
                break;
            }
            i54++;
        }
        if (i54 == i11) {
            return new zzfm(zzfdVar4, null, zzffVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i23, i23);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i23, i23);
        int i55 = 1;
        while (i55 < i23) {
            boolean[][] zArr6 = zArr5;
            for (int i56 = 0; i56 < i55; i56++) {
                boolean[] zArr7 = zArr4[i55];
                boolean[] zArr8 = zArr6[i55];
                boolean zZzh9 = zzfqVar.zzh();
                zArr8[i56] = zZzh9;
                zArr7[i56] = zZzh9;
            }
            i55++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i57 = 1; i57 < i23; i57++) {
            int i58 = 0;
            while (i58 < iZza5) {
                int i59 = i58;
                for (int i60 = 0; i60 < i57; i60++) {
                    boolean[] zArr10 = zArr9[i57];
                    if (zArr10[i60] && zArr9[i60][i59]) {
                        zArr10[i59] = true;
                        break;
                    }
                }
                i58 = i59 + 1;
            }
        }
        int[] iArr21 = new int[i27];
        int i61 = 0;
        while (i61 < i23) {
            int[] iArr22 = iArr21;
            int i62 = 0;
            for (int i63 = 0; i63 < i61; i63++) {
                i62 += zArr4[i61][i63] ? 1 : 0;
            }
            iArr22[iArr13[i61]] = i62;
            i61++;
            iArr21 = iArr22;
        }
        int[] iArr23 = iArr21;
        int i64 = 0;
        for (int i65 = 0; i65 < i23; i65++) {
            if (iArr23[iArr13[i65]] == 0) {
                i64++;
            }
        }
        if (i64 > 1) {
            return new zzfm(zzfdVar4, null, zzffVar, null, null);
        }
        int[] iArr24 = new int[i23];
        int[] iArr25 = new int[iZzc2];
        if (zzfqVar.zzh()) {
            int i66 = 0;
            while (i66 < i23) {
                int i67 = i66;
                iArr24[i67] = zzfqVar.zza(3);
                i66 = i67 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i23, iZza6);
        }
        int i68 = 0;
        while (i68 < iZzc2) {
            int[] iArr26 = iArr24;
            int i69 = i68;
            int[] iArr27 = iArr13;
            int iMax = 0;
            for (int i70 = 0; i70 < iArr4[i69]; i70++) {
                iMax = Math.max(iMax, iArr26[((zzfc) zzfzoVarZzi.get(iArr9[i69][i70])).zza]);
            }
            iArr25[i69] = iMax + 1;
            i68 = i69 + 1;
            iArr24 = iArr26;
            iArr13 = iArr27;
        }
        int[] iArr28 = iArr13;
        if (zzfqVar.zzh()) {
            int i71 = 0;
            while (i71 < iZza5) {
                int i72 = i71 + 1;
                int i73 = i72;
                while (i73 < i23) {
                    if (zArr4[i73][i71]) {
                        zzfqVar.zzf(3);
                    }
                    i73++;
                    i71 = i71;
                }
                i71 = i72;
            }
        }
        zzfqVar.zze();
        int iZzc4 = zzfqVar.zzc() + 1;
        zzfzl zzfzlVar2 = new zzfzl();
        zzfzlVar2.zzf(zzfeVarZzm);
        if (iZzc4 > 1) {
            zzfzlVar2.zzf(zzfeVarZzm2);
            for (int i74 = 2; i74 < iZzc4; i74++) {
                zzfeVarZzm2 = zzm(zzfqVar, zzfqVar.zzh(), iZza6, zzfeVarZzm2);
                zzfzlVar2.zzf(zzfeVarZzm2);
            }
        }
        zzfzo zzfzoVarZzi2 = zzfzlVar2.zzi();
        int iZzc5 = zzfqVar.zzc() + iZzc2;
        if (iZzc5 > iZzc2) {
            return new zzfm(zzfdVar4, null, zzffVar, null, null);
        }
        int iZza9 = zzfqVar.zza(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iZzc5, i27);
        int[] iArr29 = new int[iZzc5];
        int i75 = 0;
        int[] iArr30 = new int[iZzc5];
        int i76 = 0;
        while (i76 < iZzc2) {
            iArr29[i76] = i75;
            int i77 = i76;
            int i78 = iArr5[i77];
            iArr30[i77] = i78;
            if (iZza9 == 0) {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                Arrays.fill(zArr11[i77], i75, iArr4[i77], true);
                iArr2[i77] = iArr4[i77];
            } else {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                if (iZza9 == 1) {
                    for (int i79 = 0; i79 < iArr4[i77]; i79++) {
                        zArr2[i77][i79] = iArr9[i77][i79] == i78;
                    }
                    iArr2[i77] = 1;
                } else {
                    i75 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i76 = i77 + 1;
                iArr5 = iArr;
                zArr11 = zArr2;
                iArr29 = iArr2;
            }
            i75 = 0;
            i76 = i77 + 1;
            iArr5 = iArr;
            zArr11 = zArr2;
            iArr29 = iArr2;
        }
        boolean[][] zArr12 = zArr11;
        int[] iArr31 = iArr29;
        int[] iArr32 = new int[i27];
        int i80 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i27;
        iArr33[i75] = iZzc5;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i81 = 1;
        int i82 = 0;
        while (i81 < iZzc5) {
            if (iZza9 == i80) {
                for (int i83 = 0; i83 < iArr4[i81]; i83++) {
                    zArr12[i81][i83] = zzfqVar.zzh();
                    int i84 = iArr31[i81];
                    boolean z14 = zArr12[i81][i83];
                    iArr31[i81] = i84 + (z14 ? 1 : 0);
                    if (z14) {
                        iArr30[i81] = iArr9[i81][i83];
                    }
                }
            }
            if (i82 == 0) {
                i12 = 0;
                if (iArr9[i81][0] == 0 && zArr12[i81][0]) {
                    i82 = 0;
                    for (int i85 = 1; i85 < iArr4[i81]; i85++) {
                        if (iArr9[i81][i85] == i54 && zArr12[i81][i54]) {
                            i82 = i81;
                        }
                    }
                } else {
                    i82 = 0;
                }
            } else {
                i12 = 0;
            }
            int i86 = i12;
            while (i86 < iArr4[i81]) {
                if (iZzc4 > 1) {
                    zArr13[i81][i86] = zArr12[i81][i86];
                    zArr = zArr4;
                    i13 = iZzc4;
                    int iZza10 = zzgch.zza(iZzc4, RoundingMode.CEILING);
                    if (zArr13[i81][i86]) {
                        i14 = iZza9;
                        break;
                    }
                    int i87 = ((zzfc) zzfzoVarZzi.get(iArr9[i81][i86])).zza;
                    int i88 = i12;
                    while (true) {
                        if (i88 >= i86) {
                            i14 = iZza9;
                            break;
                        }
                        i14 = iZza9;
                        if (zArr9[i87][((zzfc) zzfzoVarZzi.get(iArr9[i81][i88])).zza]) {
                            zArr13[i81][i86] = true;
                            break;
                        }
                        i88++;
                        iZza9 = i14;
                    }
                    if (zArr13[i81][i86]) {
                        if (i82 <= 0 || i81 != i82) {
                            zzfqVar.zzf(iZza10);
                        } else {
                            iArr32[i86] = zzfqVar.zza(iZza10);
                        }
                    }
                } else {
                    i13 = iZzc4;
                    i14 = iZza9;
                    zArr = zArr4;
                }
                i86++;
                zArr4 = zArr;
                iZzc4 = i13;
                iZza9 = i14;
            }
            int i89 = iZzc4;
            int i90 = iZza9;
            boolean[][] zArr14 = zArr4;
            if (iArr31[i81] == 1 && iArr23[iArr30[i81]] > 0) {
                zzfqVar.zze();
            }
            i81++;
            zArr4 = zArr14;
            iZzc4 = i89;
            iZza9 = i90;
            i80 = 2;
        }
        boolean[][] zArr15 = zArr4;
        if (i82 == 0) {
            return new zzfm(zzfdVar4, null, zzffVar, null, null);
        }
        zzfd zzfdVar6 = zzfdVar4;
        int iZzc6 = zzfqVar.zzc();
        int i91 = iZzc6 + 1;
        zzfzl zzfzlVarZzi = zzfzo.zzi(i91);
        int[] iArr34 = new int[i23];
        int i92 = 0;
        while (i92 < i91) {
            int iZza11 = zzfqVar.zza(16);
            zzfzo zzfzoVar = zzfzoVarZzi;
            int iZza12 = zzfqVar.zza(16);
            if (zzfqVar.zzh()) {
                iZza2 = zzfqVar.zza(2);
                if (iZza2 == 3) {
                    zzfqVar.zze();
                }
                iZza3 = zzfqVar.zza(4);
                iZza4 = zzfqVar.zza(4);
            } else {
                iZza2 = 0;
                iZza3 = 0;
                iZza4 = 0;
            }
            if (zzfqVar.zzh()) {
                int iZzc7 = zzfqVar.zzc();
                int iZzc8 = zzfqVar.zzc();
                int iZzc9 = zzfqVar.zzc();
                int iZzc10 = zzfqVar.zzc();
                iZza11 = zzk(iZza11, iZza2, iZzc7, iZzc8);
                iZza12 = zzj(iZza12, iZza2, iZzc9, iZzc10);
            }
            zzfzlVarZzi.zzf(new zzfg(iZza2, iZza3, iZza4, iZza11, iZza12));
            i92++;
            zzfzoVarZzi = zzfzoVar;
            zArr13 = zArr13;
            zzfdVar6 = zzfdVar6;
            zzfzoVarZzi2 = zzfzoVarZzi2;
        }
        zzfzo zzfzoVar2 = zzfzoVarZzi;
        zzfd zzfdVar7 = zzfdVar6;
        zzfzo zzfzoVar3 = zzfzoVarZzi2;
        boolean[][] zArr16 = zArr13;
        if (i91 <= 1 || !zzfqVar.zzh()) {
            for (int i93 = 1; i93 < i23; i93++) {
                iArr34[i93] = Math.min(i93, iZzc6);
            }
        } else {
            int iZza13 = zzgch.zza(i91, RoundingMode.CEILING);
            for (int i94 = 1; i94 < i23; i94++) {
                iArr34[i94] = zzfqVar.zza(iZza13);
            }
        }
        zzfh zzfhVar = new zzfh(zzfzlVarZzi.zzi(), iArr34);
        zzfqVar.zzf(2);
        for (int i95 = 1; i95 < i23; i95++) {
            if (iArr23[iArr28[i95]] == 0) {
                zzfqVar.zze();
            }
        }
        for (int i96 = 1; i96 < iZzc5; i96++) {
            boolean zZzh10 = zzfqVar.zzh();
            int i97 = 0;
            while (i97 < iArr25[i96]) {
                if ((i97 <= 0 || !zZzh10) ? i97 == 0 : zzfqVar.zzh()) {
                    for (int i98 = 0; i98 < iArr4[i96]; i98++) {
                        if (zArr16[i96][i98]) {
                            zzfqVar.zzc();
                        }
                    }
                    zzfqVar.zzc();
                    zzfqVar.zzc();
                }
                i97++;
            }
        }
        int iZzc11 = zzfqVar.zzc() + 2;
        if (zzfqVar.zzh()) {
            zzfqVar.zzf(iZzc11);
        } else {
            for (int i99 = 1; i99 < i23; i99++) {
                for (int i100 = 0; i100 < i99; i100++) {
                    if (zArr15[i99][i100]) {
                        zzfqVar.zzf(iZzc11);
                    }
                }
            }
        }
        int iZzc12 = zzfqVar.zzc();
        for (int i101 = 1; i101 <= iZzc12; i101++) {
            zzfqVar.zzf(8);
        }
        if (zzfqVar.zzh()) {
            zzfqVar.zzd();
            if (zzfqVar.zzh() || zzfqVar.zzh()) {
                zzfqVar.zze();
            }
            boolean zZzh11 = zzfqVar.zzh();
            boolean zZzh12 = zzfqVar.zzh();
            if (zZzh11 || zZzh12) {
                for (int i102 = 0; i102 < iZzc2; i102++) {
                    for (int i103 = 0; i103 < iArr25[i102]; i103++) {
                        boolean zZzh13 = zZzh11 ? zzfqVar.zzh() : false;
                        boolean zZzh14 = zZzh12 ? zzfqVar.zzh() : false;
                        if (zZzh13) {
                            zzfqVar.zzf(32);
                        }
                        if (zZzh14) {
                            zzfqVar.zzf(18);
                        }
                    }
                }
            }
            boolean zZzh15 = zzfqVar.zzh();
            if (zZzh15) {
                z4 = true;
                iZza = zzfqVar.zza(4) + 1;
            } else {
                z4 = true;
                iZza = i23;
            }
            zzfzl zzfzlVarZzi2 = zzfzo.zzi(iZza);
            int[] iArr35 = new int[i23];
            int i104 = 0;
            while (i104 < iZza) {
                zzfqVar.zzf(3);
                int i105 = z4 != zzfqVar.zzh() ? 2 : 1;
                int iZza14 = zzm.zza(zzfqVar.zza(8));
                int iZzb = zzm.zzb(zzfqVar.zza(8));
                zzfqVar.zzf(8);
                zzfzlVarZzi2.zzf(new zzfk(iZza14, i105, iZzb));
                i104++;
                z4 = true;
            }
            if (zZzh15 && iZza > 1) {
                for (int i106 = 0; i106 < i23; i106++) {
                    iArr35[i106] = zzfqVar.zza(4);
                }
            }
            zzflVar = new zzfl(zzfzlVarZzi2.zzi(), iArr35);
        } else {
            zzflVar = null;
        }
        return new zzfm(zzfdVar7, zzfzoVar2, new zzff(zzfzoVar3, iArr32), zzfhVar, zzflVar);
    }

    public static zzfn zze(byte[] bArr, int i, int i10) {
        zzfq zzfqVar = new zzfq(bArr, 4, i10);
        int iZzc = zzfqVar.zzc();
        int iZzc2 = zzfqVar.zzc();
        zzfqVar.zze();
        return new zzfn(iZzc, iZzc2, zzfqVar.zzh());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x0208  */
    /* JADX WARN: Code duplicated, block: B:126:0x0213  */
    /* JADX WARN: Code duplicated, block: B:129:0x021c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0223  */
    /* JADX WARN: Code duplicated, block: B:135:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0250  */
    /* JADX WARN: Code duplicated, block: B:142:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[PHI: r2
      0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x016f A[PHI: r2
      0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    public static zzfo zzf(byte[] bArr, int i, int i10) {
        int iZzc;
        int i11;
        boolean zZzh;
        int i12;
        int iZzc2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzb;
        int i18;
        int i19;
        int iZzc3;
        boolean z4;
        boolean zZzh2;
        int i20;
        int i21;
        int i22;
        int iZzc4;
        float f10;
        int i23;
        int i24;
        float f11;
        int i25;
        int i26;
        int iZza;
        int iZzb2;
        boolean zZzh3;
        boolean zZzh4;
        int i27;
        int iZza2;
        int iZza3;
        int iZza4;
        int i28;
        int i29;
        zzfq zzfqVar = new zzfq(bArr, i, i10);
        int iZza5 = zzfqVar.zza(8);
        int iZza6 = zzfqVar.zza(8);
        int iZza7 = zzfqVar.zza(8);
        int iZzc5 = zzfqVar.zzc();
        if (iZza5 == 100 || iZza5 == 110 || iZza5 == 122 || iZza5 == 244 || iZza5 == 44 || iZza5 == 83 || iZza5 == 86 || iZza5 == 118 || iZza5 == 128) {
            iZzc = zzfqVar.zzc();
            if (iZzc == 3) {
                zZzh = zzfqVar.zzh();
                i11 = 3;
            } else {
                i11 = iZzc;
                zZzh = false;
            }
            i12 = 16;
            int iZzc6 = zzfqVar.zzc();
            iZzc2 = zzfqVar.zzc();
            zzfqVar.zze();
            if (zzfqVar.zzh()) {
                if (i11 != 3) {
                    i14 = 8;
                } else {
                    i14 = 12;
                }
                for (i15 = 0; i15 < i14; i15++) {
                    if (!zzfqVar.zzh()) {
                        if (i15 < 6) {
                            i16 = 16;
                        } else {
                            i16 = 64;
                        }
                        iZzb = 8;
                        i18 = 8;
                        for (i17 = 0; i17 < i16; i17++) {
                            if (iZzb != 0) {
                                iZzb = ((zzfqVar.zzb() + i18) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i18 = iZzb;
                            }
                        }
                    }
                }
            }
            i13 = iZzc6;
        } else if (iZza5 == 138) {
            iZza5 = 138;
            iZzc = zzfqVar.zzc();
            if (iZzc == 3) {
                zZzh = zzfqVar.zzh();
                i11 = 3;
            } else {
                i11 = iZzc;
                zZzh = false;
            }
            i12 = 16;
            int iZzc7 = zzfqVar.zzc();
            iZzc2 = zzfqVar.zzc();
            zzfqVar.zze();
            if (zzfqVar.zzh()) {
                if (i11 != 3) {
                    i14 = 8;
                } else {
                    i14 = 12;
                }
                while (i15 < i14) {
                    if (!zzfqVar.zzh()) {
                        if (i15 < 6) {
                            i16 = 16;
                        } else {
                            i16 = 64;
                        }
                        iZzb = 8;
                        i18 = 8;
                        while (i17 < i16) {
                            if (iZzb != 0) {
                                iZzb = ((zzfqVar.zzb() + i18) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i18 = iZzb;
                            }
                        }
                    }
                }
            }
            i13 = iZzc7;
        } else {
            iZzc = 1;
            i12 = 16;
            i13 = 0;
            zZzh = false;
            iZzc2 = 0;
        }
        int iZzc8 = zzfqVar.zzc() + 4;
        int iZzc9 = zzfqVar.zzc();
        if (iZzc9 != 0) {
            if (iZzc9 == 1) {
                boolean zZzh5 = zzfqVar.zzh();
                zzfqVar.zzb();
                zzfqVar.zzb();
                long jZzc = zzfqVar.zzc();
                for (int i30 = 0; i30 < jZzc; i30++) {
                    zzfqVar.zzc();
                }
                z4 = zZzh5;
                iZzc9 = 1;
                i19 = 244;
                iZzc3 = 0;
            } else {
                i19 = 244;
                iZzc3 = 0;
            }
            int iZzc10 = zzfqVar.zzc();
            zzfqVar.zze();
            int iZzc11 = zzfqVar.zzc() + 1;
            int iZzc12 = zzfqVar.zzc() + 1;
            zZzh2 = zzfqVar.zzh();
            i20 = 2 - (zZzh2 ? 1 : 0);
            if (!zZzh2) {
                zzfqVar.zze();
            }
            zzfqVar.zze();
            i21 = iZzc11 * 16;
            i22 = iZzc12 * i20 * 16;
            if (zzfqVar.zzh()) {
                int iZzc13 = zzfqVar.zzc();
                int iZzc14 = zzfqVar.zzc();
                int iZzc15 = zzfqVar.zzc();
                int iZzc16 = zzfqVar.zzc();
                if (iZzc == 0) {
                    i28 = 1;
                } else {
                    if (iZzc == 3) {
                        i28 = 1;
                    } else {
                        i28 = 2;
                    }
                    if (iZzc == 1) {
                        i29 = 2;
                    } else {
                        i29 = 1;
                    }
                    i20 *= i29;
                }
                i21 -= (iZzc13 + iZzc14) * i28;
                i22 -= (iZzc15 + iZzc16) * i20;
            }
            if (iZza5 != 44 || iZza5 == 86 || iZza5 == 100 || iZza5 == 110 || iZza5 == 122) {
                if ((iZza6 & 16) != 0) {
                    iZzc4 = 0;
                } else {
                    iZzc4 = i12;
                }
            } else if (iZza5 == i19) {
                iZza5 = i19;
                if ((iZza6 & 16) != 0) {
                    iZzc4 = 0;
                } else {
                    iZzc4 = i12;
                }
            } else {
                iZzc4 = i12;
            }
            f10 = 1.0f;
            i23 = -1;
            if (zzfqVar.zzh()) {
                if (zzfqVar.zzh()) {
                    iZza2 = zzfqVar.zza(8);
                    if (iZza2 == 255) {
                        int i31 = i12;
                        iZza3 = zzfqVar.zza(i31);
                        iZza4 = zzfqVar.zza(i31);
                        if (iZza3 != 0 && iZza4 != 0) {
                            f10 = iZza3 / iZza4;
                        }
                    } else if (iZza2 < 17) {
                        f10 = zzb[iZza2];
                    } else {
                        q1.a.o(iZza2, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (zzfqVar.zzh()) {
                    zzfqVar.zze();
                }
                if (zzfqVar.zzh()) {
                    zzfqVar.zzf(3);
                    if (true != zzfqVar.zzh()) {
                        i27 = 2;
                    } else {
                        i27 = 1;
                    }
                    if (zzfqVar.zzh()) {
                        int iZza8 = zzfqVar.zza(8);
                        int iZza9 = zzfqVar.zza(8);
                        zzfqVar.zzf(8);
                        iZza = zzm.zza(iZza8);
                        iZzb2 = zzm.zzb(iZza9);
                    } else {
                        iZza = -1;
                        iZzb2 = -1;
                    }
                    i23 = i27;
                } else {
                    iZza = -1;
                    iZzb2 = -1;
                }
                if (zzfqVar.zzh()) {
                    zzfqVar.zzc();
                    zzfqVar.zzc();
                }
                if (zzfqVar.zzh()) {
                    zzfqVar.zzf(65);
                }
                zZzh3 = zzfqVar.zzh();
                if (zZzh3) {
                    zzn(zzfqVar);
                }
                zZzh4 = zzfqVar.zzh();
                if (zZzh4) {
                    zzn(zzfqVar);
                }
                if (zZzh3 || zZzh4) {
                    zzfqVar.zze();
                }
                zzfqVar.zze();
                if (zzfqVar.zzh()) {
                    zzfqVar.zze();
                    zzfqVar.zzc();
                    zzfqVar.zzc();
                    zzfqVar.zzc();
                    zzfqVar.zzc();
                    iZzc4 = zzfqVar.zzc();
                    zzfqVar.zzc();
                }
                i26 = iZzb2;
                i24 = iZzc4;
                f11 = f10;
                i25 = i23;
                i23 = iZza;
            } else {
                i24 = iZzc4;
                f11 = 1.0f;
                i25 = -1;
                i26 = -1;
            }
            return new zzfo(iZza5, iZza6, iZza7, iZzc5, iZzc10, i21, i22, f11, i13, iZzc2, zZzh, zZzh2, iZzc8, iZzc9, iZzc3, z4, i23, i25, i26, i24);
        }
        iZzc3 = zzfqVar.zzc() + 4;
        i19 = 244;
        z4 = false;
        int iZzc17 = zzfqVar.zzc();
        zzfqVar.zze();
        int iZzc18 = zzfqVar.zzc() + 1;
        int iZzc19 = zzfqVar.zzc() + 1;
        zZzh2 = zzfqVar.zzh();
        i20 = 2 - (zZzh2 ? 1 : 0);
        if (!zZzh2) {
            zzfqVar.zze();
        }
        zzfqVar.zze();
        i21 = iZzc18 * 16;
        i22 = iZzc19 * i20 * 16;
        if (zzfqVar.zzh()) {
            int iZzc110 = zzfqVar.zzc();
            int iZzc111 = zzfqVar.zzc();
            int iZzc112 = zzfqVar.zzc();
            int iZzc113 = zzfqVar.zzc();
            if (iZzc == 0) {
                i28 = 1;
            } else {
                if (iZzc == 3) {
                    i28 = 1;
                } else {
                    i28 = 2;
                }
                if (iZzc == 1) {
                    i29 = 2;
                } else {
                    i29 = 1;
                }
                i20 *= i29;
            }
            i21 -= (iZzc110 + iZzc111) * i28;
            i22 -= (iZzc112 + iZzc113) * i20;
        }
        if (iZza5 != 44) {
            if ((iZza6 & 16) != 0) {
                iZzc4 = 0;
            } else {
                iZzc4 = i12;
            }
        } else if ((iZza6 & 16) != 0) {
            iZzc4 = 0;
        } else {
            iZzc4 = i12;
        }
        f10 = 1.0f;
        i23 = -1;
        if (zzfqVar.zzh()) {
            if (zzfqVar.zzh()) {
                iZza2 = zzfqVar.zza(8);
                if (iZza2 == 255) {
                    int i32 = i12;
                    iZza3 = zzfqVar.zza(i32);
                    iZza4 = zzfqVar.zza(i32);
                    if (iZza3 != 0) {
                        f10 = iZza3 / iZza4;
                    }
                } else if (iZza2 < 17) {
                    f10 = zzb[iZza2];
                } else {
                    q1.a.o(iZza2, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (zzfqVar.zzh()) {
                zzfqVar.zze();
            }
            if (zzfqVar.zzh()) {
                zzfqVar.zzf(3);
                if (true != zzfqVar.zzh()) {
                    i27 = 2;
                } else {
                    i27 = 1;
                }
                if (zzfqVar.zzh()) {
                    int iZza10 = zzfqVar.zza(8);
                    int iZza11 = zzfqVar.zza(8);
                    zzfqVar.zzf(8);
                    iZza = zzm.zza(iZza10);
                    iZzb2 = zzm.zzb(iZza11);
                } else {
                    iZza = -1;
                    iZzb2 = -1;
                }
                i23 = i27;
            } else {
                iZza = -1;
                iZzb2 = -1;
            }
            if (zzfqVar.zzh()) {
                zzfqVar.zzc();
                zzfqVar.zzc();
            }
            if (zzfqVar.zzh()) {
                zzfqVar.zzf(65);
            }
            zZzh3 = zzfqVar.zzh();
            if (zZzh3) {
                zzn(zzfqVar);
            }
            zZzh4 = zzfqVar.zzh();
            if (zZzh4) {
                zzn(zzfqVar);
            }
            if (zZzh3) {
                zzfqVar.zze();
            } else {
                zzfqVar.zze();
            }
            zzfqVar.zze();
            if (zzfqVar.zzh()) {
                zzfqVar.zze();
                zzfqVar.zzc();
                zzfqVar.zzc();
                zzfqVar.zzc();
                zzfqVar.zzc();
                iZzc4 = zzfqVar.zzc();
                zzfqVar.zzc();
            }
            i26 = iZzb2;
            i24 = iZzc4;
            f11 = f10;
            i25 = i23;
            i23 = iZza;
        } else {
            i24 = iZzc4;
            f11 = 1.0f;
            i25 = -1;
            i26 = -1;
        }
        return new zzfo(iZza5, iZza6, iZza7, iZzc5, iZzc17, i21, i22, f11, i13, iZzc2, zZzh, zZzh2, iZzc8, iZzc9, iZzc3, z4, i23, i25, i26, i24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String zzg(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                zzfzl zzfzlVar = new zzfzl();
                int i10 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i10 >= length2) {
                        break;
                    }
                    int iZza = zza(bArr, i10, length2, zArr);
                    if (iZza != length2) {
                        zzfzlVar.zzf(Integer.valueOf(iZza));
                    }
                    i10 = iZza + 3;
                }
                zzfzo zzfzoVarZzi = zzfzlVar.zzi();
                for (int i11 = 0; i11 < zzfzoVarZzi.size(); i11++) {
                    if (((Integer) zzfzoVarZzi.get(i11)).intValue() + 3 < length) {
                        zzfq zzfqVar = new zzfq(bArr, ((Integer) zzfzoVarZzi.get(i11)).intValue() + 3, length);
                        zzfd zzfdVarZzl = zzl(zzfqVar);
                        if (zzfdVarZzl.zza == 33 && zzfdVarZzl.zzb == 0) {
                            zzfqVar.zzf(4);
                            int iZza2 = zzfqVar.zza(3);
                            zzfqVar.zze();
                            zzfe zzfeVarZzm = zzm(zzfqVar, true, iZza2, null);
                            return zzdd.zzd(zzfeVarZzm.zza, zzfeVarZzm.zzb, zzfeVarZzm.zzc, zzfeVarZzm.zzd, zzfeVarZzm.zze, zzfeVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void zzh(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzi(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i = b10 & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    private static int zzj(int i, int i10, int i11, int i12) {
        return i - ((i11 + i12) * (i10 == 1 ? 2 : 1));
    }

    private static int zzk(int i, int i10, int i11, int i12) {
        int i13 = 2;
        if (i10 != 1 && i10 != 2) {
            i13 = 1;
        }
        return i - ((i11 + i12) * i13);
    }

    private static zzfd zzl(zzfq zzfqVar) {
        zzfqVar.zze();
        return new zzfd(zzfqVar.zza(6), zzfqVar.zza(6), zzfqVar.zza(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static zzfe zzm(zzfq zzfqVar, boolean z4, int i, zzfe zzfeVar) {
        int[] iArr;
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean zZzh;
        int iZza;
        int i13;
        int i14;
        int[] iArr2 = new int[6];
        if (!z4) {
            if (zzfeVar != null) {
                int i15 = zzfeVar.zza;
                zZzh = zzfeVar.zzb;
                iZza = zzfeVar.zzc;
                i13 = zzfeVar.zzd;
                iArr2 = zzfeVar.zze;
                i10 = i15;
            } else {
                iArr = iArr2;
                i10 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
            }
            int iZza2 = zzfqVar.zza(8);
            i14 = 0;
            for (int i16 = 0; i16 < i; i16++) {
                if (zzfqVar.zzh()) {
                    i14 += 88;
                }
                if (zzfqVar.zzh()) {
                    i14 += 8;
                }
            }
            zzfqVar.zzf(i14);
            if (i > 0) {
                int i17 = 8 - i;
                zzfqVar.zzf(i17 + i17);
            }
            return new zzfe(i10, z10, i11, i12, iArr, iZza2);
        }
        int iZza3 = zzfqVar.zza(2);
        zZzh = zzfqVar.zzh();
        iZza = zzfqVar.zza(5);
        i13 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (zzfqVar.zzh()) {
                i13 |= 1 << i18;
            }
        }
        for (int i19 = 0; i19 < 6; i19++) {
            iArr2[i19] = zzfqVar.zza(8);
        }
        i10 = iZza3;
        iArr = iArr2;
        z10 = zZzh;
        i11 = iZza;
        i12 = i13;
        int iZza4 = zzfqVar.zza(8);
        i14 = 0;
        while (i16 < i) {
            if (zzfqVar.zzh()) {
                i14 += 88;
            }
            if (zzfqVar.zzh()) {
                i14 += 8;
            }
        }
        zzfqVar.zzf(i14);
        if (i > 0) {
            int i110 = 8 - i;
            zzfqVar.zzf(i110 + i110);
        }
        return new zzfe(i10, z10, i11, i12, iArr, iZza4);
    }

    private static void zzn(zzfq zzfqVar) {
        int iZzc = zzfqVar.zzc() + 1;
        zzfqVar.zzf(8);
        for (int i = 0; i < iZzc; i++) {
            zzfqVar.zzc();
            zzfqVar.zzc();
            zzfqVar.zze();
        }
        zzfqVar.zzf(20);
    }
}

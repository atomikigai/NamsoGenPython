package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadg {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final int zzj;
    public final String zzk;
    public final zzfm zzl;

    private zzadg(List list, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, String str, zzfm zzfmVar) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
        this.zzg = i16;
        this.zzh = i17;
        this.zzi = f10;
        this.zzj = i18;
        this.zzk = str;
        this.zzl = zzfmVar;
    }

    public static zzadg zza(zzed zzedVar) throws zzbh {
        return zzc(zzedVar, false, null);
    }

    public static zzadg zzb(zzed zzedVar, zzfm zzfmVar) throws zzbh {
        return zzc(zzedVar, true, zzfmVar);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0275  */
    /* JADX WARN: Code duplicated, block: B:115:0x0278  */
    /* JADX WARN: Code duplicated, block: B:39:0x011a A[PHI: r31
      0x011a: PHI (r31v2 int) = (r31v0 int), (r31v0 int), (r31v0 int), (r31v0 int), (r31v3 int) binds: [B:41:0x0123, B:42:0x0125, B:95:0x021d, B:96:0x021f, B:38:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private static zzadg zzc(zzed zzedVar, boolean z4, zzfm zzfmVar) throws zzbh {
        boolean z10;
        boolean z11;
        String str;
        int i;
        int i10;
        zzfi zzfiVar;
        int i11;
        int iMax;
        int i12;
        int iMax2;
        int i13;
        int i14;
        int i15 = 4;
        boolean z12 = true;
        if (z4) {
            try {
                zzedVar.zzM(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z11 = true;
                if (z11 != z4) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzbh.zza("Error parsing".concat(str), e);
            }
        } else {
            try {
                zzedVar.zzM(21);
            } catch (ArrayIndexOutOfBoundsException e4) {
                e = e4;
                z10 = z12;
                z11 = z10;
                if (z11 != z4) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzbh.zza("Error parsing".concat(str), e);
            }
        }
        int iZzm = zzedVar.zzm() & 3;
        int iZzm2 = zzedVar.zzm();
        int iZzd = zzedVar.zzd();
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < iZzm2; i18++) {
            zzedVar.zzM(1);
            int iZzq = zzedVar.zzq();
            for (int i19 = 0; i19 < iZzq; i19++) {
                int iZzq2 = zzedVar.zzq();
                i17 += iZzq2 + 4;
                zzedVar.zzM(iZzq2);
            }
        }
        zzedVar.zzL(iZzd);
        byte[] bArr = new byte[i17];
        zzfm zzfmVar2 = zzfmVar;
        int i20 = 0;
        float f10 = 1.0f;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        String strZzd = null;
        int i30 = 0;
        while (i30 < iZzm2) {
            int iZzm3 = zzedVar.zzm() & 63;
            int iZzq3 = zzedVar.zzq();
            z10 = z12;
            int i31 = i16;
            zzfm zzfmVarZzd = zzfmVar2;
            while (i31 < iZzq3) {
                try {
                    int iZzq4 = zzedVar.zzq();
                    int i32 = i31;
                    System.arraycopy(zzfp.zza, i16, bArr, i20, i15);
                    int i33 = i20 + 4;
                    System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), bArr, i33, iZzq4);
                    int i34 = 32;
                    if (iZzm3 == 32) {
                        if (i32 == 0) {
                            zzfmVarZzd = zzfp.zzd(bArr, i33, i33 + iZzq4);
                            i10 = i33;
                            i = iZzm;
                            i14 = 0;
                            i13 = 0;
                        }
                        i20 = i10 + iZzq4;
                        zzedVar.zzM(iZzq4);
                        i31 = i14 + 1;
                        i16 = i13;
                        iZzm = i;
                        i15 = 4;
                    } else {
                        i34 = iZzm3;
                    }
                    i = iZzm;
                    if (i34 != 33) {
                        i10 = i33;
                        int i35 = 8;
                        if (i34 == 39 && i32 == 0) {
                            int i36 = i20 + 6;
                            int i37 = (i10 + iZzq4) - 1;
                            while (true) {
                                byte b10 = bArr[i37];
                                if (b10 != 0) {
                                    if (b10 == 0 || i37 <= i36) {
                                        break;
                                    }
                                    zzfq zzfqVar = new zzfq(bArr, i36, i37 + 1);
                                    while (true) {
                                        if (zzfqVar.zzg(16)) {
                                            int i38 = i35;
                                            int iZza = zzfqVar.zza(i38);
                                            int i39 = 0;
                                            while (iZza == 255) {
                                                i39 += 255;
                                                iZza = zzfqVar.zza(i38);
                                            }
                                            int i40 = i39 + iZza;
                                            int iZza2 = zzfqVar.zza(i38);
                                            int i41 = 0;
                                            while (iZza2 == 255) {
                                                i41 += 255;
                                                iZza2 = zzfqVar.zza(8);
                                            }
                                            i35 = 8;
                                            int i42 = i41 + iZza2;
                                            if (i42 == 0 || !zzfqVar.zzg(i42)) {
                                                break;
                                            }
                                            if (i40 == 176) {
                                                int iZzc = zzfqVar.zzc();
                                                boolean zZzh = zzfqVar.zzh();
                                                int iZzc2 = zZzh ? zzfqVar.zzc() : 0;
                                                int iZzc3 = zzfqVar.zzc();
                                                int iZzc4 = -1;
                                                int iZzc5 = -1;
                                                int i43 = -1;
                                                int iZza3 = -1;
                                                int i44 = -1;
                                                int iZza4 = -1;
                                                int i45 = 0;
                                                while (true) {
                                                    if (i45 > iZzc3) {
                                                        zzfiVar = new zzfi(iZzc, iZzc2, iZzc3 + 1, iZzc4, iZzc5, i43, iZza3, i44, iZza4);
                                                        break;
                                                    }
                                                    iZzc4 = zzfqVar.zzc();
                                                    iZzc5 = zzfqVar.zzc();
                                                    boolean z13 = zZzh;
                                                    int iZza5 = zzfqVar.zza(6);
                                                    if (iZza5 != 63) {
                                                        if (iZza5 == 0) {
                                                            i11 = iZza5;
                                                            iMax = Math.max(0, iZzc - 30);
                                                        } else {
                                                            i11 = iZza5;
                                                            iMax = Math.max(0, (i11 + iZzc) - 31);
                                                        }
                                                        iZza3 = zzfqVar.zza(iMax);
                                                        if (z13) {
                                                            int iZza6 = zzfqVar.zza(6);
                                                            if (iZza6 != 63) {
                                                                if (iZza6 == 0) {
                                                                    i12 = iZza6;
                                                                    iMax2 = Math.max(0, iZzc2 - 30);
                                                                } else {
                                                                    i12 = iZza6;
                                                                    iMax2 = Math.max(0, (i12 + iZzc2) - 31);
                                                                }
                                                                iZza4 = zzfqVar.zza(iMax2);
                                                                i44 = i12;
                                                            }
                                                        }
                                                        if (zzfqVar.zzh()) {
                                                            zzfqVar.zzf(10);
                                                        }
                                                        i45++;
                                                        zZzh = z13;
                                                        i43 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (i37 > i36) {
                                    i37--;
                                }
                                zzfiVar = null;
                                break;
                            }
                            if (zzfiVar == null || zzfmVarZzd == null) {
                                i13 = 0;
                            } else {
                                i13 = 0;
                                if (zzfiVar.zza == ((zzfc) zzfmVarZzd.zza.get(0)).zzb) {
                                    i14 = i32;
                                    i28 = 4;
                                } else {
                                    i28 = 5;
                                }
                            }
                            i14 = i32;
                        } else {
                            i13 = 0;
                            i14 = i32;
                        }
                    } else if (i32 == 0) {
                        zzfj zzfjVarZzc = zzfp.zzc(bArr, i33, i33 + iZzq4, zzfmVarZzd);
                        int i46 = zzfjVarZzc.zzd;
                        int i47 = zzfjVarZzc.zze;
                        int i48 = zzfjVarZzc.zzb + 8;
                        int i49 = zzfjVarZzc.zzc + 8;
                        i10 = i33;
                        int i50 = zzfjVarZzc.zzh;
                        int i51 = zzfjVarZzc.zzi;
                        int i52 = zzfjVarZzc.zzj;
                        float f11 = zzfjVarZzc.zzf;
                        int i53 = zzfjVarZzc.zzg;
                        zzfe zzfeVar = zzfjVarZzc.zza;
                        if (zzfeVar != null) {
                            strZzd = zzdd.zzd(zzfeVar.zza, zzfeVar.zzb, zzfeVar.zzc, zzfeVar.zzd, zzfeVar.zze, zzfeVar.zzf);
                        }
                        i27 = i52;
                        f10 = f11;
                        i29 = i53;
                        i14 = i32;
                        i24 = i49;
                        i25 = i50;
                        i26 = i51;
                        i13 = 0;
                        i22 = i47;
                        i23 = i48;
                        i21 = i46;
                    } else {
                        i10 = i33;
                        i13 = 0;
                        i14 = i32;
                    }
                    i20 = i10 + iZzq4;
                    zzedVar.zzM(iZzq4);
                    i31 = i14 + 1;
                    i16 = i13;
                    iZzm = i;
                    i15 = 4;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    e = e10;
                    z11 = z10;
                    if (z11 != z4) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw zzbh.zza("Error parsing".concat(str), e);
                }
            }
            i30++;
            zzfmVar2 = zzfmVarZzd;
            z12 = z10;
            iZzm = iZzm;
            i15 = 4;
        }
        z10 = z12;
        return new zzadg(i17 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZzm + 1, i21, i22, i23, i24, i25, i26, i27, i28, f10, i29, strZzd, zzfmVar2);
    }
}

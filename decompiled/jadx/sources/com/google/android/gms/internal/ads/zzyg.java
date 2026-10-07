package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzyg extends zzyj {
    public abstract Pair zzd(zzyf zzyfVar, int[][][] iArr, int[] iArr2, zzur zzurVar, zzbv zzbvVar) throws zzig;

    @Override // com.google.android.gms.internal.ads.zzyj
    public final zzyk zzo(zzlq[] zzlqVarArr, zzwr zzwrVar, zzur zzurVar, zzbv zzbvVar) throws zzig {
        boolean z4;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbw[][] zzbwVarArr = new zzbw[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i10 = zzwrVar.zzb;
            zzbwVarArr[i] = new zzbw[i10];
            iArr3[i] = new int[i10][];
        }
        int i11 = 2;
        int[] iArr4 = new int[2];
        for (int i12 = 0; i12 < 2; i12++) {
            iArr4[i12] = zzlqVarArr[i12].zze();
        }
        int i13 = 0;
        while (i13 < zzwrVar.zzb) {
            zzbw zzbwVarZzb = zzwrVar.zzb(i13);
            int i14 = zzbwVarZzb.zzc;
            int i15 = i11;
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < i11) {
                zzlq zzlqVar = zzlqVarArr[i16];
                int iMax = 0;
                for (int i18 = 0; i18 < zzbwVarZzb.zza; i18++) {
                    iMax = Math.max(iMax, zzlqVar.zzY(zzbwVarZzb.zzb(i18)) & 7);
                }
                boolean z11 = iArr2[i16] == 0;
                if (iMax > i17) {
                    z10 = z11;
                    i15 = i16;
                    i17 = iMax;
                } else if (iMax == i17 && i14 == 5 && !z10 && z11) {
                    i15 = i16;
                    i17 = iMax;
                    z10 = true;
                }
                i16++;
                i11 = 2;
            }
            if (i15 == i11) {
                iArr = new int[zzbwVarZzb.zza];
            } else {
                zzlq zzlqVar2 = zzlqVarArr[i15];
                int[] iArr5 = new int[zzbwVarZzb.zza];
                for (int i19 = 0; i19 < zzbwVarZzb.zza; i19++) {
                    iArr5[i19] = zzlqVar2.zzY(zzbwVarZzb.zzb(i19));
                }
                iArr = iArr5;
            }
            int i20 = iArr2[i15];
            zzbwVarArr[i15][i20] = zzbwVarZzb;
            iArr3[i15][i20] = iArr;
            iArr2[i15] = i20 + 1;
            i13++;
            i11 = 2;
        }
        zzwr[] zzwrVarArr = new zzwr[i11];
        String[] strArr = new String[i11];
        int[] iArr6 = new int[i11];
        int i21 = 0;
        while (i21 < i11) {
            int i22 = iArr2[i21];
            zzwrVarArr[i21] = new zzwr((zzbw[]) zzen.zzO(zzbwVarArr[i21], i22));
            iArr3[i21] = (int[][]) zzen.zzO(iArr3[i21], i22);
            strArr[i21] = zzlqVarArr[i21].zzU();
            iArr6[i21] = zzlqVarArr[i21].zzb();
            i21++;
            i11 = 2;
        }
        int i23 = i11;
        zzyf zzyfVar = new zzyf(strArr, iArr6, zzwrVarArr, iArr4, iArr3, new zzwr((zzbw[]) zzen.zzO(zzbwVarArr[i23], iArr2[i23])));
        Pair pairZzd = zzd(zzyfVar, iArr3, iArr4, zzurVar, zzbvVar);
        zzyh[] zzyhVarArr = (zzyh[]) pairZzd.second;
        List[] listArr = new List[zzyhVarArr.length];
        for (int i24 = 0; i24 < zzyhVarArr.length; i24++) {
            zzyh zzyhVar = zzyhVarArr[i24];
            listArr[i24] = zzyhVar != null ? zzfzo.zzo(zzyhVar) : zzfzo.zzn();
        }
        zzfzl zzfzlVar = new zzfzl();
        for (int i25 = 0; i25 < 2; i25++) {
            zzwr zzwrVarZzd = zzyfVar.zzd(i25);
            List list = listArr[i25];
            for (int i26 = 0; i26 < zzwrVarZzd.zzb; i26++) {
                zzbw zzbwVarZzb2 = zzwrVarZzd.zzb(i26);
                boolean z12 = zzyfVar.zza(i25, i26, false) != 0;
                int i27 = zzbwVarZzb2.zza;
                int[] iArr7 = new int[i27];
                boolean[] zArr = new boolean[i27];
                for (int i28 = 0; i28 < zzbwVarZzb2.zza; i28++) {
                    iArr7[i28] = zzyfVar.zzb(i25, i26, i28) & 7;
                    int i29 = 0;
                    while (true) {
                        if (i29 >= list.size()) {
                            z4 = false;
                            break;
                        }
                        zzyh zzyhVar2 = (zzyh) list.get(i29);
                        if (zzyhVar2.zze().equals(zzbwVarZzb2) && zzyhVar2.zzb(i28) != -1) {
                            z4 = true;
                            break;
                        }
                        i29++;
                    }
                    zArr[i28] = z4;
                }
                zzfzlVar.zzf(new zzcc(zzbwVarZzb2, z12, iArr7, zArr));
            }
        }
        zzwr zzwrVarZze = zzyfVar.zze();
        for (int i30 = 0; i30 < zzwrVarZze.zzb; i30++) {
            zzbw zzbwVarZzb3 = zzwrVarZze.zzb(i30);
            int[] iArr8 = new int[zzbwVarZzb3.zza];
            Arrays.fill(iArr8, 0);
            zzfzlVar.zzf(new zzcc(zzbwVarZzb3, false, iArr8, new boolean[zzbwVarZzb3.zza]));
        }
        return new zzyk((zzlr[]) pairZzd.first, (zzyd[]) pairZzd.second, new zzcd(zzfzlVar.zzi()), zzyfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzp(Object obj) {
    }
}

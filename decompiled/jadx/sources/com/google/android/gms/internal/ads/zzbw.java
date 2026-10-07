package com.google.android.gms.internal.ads;

import java.util.Arrays;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbw {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzad[] zzd;
    private int zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbw(String str, zzad... zzadVarArr) {
        int length = zzadVarArr.length;
        int i = 1;
        zzdb.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzadVarArr;
        this.zza = length;
        int iZzb = zzbg.zzb(zzadVarArr[0].zzo);
        this.zzc = iZzb == -1 ? zzbg.zzb(zzadVarArr[0].zzn) : iZzb;
        String strZzc = zzc(zzadVarArr[0].zzd);
        int i10 = zzadVarArr[0].zzf | 16384;
        while (true) {
            zzad[] zzadVarArr2 = this.zzd;
            if (i >= zzadVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzadVarArr2[i].zzd))) {
                zzad[] zzadVarArr3 = this.zzd;
                zzd("languages", zzadVarArr3[0].zzd, zzadVarArr3[i].zzd, i);
                return;
            } else {
                zzad[] zzadVarArr4 = this.zzd;
                if (i10 != (zzadVarArr4[i].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzadVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i].zzf), i);
                    return;
                }
                i++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i) {
        StringBuilder sbE = b.e("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbE.append(str3);
        sbE.append("' (track ");
        sbE.append(i);
        sbE.append(")");
        zzdt.zzd("TrackGroup", "", new IllegalStateException(sbE.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbw.class == obj.getClass()) {
            zzbw zzbwVar = (zzbw) obj;
            if (this.zzb.equals(zzbwVar.zzb) && Arrays.equals(this.zzd, zzbwVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zzb.hashCode() + 527;
        int iHashCode2 = Arrays.hashCode(this.zzd) + (iHashCode * 31);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    public final int zza(zzad zzadVar) {
        int i = 0;
        while (true) {
            zzad[] zzadVarArr = this.zzd;
            if (i >= zzadVarArr.length) {
                return -1;
            }
            if (zzadVar == zzadVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final zzad zzb(int i) {
        return this.zzd[i];
    }
}

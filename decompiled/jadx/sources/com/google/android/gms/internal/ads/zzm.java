package com.google.android.gms.internal.ads;

import da.v;
import java.util.Arrays;
import java.util.Locale;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm {
    public static final zzm zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzk zzkVar = new zzk();
        zzkVar.zzc(1);
        zzkVar.zzb(2);
        zzkVar.zzd(3);
        zza = zzkVar.zzg();
        zzk zzkVar2 = new zzk();
        zzkVar2.zzc(1);
        zzkVar2.zzb(1);
        zzkVar2.zzd(2);
        zzkVar2.zzg();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzm(int i, int i10, int i11, byte[] bArr, int i12, int i13, zzl zzlVar) {
        this.zzb = i;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = bArr;
        this.zzf = i12;
        this.zzg = i13;
    }

    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean zzg(zzm zzmVar) {
        if (zzmVar == null) {
            return true;
        }
        int i = zzmVar.zzb;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i10 = zzmVar.zzc;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = zzmVar.zzd;
        if ((i11 != -1 && i11 != 3) || zzmVar.zze != null) {
            return false;
        }
        int i12 = zzmVar.zzg;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = zzmVar.zzf;
        return i13 == -1 || i13 == 8;
    }

    private static String zzh(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? v.f(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    private static String zzi(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? v.f(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    private static String zzj(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? v.f(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzm.class == obj.getClass()) {
            zzm zzmVar = (zzm) obj;
            if (this.zzb == zzmVar.zzb && this.zzc == zzmVar.zzc && this.zzd == zzmVar.zzd && Arrays.equals(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = this.zzf;
        int i10 = this.zzd;
        int i11 = this.zzc;
        String strZzi = zzi(this.zzb);
        String strZzh = zzh(i11);
        String strZzj = zzj(i10);
        String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i12 = this.zzg;
        if (i12 != -1) {
            str2 = i12 + "bit Chroma";
        }
        boolean z4 = this.zze != null;
        StringBuilder sbE = b.e("ColorInfo(", strZzi, ", ", strZzh, ", ");
        sbE.append(strZzj);
        sbE.append(", ");
        sbE.append(z4);
        sbE.append(", ");
        sbE.append(str);
        sbE.append(", ");
        sbE.append(str2);
        sbE.append(")");
        return sbE.toString();
    }

    public final zzk zzc() {
        return new zzk(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            String strZzi = zzi(this.zzb);
            String strZzh = zzh(this.zzc);
            String strZzj = zzj(this.zzd);
            Locale locale = Locale.US;
            str = strZzi + "/" + strZzh + "/" + strZzj;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzf + "/" + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return v.u(str, "/", str2);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}

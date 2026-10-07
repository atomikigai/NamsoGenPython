package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalb {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalb(String str, int i, Integer num, Integer num2, float f10, boolean z4, boolean z10, boolean z11, boolean z12, int i10) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z4;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzalb zzb(String str, zzakz zzakzVar) {
        int i;
        zzdb.zzd(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = zzakzVar.zzk;
        zzalb zzalbVar = null;
        if (length != i10) {
            Locale locale = Locale.US;
            StringBuilder sbD = b.d(i10, length, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
            sbD.append(str);
            sbD.append("'");
            zzdt.zzf("SsaStyle", sbD.toString());
            return zzalbVar;
        }
        try {
            String strTrim = strArrSplit[zzakzVar.zza].trim();
            int i11 = zzakzVar.zzb;
            int iZzd = i11 != -1 ? zzd(strArrSplit[i11].trim()) : -1;
            int i12 = zzakzVar.zzc;
            Integer numZzc = i12 != -1 ? zzc(strArrSplit[i12].trim()) : zzalbVar;
            int i13 = zzakzVar.zzd;
            Integer numZzc2 = i13 != -1 ? zzc(strArrSplit[i13].trim()) : zzalbVar;
            int i14 = zzakzVar.zze;
            float f10 = -3.4028235E38f;
            if (i14 != -1) {
                String strTrim2 = strArrSplit[i14].trim();
                try {
                    try {
                        f10 = Float.parseFloat(strTrim2);
                    } catch (NumberFormatException e) {
                        zzdt.zzg("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                    zzdt.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                    return zzalbVar;
                }
            }
            int i15 = zzakzVar.zzf;
            boolean z4 = i15 != -1 && zze(strArrSplit[i15].trim());
            int i16 = zzakzVar.zzg;
            boolean z10 = i16 != -1 && zze(strArrSplit[i16].trim());
            int i17 = zzakzVar.zzh;
            boolean z11 = i17 != -1 && zze(strArrSplit[i17].trim());
            int i18 = zzakzVar.zzi;
            boolean z12 = i18 != -1 && zze(strArrSplit[i18].trim());
            int i19 = zzakzVar.zzj;
            if (i19 != -1) {
                String strTrim3 = strArrSplit[i19].trim();
                try {
                    int i20 = Integer.parseInt(strTrim3.trim());
                    if (i20 == 1 || i20 == 3) {
                        i = i20;
                    } else {
                        zzdt.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                        i = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                i = -1;
            }
            return new zzalb(strTrim, iZzd, numZzc, numZzc2, f10, z4, z10, z11, z12, i);
        } catch (RuntimeException e10) {
            e = e10;
            zzalbVar = zzalbVar;
        }
    }

    public static Integer zzc(String str) {
        try {
            long j4 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzdb.zzd(j4 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgcr.zzb(((j4 >> 24) & 255) ^ 255), zzgcr.zzb(j4 & 255), zzgcr.zzb((j4 >> 8) & 255), zzgcr.zzb((j4 >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzdt.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    q1.a.s(str, "Ignoring unknown alignment: ", "SsaStyle");
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static boolean zze(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            zzdt.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}

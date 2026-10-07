package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzakz {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzakz(int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = i18;
        this.zzk = i19;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzakz zza(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i10 != -1) {
                    return new zzakz(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, length);
                }
                return null;
            }
            String strZza = zzfwa.zza(strArrSplit[i].trim());
            switch (strZza.hashCode()) {
                case -1178781136:
                    if (strZza.equals("italic")) {
                        i16 = i;
                    }
                    break;
                case -1026963764:
                    if (strZza.equals("underline")) {
                        i17 = i;
                    }
                    break;
                case -192095652:
                    if (strZza.equals("strikeout")) {
                        i18 = i;
                    }
                    break;
                case -70925746:
                    if (strZza.equals("primarycolour")) {
                        i12 = i;
                    }
                    break;
                case 3029637:
                    if (strZza.equals("bold")) {
                        i15 = i;
                    }
                    break;
                case 3373707:
                    if (strZza.equals("name")) {
                        i10 = i;
                    }
                    break;
                case 366554320:
                    if (strZza.equals("fontsize")) {
                        i14 = i;
                    }
                    break;
                case 767321349:
                    if (strZza.equals("borderstyle")) {
                        i19 = i;
                    }
                    break;
                case 1767875043:
                    if (strZza.equals("alignment")) {
                        i11 = i;
                    }
                    break;
                case 1988365454:
                    if (strZza.equals("outlinecolour")) {
                        i13 = i;
                    }
                    break;
            }
            i++;
        }
    }
}

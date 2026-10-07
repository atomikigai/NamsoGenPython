package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzale {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfzt zze = zzfzt.zzp("auto", "none");
    private static final zzfzt zzf = zzfzt.zzq("dot", "sesame", "circle");
    private static final zzfzt zzg = zzfzt.zzp("filled", "open");
    private static final zzfzt zzh = zzfzt.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzale(int i, int i10, int i11) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    public static zzale zza(String str) {
        int i;
        if (str == null) {
            return null;
        }
        String strZza = zzfwa.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzfzt zzfztVarZzm = zzfzt.zzm(TextUtils.split(strZza, zzd));
        String str2 = (String) zzfzu.zza(zzgbq.zzb(zzh, zzfztVarZzm), "outside");
        int iHashCode = str2.hashCode();
        int i10 = 1;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                i = 2;
            } else {
                i = 1;
            }
        } else if (str2.equals("outside")) {
            i = -2;
        } else {
            i = 1;
        }
        zzgbo zzgboVarZzb = zzgbq.zzb(zze, zzfztVarZzm);
        int i11 = 0;
        if (zzgboVarZzb.isEmpty()) {
            zzgbo zzgboVarZzb2 = zzgbq.zzb(zzg, zzfztVarZzm);
            zzgbo zzgboVarZzb3 = zzgbq.zzb(zzf, zzfztVarZzm);
            if (zzgboVarZzb2.isEmpty() && zzgboVarZzb3.isEmpty()) {
                i10 = -1;
            } else {
                String str3 = (String) zzfzu.zza(zzgboVarZzb2, "filled");
                i11 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzfzu.zza(zzgboVarZzb3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i10 = 2;
                    }
                } else if (str4.equals("sesame")) {
                    i10 = 3;
                }
            }
        } else {
            String str5 = (String) zzgboVarZzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i10 = 0;
            } else {
                i10 = -1;
            }
        }
        return new zzale(i10, i11, i);
    }
}

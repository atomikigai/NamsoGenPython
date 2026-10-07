package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzakx {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzakx(int i, int i10, int i11, int i12, int i13) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzakx zza(String str) {
        zzdb.zzd(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i10 == -1 || i11 == -1 || i13 == -1) {
                    return null;
                }
                return new zzakx(i10, i11, i12, i13, length);
            }
            String strZza = zzfwa.zza(strArrSplit[i].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    if (strZza.equals("end")) {
                        i11 = i;
                    }
                    break;
                case 3556653:
                    if (strZza.equals("text")) {
                        i13 = i;
                    }
                    break;
                case 109757538:
                    if (strZza.equals("start")) {
                        i10 = i;
                    }
                    break;
                case 109780401:
                    if (strZza.equals("style")) {
                        i12 = i;
                    }
                    break;
            }
            i++;
        }
    }
}

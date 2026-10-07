package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacn {
    public final String zza;

    private zzacn(int i, int i10, String str) {
        this.zza = str;
    }

    public static zzacn zza(zzed zzedVar) {
        String str;
        zzedVar.zzM(2);
        int iZzm = zzedVar.zzm();
        int i = iZzm >> 1;
        int i10 = iZzm & 1;
        int iZzm2 = zzedVar.zzm() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i11 = iZzm2 | (i10 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i);
        sb2.append(i11 >= 10 ? "." : ".0");
        sb2.append(i11);
        return new zzacn(i, i11, sb2.toString());
    }
}

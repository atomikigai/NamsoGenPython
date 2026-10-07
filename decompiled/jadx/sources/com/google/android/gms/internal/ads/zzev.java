package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzev {
    public final int zzd;

    public static String zze(int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i >> 24) & 255));
        sb2.append((char) ((i >> 16) & 255));
        sb2.append((char) ((i >> 8) & 255));
        sb2.append((char) (i & 255));
        return sb2.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}

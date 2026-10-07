package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfnj {
    private final String zza;
    private final String zzb;

    private zzfnj(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfnj zza(String str, String str2) {
        zzfor.zzb(str, "Name is null or empty");
        zzfor.zzb(str2, "Version is null or empty");
        return new zzfnj(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}

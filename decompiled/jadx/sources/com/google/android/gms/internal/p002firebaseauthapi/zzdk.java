package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdk {
    public static final zzdk zza = new zzdk("SHA1");
    public static final zzdk zzb = new zzdk("SHA224");
    public static final zzdk zzc = new zzdk("SHA256");
    public static final zzdk zzd = new zzdk("SHA384");
    public static final zzdk zze = new zzdk("SHA512");
    private final String zzf;

    private zzdk(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqm {
    public static final zzqm zza = new zzqm("SHA1");
    public static final zzqm zzb = new zzqm("SHA224");
    public static final zzqm zzc = new zzqm("SHA256");
    public static final zzqm zzd = new zzqm("SHA384");
    public static final zzqm zze = new zzqm("SHA512");
    private final String zzf;

    private zzqm(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}

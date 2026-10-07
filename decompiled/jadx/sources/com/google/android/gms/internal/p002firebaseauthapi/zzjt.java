package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjt {
    public static final zzjt zza = new zzjt("SHA1");
    public static final zzjt zzb = new zzjt("SHA224");
    public static final zzjt zzc = new zzjt("SHA256");
    public static final zzjt zzd = new zzjt("SHA384");
    public static final zzjt zze = new zzjt("SHA512");
    private final String zzf;

    private zzjt(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}

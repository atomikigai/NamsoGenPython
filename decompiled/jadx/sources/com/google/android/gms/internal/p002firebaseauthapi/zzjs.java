package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjs {
    public static final zzjs zza = new zzjs("NIST_P256");
    public static final zzjs zzb = new zzjs("NIST_P384");
    public static final zzjs zzc = new zzjs("NIST_P521");
    public static final zzjs zzd = new zzjs("X25519");
    private final String zze;

    private zzjs(String str) {
        this.zze = str;
    }

    public final String toString() {
        return this.zze;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgjn {
    public static final zzgjn zza = new zzgjn("ASSUME_AES_GCM");
    public static final zzgjn zzb = new zzgjn("ASSUME_XCHACHA20POLY1305");
    public static final zzgjn zzc = new zzgjn("ASSUME_CHACHA20POLY1305");
    public static final zzgjn zzd = new zzgjn("ASSUME_AES_CTR_HMAC");
    public static final zzgjn zze = new zzgjn("ASSUME_AES_EAX");
    public static final zzgjn zzf = new zzgjn("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzgjn(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}

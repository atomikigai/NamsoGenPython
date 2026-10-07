package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaka {
    private static final zzajy zza = new zzajz();
    private static final zzajy zzb;

    static {
        zzajy zzajyVar = null;
        try {
            zzajyVar = (zzajy) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzajyVar;
    }

    public static zzajy zza() {
        zzajy zzajyVar = zzb;
        if (zzajyVar != null) {
            return zzajyVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzajy zzb() {
        return zza;
    }
}

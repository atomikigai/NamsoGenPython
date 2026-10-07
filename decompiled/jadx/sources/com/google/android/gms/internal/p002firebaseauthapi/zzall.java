package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzall {
    private static final zzalk zza;
    private static final zzalk zzb;

    static {
        zzalk zzalkVar = null;
        try {
            zzalkVar = (zzalk) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzalkVar;
        zzb = new zzalk();
    }

    public static zzalk zza() {
        return zza;
    }

    public static zzalk zzb() {
        return zzb;
    }
}

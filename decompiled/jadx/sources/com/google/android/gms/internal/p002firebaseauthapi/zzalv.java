package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalv {
    private static final zzalu zza;
    private static final zzalu zzb;

    static {
        zzalu zzaluVar = null;
        try {
            zzaluVar = (zzalu) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzaluVar;
        zzb = new zzalu();
    }

    public static zzalu zza() {
        return zza;
    }

    public static zzalu zzb() {
        return zzb;
    }
}

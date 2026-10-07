package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzakf implements zzaln {
    private static final zzakf zza = new zzakf();

    private zzakf() {
    }

    public static zzakf zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final zzalm zzb(Class cls) {
        if (!zzakk.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzalm) zzakk.zzv(cls.asSubclass(zzakk.class)).zzj(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final boolean zzc(Class cls) {
        return zzakk.class.isAssignableFrom(cls);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgyq implements zzhag {
    private static final zzgyq zza = new zzgyq();

    private zzgyq() {
    }

    public static zzgyq zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final zzhaf zzb(Class cls) {
        if (!zzgyx.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzhaf) zzgyx.zzbh(cls.asSubclass(zzgyx.class)).zzbO();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final boolean zzc(Class cls) {
        return zzgyx.class.isAssignableFrom(cls);
    }
}

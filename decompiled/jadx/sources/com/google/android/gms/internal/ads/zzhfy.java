package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhfy implements zzhfx, zzhfr {
    private static final zzhfy zza = new zzhfy(null);
    private final Object zzb;

    private zzhfy(Object obj) {
        this.zzb = obj;
    }

    public static zzhfx zza(Object obj) {
        zzhgf.zza(obj, "instance cannot be null");
        return new zzhfy(obj);
    }

    public static zzhfx zzc(Object obj) {
        return obj == null ? zza : new zzhfy(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        return this.zzb;
    }
}

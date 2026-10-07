package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhfv implements zzhfx {
    private zzhgg zza;

    public static void zza(zzhgg zzhggVar, zzhgg zzhggVar2) {
        zzhfv zzhfvVar = (zzhfv) zzhggVar;
        if (zzhfvVar.zza != null) {
            throw new IllegalStateException();
        }
        zzhfvVar.zza = zzhggVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzhgg zzhggVar = this.zza;
        if (zzhggVar != null) {
            return zzhggVar.zzb();
        }
        throw new IllegalStateException();
    }
}

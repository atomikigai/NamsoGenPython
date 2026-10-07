package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhgm implements zzhgg {
    private static final Object zza = new Object();
    private volatile zzhgg zzb;
    private volatile Object zzc = zza;

    private zzhgm(zzhgg zzhggVar) {
        this.zzb = zzhggVar;
    }

    public static zzhgg zza(zzhgg zzhggVar) {
        return ((zzhggVar instanceof zzhgm) || (zzhggVar instanceof zzhfw)) ? zzhggVar : new zzhgm(zzhggVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhgg zzhggVar = this.zzb;
        if (zzhggVar == null) {
            return this.zzc;
        }
        Object objZzb = zzhggVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}

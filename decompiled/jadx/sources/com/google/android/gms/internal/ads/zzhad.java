package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhad {
    public static final boolean zza(Object obj) {
        return !((zzhac) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhac zzhacVarZzb = (zzhac) obj;
        zzhac zzhacVar = (zzhac) obj2;
        if (!zzhacVar.isEmpty()) {
            if (!zzhacVarZzb.zze()) {
                zzhacVarZzb = zzhacVarZzb.zzb();
            }
            zzhacVarZzb.zzd(zzhacVar);
        }
        return zzhacVarZzb;
    }
}

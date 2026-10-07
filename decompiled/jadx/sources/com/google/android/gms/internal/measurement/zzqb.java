package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqb implements zzqa {
    public static final zzib zza;
    public static final zzib zzb;

    static {
        zzhy zzhyVarZza = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhyVarZza.zzf("measurement.collection.client.log_target_api_version", true);
        zzb = zzhyVarZza.zzf("measurement.collection.service.log_target_api_version", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqa
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqa
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqa
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}

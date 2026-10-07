package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpm implements zzpl {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;

    static {
        zzhy zzhyVarZza = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhyVarZza.zzf("measurement.client.global_params", true);
        zzb = zzhyVarZza.zzf("measurement.service.global_params_in_payload", true);
        zzc = zzhyVarZza.zzf("measurement.service.clear_global_params_on_uninstall", true);
        zzd = zzhyVarZza.zzf("measurement.service.global_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zzb() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrc implements zzrb {
    public static final zzib zza;
    public static final zzib zzb;

    static {
        zzhy zzhyVarZza = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzhyVarZza.zzf("measurement.sfmc.client", true);
        zzb = zzhyVarZza.zzf("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}

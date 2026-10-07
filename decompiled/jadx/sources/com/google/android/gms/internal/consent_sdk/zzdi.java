package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdi implements zzdk {
    private zzdn zza;

    public static void zzb(zzdn zzdnVar, zzdn zzdnVar2) {
        zzdi zzdiVar = (zzdi) zzdnVar;
        if (zzdiVar.zza != null) {
            throw new IllegalStateException();
        }
        zzdiVar.zza = zzdnVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final Object zza() {
        zzdn zzdnVar = this.zza;
        if (zzdnVar != null) {
            return zzdnVar.zza();
        }
        throw new IllegalStateException();
    }
}

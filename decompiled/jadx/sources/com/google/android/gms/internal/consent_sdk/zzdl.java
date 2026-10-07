package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdl implements zzdk {
    private final Object zza;

    private zzdl(Object obj) {
        this.zza = obj;
    }

    public static zzdk zzb(Object obj) {
        if (obj != null) {
            return new zzdl(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final Object zza() {
        return this.zza;
    }
}

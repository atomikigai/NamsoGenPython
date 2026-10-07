package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzal implements zzdk {
    private final zzdp zza;
    private final zzdp zzb;

    public zzal(zzdp zzdpVar, zzdp zzdpVar2, zzdp zzdpVar3) {
        this.zza = zzdpVar;
        this.zzb = zzdpVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzak zza() {
        return new zzak((Application) this.zza.zza(), (zzam) this.zzb.zza(), zzar.zzb());
    }
}

package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzag {
    private Application zza;

    private zzag() {
        throw null;
    }

    public final zza zza() {
        zzdm.zzb(this.zza, Application.class);
        return new zzaf(this.zza, null);
    }

    public final zzag zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }

    public /* synthetic */ zzag(zzaj zzajVar) {
    }
}

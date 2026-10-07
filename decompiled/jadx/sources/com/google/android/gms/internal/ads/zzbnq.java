package com.google.android.gms.internal.ads;

import e6.t;
import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbnq implements zzcaq {
    final /* synthetic */ zzbno zza;

    public zzbnq(zzbnt zzbntVar, zzbno zzbnoVar) {
        this.zza = zzbnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zza() {
        k0.k("Rejecting reference for JS Engine.");
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhq)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}

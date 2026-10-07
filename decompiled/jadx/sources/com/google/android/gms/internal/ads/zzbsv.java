package com.google.android.gms.internal.ads;

import n6.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsv extends zzbhl {
    private final e zza;

    public zzbsv(e eVar) {
        this.zza = eVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhm
    public final void zze(zzbhv zzbhvVar) {
        this.zza.onNativeAdLoaded(new zzbsp(zzbhvVar));
    }
}

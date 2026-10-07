package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgj implements zzgc {
    private final Context zza;
    private final zzgc zzb;

    public zzgj(Context context) {
        zzgl zzglVar = new zzgl();
        this.zza = context.getApplicationContext();
        this.zzb = zzglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final /* bridge */ /* synthetic */ zzgd zza() {
        return new zzgk(this.zza, ((zzgl) this.zzb).zza());
    }
}

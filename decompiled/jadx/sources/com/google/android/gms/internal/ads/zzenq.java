package com.google.android.gms.internal.ads;

import android.content.Context;
import e0.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzenq implements zzevz {
    private final Context zza;

    public zzenq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return zzgei.zzh(new zzenr(k.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}

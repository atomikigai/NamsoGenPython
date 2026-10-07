package com.google.android.gms.internal.ads;

import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzenx implements zzevz {
    private final n7.a zza;
    private final zzffo zzb;

    public zzenx(n7.a aVar, zzffo zzffoVar) {
        this.zza = aVar;
        this.zzb = zzffoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        n7.a aVar = this.zza;
        zzffo zzffoVar = this.zzb;
        ((b) aVar).getClass();
        return zzgei.zzh(new zzeny(zzffoVar, System.currentTimeMillis()));
    }
}

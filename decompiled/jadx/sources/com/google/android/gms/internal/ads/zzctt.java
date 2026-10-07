package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzctt implements e6.a {
    private final zzctx zza;
    private final zzffo zzb;

    public zzctt(zzctx zzctxVar, zzffo zzffoVar) {
        this.zza = zzctxVar;
        this.zzb = zzffoVar;
    }

    @Override // e6.a
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}

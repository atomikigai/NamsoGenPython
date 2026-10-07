package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfbo implements zzfhw {
    private final zzfck zza;

    public zzfbo(zzfck zzfckVar) {
        this.zza = zzfckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final m9.a zza(zzfhx zzfhxVar) {
        zzfbp zzfbpVar = (zzfbp) zzfhxVar;
        return ((zzfbl) this.zza).zzb(zzfbpVar.zzb, zzfbpVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final void zzb(zzfhl zzfhlVar) {
        zzfhlVar.zza = ((zzfbl) this.zza).zza();
    }
}

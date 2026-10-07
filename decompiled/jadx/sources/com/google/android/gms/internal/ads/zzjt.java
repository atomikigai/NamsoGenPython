package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzjt implements zzku {
    private final Object zza;
    private zzbv zzb;

    public zzjt(Object obj, zzum zzumVar) {
        this.zza = obj;
        this.zzb = zzumVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final zzbv zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzbv zzbvVar) {
        this.zzb = zzbvVar;
    }
}

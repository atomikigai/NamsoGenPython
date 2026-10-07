package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzftx extends zzfuj {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfuj zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfuj zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfuk zzc() {
        return new zzftz(this.zza, this.zzb, null);
    }
}

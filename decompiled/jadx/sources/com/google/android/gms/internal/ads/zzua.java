package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzua implements zzwi {
    private final zzwi zza;
    private final zzfzo zzb;

    public zzua(zzwi zzwiVar, List list) {
        this.zza = zzwiVar;
        this.zzb = zzfzo.zzl(list);
    }

    public final zzfzo zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j4) {
        this.zza.zzm(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        return this.zza.zzo(zzkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zza.zzp();
    }
}

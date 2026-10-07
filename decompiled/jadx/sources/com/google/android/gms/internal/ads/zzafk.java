package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafk implements zzacu {
    private final long zzb;
    private final zzacu zzc;

    public zzafk(long j4, zzacu zzacuVar) {
        this.zzb = j4;
        this.zzc = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzO(zzadq zzadqVar) {
        this.zzc.zzO(new zzafj(this, zzadqVar, zzadqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final zzadx zzw(int i, int i10) {
        return this.zzc.zzw(i, i10);
    }
}

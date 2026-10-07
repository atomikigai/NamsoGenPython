package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfzn extends zzfzo {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfzo zzc;

    public zzfzn(zzfzo zzfzoVar, int i, int i10) {
        this.zzc = zzfzoVar;
        this.zza = i;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfwq.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfzo, java.util.List
    /* JADX INFO: renamed from: zzh */
    public final zzfzo subList(int i, int i10) {
        zzfwq.zzj(i, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i + i11, i10 + i11);
    }
}

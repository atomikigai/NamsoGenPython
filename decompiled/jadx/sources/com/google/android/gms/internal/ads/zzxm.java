package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzxm extends zzxw implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxm(int i, zzbw zzbwVar, int i10, zzxp zzxpVar, int i11) {
        super(i, zzbwVar, i10);
        this.zze = zzlo.zza(i11, zzxpVar.zzN) ? 1 : 0;
        this.zzf = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxm zzxmVar) {
        return Integer.compare(this.zzf, zzxmVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final /* bridge */ /* synthetic */ boolean zzc(zzxw zzxwVar) {
        return false;
    }
}

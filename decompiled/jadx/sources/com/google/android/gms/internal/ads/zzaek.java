package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaek implements zzaef {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaek(int i, int i10, int i11, int i12) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
    }

    public static zzaek zzb(zzed zzedVar) {
        int iZzi = zzedVar.zzi();
        zzedVar.zzM(8);
        int iZzi2 = zzedVar.zzi();
        int iZzi3 = zzedVar.zzi();
        zzedVar.zzM(4);
        int iZzi4 = zzedVar.zzi();
        zzedVar.zzM(12);
        return new zzaek(iZzi, iZzi2, iZzi3, iZzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final int zza() {
        return 1751742049;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzael implements zzaef {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzael(int i, int i10, int i11, int i12, int i13, int i14) {
        this.zza = i;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
    }

    public static zzael zzb(zzed zzedVar) {
        int iZzi = zzedVar.zzi();
        zzedVar.zzM(12);
        int iZzi2 = zzedVar.zzi();
        int iZzi3 = zzedVar.zzi();
        int iZzi4 = zzedVar.zzi();
        zzedVar.zzM(4);
        int iZzi5 = zzedVar.zzi();
        int iZzi6 = zzedVar.zzi();
        zzedVar.zzM(8);
        return new zzael(iZzi, iZzi2, iZzi3, iZzi4, iZzi5, iZzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final int zza() {
        return 1752331379;
    }
}

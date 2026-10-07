package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaid {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzed zzf;
    private final zzed zzg;
    private int zzh;
    private int zzi;

    public zzaid(zzed zzedVar, zzed zzedVar2, boolean z4) throws zzbh {
        this.zzg = zzedVar;
        this.zzf = zzedVar2;
        this.zze = z4;
        zzedVar2.zzL(12);
        this.zza = zzedVar2.zzp();
        zzedVar.zzL(12);
        this.zzi = zzedVar.zzp();
        zzacv.zzb(zzedVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzw() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzM(4);
            int i10 = this.zzi - 1;
            this.zzi = i10;
            this.zzh = i10 > 0 ? (-1) + this.zzg.zzp() : -1;
        }
        return true;
    }
}

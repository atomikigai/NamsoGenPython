package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzanl {
    private final zzamm zza;
    private final zzek zzb;
    private final zzec zzc = new zzec(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzanl(zzamm zzammVar, zzek zzekVar) {
        this.zza = zzammVar;
        this.zzb = zzekVar;
    }

    public final void zza(zzed zzedVar) throws zzbh {
        long jZzb;
        char c10;
        zzedVar.zzH(this.zzc.zza, 0, 3);
        this.zzc.zzl(0);
        this.zzc.zzn(8);
        this.zzd = this.zzc.zzp();
        this.zze = this.zzc.zzp();
        this.zzc.zzn(6);
        zzec zzecVar = this.zzc;
        zzedVar.zzH(zzecVar.zza, 0, zzecVar.zzd(8));
        this.zzc.zzl(0);
        if (this.zzd) {
            this.zzc.zzn(4);
            long jZzd = this.zzc.zzd(3);
            this.zzc.zzn(1);
            int iZzd = this.zzc.zzd(15) << 15;
            this.zzc.zzn(1);
            long jZzd2 = this.zzc.zzd(15);
            this.zzc.zzn(1);
            if (this.zzf || !this.zze) {
                c10 = 30;
            } else {
                this.zzc.zzn(4);
                long jZzd3 = ((long) this.zzc.zzd(3)) << 30;
                this.zzc.zzn(1);
                int iZzd2 = this.zzc.zzd(15) << 15;
                this.zzc.zzn(1);
                long jZzd4 = this.zzc.zzd(15);
                this.zzc.zzn(1);
                c10 = 30;
                this.zzb.zzb(jZzd3 | ((long) iZzd2) | jZzd4);
                this.zzf = true;
            }
            jZzb = this.zzb.zzb((jZzd << c10) | ((long) iZzd) | jZzd2);
        } else {
            jZzb = 0;
        }
        this.zza.zzd(jZzb, 4);
        this.zza.zza(zzedVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzced implements zzkl {
    private final zzys zza = new zzys(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza(boolean z4) {
        this.zzf = 0;
        this.zzg = false;
        if (z4) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final long zzb(zzoj zzojVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzc(zzoj zzojVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzd(zzoj zzojVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zze(zzoj zzojVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzf(zzoj zzojVar, zzbv zzbvVar, zzur zzurVar, zzln[] zzlnVarArr, zzwr zzwrVar, zzyd[] zzydVarArr) {
        int i = 0;
        this.zzf = 0;
        while (true) {
            int length = zzlnVarArr.length;
            if (i >= 2) {
                this.zza.zzf(this.zzf);
                return;
            } else {
                if (zzydVarArr[i] != null) {
                    this.zzf += zzlnVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzg(zzoj zzojVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzh(zzkk zzkkVar) {
        char c10;
        long j4 = zzkkVar.zzb;
        boolean z4 = true;
        if (j4 > this.zzc) {
            c10 = 0;
        } else {
            c10 = j4 < this.zzb ? (char) 2 : (char) 1;
        }
        int iZza = this.zza.zza();
        int i = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || iZza >= i)) {
            z4 = false;
        }
        this.zzg = z4;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzi(zzkk zzkkVar) {
        long j4 = zzkkVar.zzd ? this.zze : this.zzd;
        return j4 <= 0 || zzkkVar.zzb >= j4;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzys zzj() {
        return this.zza;
    }

    public final synchronized void zzk(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzb = ((long) i) * 1000;
    }
}

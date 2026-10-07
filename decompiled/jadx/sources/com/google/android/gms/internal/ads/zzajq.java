package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajq {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzed zzg = new zzed(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzacs zzacsVar, boolean z4) throws IOException {
        zza();
        this.zzg.zzI(27);
        if (zzacv.zzc(zzacsVar, this.zzg.zzN(), 0, 27, z4) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z4) {
                    return false;
                }
                throw zzbh.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int iZzm = this.zzg.zzm();
            this.zzc = iZzm;
            this.zzd = iZzm + 27;
            this.zzg.zzI(iZzm);
            if (zzacv.zzc(zzacsVar, this.zzg.zzN(), 0, this.zzc, z4)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzm();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzacs zzacsVar, long j4) throws IOException {
        zzdb.zzd(zzacsVar.zzf() == zzacsVar.zze());
        this.zzg.zzI(4);
        while (true) {
            if ((j4 != -1 && zzacsVar.zzf() + 4 >= j4) || !zzacv.zzc(zzacsVar, this.zzg.zzN(), 0, 4, true)) {
                break;
            }
            this.zzg.zzL(0);
            if (this.zzg.zzu() == 1332176723) {
                zzacsVar.zzj();
                return true;
            }
            zzacsVar.zzk(1);
        }
        do {
            if (j4 != -1 && zzacsVar.zzf() >= j4) {
                break;
            }
        } while (zzacsVar.zzc(1) != -1);
        return false;
    }
}

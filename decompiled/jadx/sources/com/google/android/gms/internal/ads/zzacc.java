package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzacc {
    protected final zzabw zza;
    protected final zzacb zzb;
    protected zzaby zzc;
    private final int zzd;

    public zzacc(zzabz zzabzVar, zzacb zzacbVar, long j4, long j10, long j11, long j12, long j13, long j14, int i) {
        this.zzb = zzacbVar;
        this.zzd = i;
        this.zza = new zzabw(zzabzVar, j4, 0L, j11, j12, j13, j14);
    }

    public static final int zzf(zzacs zzacsVar, long j4, zzadn zzadnVar) {
        if (j4 == zzacsVar.zzf()) {
            return 0;
        }
        zzadnVar.zza = j4;
        return 1;
    }

    public static final boolean zzg(zzacs zzacsVar, long j4) throws IOException {
        long jZzf = j4 - zzacsVar.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        zzacsVar.zzk((int) jZzf);
        return true;
    }

    public final int zza(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        while (true) {
            zzaby zzabyVar = this.zzc;
            zzdb.zzb(zzabyVar);
            long j4 = zzabyVar.zzf;
            long j10 = zzabyVar.zzg;
            long j11 = zzabyVar.zzh;
            if (j10 - j4 <= this.zzd) {
                zzc(false, j4);
                return zzf(zzacsVar, j4, zzadnVar);
            }
            if (!zzg(zzacsVar, j11)) {
                return zzf(zzacsVar, j11, zzadnVar);
            }
            zzacsVar.zzj();
            zzaca zzacaVarZza = this.zzb.zza(zzacsVar, zzabyVar.zzb);
            int i = zzacaVarZza.zzb;
            if (i == -3) {
                zzc(false, j11);
                return zzf(zzacsVar, j11, zzadnVar);
            }
            if (i == -2) {
                zzaby.zzh(zzabyVar, zzacaVarZza.zzc, zzacaVarZza.zzd);
            } else {
                if (i != -1) {
                    zzg(zzacsVar, zzacaVarZza.zzd);
                    zzc(true, zzacaVarZza.zzd);
                    return zzf(zzacsVar, zzacaVarZza.zzd, zzadnVar);
                }
                zzaby.zzg(zzabyVar, zzacaVarZza.zzc, zzacaVarZza.zzd);
            }
        }
    }

    public final zzadq zzb() {
        return this.zza;
    }

    public final void zzc(boolean z4, long j4) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j4) {
        zzaby zzabyVar = this.zzc;
        if (zzabyVar == null || zzabyVar.zza != j4) {
            zzabw zzabwVar = this.zza;
            this.zzc = new zzaby(j4, zzabwVar.zzf(j4), 0L, zzabwVar.zzc, zzabwVar.zzd, zzabwVar.zze, zzabwVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}

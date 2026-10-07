package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzajw {
    private zzadx zzb;
    private zzacu zzc;
    private zzajr zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajp zza = new zzajp();
    private zzajt zzj = new zzajt();

    public abstract long zza(zzed zzedVar);

    public void zzb(boolean z4) {
        int i;
        if (z4) {
            this.zzj = new zzajt();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzed zzedVar, long j4, zzajt zzajtVar) throws IOException;

    public final int zze(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        zzdb.zzb(this.zzb);
        int i = zzen.zza;
        int i10 = this.zzh;
        if (i10 == 0) {
            while (this.zza.zze(zzacsVar)) {
                long jZzf = zzacsVar.zzf();
                long j4 = this.zzf;
                this.zzk = jZzf - j4;
                if (!zzc(this.zza.zza(), j4, this.zzj)) {
                    zzad zzadVar = this.zzj.zza;
                    this.zzi = zzadVar.zzD;
                    if (!this.zzm) {
                        this.zzb.zzl(zzadVar);
                        this.zzm = true;
                    }
                    zzajr zzajrVar = this.zzj.zzb;
                    if (zzajrVar != null) {
                        this.zzd = zzajrVar;
                    } else if (zzacsVar.zzd() == -1) {
                        this.zzd = new zzaju(null);
                    } else {
                        zzajq zzajqVarZzb = this.zza.zzb();
                        this.zzd = new zzajl(this, this.zzf, zzacsVar.zzd(), zzajqVarZzb.zzd + zzajqVarZzb.zze, zzajqVarZzb.zzb, (zzajqVarZzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzacsVar.zzf();
            }
            this.zzh = 3;
            return -1;
        }
        if (i10 == 1) {
            zzacsVar.zzk((int) this.zzf);
            this.zzh = 2;
            return 0;
        }
        if (i10 != 2) {
            return -1;
        }
        long jZzd = this.zzd.zzd(zzacsVar);
        if (jZzd >= 0) {
            zzadnVar.zza = jZzd;
            return 1;
        }
        if (jZzd < -1) {
            zzi(-(jZzd + 2));
        }
        if (!this.zzl) {
            zzadq zzadqVarZze = this.zzd.zze();
            zzdb.zzb(zzadqVarZze);
            this.zzc.zzO(zzadqVarZze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzacsVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzed zzedVarZza = this.zza.zza();
        long jZza = zza(zzedVarZza);
        if (jZza >= 0) {
            long j10 = this.zzg;
            if (j10 + jZza >= this.zze) {
                long jZzf2 = zzf(j10);
                this.zzb.zzq(zzedVarZza, zzedVarZza.zze());
                this.zzb.zzs(jZzf2, 1, zzedVarZza.zze(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += jZza;
        return 0;
    }

    public final long zzf(long j4) {
        return (j4 * 1000000) / ((long) this.zzi);
    }

    public final long zzg(long j4) {
        return (((long) this.zzi) * j4) / 1000000;
    }

    public final void zzh(zzacu zzacuVar, zzadx zzadxVar) {
        this.zzc = zzacuVar;
        this.zzb = zzadxVar;
        zzb(true);
    }

    public void zzi(long j4) {
        this.zzg = j4;
    }

    public final void zzj(long j4, long j10) {
        this.zza.zzc();
        if (j4 == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzg = zzg(j10);
            this.zze = jZzg;
            zzajr zzajrVar = this.zzd;
            int i = zzen.zza;
            zzajrVar.zzg(jZzg);
            this.zzh = 2;
        }
    }
}

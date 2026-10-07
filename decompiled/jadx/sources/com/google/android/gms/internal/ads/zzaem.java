package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaem {
    protected final zzadx zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private long[] zzl;
    private int[] zzm;

    public zzaem(int i, int i10, long j4, int i11, zzadx zzadxVar) {
        i10 = i10 != 1 ? 2 : i10;
        this.zzd = j4;
        this.zze = i11;
        this.zza = zzadxVar;
        this.zzb = zzh(i, i10 == 2 ? 1667497984 : 1651965952);
        this.zzc = i10 == 2 ? zzh(i, 1650720768) : -1;
        this.zzk = -1L;
        this.zzl = new long[512];
        this.zzm = new int[512];
    }

    private static int zzh(int i, int i10) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i10;
    }

    private final long zzi(int i) {
        return (this.zzd * ((long) i)) / ((long) this.zze);
    }

    private final zzadr zzj(int i) {
        return new zzadr(((long) this.zzm[i]) * zzi(1), this.zzl[i]);
    }

    public final zzado zza(long j4) {
        if (this.zzj == 0) {
            zzadr zzadrVar = new zzadr(0L, this.zzk);
            return new zzado(zzadrVar, zzadrVar);
        }
        int iZzi = (int) (j4 / zzi(1));
        int iZzc = zzen.zzc(this.zzm, iZzi, true, true);
        if (this.zzm[iZzc] == iZzi) {
            zzadr zzadrVarZzj = zzj(iZzc);
            return new zzado(zzadrVarZzj, zzadrVarZzj);
        }
        zzadr zzadrVarZzj2 = zzj(iZzc);
        int i = iZzc + 1;
        return i < this.zzl.length ? new zzado(zzadrVarZzj2, zzj(i)) : new zzado(zzadrVarZzj2, zzadrVarZzj2);
    }

    public final void zzb(long j4, boolean z4) {
        if (this.zzk == -1) {
            this.zzk = j4;
        }
        if (z4) {
            if (this.zzj == this.zzm.length) {
                long[] jArr = this.zzl;
                this.zzl = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzm;
                this.zzm = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzl;
            int i = this.zzj;
            jArr2[i] = j4;
            this.zzm[i] = this.zzi;
            this.zzj = i + 1;
        }
        this.zzi++;
    }

    public final void zzc() {
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
        this.zzm = Arrays.copyOf(this.zzm, this.zzj);
    }

    public final void zzd(int i) {
        this.zzf = i;
        this.zzg = i;
    }

    public final void zze(long j4) {
        if (this.zzj == 0) {
            this.zzh = 0;
        } else {
            this.zzh = this.zzm[zzen.zzd(this.zzl, j4, true, true)];
        }
    }

    public final boolean zzf(int i) {
        return this.zzb == i || this.zzc == i;
    }

    public final boolean zzg(zzacs zzacsVar) throws IOException {
        int i = this.zzg;
        int iZzf = i - this.zza.zzf(zzacsVar, i, false);
        this.zzg = iZzf;
        boolean z4 = iZzf == 0;
        if (z4) {
            if (this.zzf > 0) {
                this.zza.zzs(zzi(this.zzh), Arrays.binarySearch(this.zzm, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z4;
    }
}

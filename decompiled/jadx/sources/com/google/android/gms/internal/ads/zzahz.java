package com.google.android.gms.internal.ads;

import da.v;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzahz implements zzahy {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahz(long[] jArr, long[] jArr2, long j4, long j10, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j4;
        this.zzd = j10;
        this.zze = i;
    }

    public static zzahz zzb(long j4, long j10, zzadj zzadjVar, zzed zzedVar) {
        int iZzm;
        zzedVar.zzM(10);
        int iZzg = zzedVar.zzg();
        if (iZzg <= 0) {
            return null;
        }
        int i = zzadjVar.zzd;
        long jZzu = zzen.zzu(iZzg, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i, RoundingMode.FLOOR);
        int iZzq = zzedVar.zzq();
        int iZzq2 = zzedVar.zzq();
        int iZzq3 = zzedVar.zzq();
        zzedVar.zzM(2);
        long j11 = j10 + ((long) zzadjVar.zzc);
        long[] jArr = new long[iZzq];
        long[] jArr2 = new long[iZzq];
        int i10 = 0;
        long j12 = j10;
        while (i10 < iZzq) {
            long j13 = jZzu;
            jArr[i10] = (((long) i10) * j13) / ((long) iZzq);
            jArr2[i10] = Math.max(j12, j11);
            if (iZzq3 == 1) {
                iZzm = zzedVar.zzm();
            } else if (iZzq3 == 2) {
                iZzm = zzedVar.zzq();
            } else if (iZzq3 == 3) {
                iZzm = zzedVar.zzo();
            } else {
                if (iZzq3 != 4) {
                    return null;
                }
                iZzm = zzedVar.zzp();
            }
            j12 += ((long) iZzm) * ((long) iZzq2);
            i10++;
            iZzq = iZzq;
            jZzu = j13;
        }
        long j14 = jZzu;
        if (j4 != -1 && j4 != j12) {
            StringBuilder sbL = v.l("VBRI data size mismatch: ", ", ", j4);
            sbL.append(j12);
            zzdt.zzf("VbriSeeker", sbL.toString());
        }
        return new zzahz(jArr, jArr2, j14, j12, zzadjVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zze(long j4) {
        return this.zza[zzen.zzd(this.zzb, j4, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        long[] jArr = this.zza;
        int iZzd = zzen.zzd(jArr, j4, true, true);
        zzadr zzadrVar = new zzadr(jArr[iZzd], this.zzb[iZzd]);
        if (zzadrVar.zzb < j4) {
            long[] jArr2 = this.zza;
            if (iZzd != jArr2.length - 1) {
                int i = iZzd + 1;
                return new zzado(zzadrVar, new zzadr(jArr2[i], this.zzb[i]));
            }
        }
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}

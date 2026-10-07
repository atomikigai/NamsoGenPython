package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzajh {
    public final zzaje zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzajh(zzaje zzajeVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j4) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzdb.zzd(length == length2);
        int length3 = jArr.length;
        zzdb.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdb.zzd(length4 == length2);
        this.zza = zzajeVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j4;
        this.zzb = length3;
        if (length4 > 0) {
            int i10 = length4 - 1;
            iArr2[i10] = iArr2[i10] | 536870912;
        }
    }

    public final int zza(long j4) {
        for (int iZzd = zzen.zzd(this.zzf, j4, true, false); iZzd >= 0; iZzd--) {
            if ((this.zzg[iZzd] & 1) != 0) {
                return iZzd;
            }
        }
        return -1;
    }

    public final int zzb(long j4) {
        for (int iZza = zzen.zza(this.zzf, j4, true, false); iZza < this.zzf.length; iZza++) {
            if ((this.zzg[iZza] & 1) != 0) {
                return iZza;
            }
        }
        return -1;
    }
}

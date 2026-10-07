package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzace implements zzadq {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzace(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        StringBuilder sb2 = new StringBuilder("ChunkIndex(length=");
        sb2.append(this.zza);
        sb2.append(", sizes=");
        sb2.append(string);
        sb2.append(", offsets=");
        sb2.append(string2);
        sb2.append(", timeUs=");
        sb2.append(string3);
        sb2.append(", durationsUs=");
        return q1.a.m(sb2, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        long[] jArr = this.zze;
        int iZzd = zzen.zzd(jArr, j4, true, true);
        zzadr zzadrVar = new zzadr(jArr[iZzd], this.zzc[iZzd]);
        if (zzadrVar.zzb >= j4 || iZzd == this.zza - 1) {
            return new zzado(zzadrVar, zzadrVar);
        }
        int i = iZzd + 1;
        return new zzado(zzadrVar, new zzadr(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}

package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdv {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzdv() {
        throw null;
    }

    public final long zza() {
        if (this.zzb != 0) {
            return this.zzc[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i = this.zzb;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzc;
        int i10 = this.zza;
        long j4 = jArr[i10];
        this.zza = this.zzd & (i10 + 1);
        this.zzb = i - 1;
        return j4;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzd() {
        return this.zzb == 0;
    }

    public zzdv(int i) {
        int i10 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        this.zza = 0;
        this.zzb = 0;
        long[] jArr = new long[i10];
        this.zzc = jArr;
        this.zzd = jArr.length - 1;
    }
}

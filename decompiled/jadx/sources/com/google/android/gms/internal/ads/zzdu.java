package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdu {
    private int zza;
    private long[] zzb;

    public zzdu() {
        throw null;
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i) {
        if (i < 0 || i >= this.zza) {
            throw new IndexOutOfBoundsException(q1.a.i(i, this.zza, "Invalid index ", ", size is "));
        }
        return this.zzb[i];
    }

    public final void zzc(long j4) {
        int i = this.zza;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.zzb;
        int i10 = this.zza;
        this.zza = i10 + 1;
        jArr2[i10] = j4;
    }

    public final void zzd(long[] jArr) {
        int i = this.zza;
        int length = jArr.length;
        int i10 = i + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i10 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i10));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i10;
    }

    public zzdu(int i) {
        this.zzb = new long[i];
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzej {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzej() {
        throw null;
    }

    private final Object zzf() {
        zzdb.zzf(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i = this.zzc;
        Object obj = objArr[i];
        objArr[i] = null;
        this.zzc = (i + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized int zza() {
        return this.zzd;
    }

    public final synchronized Object zzb() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized Object zzc(long j4) {
        Object objZzf;
        objZzf = null;
        while (this.zzd > 0 && j4 - this.zza[this.zzc] >= 0) {
            objZzf = zzf();
        }
        return objZzf;
    }

    public final synchronized void zzd(long j4, Object obj) {
        try {
            int i = this.zzd;
            if (i > 0) {
                if (j4 <= this.zza[((this.zzc + i) - 1) % this.zzb.length]) {
                    zze();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i10 = length + length;
                long[] jArr = new long[i10];
                Object[] objArr = new Object[i10];
                int i11 = this.zzc;
                int i12 = length - i11;
                System.arraycopy(this.zza, i11, jArr, 0, i12);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i12);
                int i13 = this.zzc;
                if (i13 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i12, i13);
                    System.arraycopy(this.zzb, 0, objArr, i12, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i14 = this.zzc;
            int i15 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i14 + i15) % objArr2.length;
            this.zza[length2] = j4;
            objArr2[length2] = obj;
            this.zzd = i15 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zze() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public zzej(int i) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}

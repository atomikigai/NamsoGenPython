package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzahs {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i) {
        int i10 = 0;
        while (i10 < 8) {
            int i11 = i10 + 1;
            if ((zza[i10] & ((long) i)) != 0) {
                return i11;
            }
            i10 = i11;
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i, boolean z4) {
        long j4 = ((long) bArr[0]) & 255;
        if (z4) {
            j4 &= ~zza[i - 1];
        }
        for (int i10 = 1; i10 < i; i10++) {
            j4 = (j4 << 8) | (((long) bArr[i10]) & 255);
        }
        return j4;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(zzacs zzacsVar, boolean z4, boolean z10, int i) throws IOException {
        if (this.zzc == 0) {
            if (!zzacsVar.zzn(this.zzb, 0, 1, z4)) {
                return -1L;
            }
            int iZzb = zzb(this.zzb[0] & 255);
            this.zzd = iZzb;
            if (iZzb == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i10 = this.zzd;
        if (i10 > i) {
            this.zzc = 0;
            return -2L;
        }
        if (i10 != 1) {
            zzacsVar.zzi(this.zzb, 1, i10 - 1);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z10);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaoc {
    public static int zza(byte[] bArr, int i, int i10) {
        while (i < i10 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzed zzedVar, int i, int i10) {
        zzedVar.zzL(i);
        if (zzedVar.zzb() < 5) {
            return -9223372036854775807L;
        }
        int iZzg = zzedVar.zzg();
        if ((8388608 & iZzg) != 0 || ((iZzg >> 8) & 8191) != i10 || (iZzg & 32) == 0 || zzedVar.zzm() < 7 || zzedVar.zzb() < 7 || (zzedVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzedVar.zzH(bArr, 0, 6);
        long j4 = bArr[0];
        long j10 = bArr[1];
        long j11 = bArr[2];
        long j12 = bArr[3] & 255;
        return ((j4 & 255) << 25) | ((j10 & 255) << 17) | ((j11 & 255) << 9) | (j12 + j12) | ((((long) bArr[4]) & 255) >> 7);
    }
}

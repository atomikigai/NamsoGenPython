package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadk {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!zzm(i) || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = i12 - 1;
        int i16 = zzb[i13];
        if (i10 == 2) {
            i16 /= 2;
        } else if (i10 == 0) {
            i16 /= 4;
        }
        int i17 = (i >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? zzc[i15] : zzd[i15]) * 12) / i16) + i17) * 4;
        }
        if (i10 == 3) {
            i14 = i11 == 2 ? zze[i15] : zzf[i15];
        } else {
            i14 = zzg[i15];
        }
        if (i10 == 3) {
            return q1.a.u(i14, 144, i16, i17);
        }
        return q1.a.u(i11 == 1 ? 72 : 144, i14, i16, i17);
    }

    public static int zzc(int i) {
        int i10;
        int i11;
        if (!zzm(i) || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = i >>> 12;
        int i13 = (i >>> 10) & 3;
        int i14 = i12 & 15;
        if (i14 == 0 || i14 == 15 || i13 == 3) {
            return -1;
        }
        return zzl(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i, int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 384 : 1152;
        }
        return i == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i) {
        return (i & (-2097152)) == -2097152;
    }
}

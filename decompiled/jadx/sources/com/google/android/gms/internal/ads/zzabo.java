package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzabo {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabm zza(byte[] bArr) throws zzbh {
        return zzb(new zzec(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzabm zzb(com.google.android.gms.internal.ads.zzec r11, boolean r12) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabo.zzb(com.google.android.gms.internal.ads.zzec, boolean):com.google.android.gms.internal.ads.zzabm");
    }

    private static int zzc(zzec zzecVar) {
        int iZzd = zzecVar.zzd(5);
        return iZzd == 31 ? zzecVar.zzd(6) + 32 : iZzd;
    }

    private static int zzd(zzec zzecVar) throws zzbh {
        int iZzd = zzecVar.zzd(4);
        if (iZzd == 15) {
            if (zzecVar.zza() >= 24) {
                return zzecVar.zzd(24);
            }
            throw zzbh.zza("AAC header insufficient data", null);
        }
        if (iZzd < 13) {
            return zzb[iZzd];
        }
        throw zzbh.zza("AAC header wrong Sampling Frequency Index", null);
    }
}

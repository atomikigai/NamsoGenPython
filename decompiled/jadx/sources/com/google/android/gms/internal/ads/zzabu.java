package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzabu {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, zzbbs.zzq.zzf, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    public static zzabs zza(zzec zzecVar) {
        int i;
        int iZzd;
        int iZzd2 = zzecVar.zzd(16);
        int iZzd3 = zzecVar.zzd(16);
        if (iZzd3 == 65535) {
            iZzd3 = zzecVar.zzd(24);
            i = 7;
        } else {
            i = 4;
        }
        int i10 = iZzd3 + i;
        if (iZzd2 == 44097) {
            i10 += 2;
        }
        int i11 = i10;
        int iZzd4 = zzecVar.zzd(2);
        int i12 = 0;
        if (iZzd4 == 3) {
            int i13 = 0;
            while (true) {
                iZzd = zzecVar.zzd(2) + i13;
                if (!zzecVar.zzp()) {
                    break;
                }
                i13 = (iZzd + 1) << 2;
            }
            iZzd4 = iZzd + 3;
        }
        int i14 = iZzd4;
        int iZzd5 = zzecVar.zzd(10);
        if (zzecVar.zzp() && zzecVar.zzd(3) > 0) {
            zzecVar.zzn(2);
        }
        int i15 = 48000;
        if (true != zzecVar.zzp()) {
            i15 = 44100;
        }
        int iZzd6 = zzecVar.zzd(4);
        if (i15 == 44100 && iZzd6 == 13) {
            i12 = zzb[13];
        } else if (i15 == 48000 && iZzd6 < 14) {
            i12 = zzb[iZzd6];
            int i16 = iZzd5 % 5;
            if (i16 == 1) {
                if (iZzd6 != 3 || iZzd6 == 8) {
                    i12++;
                }
            } else if (i16 != 2) {
                if (i16 != 3) {
                    if (i16 == 4 && (iZzd6 == 3 || iZzd6 == 8 || iZzd6 == 11)) {
                        i12++;
                    }
                } else if (iZzd6 != 3) {
                    i12++;
                } else {
                    i12++;
                }
            } else if (iZzd6 == 8 || iZzd6 == 11) {
                i12++;
            }
        }
        return new zzabs(i14, 2, i15, i11, i12, null);
    }

    public static void zzb(int i, zzed zzedVar) {
        zzedVar.zzI(7);
        byte[] bArrZzN = zzedVar.zzN();
        bArrZzN[0] = -84;
        bArrZzN[1] = 64;
        bArrZzN[2] = -1;
        bArrZzN[3] = -1;
        bArrZzN[4] = (byte) ((i >> 16) & 255);
        bArrZzN[5] = (byte) ((i >> 8) & 255);
        bArrZzN[6] = (byte) (i & 255);
    }
}

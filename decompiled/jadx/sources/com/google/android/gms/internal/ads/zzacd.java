package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacd {
    public static void zza(long j4, zzed zzedVar, zzadx[] zzadxVarArr) {
        int iZzg;
        while (true) {
            if (zzedVar.zzb() <= 1) {
                return;
            }
            int iZzc = zzc(zzedVar);
            int iZzc2 = zzc(zzedVar);
            int iZzd = zzedVar.zzd() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzedVar.zzb()) {
                zzdt.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzd = zzedVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzm = zzedVar.zzm();
                int iZzq = zzedVar.zzq();
                if (iZzq == 49) {
                    iZzg = zzedVar.zzg();
                    iZzq = 49;
                } else {
                    iZzg = 0;
                }
                int iZzm2 = zzedVar.zzm();
                if (iZzq == 47) {
                    zzedVar.zzM(1);
                    iZzq = 47;
                }
                boolean z4 = iZzm == 181 && (iZzq == 49 || iZzq == 47) && iZzm2 == 3;
                if (iZzq == 49) {
                    z4 &= iZzg == 1195456820;
                }
                if (z4) {
                    zzb(j4, zzedVar, zzadxVarArr);
                }
            }
            zzedVar.zzL(iZzd);
        }
    }

    public static void zzb(long j4, zzed zzedVar, zzadx[] zzadxVarArr) {
        int iZzm = zzedVar.zzm();
        if ((iZzm & 64) != 0) {
            int i = iZzm & 31;
            zzedVar.zzM(1);
            int iZzd = zzedVar.zzd();
            for (zzadx zzadxVar : zzadxVarArr) {
                int i10 = i * 3;
                zzedVar.zzL(iZzd);
                zzadxVar.zzq(zzedVar, i10);
                zzdb.zzf(j4 != -9223372036854775807L);
                zzadxVar.zzs(j4, 1, i10, 0, null);
            }
        }
    }

    private static int zzc(zzed zzedVar) {
        int i = 0;
        while (zzedVar.zzb() != 0) {
            int iZzm = zzedVar.zzm();
            i += iZzm;
            if (iZzm != 255) {
                return i;
            }
        }
        return -1;
    }
}

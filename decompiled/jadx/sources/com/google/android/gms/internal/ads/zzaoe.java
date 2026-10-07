package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaoe implements zzaof {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacu zzc;
    private final zzadx zzd;
    private final zzaoi zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzed zzh;
    private final int zzi;
    private final zzad zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaoe(zzacu zzacuVar, zzadx zzadxVar, zzaoi zzaoiVar) throws zzbh {
        this.zzc = zzacuVar;
        this.zzd = zzadxVar;
        this.zze = zzaoiVar;
        int iMax = Math.max(1, zzaoiVar.zzc / 10);
        this.zzi = iMax;
        zzed zzedVar = new zzed(zzaoiVar.zzf);
        zzedVar.zzk();
        int iZzk = zzedVar.zzk();
        this.zzf = iZzk;
        int i = zzaoiVar.zzb;
        int i10 = zzaoiVar.zzd;
        int iU = q1.a.u(i10 - (i * 4), 8, zzaoiVar.zze * i, 1);
        if (iZzk != iU) {
            throw zzbh.zza("Expected frames per block: " + iU + "; got: " + iZzk, null);
        }
        int i11 = zzen.zza;
        int i12 = ((iMax + iZzk) - 1) / iZzk;
        this.zzg = new byte[i10 * i12];
        this.zzh = new zzed((iZzk + iZzk) * i * i12);
        int i13 = ((zzaoiVar.zzc * zzaoiVar.zzd) * 8) / iZzk;
        zzab zzabVar = new zzab();
        zzabVar.zzZ("audio/raw");
        zzabVar.zzy(i13);
        zzabVar.zzU(i13);
        zzabVar.zzQ((iMax + iMax) * i);
        zzabVar.zzz(zzaoiVar.zzb);
        zzabVar.zzaa(zzaoiVar.zzc);
        zzabVar.zzT(2);
        this.zzj = zzabVar.zzaf();
    }

    private final int zzd(int i) {
        int i10 = this.zze.zzb;
        return i / (i10 + i10);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long jZzu = this.zzl + zzen.zzu(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int iZze = zze(i);
        this.zzd.zzs(jZzu, 1, iZze, this.zzm - iZze, null);
        this.zzn += (long) i;
        this.zzm -= iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zza(int i, long j4) {
        this.zzc.zzO(new zzaol(this.zze, this.zzf, i, j4));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zzb(long j4) {
        this.zzk = 0;
        this.zzl = j4;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[LOOP:0: B:6:0x0023->B:12:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzaof
    public final boolean zzc(com.google.android.gms.internal.ads.zzacs r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoe.zzc(com.google.android.gms.internal.ads.zzacs, long):boolean");
    }
}

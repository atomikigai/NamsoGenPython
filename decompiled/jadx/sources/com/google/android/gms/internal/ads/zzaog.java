package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaog implements zzaof {
    private final zzacu zza;
    private final zzadx zzb;
    private final zzaoi zzc;
    private final zzad zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaog(zzacu zzacuVar, zzadx zzadxVar, zzaoi zzaoiVar, String str, int i) throws zzbh {
        this.zza = zzacuVar;
        this.zzb = zzadxVar;
        this.zzc = zzaoiVar;
        int i10 = zzaoiVar.zzb * zzaoiVar.zze;
        int i11 = zzaoiVar.zzd;
        int i12 = i10 / 8;
        if (i11 != i12) {
            throw zzbh.zza("Expected block size: " + i12 + "; got: " + i11, null);
        }
        int i13 = zzaoiVar.zzc * i12;
        int i14 = i13 * 8;
        int iMax = Math.max(i12, i13 / 10);
        this.zze = iMax;
        zzab zzabVar = new zzab();
        zzabVar.zzZ(str);
        zzabVar.zzy(i14);
        zzabVar.zzU(i14);
        zzabVar.zzQ(iMax);
        zzabVar.zzz(zzaoiVar.zzb);
        zzabVar.zzaa(zzaoiVar.zzc);
        zzabVar.zzT(i);
        this.zzd = zzabVar.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zza(int i, long j4) {
        this.zza.zzO(new zzaol(this.zzc, 1, i, j4));
        this.zzb.zzl(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zzb(long j4) {
        this.zzf = j4;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final boolean zzc(zzacs zzacsVar, long j4) throws IOException {
        int i;
        int i10;
        long j10 = j4;
        while (j10 > 0 && (i = this.zzg) < (i10 = this.zze)) {
            int iZzf = this.zzb.zzf(zzacsVar, (int) Math.min(i10 - i, j10), true);
            if (iZzf == -1) {
                j10 = 0;
            } else {
                this.zzg += iZzf;
                j10 -= (long) iZzf;
            }
        }
        zzaoi zzaoiVar = this.zzc;
        int i11 = this.zzg;
        int i12 = zzaoiVar.zzd;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long jZzu = this.zzf + zzen.zzu(this.zzh, 1000000L, zzaoiVar.zzc, RoundingMode.FLOOR);
            int i14 = i13 * i12;
            int i15 = this.zzg - i14;
            this.zzb.zzs(jZzu, 1, i14, i15, null);
            this.zzh += (long) i13;
            this.zzg = i15;
        }
        return j10 <= 0;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzady {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzadx zzadxVar, zzadw zzadwVar) {
        if (this.zzc > 0) {
            zzadxVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzadwVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzadx zzadxVar, long j4, int i, int i10, int i11, zzadw zzadwVar) {
        zzdb.zzg(this.zzg <= i10 + i11, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i12 = this.zzc;
            int i13 = i12 + 1;
            this.zzc = i13;
            if (i12 == 0) {
                this.zzd = j4;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i10;
            this.zzg = i11;
            if (i13 >= 16) {
                zza(zzadxVar, zzadwVar);
            }
        }
    }

    public final void zzd(zzacs zzacsVar) throws IOException {
        if (this.zzb) {
            return;
        }
        zzacsVar.zzh(this.zza, 0, 10);
        zzacsVar.zzj();
        byte[] bArr = this.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}

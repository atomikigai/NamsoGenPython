package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzceg implements zzgd {
    private final zzgd zza;
    private final long zzb;
    private final zzgd zzc;
    private long zzd;
    private Uri zze;

    public zzceg(zzgd zzgdVar, int i, zzgd zzgdVar2) {
        this.zza = zzgdVar;
        this.zzb = i;
        this.zzc = zzgdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        long j4 = this.zzd;
        long j10 = this.zzb;
        if (j4 < j10) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i10, j10 - j4));
            long j11 = this.zzd + ((long) iZza);
            this.zzd = j11;
            i11 = iZza;
            j4 = j11;
        } else {
            i11 = 0;
        }
        if (j4 < this.zzb) {
            return i11;
        }
        int iZza2 = this.zzc.zza(bArr, i + i11, i10 - i11);
        int i12 = i11 + iZza2;
        this.zzd += (long) iZza2;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        zzgi zzgiVar2;
        this.zze = zzgiVar.zza;
        long j4 = zzgiVar.zze;
        long j10 = this.zzb;
        zzgi zzgiVar3 = null;
        if (j4 >= j10) {
            zzgiVar2 = null;
        } else {
            long j11 = zzgiVar.zzf;
            long jMin = j10 - j4;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            zzgiVar2 = new zzgi(zzgiVar.zza, j4, jMin, null);
        }
        long j12 = zzgiVar.zzf;
        if (j12 == -1 || zzgiVar.zze + j12 > this.zzb) {
            long jMax = Math.max(this.zzb, zzgiVar.zze);
            long j13 = zzgiVar.zzf;
            zzgiVar3 = new zzgi(zzgiVar.zza, jMax, j13 != -1 ? Math.min(j13, (zzgiVar.zze + j13) - this.zzb) : -1L, null);
        }
        long jZzb = zzgiVar2 != null ? this.zza.zzb(zzgiVar2) : 0L;
        long jZzb2 = zzgiVar3 != null ? this.zzc.zzb(zzgiVar3) : 0L;
        this.zzd = zzgiVar.zze;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        return zzfzr.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
    }
}

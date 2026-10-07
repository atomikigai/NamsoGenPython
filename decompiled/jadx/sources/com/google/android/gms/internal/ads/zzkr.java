package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzkr {
    public final zzur zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzkr(zzur zzurVar, long j4, long j10, long j11, long j12, boolean z4, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        zzdb.zzd(!z12 || z10);
        if (z11 && !z10) {
            z13 = false;
        }
        zzdb.zzd(z13);
        this.zza = zzurVar;
        this.zzb = j4;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = false;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkr.class == obj.getClass()) {
            zzkr zzkrVar = (zzkr) obj;
            if (this.zzb == zzkrVar.zzb && this.zzc == zzkrVar.zzc && this.zzd == zzkrVar.zzd && this.zze == zzkrVar.zze && this.zzg == zzkrVar.zzg && this.zzh == zzkrVar.zzh && this.zzi == zzkrVar.zzi && Objects.equals(this.zza, zzkrVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j4 = this.zze;
        long j10 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j10)) * 31) + ((int) j4)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkr zza(long j4) {
        return j4 == this.zzc ? this : new zzkr(this.zza, this.zzb, j4, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkr zzb(long j4) {
        return j4 == this.zzb ? this : new zzkr(this.zza, j4, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}

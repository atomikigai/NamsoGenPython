package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaev extends zzacc {
    public zzaev(final zzadc zzadcVar, int i, long j4, long j10) {
        long j11;
        Objects.requireNonNull(zzadcVar);
        zzabz zzabzVar = new zzabz() { // from class: com.google.android.gms.internal.ads.zzaes
            @Override // com.google.android.gms.internal.ads.zzabz
            public final long zza(long j12) {
                return zzadcVar.zzb(j12);
            }
        };
        zzaet zzaetVar = new zzaet(zzadcVar, i, null);
        long jZza = zzadcVar.zza();
        long j12 = zzadcVar.zzj;
        int i10 = zzadcVar.zzd;
        if (i10 > 0) {
            j11 = ((((long) i10) + ((long) zzadcVar.zzc)) / 2) + 1;
        } else {
            int i11 = zzadcVar.zza;
            long j13 = 4096;
            if (i11 == zzadcVar.zzb && i11 > 0) {
                j13 = i11;
            }
            j11 = 64 + (((j13 * ((long) zzadcVar.zzg)) * ((long) zzadcVar.zzh)) / 8);
        }
        super(zzabzVar, zzaetVar, jZza, 0L, j12, j4, j10, j11, Math.max(6, zzadcVar.zzc));
    }
}

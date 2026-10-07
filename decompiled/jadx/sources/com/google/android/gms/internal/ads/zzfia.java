package com.google.android.gms.internal.ads;

import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfia {
    private final long zza;
    private long zzc;
    private final zzfhz zzb = new zzfhz();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfia() {
        p.C.f2983j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfhz zzd() {
        zzfhz zzfhzVar = this.zzb;
        zzfhz zzfhzVarClone = zzfhzVar.clone();
        zzfhzVar.zza = false;
        zzfhzVar.zzb = 0;
        return zzfhzVarClone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        p.C.f2983j.getClass();
        this.zzc = System.currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}

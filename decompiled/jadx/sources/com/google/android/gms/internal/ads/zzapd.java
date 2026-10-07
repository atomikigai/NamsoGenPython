package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzapd {
    private int zza = 2500;
    private int zzb;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final void zzc(zzapy zzapyVar) throws zzapy {
        int i = this.zzb + 1;
        this.zzb = i;
        int i10 = this.zza;
        this.zza = i10 + i10;
        if (i > 1) {
            throw zzapyVar;
        }
    }
}

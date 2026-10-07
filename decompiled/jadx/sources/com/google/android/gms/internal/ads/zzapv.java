package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzapv {
    public final Object zza;
    public final zzaoy zzb;
    public final zzapy zzc;
    public boolean zzd;

    private zzapv(zzapy zzapyVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapyVar;
    }

    public static zzapv zza(zzapy zzapyVar) {
        return new zzapv(zzapyVar);
    }

    public static zzapv zzb(Object obj, zzaoy zzaoyVar) {
        return new zzapv(obj, zzaoyVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzapv(Object obj, zzaoy zzaoyVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaoyVar;
        this.zzc = null;
    }
}

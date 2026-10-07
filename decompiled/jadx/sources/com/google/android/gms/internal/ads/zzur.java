package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzur {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzur(Object obj, int i, int i10, long j4, int i11) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i10;
        this.zzd = j4;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzur)) {
            return false;
        }
        zzur zzurVar = (zzur) obj;
        return this.zza.equals(zzurVar.zza) && this.zzb == zzurVar.zzb && this.zzc == zzurVar.zzc && this.zzd == zzurVar.zzd && this.zze == zzurVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzur zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzur(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzur(Object obj, int i, int i10, long j4) {
        this(obj, i, i10, j4, -1);
    }

    public zzur(Object obj, long j4) {
        this(obj, -1, -1, j4, -1);
    }

    public zzur(Object obj, long j4, int i) {
        this(obj, -1, -1, j4, i);
    }
}

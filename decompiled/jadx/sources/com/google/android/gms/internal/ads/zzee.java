package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzee {
    public static final zzee zza = new zzee(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzee(0, 0);
    }

    public zzee(int i, int i10) {
        boolean z4 = false;
        if ((i == -1 || i >= 0) && (i10 == -1 || i10 >= 0)) {
            z4 = true;
        }
        zzdb.zzd(z4);
        this.zzb = i;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzee) {
            zzee zzeeVar = (zzee) obj;
            if (this.zzb == zzeeVar.zzb && this.zzc == zzeeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        return ((i >>> 16) | (i << 16)) ^ this.zzc;
    }

    public final String toString() {
        return this.zzb + "x" + this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }
}

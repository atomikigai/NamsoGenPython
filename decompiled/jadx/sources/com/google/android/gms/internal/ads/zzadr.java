package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadr {
    public static final zzadr zza = new zzadr(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadr(long j4, long j10) {
        this.zzb = j4;
        this.zzc = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadr.class == obj.getClass()) {
            zzadr zzadrVar = (zzadr) obj;
            if (this.zzb == zzadrVar.zzb && this.zzc == zzadrVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.zzb);
        sb2.append(", position=");
        return q1.a.l(sb2, this.zzc, "]");
    }
}

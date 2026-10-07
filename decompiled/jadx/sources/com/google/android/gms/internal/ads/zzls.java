package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzls {
    public static final zzls zza;
    public static final zzls zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzls zzlsVar = new zzls(0L, 0L);
        zza = zzlsVar;
        new zzls(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzls(Long.MAX_VALUE, 0L);
        new zzls(0L, Long.MAX_VALUE);
        zzb = zzlsVar;
    }

    public zzls(long j4, long j10) {
        zzdb.zzd(j4 >= 0);
        zzdb.zzd(j10 >= 0);
        this.zzc = j4;
        this.zzd = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzls.class == obj.getClass()) {
            zzls zzlsVar = (zzls) obj;
            if (this.zzc == zzlsVar.zzc && this.zzd == zzlsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}

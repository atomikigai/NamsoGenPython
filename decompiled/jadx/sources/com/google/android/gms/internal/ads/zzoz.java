package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoz {
    public static final zzoz zza = new zzox().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzoz(zzox zzoxVar, zzoy zzoyVar) {
        this.zzb = zzoxVar.zza;
        this.zzc = zzoxVar.zzb;
        this.zzd = zzoxVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzoz.class == obj.getClass()) {
            zzoz zzozVar = (zzoz) obj;
            if (this.zzb == zzozVar.zzb && this.zzc == zzozVar.zzc && this.zzd == zzozVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z4 = this.zzb;
        boolean z10 = this.zzc;
        return (z10 ? 1 : 0) + (z10 ? 1 : 0) + ((z4 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}

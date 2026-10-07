package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzvq {
    public final int zza;
    public final boolean zzb;

    public zzvq(int i, boolean z4) {
        this.zza = i;
        this.zzb = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvq.class == obj.getClass()) {
            zzvq zzvqVar = (zzvq) obj;
            if (this.zza == zzvqVar.zza && this.zzb == zzvqVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}

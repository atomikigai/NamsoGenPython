package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazu {
    final long zza;
    final String zzb;
    final int zzc;

    public zzazu(long j4, String str, int i) {
        this.zza = j4;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzazu)) {
            zzazu zzazuVar = (zzazu) obj;
            if (zzazuVar.zza == this.zza && zzazuVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}

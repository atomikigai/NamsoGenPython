package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfui extends zzfvk {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfui(String str, String str2, zzfuh zzfuhVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvk) {
            zzfvk zzfvkVar = (zzfvk) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfvkVar.zzb()) : zzfvkVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfvkVar.zza()) : zzfvkVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb2.append(this.zza);
        sb2.append(", appId=");
        return q1.a.m(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final String zzb() {
        return this.zza;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfuf extends zzfvh {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfuf(int i, String str, zzfue zzfueVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvh) {
            zzfvh zzfvhVar = (zzfvh) obj;
            if (this.zza == zzfvhVar.zza() && ((str = this.zzb) != null ? str.equals(zzfvhVar.zzb()) : zzfvhVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayDisplayState{statusCode=");
        sb2.append(this.zza);
        sb2.append(", sessionToken=");
        return q1.a.m(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final String zzb() {
        return this.zzb;
    }
}

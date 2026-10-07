package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfsa extends zzfsh {
    private final String zzb;
    private final boolean zzc;
    private final int zzd;

    public /* synthetic */ zzfsa(String str, boolean z4, boolean z10, zzfrw zzfrwVar, zzfrx zzfrxVar, int i, zzfrz zzfrzVar) {
        this.zzb = str;
        this.zzc = z10;
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsh) {
            zzfsh zzfshVar = (zzfsh) obj;
            if (this.zzb.equals(zzfshVar.zzc())) {
                zzfshVar.zzd();
                if (this.zzc == zzfshVar.zze()) {
                    zzfshVar.zza();
                    zzfshVar.zzb();
                    int i = this.zzd;
                    int iZzf = zzfshVar.zzf();
                    if (i == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        if (this.zzd == 0) {
            throw null;
        }
        return (((((iHashCode * 1000003) ^ 1237) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 583896283) ^ 1;
    }

    public final String toString() {
        String str = this.zzd != 1 ? "null" : "READ_AND_WRITE";
        boolean z4 = this.zzc;
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder("FileComplianceOptions{fileOwner=");
        sb2.append(str2);
        sb2.append(", hasDifferentDmaOwner=false, skipChecks=");
        sb2.append(z4);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        return q1.a.m(sb2, str, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfrw zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfrx zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final int zzf() {
        return this.zzd;
    }
}

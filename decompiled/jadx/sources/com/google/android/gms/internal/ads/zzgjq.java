package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgjq extends zzggt {
    private final zzgjo zza;
    private final String zzb;
    private final zzgjn zzc;
    private final zzggt zzd;

    public /* synthetic */ zzgjq(zzgjo zzgjoVar, String str, zzgjn zzgjnVar, zzggt zzggtVar, zzgjp zzgjpVar) {
        this.zza = zzgjoVar;
        this.zzb = str;
        this.zzc = zzgjnVar;
        this.zzd = zzggtVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjq)) {
            return false;
        }
        zzgjq zzgjqVar = (zzgjq) obj;
        return zzgjqVar.zzc.equals(this.zzc) && zzgjqVar.zzd.equals(this.zzd) && zzgjqVar.zzb.equals(this.zzb) && zzgjqVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzgjq.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzgjo zzgjoVar = this.zza;
        zzggt zzggtVar = this.zzd;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + String.valueOf(this.zzc) + ", dekParametersForNewKeys: " + String.valueOf(zzggtVar) + ", variant: " + String.valueOf(zzgjoVar) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza != zzgjo.zzb;
    }

    public final zzggt zzb() {
        return this.zzd;
    }

    public final zzgjo zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}

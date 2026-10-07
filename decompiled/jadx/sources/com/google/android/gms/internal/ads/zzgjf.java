package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgjf extends zzggt {
    private final String zza;
    private final zzgje zzb;

    private zzgjf(String str, zzgje zzgjeVar) {
        this.zza = str;
        this.zzb = zzgjeVar;
    }

    public static zzgjf zzc(String str, zzgje zzgjeVar) {
        return new zzgjf(str, zzgjeVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjf)) {
            return false;
        }
        zzgjf zzgjfVar = (zzgjf) obj;
        return zzgjfVar.zza.equals(this.zza) && zzgjfVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzgjf.class, this.zza, this.zzb);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + this.zzb.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzb != zzgje.zzb;
    }

    public final zzgje zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}

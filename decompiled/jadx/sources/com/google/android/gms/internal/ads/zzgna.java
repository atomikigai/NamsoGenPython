package com.google.android.gms.internal.ads;

import da.v;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgna extends zzggj {
    private final zzgox zza;

    public zzgna(zzgox zzgoxVar) {
        this.zza = zzgoxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgna)) {
            return false;
        }
        zzgox zzgoxVar = ((zzgna) obj).zza;
        return this.zza.zzc().zzg().equals(zzgoxVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgoxVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgoxVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgox zzgoxVar = this.zza;
        return Objects.hash(zzgoxVar.zzc(), zzgoxVar.zzd());
    }

    public final String toString() {
        String str;
        String strZzi = this.zza.zzc().zzi();
        int iOrdinal = this.zza.zzc().zzg().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return v.k("(typeUrl=", strZzi, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgve.RAW;
    }

    public final zzgox zzb() {
        return this.zza;
    }
}

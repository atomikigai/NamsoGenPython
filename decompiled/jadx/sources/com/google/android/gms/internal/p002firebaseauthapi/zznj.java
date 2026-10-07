package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zznj extends zzce {
    private final zzop zza;

    public zznj(zzop zzopVar) {
        this.zza = zzopVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznj)) {
            return false;
        }
        zzop zzopVar = ((zznj) obj).zza;
        return this.zza.zzc().zze().equals(zzopVar.zzc().zze()) && this.zza.zzc().zzg().equals(zzopVar.zzc().zzg()) && this.zza.zzc().zzf().equals(zzopVar.zzc().zzf());
    }

    public final int hashCode() {
        zzop zzopVar = this.zza;
        return Arrays.hashCode(new Object[]{zzopVar.zzc(), zzopVar.zzd()});
    }

    public final String toString() {
        String str;
        String strZzg = this.zza.zzc().zzg();
        zzxo zzxoVarZze = this.zza.zzc().zze();
        zzxo zzxoVar = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVarZze.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return v.k("(typeUrl=", strZzg, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        throw null;
    }

    public final zzop zzb() {
        return this.zza;
    }
}

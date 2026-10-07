package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgjl extends zzggs {
    private final zzgjq zza;
    private final zzgwu zzb;
    private final Integer zzc;

    private zzgjl(zzgjq zzgjqVar, zzgwu zzgwuVar, Integer num) {
        this.zza = zzgjqVar;
        this.zzb = zzgwuVar;
        this.zzc = num;
    }

    public static zzgjl zza(zzgjq zzgjqVar, Integer num) throws GeneralSecurityException {
        zzgwu zzgwuVarZzb;
        if (zzgjqVar.zzc() == zzgjo.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgwuVarZzb = zzgoa.zza;
        } else {
            if (zzgjqVar.zzc() != zzgjo.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgjqVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgwuVarZzb = zzgoa.zzb(num.intValue());
        }
        return new zzgjl(zzgjqVar, zzgwuVarZzb, num);
    }

    public final zzgjq zzb() {
        return this.zza;
    }

    public final zzgwu zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}

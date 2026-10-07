package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgiq extends zzggs {
    private final zzgiv zza;
    private final zzgwv zzb;
    private final zzgwu zzc;
    private final Integer zzd;

    private zzgiq(zzgiv zzgivVar, zzgwv zzgwvVar, zzgwu zzgwuVar, Integer num) {
        this.zza = zzgivVar;
        this.zzb = zzgwvVar;
        this.zzc = zzgwuVar;
        this.zzd = num;
    }

    public static zzgiq zza(zzgiu zzgiuVar, zzgwv zzgwvVar, Integer num) throws GeneralSecurityException {
        zzgwu zzgwuVarZzb;
        zzgiu zzgiuVar2 = zzgiu.zzc;
        if (zzgiuVar != zzgiuVar2 && num == null) {
            throw new GeneralSecurityException(v.i("For given Variant ", zzgiuVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgiuVar == zzgiuVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwvVar.zza() != 32) {
            throw new GeneralSecurityException(v.f(zzgwvVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzgiv zzgivVarZzc = zzgiv.zzc(zzgiuVar);
        if (zzgivVarZzc.zzb() == zzgiuVar2) {
            zzgwuVarZzb = zzgoa.zza;
        } else if (zzgivVarZzc.zzb() == zzgiu.zzb) {
            zzgwuVarZzb = zzgoa.zza(num.intValue());
        } else {
            if (zzgivVarZzc.zzb() != zzgiu.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgivVarZzc.zzb().toString()));
            }
            zzgwuVarZzb = zzgoa.zzb(num.intValue());
        }
        return new zzgiq(zzgivVarZzc, zzgwvVar, zzgwuVarZzb, num);
    }

    public final zzgiv zzb() {
        return this.zza;
    }

    public final zzgwu zzc() {
        return this.zzc;
    }

    public final zzgwv zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}

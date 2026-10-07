package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgkg extends zzggs {
    private final zzgkm zza;
    private final zzgwv zzb;
    private final zzgwu zzc;
    private final Integer zzd;

    private zzgkg(zzgkm zzgkmVar, zzgwv zzgwvVar, zzgwu zzgwuVar, Integer num) {
        this.zza = zzgkmVar;
        this.zzb = zzgwvVar;
        this.zzc = zzgwuVar;
        this.zzd = num;
    }

    public static zzgkg zza(zzgkl zzgklVar, zzgwv zzgwvVar, Integer num) throws GeneralSecurityException {
        zzgwu zzgwuVarZzb;
        zzgkl zzgklVar2 = zzgkl.zzc;
        if (zzgklVar != zzgklVar2 && num == null) {
            throw new GeneralSecurityException(v.i("For given Variant ", zzgklVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgklVar == zzgklVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwvVar.zza() != 32) {
            throw new GeneralSecurityException(v.f(zzgwvVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzgkm zzgkmVarZzc = zzgkm.zzc(zzgklVar);
        if (zzgkmVarZzc.zzb() == zzgklVar2) {
            zzgwuVarZzb = zzgoa.zza;
        } else if (zzgkmVarZzc.zzb() == zzgkl.zzb) {
            zzgwuVarZzb = zzgoa.zza(num.intValue());
        } else {
            if (zzgkmVarZzc.zzb() != zzgkl.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgkmVarZzc.zzb().toString()));
            }
            zzgwuVarZzb = zzgoa.zzb(num.intValue());
        }
        return new zzgkg(zzgkmVarZzc, zzgwvVar, zzgwuVarZzb, num);
    }

    public final zzgkm zzb() {
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

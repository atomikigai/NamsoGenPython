package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzghk {
    private zzght zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzghk() {
    }

    public final zzghk zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghk zzb(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzghk zzc(zzght zzghtVar) {
        this.zza = zzghtVar;
        return this;
    }

    public final zzghm zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zzgwuVarZzb;
        zzght zzghtVar = this.zza;
        if (zzghtVar == null || (zzgwvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzghtVar.zzc() != zzgwvVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzghtVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzghr.zzc) {
            zzgwuVarZzb = zzgoa.zza;
        } else if (this.zza.zze() == zzghr.zzb) {
            zzgwuVarZzb = zzgoa.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzghr.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzgwuVarZzb = zzgoa.zzb(this.zzc.intValue());
        }
        return new zzghm(this.zza, this.zzb, zzgwuVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzghk(zzghl zzghlVar) {
    }
}

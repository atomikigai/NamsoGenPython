package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgpk {
    private zzgpu zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzgpk() {
    }

    public final zzgpk zza(zzgwv zzgwvVar) throws GeneralSecurityException {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzgpk zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgpk zzc(zzgpu zzgpuVar) {
        this.zza = zzgpuVar;
        return this;
    }

    public final zzgpm zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zzgwuVarZza;
        zzgpu zzgpuVar = this.zza;
        if (zzgpuVar == null || (zzgwvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgpuVar.zzc() != zzgwvVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgpuVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzgps.zzd) {
            zzgwuVarZza = zzgoa.zza;
        } else if (this.zza.zzf() == zzgps.zzc || this.zza.zzf() == zzgps.zzb) {
            zzgwuVarZza = zzgoa.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzgps.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzgwuVarZza = zzgoa.zzb(this.zzc.intValue());
        }
        return new zzgpm(this.zza, this.zzb, zzgwuVarZza, this.zzc, null);
    }

    public /* synthetic */ zzgpk(zzgpl zzgplVar) {
    }
}

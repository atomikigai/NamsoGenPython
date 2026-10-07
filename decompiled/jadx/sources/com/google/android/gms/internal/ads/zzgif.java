package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgif {
    private zzgip zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzgif() {
    }

    public final zzgif zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgif zzb(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzgif zzc(zzgip zzgipVar) {
        this.zza = zzgipVar;
        return this;
    }

    public final zzgih zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zzgwuVarZzb;
        zzgip zzgipVar = this.zza;
        if (zzgipVar == null || (zzgwvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgipVar.zzb() != zzgwvVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgipVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgin.zzc) {
            zzgwuVarZzb = zzgoa.zza;
        } else if (this.zza.zzd() == zzgin.zzb) {
            zzgwuVarZzb = zzgoa.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgin.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzgwuVarZzb = zzgoa.zzb(this.zzc.intValue());
        }
        return new zzgih(this.zza, this.zzb, zzgwuVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgif(zzgig zzgigVar) {
    }
}

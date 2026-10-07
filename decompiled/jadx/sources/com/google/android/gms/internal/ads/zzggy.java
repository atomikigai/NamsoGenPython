package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzggy {
    private zzghj zza = null;
    private zzgwv zzb = null;
    private zzgwv zzc = null;
    private Integer zzd = null;

    private zzggy() {
    }

    public final zzggy zza(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzggy zzb(zzgwv zzgwvVar) {
        this.zzc = zzgwvVar;
        return this;
    }

    public final zzggy zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzggy zzd(zzghj zzghjVar) {
        this.zza = zzghjVar;
        return this;
    }

    public final zzgha zze() throws GeneralSecurityException {
        zzgwu zzgwuVarZzb;
        zzghj zzghjVar = this.zza;
        if (zzghjVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgwv zzgwvVar = this.zzb;
        if (zzgwvVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzghjVar.zzb() != zzgwvVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzghjVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzh() == zzghh.zzc) {
            zzgwuVarZzb = zzgoa.zza;
        } else if (this.zza.zzh() == zzghh.zzb) {
            zzgwuVarZzb = zzgoa.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzh() != zzghh.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
            }
            zzgwuVarZzb = zzgoa.zzb(this.zzd.intValue());
        }
        return new zzgha(this.zza, this.zzb, this.zzc, zzgwuVarZzb, this.zzd, null);
    }

    public /* synthetic */ zzggy(zzggz zzggzVar) {
    }
}

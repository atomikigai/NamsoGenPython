package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgpz {
    private zzgql zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzgpz() {
    }

    public final zzgpz zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgpz zzb(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzgpz zzc(zzgql zzgqlVar) {
        this.zza = zzgqlVar;
        return this;
    }

    public final zzgqb zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zzgwuVarZza;
        zzgql zzgqlVar = this.zza;
        if (zzgqlVar == null || (zzgwvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgqlVar.zzc() != zzgwvVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgqlVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgqj.zzd) {
            zzgwuVarZza = zzgoa.zza;
        } else if (this.zza.zzg() == zzgqj.zzc || this.zza.zzg() == zzgqj.zzb) {
            zzgwuVarZza = zzgoa.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzg() != zzgqj.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzgwuVarZza = zzgoa.zzb(this.zzc.intValue());
        }
        return new zzgqb(this.zza, this.zzb, zzgwuVarZza, this.zzc, null);
    }

    public /* synthetic */ zzgpz(zzgqa zzgqaVar) {
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzev {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzew zzd;

    public /* synthetic */ zzev(zzeu zzeuVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzew.zzc;
    }

    public final zzev zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzev zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzev zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzev zzd(zzew zzewVar) {
        this.zzd = zzewVar;
        return this;
    }

    public final zzey zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.getClass();
        this.zzc.getClass();
        return new zzey(iIntValue, 12, 16, this.zzd, null);
    }

    private zzev() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }
}

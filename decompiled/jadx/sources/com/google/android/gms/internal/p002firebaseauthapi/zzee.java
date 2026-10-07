package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzee {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzef zzd;

    public /* synthetic */ zzee(zzed zzedVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzef.zzc;
    }

    public final zzee zza(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzee zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzee zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzee zzd(zzef zzefVar) {
        this.zzd = zzefVar;
        return this;
    }

    public final zzeh zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.getClass();
        return new zzeh(iIntValue, iIntValue2, 16, this.zzd, null);
    }

    private zzee() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }
}

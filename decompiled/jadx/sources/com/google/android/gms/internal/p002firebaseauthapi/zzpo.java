package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpo {
    private Integer zza;
    private Integer zzb;
    private zzpp zzc;

    public /* synthetic */ zzpo(zzpn zzpnVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzpp.zzd;
    }

    public final zzpo zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzpo zzb(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(v.f(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzpo zzc(zzpp zzppVar) {
        this.zzc = zzppVar;
        return this;
    }

    public final zzpr zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzpr(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    private zzpo() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }
}

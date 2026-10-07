package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzff {
    private zzfp zza = null;
    private zzzq zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzff(zzfe zzfeVar) {
    }

    public final zzff zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzff zzb(zzzq zzzqVar) {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzff zzc(zzfp zzfpVar) {
        this.zza = zzfpVar;
        return this;
    }

    public final zzfh zzd() throws GeneralSecurityException {
        zzzq zzzqVar;
        zzzo zzzoVarF;
        zzfp zzfpVar = this.zza;
        if (zzfpVar == null || (zzzqVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzfpVar.zzb() != zzzqVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzfpVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzc() == zzfn.zzc) {
            zzzoVarF = zzzo.zzb(new byte[0]);
        } else if (this.zza.zzc() == zzfn.zzb) {
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (this.zza.zzc() != zzfn.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
            }
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 1));
        }
        return new zzfh(this.zza, this.zzb, zzzoVarF, this.zzc, null);
    }

    private zzff() {
    }
}

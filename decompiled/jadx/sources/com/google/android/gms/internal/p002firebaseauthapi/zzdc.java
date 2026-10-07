package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdc {
    private zzdn zza = null;
    private zzzq zzb = null;
    private zzzq zzc = null;
    private Integer zzd = null;

    public /* synthetic */ zzdc(zzdb zzdbVar) {
    }

    public final zzdc zza(zzzq zzzqVar) {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzdc zzb(zzzq zzzqVar) {
        this.zzc = zzzqVar;
        return this;
    }

    public final zzdc zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzdc zzd(zzdn zzdnVar) {
        this.zza = zzdnVar;
        return this;
    }

    public final zzde zze() throws GeneralSecurityException {
        zzzo zzzoVarF;
        zzdn zzdnVar = this.zza;
        if (zzdnVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzzq zzzqVar = this.zzb;
        if (zzzqVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzdnVar.zzb() != zzzqVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzdnVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzh() == zzdl.zzc) {
            zzzoVarF = zzzo.zzb(new byte[0]);
        } else if (this.zza.zzh() == zzdl.zzb) {
            zzzoVarF = a.f(this.zzd, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (this.zza.zzh() != zzdl.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
            }
            zzzoVarF = a.f(this.zzd, ByteBuffer.allocate(5).put((byte) 1));
        }
        return new zzde(this.zza, this.zzb, this.zzc, zzzoVarF, this.zzd, null);
    }

    private zzdc() {
    }
}

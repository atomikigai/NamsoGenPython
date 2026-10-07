package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdx {
    private zzeh zza = null;
    private zzzq zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzdx(zzdw zzdwVar) {
    }

    public final zzdx zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzdx zzb(zzzq zzzqVar) {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzdx zzc(zzeh zzehVar) {
        this.zza = zzehVar;
        return this;
    }

    public final zzdz zzd() throws GeneralSecurityException {
        zzzq zzzqVar;
        zzzo zzzoVarF;
        zzeh zzehVar = this.zza;
        if (zzehVar == null || (zzzqVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzehVar.zzc() != zzzqVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzehVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzef.zzc) {
            zzzoVarF = zzzo.zzb(new byte[0]);
        } else if (this.zza.zzd() == zzef.zzb) {
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (this.zza.zzd() != zzef.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 1));
        }
        return new zzdz(this.zza, this.zzb, zzzoVarF, this.zzc, null);
    }

    private zzdx() {
    }
}

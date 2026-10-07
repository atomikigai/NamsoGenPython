package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpf {
    private zzpr zza = null;
    private zzzq zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzpf(zzpe zzpeVar) {
    }

    public final zzpf zza(zzzq zzzqVar) throws GeneralSecurityException {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzpf zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzpf zzc(zzpr zzprVar) {
        this.zza = zzprVar;
        return this;
    }

    public final zzph zzd() throws GeneralSecurityException {
        zzzq zzzqVar;
        zzzo zzzoVarF;
        zzpr zzprVar = this.zza;
        if (zzprVar == null || (zzzqVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzprVar.zzc() != zzzqVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzprVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzpp.zzd) {
            zzzoVarF = zzzo.zzb(new byte[0]);
        } else if (this.zza.zze() == zzpp.zzc || this.zza.zze() == zzpp.zzb) {
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (this.zza.zze() != zzpp.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 1));
        }
        return new zzph(this.zza, this.zzb, zzzoVarF, this.zzc, null);
    }

    private zzpf() {
    }
}

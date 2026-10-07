package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzim {
    private zziw zza = null;
    private zzzq zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzim(zzil zzilVar) {
    }

    public final zzim zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzim zzb(zzzq zzzqVar) {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzim zzc(zziw zziwVar) {
        this.zza = zziwVar;
        return this;
    }

    public final zzio zzd() throws GeneralSecurityException {
        zzzq zzzqVar;
        zzzo zzzoVarF;
        zziw zziwVar = this.zza;
        if (zziwVar == null || (zzzqVar = this.zzb) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (zziwVar.zzb() != zzzqVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zziwVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zziu.zzc) {
            zzzoVarF = zzzo.zzb(new byte[0]);
        } else if (this.zza.zzd() == zziu.zzb) {
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (this.zza.zzd() != zziu.zza) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 1));
        }
        return new zzio(this.zza, this.zzb, zzzoVarF, this.zzc, null);
    }

    private zzim() {
    }
}

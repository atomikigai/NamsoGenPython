package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqc {
    private zzqp zza = null;
    private zzzq zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzqc(zzqb zzqbVar) {
    }

    public final zzqc zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzqc zzb(zzzq zzzqVar) {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzqc zzc(zzqp zzqpVar) {
        this.zza = zzqpVar;
        return this;
    }

    public final zzqe zzd() throws GeneralSecurityException {
        zzzq zzzqVar;
        zzzo zzzoVarF;
        zzqp zzqpVar = this.zza;
        if (zzqpVar == null || (zzzqVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzqpVar.zzc() != zzzqVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzqpVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzqn.zzd) {
            zzzoVarF = zzzo.zzb(new byte[0]);
        } else if (this.zza.zzg() == zzqn.zzc || this.zza.zzg() == zzqn.zzb) {
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (this.zza.zzg() != zzqn.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzzoVarF = a.f(this.zzc, ByteBuffer.allocate(5).put((byte) 1));
        }
        return new zzqe(this.zza, this.zzb, zzzoVarF, this.zzc, null);
    }

    private zzqc() {
    }
}

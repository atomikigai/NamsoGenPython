package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkl {
    private zzkn zza;
    private zzkm zzb;
    private zzkh zzc;
    private zzko zzd;

    public /* synthetic */ zzkl(zzkk zzkkVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzko.zzc;
    }

    public final zzkl zza(zzkh zzkhVar) {
        this.zzc = zzkhVar;
        return this;
    }

    public final zzkl zzb(zzkm zzkmVar) {
        this.zzb = zzkmVar;
        return this;
    }

    public final zzkl zzc(zzkn zzknVar) {
        this.zza = zzknVar;
        return this;
    }

    public final zzkl zzd(zzko zzkoVar) {
        this.zzd = zzkoVar;
        return this;
    }

    public final zzkq zze() throws GeneralSecurityException {
        zzkn zzknVar = this.zza;
        if (zzknVar == null) {
            throw new GeneralSecurityException("HPKE KEM parameter is not set");
        }
        zzkm zzkmVar = this.zzb;
        if (zzkmVar == null) {
            throw new GeneralSecurityException("HPKE KDF parameter is not set");
        }
        zzkh zzkhVar = this.zzc;
        if (zzkhVar == null) {
            throw new GeneralSecurityException("HPKE AEAD parameter is not set");
        }
        zzko zzkoVar = this.zzd;
        if (zzkoVar != null) {
            return new zzkq(zzknVar, zzkmVar, zzkhVar, zzkoVar, null);
        }
        throw new GeneralSecurityException("HPKE variant is not set");
    }

    private zzkl() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }
}

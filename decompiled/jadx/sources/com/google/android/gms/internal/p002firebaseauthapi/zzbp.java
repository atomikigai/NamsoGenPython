package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class zzbp implements zzbo {
    private final zzng zza;
    private final Class zzb;

    public zzbp(zzng zzngVar, Class cls) {
        if (!zzngVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(v.j("Given internalKeyMananger ", zzngVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.zza = zzngVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final zzwi zza(zzajf zzajfVar) throws GeneralSecurityException {
        try {
            zznf zznfVarZza = this.zza.zza();
            zzalp zzalpVarZzb = zznfVarZza.zzb(zzajfVar);
            zznfVarZza.zzd(zzalpVarZzb);
            zzalp zzalpVarZza = zznfVarZza.zza(zzalpVarZzb);
            zzwf zzwfVarZza = zzwi.zza();
            zzwfVarZza.zzb(this.zza.zzd());
            zzwfVarZza.zzc(zzalpVarZza.zzo());
            zzwfVarZza.zza(this.zza.zzb());
            return (zzwi) zzwfVarZza.zzi();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Object zzb(zzajf zzajfVar) throws GeneralSecurityException {
        try {
            zzalp zzalpVarZzc = this.zza.zzc(zzajfVar);
            if (Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zze(zzalpVarZzc);
            return this.zza.zzk(zzalpVarZzc, this.zzb);
        } catch (zzaks e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final String zzc() {
        return this.zza.zzd();
    }
}

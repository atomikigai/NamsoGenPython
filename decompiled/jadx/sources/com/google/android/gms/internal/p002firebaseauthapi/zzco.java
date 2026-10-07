package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzco extends zzbp implements zzcn {
    private final zzon zza;
    private final zzng zzb;

    public zzco(zzon zzonVar, zzng zzngVar, Class cls) {
        super(zzonVar, cls);
        this.zza = zzonVar;
        this.zzb = zzngVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcn
    public final zzwi zzd(zzajf zzajfVar) throws GeneralSecurityException {
        try {
            zzalp zzalpVarZzc = this.zza.zzc(zzajfVar);
            this.zza.zze(zzalpVarZzc);
            zzalp zzalpVarZzg = this.zza.zzg(zzalpVarZzc);
            this.zzb.zze(zzalpVarZzg);
            zzwf zzwfVarZza = zzwi.zza();
            zzwfVarZza.zzb(this.zzb.zzd());
            zzwfVarZza.zzc(zzalpVarZzg.zzo());
            zzwfVarZza.zza(this.zzb.zzb());
            return (zzwi) zzwfVarZza.zzi();
        } catch (zzaks e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}

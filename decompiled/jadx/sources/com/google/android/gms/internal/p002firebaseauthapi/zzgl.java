package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgl extends zznf {
    final /* synthetic */ zzgm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgl(zzgm zzgmVar, Class cls) {
        super(cls);
        this.zza = zzgmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzxi zzxiVarZzb = zzxj.zzb();
        zzxiVarZzb.zza((zzxm) zzalpVar);
        zzxiVarZzb.zzb(0);
        return (zzxj) zzxiVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzxm.zze(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzxm zzxmVar = (zzxm) zzalpVar;
        if (!zzgj.zzc(zzxmVar.zza().zzg())) {
            throw new GeneralSecurityException(v.i("Unsupported DEK key type: ", zzxmVar.zza().zzg(), ". Only Tink AEAD key types are supported."));
        }
        if (zzxmVar.zzf().isEmpty() || !zzxmVar.zzi()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}

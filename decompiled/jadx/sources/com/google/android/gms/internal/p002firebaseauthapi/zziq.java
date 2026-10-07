package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zziq extends zznf {
    final /* synthetic */ zzir zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziq(zzir zzirVar, Class cls) {
        super(cls);
        this.zza = zzirVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zztr zztrVarZzb = zzts.zzb();
        byte[] bArrZzb = zzor.zzb(((zztv) zzalpVar).zza());
        zztrVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        zztrVarZzb.zzb(0);
        return (zzts) zztrVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zztv.zze(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES256_SIV", zzji.zza);
        zzit zzitVar = new zzit(null);
        zzitVar.zza(64);
        zzitVar.zzb(zziu.zzc);
        map.put("AES256_SIV_RAW", zzitVar.zzc());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zztv zztvVar = (zztv) zzalpVar;
        if (zztvVar.zza() != 64) {
            throw new InvalidAlgorithmParameterException(a.j(zztvVar.zza(), "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }
}

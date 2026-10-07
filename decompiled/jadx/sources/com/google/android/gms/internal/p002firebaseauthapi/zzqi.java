package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzqi extends zznf {
    final /* synthetic */ zzqj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqi(zzqj zzqjVar, Class cls) {
        super(cls);
        this.zza = zzqjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzvi zzviVar = (zzvi) zzalpVar;
        zzve zzveVarZzb = zzvf.zzb();
        zzveVarZzb.zzc(0);
        zzveVarZzb.zzb(zzviVar.zzg());
        byte[] bArrZzb = zzor.zzb(zzviVar.zza());
        zzveVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        return (zzvf) zzveVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzvi.zzf(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzrc.zza);
        zzql zzqlVar = new zzql(null);
        zzqlVar.zzb(32);
        zzqlVar.zzc(16);
        zzqn zzqnVar = zzqn.zzd;
        zzqlVar.zzd(zzqnVar);
        zzqm zzqmVar = zzqm.zzc;
        zzqlVar.zza(zzqmVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzqlVar.zze());
        zzql zzqlVar2 = new zzql(null);
        zzqlVar2.zzb(32);
        zzqlVar2.zzc(32);
        zzqn zzqnVar2 = zzqn.zza;
        zzqlVar2.zzd(zzqnVar2);
        zzqlVar2.zza(zzqmVar);
        map.put("HMAC_SHA256_256BITTAG", zzqlVar2.zze());
        zzql zzqlVar3 = new zzql(null);
        zzqlVar3.zzb(32);
        zzqlVar3.zzc(32);
        zzqlVar3.zzd(zzqnVar);
        zzqlVar3.zza(zzqmVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzqlVar3.zze());
        zzql zzqlVar4 = new zzql(null);
        zzqlVar4.zzb(64);
        zzqlVar4.zzc(16);
        zzqlVar4.zzd(zzqnVar2);
        zzqm zzqmVar2 = zzqm.zze;
        zzqlVar4.zza(zzqmVar2);
        map.put("HMAC_SHA512_128BITTAG", zzqlVar4.zze());
        zzql zzqlVar5 = new zzql(null);
        zzqlVar5.zzb(64);
        zzqlVar5.zzc(16);
        zzqlVar5.zzd(zzqnVar);
        zzqlVar5.zza(zzqmVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzqlVar5.zze());
        zzql zzqlVar6 = new zzql(null);
        zzqlVar6.zzb(64);
        zzqlVar6.zzc(32);
        zzqlVar6.zzd(zzqnVar2);
        zzqlVar6.zza(zzqmVar2);
        map.put("HMAC_SHA512_256BITTAG", zzqlVar6.zze());
        zzql zzqlVar7 = new zzql(null);
        zzqlVar7.zzb(64);
        zzqlVar7.zzc(32);
        zzqlVar7.zzd(zzqnVar);
        zzqlVar7.zza(zzqmVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzqlVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzrc.zzd);
        zzql zzqlVar8 = new zzql(null);
        zzqlVar8.zzb(64);
        zzqlVar8.zzc(64);
        zzqlVar8.zzd(zzqnVar);
        zzqlVar8.zza(zzqmVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzqlVar8.zze());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzvi zzviVar = (zzvi) zzalpVar;
        if (zzviVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzqj.zzn(zzviVar.zzg());
    }
}

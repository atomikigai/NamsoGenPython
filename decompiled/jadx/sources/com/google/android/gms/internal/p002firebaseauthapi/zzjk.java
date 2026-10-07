package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzjk extends zznf {
    final /* synthetic */ zzjl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjk(zzjl zzjlVar, Class cls) {
        super(cls);
        this.zza = zzjlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzuj zzujVar = (zzuj) zzalpVar;
        KeyPair keyPairZzc = zzym.zzc(zzym.zzi(zzlj.zzc(zzujVar.zzd().zzf().zzd())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairZzc.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairZzc.getPrivate();
        ECPoint w10 = eCPublicKey.getW();
        zzur zzurVarZzc = zzus.zzc();
        zzurVarZzc.zzb(0);
        zzurVarZzc.zza(zzujVar.zzd());
        byte[] byteArray = w10.getAffineX().toByteArray();
        zzajf zzajfVar = zzajf.zzb;
        zzurVarZzc.zzc(zzajf.zzn(byteArray, 0, byteArray.length));
        byte[] byteArray2 = w10.getAffineY().toByteArray();
        zzurVarZzc.zzd(zzajf.zzn(byteArray2, 0, byteArray2.length));
        zzus zzusVar = (zzus) zzurVarZzc.zzi();
        zzuo zzuoVarZzb = zzup.zzb();
        zzuoVarZzb.zzc(0);
        zzuoVarZzb.zzb(zzusVar);
        byte[] byteArray3 = eCPrivateKey.getS().toByteArray();
        zzuoVarZzb.zza(zzajf.zzn(byteArray3, 0, byteArray3.length));
        return (zzup) zzuoVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzuj.zzc(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzjr zzjrVar = new zzjr(null);
        zzjs zzjsVar = zzjs.zza;
        zzjrVar.zza(zzjsVar);
        zzjt zzjtVar = zzjt.zzc;
        zzjrVar.zzc(zzjtVar);
        zzju zzjuVar = zzju.zzb;
        zzjrVar.zzd(zzjuVar);
        zzjv zzjvVar = zzjv.zza;
        zzjrVar.zzf(zzjvVar);
        zzev zzevVarZzc = zzey.zzc();
        zzevVarZzc.zza(12);
        zzevVarZzc.zzb(16);
        zzevVarZzc.zzc(16);
        zzew zzewVar = zzew.zzc;
        zzevVarZzc.zzd(zzewVar);
        zzjrVar.zzb(zzevVarZzc.zze());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzjrVar.zzg());
        zzjr zzjrVar2 = new zzjr(null);
        zzjrVar2.zza(zzjsVar);
        zzjrVar2.zzc(zzjtVar);
        zzjrVar2.zzd(zzjuVar);
        zzjv zzjvVar2 = zzjv.zzc;
        zzjrVar2.zzf(zzjvVar2);
        zzev zzevVarZzc2 = zzey.zzc();
        zzevVarZzc2.zza(12);
        zzevVarZzc2.zzb(16);
        zzevVarZzc2.zzc(16);
        zzevVarZzc2.zzd(zzewVar);
        zzjrVar2.zzb(zzevVarZzc2.zze());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjrVar2.zzg());
        zzjr zzjrVar3 = new zzjr(null);
        zzjrVar3.zza(zzjsVar);
        zzjrVar3.zzc(zzjtVar);
        zzju zzjuVar2 = zzju.zza;
        zzjrVar3.zzd(zzjuVar2);
        zzjrVar3.zzf(zzjvVar);
        zzev zzevVarZzc3 = zzey.zzc();
        zzevVarZzc3.zza(12);
        zzevVarZzc3.zzb(16);
        zzevVarZzc3.zzc(16);
        zzevVarZzc3.zzd(zzewVar);
        zzjrVar3.zzb(zzevVarZzc3.zze());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzjrVar3.zzg());
        zzjr zzjrVar4 = new zzjr(null);
        zzjrVar4.zza(zzjsVar);
        zzjrVar4.zzc(zzjtVar);
        zzjrVar4.zzd(zzjuVar2);
        zzjrVar4.zzf(zzjvVar2);
        zzev zzevVarZzc4 = zzey.zzc();
        zzevVarZzc4.zza(12);
        zzevVarZzc4.zzb(16);
        zzevVarZzc4.zzc(16);
        zzevVarZzc4.zzd(zzewVar);
        zzjrVar4.zzb(zzevVarZzc4.zze());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjrVar4.zzg());
        zzjr zzjrVar5 = new zzjr(null);
        zzjrVar5.zza(zzjsVar);
        zzjrVar5.zzc(zzjtVar);
        zzjrVar5.zzd(zzjuVar2);
        zzjrVar5.zzf(zzjvVar2);
        zzev zzevVarZzc5 = zzey.zzc();
        zzevVarZzc5.zza(12);
        zzevVarZzc5.zzb(16);
        zzevVarZzc5.zzc(16);
        zzevVarZzc5.zzd(zzewVar);
        zzjrVar5.zzb(zzevVarZzc5.zze());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjrVar5.zzg());
        zzjr zzjrVar6 = new zzjr(null);
        zzjrVar6.zza(zzjsVar);
        zzjrVar6.zzc(zzjtVar);
        zzjrVar6.zzd(zzjuVar);
        zzjrVar6.zzf(zzjvVar);
        zzdj zzdjVarZzf = zzdn.zzf();
        zzdjVarZzf.zza(16);
        zzdjVarZzf.zzc(32);
        zzdjVarZzf.zze(16);
        zzdjVarZzf.zzd(16);
        zzdk zzdkVar = zzdk.zzc;
        zzdjVarZzf.zzb(zzdkVar);
        zzdl zzdlVar = zzdl.zzc;
        zzdjVarZzf.zzf(zzdlVar);
        zzjrVar6.zzb(zzdjVarZzf.zzg());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjrVar6.zzg());
        zzjr zzjrVar7 = new zzjr(null);
        zzjrVar7.zza(zzjsVar);
        zzjrVar7.zzc(zzjtVar);
        zzjrVar7.zzd(zzjuVar);
        zzjrVar7.zzf(zzjvVar2);
        zzdj zzdjVarZzf2 = zzdn.zzf();
        zzdjVarZzf2.zza(16);
        zzdjVarZzf2.zzc(32);
        zzdjVarZzf2.zze(16);
        zzdjVarZzf2.zzd(16);
        zzdjVarZzf2.zzb(zzdkVar);
        zzdjVarZzf2.zzf(zzdlVar);
        zzjrVar7.zzb(zzdjVarZzf2.zzg());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjrVar7.zzg());
        zzjr zzjrVar8 = new zzjr(null);
        zzjrVar8.zza(zzjsVar);
        zzjrVar8.zzc(zzjtVar);
        zzjrVar8.zzd(zzjuVar2);
        zzjrVar8.zzf(zzjvVar);
        zzdj zzdjVarZzf3 = zzdn.zzf();
        zzdjVarZzf3.zza(16);
        zzdjVarZzf3.zzc(32);
        zzdjVarZzf3.zze(16);
        zzdjVarZzf3.zzd(16);
        zzdjVarZzf3.zzb(zzdkVar);
        zzdjVarZzf3.zzf(zzdlVar);
        zzjrVar8.zzb(zzdjVarZzf3.zzg());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjrVar8.zzg());
        zzjr zzjrVar9 = new zzjr(null);
        zzjrVar9.zza(zzjsVar);
        zzjrVar9.zzc(zzjtVar);
        zzjrVar9.zzd(zzjuVar2);
        zzjrVar9.zzf(zzjvVar2);
        zzdj zzdjVarZzf4 = zzdn.zzf();
        zzdjVarZzf4.zza(16);
        zzdjVarZzf4.zzc(32);
        zzdjVarZzf4.zze(16);
        zzdjVarZzf4.zzd(16);
        zzdjVarZzf4.zzb(zzdkVar);
        zzdjVarZzf4.zzf(zzdlVar);
        zzjrVar9.zzb(zzdjVarZzf4.zzg());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjrVar9.zzg());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzlj.zzb(((zzuj) zzalpVar).zzd());
    }
}

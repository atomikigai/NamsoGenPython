package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlx extends zznf {
    final /* synthetic */ zzly zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlx(zzly zzlyVar, Class cls) {
        super(cls);
        this.zza = zzlyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        byte[] bArrZzb2;
        zzvu zzvuVar = (zzvu) zzalpVar;
        zzvr zzvrVarZzc = zzvuVar.zzd().zzc();
        zzvr zzvrVar = zzvr.KEM_UNKNOWN;
        int iOrdinal = zzvrVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzb = zzor.zzb(32);
            bArrZzb[0] = (byte) (bArrZzb[0] | 7);
            int i = bArrZzb[31] & 63;
            bArrZzb[31] = (byte) i;
            bArrZzb[31] = (byte) (i | 128);
            bArrZzb2 = zzzm.zzb(bArrZzb);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            int iZzh = zzmb.zzh(zzvuVar.zzd().zzc());
            KeyPair keyPairZzc = zzym.zzc(zzym.zzi(iZzh));
            ECPoint w10 = ((ECPublicKey) keyPairZzc.getPublic()).getW();
            EllipticCurve curve = zzym.zzi(iZzh).getCurve();
            zzmq.zzf(w10, curve);
            int iZza = zzym.zza(curve);
            int i10 = iZza + iZza + 1;
            bArrZzb2 = new byte[i10];
            byte[] bArrZzb3 = zzmn.zzb(w10.getAffineX());
            byte[] bArrZzb4 = zzmn.zzb(w10.getAffineY());
            int length = bArrZzb4.length;
            System.arraycopy(bArrZzb4, 0, bArrZzb2, i10 - length, length);
            int length2 = bArrZzb3.length;
            System.arraycopy(bArrZzb3, 0, bArrZzb2, (iZza + 1) - length2, length2);
            bArrZzb2[0] = 4;
            bArrZzb = zzmn.zzc(((ECPrivateKey) keyPairZzc.getPrivate()).getS(), zzmb.zza(zzvrVarZzc));
        }
        zzwc zzwcVarZzc = zzwd.zzc();
        zzwcVarZzc.zzc(0);
        zzwcVarZzc.zza(zzvuVar.zzd());
        zzwcVarZzc.zzb(zzajf.zzn(bArrZzb2, 0, bArrZzb2.length));
        zzwd zzwdVar = (zzwd) zzwcVarZzc.zzi();
        zzvz zzvzVarZzb = zzwa.zzb();
        zzvzVarZzb.zzc(0);
        zzvzVarZzb.zzb(zzwdVar);
        zzvzVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        return (zzwa) zzvzVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzvu.zzc(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzkl zzklVarZzc = zzkq.zzc();
        zzko zzkoVar = zzko.zza;
        zzklVarZzc.zzd(zzkoVar);
        zzkn zzknVar = zzkn.zzf;
        zzklVarZzc.zzc(zzknVar);
        zzkm zzkmVar = zzkm.zza;
        zzklVarZzc.zzb(zzkmVar);
        zzkh zzkhVar = zzkh.zza;
        zzklVarZzc.zza(zzkhVar);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzklVarZzc.zze());
        zzkl zzklVarZzc2 = zzkq.zzc();
        zzko zzkoVar2 = zzko.zzc;
        zzklVarZzc2.zzd(zzkoVar2);
        zzklVarZzc2.zzc(zzknVar);
        zzklVarZzc2.zzb(zzkmVar);
        zzklVarZzc2.zza(zzkhVar);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzklVarZzc2.zze());
        zzkl zzklVarZzc3 = zzkq.zzc();
        zzklVarZzc3.zzd(zzkoVar);
        zzklVarZzc3.zzc(zzknVar);
        zzklVarZzc3.zzb(zzkmVar);
        zzkh zzkhVar2 = zzkh.zzb;
        zzklVarZzc3.zza(zzkhVar2);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzklVarZzc3.zze());
        zzkl zzklVarZzc4 = zzkq.zzc();
        zzklVarZzc4.zzd(zzkoVar2);
        zzklVarZzc4.zzc(zzknVar);
        zzklVarZzc4.zzb(zzkmVar);
        zzklVarZzc4.zza(zzkhVar2);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzklVarZzc4.zze());
        zzkl zzklVarZzc5 = zzkq.zzc();
        zzklVarZzc5.zzd(zzkoVar);
        zzklVarZzc5.zzc(zzknVar);
        zzklVarZzc5.zzb(zzkmVar);
        zzkh zzkhVar3 = zzkh.zzc;
        zzklVarZzc5.zza(zzkhVar3);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzklVarZzc5.zze());
        zzkl zzklVarZzc6 = zzkq.zzc();
        zzklVarZzc6.zzd(zzkoVar2);
        zzklVarZzc6.zzc(zzknVar);
        zzklVarZzc6.zzb(zzkmVar);
        zzklVarZzc6.zza(zzkhVar3);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzklVarZzc6.zze());
        zzkl zzklVarZzc7 = zzkq.zzc();
        zzklVarZzc7.zzd(zzkoVar);
        zzkn zzknVar2 = zzkn.zza;
        zzklVarZzc7.zzc(zzknVar2);
        zzklVarZzc7.zzb(zzkmVar);
        zzklVarZzc7.zza(zzkhVar);
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzklVarZzc7.zze());
        zzkl zzklVarZzc8 = zzkq.zzc();
        zzklVarZzc8.zzd(zzkoVar2);
        zzklVarZzc8.zzc(zzknVar2);
        zzklVarZzc8.zzb(zzkmVar);
        zzklVarZzc8.zza(zzkhVar);
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzklVarZzc8.zze());
        zzkl zzklVarZzc9 = zzkq.zzc();
        zzklVarZzc9.zzd(zzkoVar);
        zzklVarZzc9.zzc(zzknVar2);
        zzklVarZzc9.zzb(zzkmVar);
        zzklVarZzc9.zza(zzkhVar2);
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzklVarZzc9.zze());
        zzkl zzklVarZzc10 = zzkq.zzc();
        zzklVarZzc10.zzd(zzkoVar2);
        zzklVarZzc10.zzc(zzknVar2);
        zzklVarZzc10.zzb(zzkmVar);
        zzklVarZzc10.zza(zzkhVar2);
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzklVarZzc10.zze());
        zzkl zzklVarZzc11 = zzkq.zzc();
        zzklVarZzc11.zzd(zzkoVar);
        zzkn zzknVar3 = zzkn.zzb;
        zzklVarZzc11.zzc(zzknVar3);
        zzkm zzkmVar2 = zzkm.zzb;
        zzklVarZzc11.zzb(zzkmVar2);
        zzklVarZzc11.zza(zzkhVar);
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzklVarZzc11.zze());
        zzkl zzklVarZzc12 = zzkq.zzc();
        zzklVarZzc12.zzd(zzkoVar2);
        zzklVarZzc12.zzc(zzknVar3);
        zzklVarZzc12.zzb(zzkmVar2);
        zzklVarZzc12.zza(zzkhVar);
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzklVarZzc12.zze());
        zzkl zzklVarZzc13 = zzkq.zzc();
        zzklVarZzc13.zzd(zzkoVar);
        zzklVarZzc13.zzc(zzknVar3);
        zzklVarZzc13.zzb(zzkmVar2);
        zzklVarZzc13.zza(zzkhVar2);
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzklVarZzc13.zze());
        zzkl zzklVarZzc14 = zzkq.zzc();
        zzklVarZzc14.zzd(zzkoVar2);
        zzklVarZzc14.zzc(zzknVar3);
        zzklVarZzc14.zzb(zzkmVar2);
        zzklVarZzc14.zza(zzkhVar2);
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzklVarZzc14.zze());
        zzkl zzklVarZzc15 = zzkq.zzc();
        zzklVarZzc15.zzd(zzkoVar);
        zzkn zzknVar4 = zzkn.zzc;
        zzklVarZzc15.zzc(zzknVar4);
        zzkm zzkmVar3 = zzkm.zzc;
        zzklVarZzc15.zzb(zzkmVar3);
        zzklVarZzc15.zza(zzkhVar);
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzklVarZzc15.zze());
        zzkl zzklVarZzc16 = zzkq.zzc();
        zzklVarZzc16.zzd(zzkoVar2);
        zzklVarZzc16.zzc(zzknVar4);
        zzklVarZzc16.zzb(zzkmVar3);
        zzklVarZzc16.zza(zzkhVar);
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzklVarZzc16.zze());
        zzkl zzklVarZzc17 = zzkq.zzc();
        zzklVarZzc17.zzd(zzkoVar);
        zzklVarZzc17.zzc(zzknVar4);
        zzklVarZzc17.zzb(zzkmVar3);
        zzklVarZzc17.zza(zzkhVar2);
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzklVarZzc17.zze());
        zzkl zzklVarZzc18 = zzkq.zzc();
        zzklVarZzc18.zzd(zzkoVar2);
        zzklVarZzc18.zzc(zzknVar4);
        zzklVarZzc18.zzb(zzkmVar3);
        zzklVarZzc18.zza(zzkhVar2);
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzklVarZzc18.zze());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzmb.zzb(((zzvu) zzalpVar).zzd());
    }
}

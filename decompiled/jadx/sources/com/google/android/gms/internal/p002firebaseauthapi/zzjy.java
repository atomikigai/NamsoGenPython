package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjy extends zzlh {
    private final zzkg zza;
    private final zzzp zzb;
    private final zzzq zzc;

    private zzjy(zzkg zzkgVar, zzzp zzzpVar, zzzq zzzqVar) {
        this.zza = zzkgVar;
        this.zzb = zzzpVar;
        this.zzc = zzzqVar;
    }

    public static zzjy zza(zzkg zzkgVar, zzzq zzzqVar) throws GeneralSecurityException {
        if (zzkgVar.zzd() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        byte[] bArrZzc = zzzqVar.zzc(zzbm.zza());
        byte[] bArrZzc2 = zzkgVar.zzd().zzc();
        if (bArrZzc.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(zzzm.zzb(bArrZzc), bArrZzc2)) {
            return new zzjy(zzkgVar, null, zzzqVar);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    public static zzjy zzb(zzkg zzkgVar, zzzp zzzpVar) throws GeneralSecurityException {
        if (zzkgVar.zze() == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        BigInteger bigIntegerZzb = zzzpVar.zzb(zzbm.zza());
        ECPoint eCPointZze = zzkgVar.zze();
        zzjs zzjsVarZzc = zzkgVar.zza().zzc();
        BigInteger order = zzc(zzjsVarZzc).getOrder();
        if (bigIntegerZzb.signum() <= 0 || bigIntegerZzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzmq.zze(bigIntegerZzb, zzc(zzjsVarZzc)).equals(eCPointZze)) {
            return new zzjy(zzkgVar, zzzpVar, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    private static ECParameterSpec zzc(zzjs zzjsVar) {
        if (zzjsVar == zzjs.zza) {
            return zzmq.zza;
        }
        if (zzjsVar == zzjs.zzb) {
            return zzmq.zzb;
        }
        if (zzjsVar == zzjs.zzc) {
            return zzmq.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzjsVar)));
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzym {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zzmq.zzd(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger zzb(BigInteger bigInteger, boolean z4, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerZzd = zzmq.zzd(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerZzd);
        if (bigIntegerZzd.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerZzd);
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigIntegerAdd)) {
            if (bigIntegerZzd.testBit(0) && bigIntegerZzd.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerZzd.add(BigInteger.ONE).shiftRight(2), bigIntegerZzd);
            } else if (!bigIntegerZzd.testBit(0) || bigIntegerZzd.testBit(1)) {
                bigIntegerAdd = null;
            } else {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerZzd.subtract(bigIntegerAdd).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerZzd);
                    if (!bigIntegerMod3.equals(BigInteger.ZERO)) {
                        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerZzd);
                        BigInteger bigIntegerMod4 = BigInteger.ONE;
                        if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerZzd)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerZzd.add(bigIntegerMod4).shiftRight(1);
                            BigInteger bigIntegerMod5 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerZzd).multiply(bigIntegerMod3)).mod(bigIntegerZzd);
                                BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerZzd);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerZzd);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerZzd);
                                    bigIntegerMod5 = bigIntegerMod7;
                                } else {
                                    bigIntegerMod4 = bigIntegerMod6;
                                }
                            }
                            bigIntegerAdd = bigIntegerMod5;
                        } else {
                            if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                            i++;
                            if (i == 128 && !bigIntegerZzd.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerZzd).compareTo(bigIntegerMod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
        }
        return z4 != bigIntegerAdd.testBit(0) ? bigIntegerZzd.subtract(bigIntegerAdd).mod(bigIntegerZzd) : bigIntegerAdd;
    }

    public static KeyPair zzc(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzyv.zzf.zza("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void zzd(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zze(eCPublicKey, eCPrivateKey);
        zzmq.zzf(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static void zze(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (zzmq.zzg(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] zzf(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        zze(eCPublicKey, eCPrivateKey);
        ECPoint w10 = eCPublicKey.getW();
        zzmq.zzf(w10, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = ((KeyFactory) zzyv.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) zzyv.zze.zza("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(zzmq.zzd(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            zzb(bigInteger, true, curve);
            return bArrGenerateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static ECPrivateKey zzg(int i, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) zzyv.zzg.zza("EC")).generatePrivate(new ECPrivateKeySpec(zzmn.zza(bArr), zzi(i)));
    }

    public static ECPublicKey zzh(ECParameterSpec eCParameterSpec, int i, byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) ((KeyFactory) zzyv.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(zzj(eCParameterSpec.getCurve(), i, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zzi(int i) throws NoSuchAlgorithmException {
        int i10 = i - 1;
        if (i10 != 0) {
            return i10 != 1 ? zzmq.zzc : zzmq.zzb;
        }
        return zzmq.zza;
    }

    public static ECPoint zzj(EllipticCurve ellipticCurve, int i, byte[] bArr) throws GeneralSecurityException {
        int iZza = zza(ellipticCurve);
        int i10 = i - 1;
        boolean z4 = false;
        if (i10 == 0) {
            int length = bArr.length;
            if (length != iZza + iZza + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i11 = iZza + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i11)), new BigInteger(1, Arrays.copyOfRange(bArr, i11, length)));
            zzmq.zzf(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (i10 != 1) {
            int i12 = iZza + iZza;
            int length2 = bArr.length;
            if (length2 != i12) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, iZza)), new BigInteger(1, Arrays.copyOfRange(bArr, iZza, length2)));
            zzmq.zzf(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        int i13 = iZza + 1;
        BigInteger bigIntegerZzd = zzmq.zzd(ellipticCurve);
        int length3 = bArr.length;
        if (length3 != i13) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b10 = bArr[0];
        if (b10 != 2) {
            if (b10 != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z4 = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length3));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(bigIntegerZzd) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, zzb(bigInteger, z4, ellipticCurve));
    }
}

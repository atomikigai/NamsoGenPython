package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkr extends zzlh {
    private final zzkz zza;
    private final zzzq zzb;

    private zzkr(zzkz zzkzVar, zzzq zzzqVar) {
        this.zza = zzkzVar;
        this.zzb = zzzqVar;
    }

    public static zzkr zza(zzkz zzkzVar, zzzq zzzqVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        zzkn zzknVarZze = zzkzVar.zza().zze();
        int iZza = zzzqVar.zza();
        String str = "Encoded private key byte length for " + zzknVarZze.toString() + " must be %d, not " + iZza;
        zzkn zzknVar = zzkn.zza;
        if (zzknVarZze == zzknVar) {
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (zzknVarZze == zzkn.zzb) {
            if (iZza != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (zzknVarZze == zzkn.zzc) {
            if (iZza != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (zzknVarZze != zzkn.zzf) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(zzknVarZze.toString()));
            }
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        zzkn zzknVarZze2 = zzkzVar.zza().zze();
        byte[] bArrZzc = zzkzVar.zzc().zzc();
        byte[] bArrZzc2 = zzzqVar.zzc(zzbm.zza());
        if (zzknVarZze2 == zzknVar || zzknVarZze2 == zzkn.zzb || zzknVarZze2 == zzkn.zzc) {
            if (zzknVarZze2 == zzknVar) {
                eCParameterSpec = zzmq.zza;
            } else if (zzknVarZze2 == zzkn.zzb) {
                eCParameterSpec = zzmq.zzb;
            } else {
                if (zzknVarZze2 != zzkn.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(zzknVarZze2.toString()));
                }
                eCParameterSpec = zzmq.zzc;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigIntegerZza = zzmn.zza(bArrZzc2);
            if (bigIntegerZza.signum() <= 0 || bigIntegerZza.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zzmq.zze(bigIntegerZza, eCParameterSpec).equals(zzym.zzj(eCParameterSpec.getCurve(), 1, bArrZzc))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (zzknVarZze2 != zzkn.zzf) {
                throw new IllegalArgumentException("Unable to validate key pair for ".concat(zzknVarZze2.toString()));
            }
            if (!Arrays.equals(zzzm.zzb(bArrZzc2), bArrZzc)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new zzkr(zzkzVar, zzzqVar);
    }
}

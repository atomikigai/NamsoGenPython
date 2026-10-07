package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmb {
    public static final byte[] zza = zzd(1, 0);
    public static final byte[] zzb = zzd(1, 2);
    public static final byte[] zzc = zzd(2, 32);
    public static final byte[] zzd = zzd(2, 16);
    public static final byte[] zze = zzd(2, 17);
    public static final byte[] zzf = zzd(2, 18);
    public static final byte[] zzg = zzd(2, 1);
    public static final byte[] zzh = zzd(2, 2);
    public static final byte[] zzi = zzd(2, 3);
    public static final byte[] zzj = zzd(2, 1);
    public static final byte[] zzk = zzd(2, 2);
    public static final byte[] zzl = zzd(2, 3);
    public static final byte[] zzm = new byte[0];
    private static final byte[] zzn;
    private static final byte[] zzo;
    private static final byte[] zzp;

    static {
        Charset charset = zzpd.zza;
        zzn = "KEM".getBytes(charset);
        zzo = "HPKE".getBytes(charset);
        zzp = "HPKE-v1".getBytes(charset);
    }

    public static int zza(zzvr zzvrVar) throws GeneralSecurityException {
        zzvr zzvrVar2 = zzvr.KEM_UNKNOWN;
        int iOrdinal = zzvrVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return 32;
        }
        if (iOrdinal == 3) {
            return 48;
        }
        if (iOrdinal == 4) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static void zzb(zzvx zzvxVar) throws GeneralSecurityException {
        if (zzvxVar.zzc() == zzvr.KEM_UNKNOWN || zzvxVar.zzc() == zzvr.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(String.valueOf(zzvxVar.zzc().name())));
        }
        if (zzvxVar.zzb() == zzvp.KDF_UNKNOWN || zzvxVar.zzb() == zzvp.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KDF param: ".concat(String.valueOf(zzvxVar.zzb().name())));
        }
        if (zzvxVar.zza() == zzvn.AEAD_UNKNOWN || zzvxVar.zza() == zzvn.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(String.valueOf(zzvxVar.zza().name())));
        }
    }

    public static byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzyf.zzb(zzo, bArr, bArr2, bArr3);
    }

    public static byte[] zzd(int i, int i10) {
        byte[] bArr = new byte[i];
        for (int i11 = 0; i11 < i; i11++) {
            bArr[i11] = (byte) ((i10 >> (((i - i11) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] zze(byte[] bArr) throws GeneralSecurityException {
        return zzyf.zzb(zzn, bArr);
    }

    public static byte[] zzf(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzyf.zzb(zzp, bArr2, str.getBytes(zzpd.zza), bArr);
    }

    public static byte[] zzg(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return zzyf.zzb(zzd(2, i), zzp, bArr2, str.getBytes(zzpd.zza), bArr);
    }

    public static int zzh(zzvr zzvrVar) throws GeneralSecurityException {
        zzvr zzvrVar2 = zzvr.KEM_UNKNOWN;
        int iOrdinal = zzvrVar.ordinal();
        if (iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            return 2;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}

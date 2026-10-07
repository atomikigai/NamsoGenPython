package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlq implements zzbk {
    private static final byte[] zza = new byte[0];
    private final zzlu zzb;
    private final zzlt zzc;
    private final zzls zzd;
    private final zzlo zze;
    private final int zzf;

    private zzlq(zzlu zzluVar, zzlt zzltVar, zzls zzlsVar, zzlo zzloVar, int i) {
        this.zzb = zzluVar;
        this.zzc = zzltVar;
        this.zzd = zzlsVar;
        this.zze = zzloVar;
        this.zzf = i;
    }

    public static zzlq zzb(zzwa zzwaVar) throws GeneralSecurityException {
        int i;
        zzlu zzluVarZzc;
        if (!zzwaVar.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzwaVar.zze().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzwaVar.zzf().zzp()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzvx zzvxVarZzb = zzwaVar.zze().zzb();
        zzlt zzltVarZzc = zzlv.zzc(zzvxVarZzb);
        zzls zzlsVarZzb = zzlv.zzb(zzvxVarZzb);
        zzlo zzloVarZza = zzlv.zza(zzvxVarZzb);
        zzvr zzvrVarZzc = zzvxVarZzb.zzc();
        zzvr zzvrVar = zzvr.KEM_UNKNOWN;
        int iOrdinal = zzvrVarZzc.ordinal();
        if (iOrdinal == 1) {
            i = 32;
        } else if (iOrdinal == 2) {
            i = 65;
        } else if (iOrdinal == 3) {
            i = 97;
        } else {
            if (iOrdinal != 4) {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(String.valueOf(zzvrVarZzc.name())));
            }
            i = 133;
        }
        int iOrdinal2 = zzwaVar.zze().zzb().zzc().ordinal();
        if (iOrdinal2 == 1) {
            zzluVarZzc = zzmf.zzc(zzwaVar.zzf().zzq());
        } else {
            if (iOrdinal2 != 2 && iOrdinal2 != 3 && iOrdinal2 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            zzluVarZzc = zzmd.zzc(zzwaVar.zzf().zzq(), zzwaVar.zze().zzg().zzq(), zzmb.zzh(zzwaVar.zze().zzb().zzc()));
        }
        return new zzlq(zzluVarZzc, zzltVarZzc, zzlsVarZzb, zzloVarZza, i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbk
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzf;
        if (length < i) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.zzf, length);
        zzlu zzluVar = this.zzb;
        zzlt zzltVar = this.zzc;
        zzls zzlsVar = this.zzd;
        zzlo zzloVar = this.zze;
        byte[] bArrZza = zzltVar.zza(bArrCopyOf, zzluVar);
        return zzlp.zza(zzmb.zza, bArrCopyOf, bArrZza, zzltVar, zzlsVar, zzloVar, new byte[0]).zzb(bArrCopyOfRange, zza);
    }
}

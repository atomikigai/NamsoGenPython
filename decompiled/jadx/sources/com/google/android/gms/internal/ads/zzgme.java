package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgme {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzgwuVarZzb;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgme.zzd((zzgkm) zzggjVar);
            }
        }, zzgkm.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgme.zzb((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgme.zzc((zzgkg) zzgfwVar, zzggnVar);
            }
        }, zzgkg.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgme.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzgkg zza(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgvk zzgvkVarZzd = zzgvk.zzd(zzgowVar.zze(), zzgyh.zza());
            if (zzgvkVarZzd.zza() == 0) {
                return zzgkg.zza(zzf(zzgowVar.zzc()), zzgwv.zzb(zzgvkVarZzd.zzf().zzA(), zzggnVar), zzgowVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgzm unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgkm zzb(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            if (zzgvn.zzd(zzgoxVar.zzc().zzh(), zzgyh.zza()).zza() == 0) {
                return zzgkm.zzc(zzf(zzgoxVar.zzc().zzg()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgow zzc(zzgkg zzgkgVar, zzggn zzggnVar) {
        zzgvi zzgviVarZzb = zzgvk.zzb();
        byte[] bArrZzd = zzgkgVar.zzd().zzd(zzggnVar);
        zzgviVarZzb.zza(zzgxp.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgvk) zzgviVarZzb.zzbr()).zzaN(), zzgty.SYMMETRIC, zzg(zzgkgVar.zzb().zzb()), zzgkgVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzgkm zzgkmVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgucVarZza.zzc(zzgvn.zzc().zzaN());
        zzgucVarZza.zza(zzg(zzgkmVar.zzb()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgkl zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int iOrdinal = zzgveVar.ordinal();
        if (iOrdinal == 1) {
            return zzgkl.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgkl.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzgveVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgkl.zzb;
    }

    private static zzgve zzg(zzgkl zzgklVar) throws GeneralSecurityException {
        if (zzgkl.zza.equals(zzgklVar)) {
            return zzgve.TINK;
        }
        if (zzgkl.zzb.equals(zzgklVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgkl.zzc.equals(zzgklVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgklVar.toString()));
    }
}

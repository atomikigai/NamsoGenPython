package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgld {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgwuVarZzb;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgld.zzd((zzgie) zzggjVar);
            }
        }, zzgie.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgla
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgld.zzb((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgld.zzc((zzghw) zzgfwVar, zzggnVar);
            }
        }, zzghw.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgld.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzghw zza(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgsx zzgsxVarZzd = zzgsx.zzd(zzgowVar.zze(), zzgyh.zza());
            if (zzgsxVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgib zzgibVarZzc = zzgie.zzc();
            zzgibVarZzc.zzb(zzgsxVarZzd.zzf().zzd());
            zzgibVarZzc.zza(12);
            zzgibVarZzc.zzc(16);
            zzgibVarZzc.zzd(zzf(zzgowVar.zzc()));
            zzgie zzgieVarZze = zzgibVarZzc.zze();
            zzghu zzghuVarZza = zzghw.zza();
            zzghuVarZza.zzc(zzgieVarZze);
            zzghuVarZza.zzb(zzgwv.zzb(zzgsxVarZzd.zzf().zzA(), zzggnVar));
            zzghuVarZza.zza(zzgowVar.zzf());
            return zzghuVarZza.zzd();
        } catch (zzgzm unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgie zzb(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            zzgta zzgtaVarZzf = zzgta.zzf(zzgoxVar.zzc().zzh(), zzgyh.zza());
            if (zzgtaVarZzf.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgib zzgibVarZzc = zzgie.zzc();
            zzgibVarZzc.zzb(zzgtaVarZzf.zza());
            zzgibVarZzc.zza(12);
            zzgibVarZzc.zzc(16);
            zzgibVarZzc.zzd(zzf(zzgoxVar.zzc().zzg()));
            return zzgibVarZzc.zze();
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgow zzc(zzghw zzghwVar, zzggn zzggnVar) {
        zzgsv zzgsvVarZzb = zzgsx.zzb();
        byte[] bArrZzd = zzghwVar.zzd().zzd(zzggnVar);
        zzgsvVarZzb.zza(zzgxp.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgsx) zzgsvVarZzb.zzbr()).zzaN(), zzgty.SYMMETRIC, zzg(zzghwVar.zzb().zzd()), zzghwVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzgie zzgieVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgsy zzgsyVarZzc = zzgta.zzc();
        zzgsyVarZzc.zza(zzgieVar.zzb());
        zzgucVarZza.zzc(((zzgta) zzgsyVarZzc.zzbr()).zzaN());
        zzgucVarZza.zza(zzg(zzgieVar.zzd()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgic zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int iOrdinal = zzgveVar.ordinal();
        if (iOrdinal == 1) {
            return zzgic.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgic.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzgveVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgic.zzb;
    }

    private static zzgve zzg(zzgic zzgicVar) throws GeneralSecurityException {
        if (zzgic.zza.equals(zzgicVar)) {
            return zzgve.TINK;
        }
        if (zzgic.zzb.equals(zzgicVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgic.zzc.equals(zzgicVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgicVar)));
    }
}

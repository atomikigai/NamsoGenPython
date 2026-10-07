package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgkw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgwuVarZzb;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgks
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgkw.zzd((zzght) zzggjVar);
            }
        }, zzght.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgkt
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgkw.zzb((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgku
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgkw.zzc((zzghm) zzgfwVar, zzggnVar);
            }
        }, zzghm.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgkv
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgkw.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzghm zza(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgso zzgsoVarZzd = zzgso.zzd(zzgowVar.zze(), zzgyh.zza());
            if (zzgsoVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzghq zzghqVarZzd = zzght.zzd();
            zzghqVarZzd.zzb(zzgsoVarZzd.zzg().zzd());
            zzghqVarZzd.zza(zzgsoVarZzd.zzf().zza());
            zzghqVarZzd.zzc(16);
            zzghqVarZzd.zzd(zzf(zzgowVar.zzc()));
            zzght zzghtVarZze = zzghqVarZzd.zze();
            zzghk zzghkVarZza = zzghm.zza();
            zzghkVarZza.zzc(zzghtVarZze);
            zzghkVarZza.zzb(zzgwv.zzb(zzgsoVarZzd.zzg().zzA(), zzggnVar));
            zzghkVarZza.zza(zzgowVar.zzf());
            return zzghkVarZza.zzd();
        } catch (zzgzm unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzght zzb(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            zzgsr zzgsrVarZzd = zzgsr.zzd(zzgoxVar.zzc().zzh(), zzgyh.zza());
            zzghq zzghqVarZzd = zzght.zzd();
            zzghqVarZzd.zzb(zzgsrVarZzd.zza());
            zzghqVarZzd.zza(zzgsrVarZzd.zzf().zza());
            zzghqVarZzd.zzc(16);
            zzghqVarZzd.zzd(zzf(zzgoxVar.zzc().zzg()));
            return zzghqVarZzd.zze();
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgow zzc(zzghm zzghmVar, zzggn zzggnVar) {
        zzgsm zzgsmVarZzb = zzgso.zzb();
        zzgsmVarZzb.zzb(zzg(zzghmVar.zzb()));
        byte[] bArrZzd = zzghmVar.zzd().zzd(zzggnVar);
        zzgsmVarZzb.zza(zzgxp.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgso) zzgsmVarZzb.zzbr()).zzaN(), zzgty.SYMMETRIC, zzh(zzghmVar.zzb().zze()), zzghmVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzght zzghtVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgsp zzgspVarZzb = zzgsr.zzb();
        zzgspVarZzb.zzb(zzg(zzghtVar));
        zzgspVarZzb.zza(zzghtVar.zzc());
        zzgucVarZza.zzc(((zzgsr) zzgspVarZzb.zzbr()).zzaN());
        zzgucVarZza.zza(zzh(zzghtVar.zze()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzghr zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int iOrdinal = zzgveVar.ordinal();
        if (iOrdinal == 1) {
            return zzghr.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzghr.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzgveVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzghr.zzb;
    }

    private static zzgsu zzg(zzght zzghtVar) throws GeneralSecurityException {
        zzgss zzgssVarZzb = zzgsu.zzb();
        zzgssVarZzb.zza(zzghtVar.zzb());
        return (zzgsu) zzgssVarZzb.zzbr();
    }

    private static zzgve zzh(zzghr zzghrVar) throws GeneralSecurityException {
        if (zzghr.zza.equals(zzghrVar)) {
            return zzgve.TINK;
        }
        if (zzghr.zzb.equals(zzghrVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzghr.zzc.equals(zzghrVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzghrVar)));
    }
}

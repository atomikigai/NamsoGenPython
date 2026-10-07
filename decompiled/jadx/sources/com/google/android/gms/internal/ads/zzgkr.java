package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgkr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgwuVarZzb;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgkr.zzd((zzghj) zzggjVar);
            }
        }, zzghj.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgko
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgkr.zzb((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgkp
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgkr.zzc((zzgha) zzgfwVar, zzggnVar);
            }
        }, zzgha.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgkr.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzgha zza(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgrz zzgrzVarZzd = zzgrz.zzd(zzgowVar.zze(), zzgyh.zza());
            if (zzgrzVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgrzVarZzd.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzgrzVarZzd.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzghf zzghfVarZzf = zzghj.zzf();
            zzghfVarZzf.zza(zzgrzVarZzd.zzf().zzg().zzd());
            zzghfVarZzf.zzc(zzgrzVarZzd.zzg().zzh().zzd());
            zzghfVarZzf.zzd(zzgrzVarZzd.zzf().zzf().zza());
            zzghfVarZzf.zze(zzgrzVarZzd.zzg().zzg().zza());
            zzghfVarZzf.zzb(zzf(zzgrzVarZzd.zzg().zzg().zzb()));
            zzghfVarZzf.zzf(zzg(zzgowVar.zzc()));
            zzghj zzghjVarZzg = zzghfVarZzf.zzg();
            zzggy zzggyVarZza = zzgha.zza();
            zzggyVarZza.zzd(zzghjVarZzg);
            zzggyVarZza.zza(zzgwv.zzb(zzgrzVarZzd.zzf().zzg().zzA(), zzggnVar));
            zzggyVarZza.zzb(zzgwv.zzb(zzgrzVarZzd.zzg().zzh().zzA(), zzggnVar));
            zzggyVarZza.zzc(zzgowVar.zzf());
            return zzggyVarZza.zze();
        } catch (zzgzm unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzghj zzb(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            zzgsc zzgscVarZzc = zzgsc.zzc(zzgoxVar.zzc().zzh(), zzgyh.zza());
            if (zzgscVarZzc.zzf().zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzghf zzghfVarZzf = zzghj.zzf();
            zzghfVarZzf.zza(zzgscVarZzc.zzd().zza());
            zzghfVarZzf.zzc(zzgscVarZzc.zzf().zza());
            zzghfVarZzf.zzd(zzgscVarZzc.zzd().zzf().zza());
            zzghfVarZzf.zze(zzgscVarZzc.zzf().zzh().zza());
            zzghfVarZzf.zzb(zzf(zzgscVarZzc.zzf().zzh().zzb()));
            zzghfVarZzf.zzf(zzg(zzgoxVar.zzc().zzg()));
            return zzghfVarZzf.zzg();
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgow zzc(zzgha zzghaVar, zzggn zzggnVar) {
        zzgrx zzgrxVarZzb = zzgrz.zzb();
        zzgsd zzgsdVarZzb = zzgsf.zzb();
        zzgsj zzgsjVarZzb = zzgsl.zzb();
        zzgsjVarZzb.zza(zzghaVar.zzb().zzd());
        zzgsdVarZzb.zzb((zzgsl) zzgsjVarZzb.zzbr());
        byte[] bArrZzd = zzghaVar.zzd().zzd(zzggnVar);
        zzgsdVarZzb.zza(zzgxp.zzv(bArrZzd, 0, bArrZzd.length));
        zzgrxVarZzb.zza((zzgsf) zzgsdVarZzb.zzbr());
        zzgto zzgtoVarZzb = zzgtq.zzb();
        zzgtoVarZzb.zzb(zzh(zzghaVar.zzb()));
        byte[] bArrZzd2 = zzghaVar.zze().zzd(zzggnVar);
        zzgtoVarZzb.zza(zzgxp.zzv(bArrZzd2, 0, bArrZzd2.length));
        zzgrxVarZzb.zzb((zzgtq) zzgtoVarZzb.zzbr());
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgrz) zzgrxVarZzb.zzbr()).zzaN(), zzgty.SYMMETRIC, zzi(zzghaVar.zzb().zzh()), zzghaVar.zzf());
    }

    public static /* synthetic */ zzgox zzd(zzghj zzghjVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgsa zzgsaVarZza = zzgsc.zza();
        zzgsg zzgsgVarZzb = zzgsi.zzb();
        zzgsj zzgsjVarZzb = zzgsl.zzb();
        zzgsjVarZzb.zza(zzghjVar.zzd());
        zzgsgVarZzb.zzb((zzgsl) zzgsjVarZzb.zzbr());
        zzgsgVarZzb.zza(zzghjVar.zzb());
        zzgsaVarZza.zza((zzgsi) zzgsgVarZzb.zzbr());
        zzgtr zzgtrVarZzc = zzgtt.zzc();
        zzgtrVarZzc.zzb(zzh(zzghjVar));
        zzgtrVarZzc.zza(zzghjVar.zzc());
        zzgsaVarZza.zzb((zzgtt) zzgtrVarZzc.zzbr());
        zzgucVarZza.zzc(((zzgsc) zzgsaVarZza.zzbr()).zzaN());
        zzgucVarZza.zza(zzi(zzghjVar.zzh()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzghg zzf(zzgtn zzgtnVar) throws GeneralSecurityException {
        int iOrdinal = zzgtnVar.ordinal();
        if (iOrdinal == 1) {
            return zzghg.zza;
        }
        if (iOrdinal == 2) {
            return zzghg.zzd;
        }
        if (iOrdinal == 3) {
            return zzghg.zzc;
        }
        if (iOrdinal == 4) {
            return zzghg.zze;
        }
        if (iOrdinal == 5) {
            return zzghg.zzb;
        }
        throw new GeneralSecurityException(v.f(zzgtnVar.zza(), "Unable to parse HashType: "));
    }

    private static zzghh zzg(zzgve zzgveVar) throws GeneralSecurityException {
        int iOrdinal = zzgveVar.ordinal();
        if (iOrdinal == 1) {
            return zzghh.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzghh.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzgveVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzghh.zzb;
    }

    private static zzgtw zzh(zzghj zzghjVar) throws GeneralSecurityException {
        zzgtn zzgtnVar;
        zzgtu zzgtuVarZzc = zzgtw.zzc();
        zzgtuVarZzc.zzb(zzghjVar.zze());
        zzghg zzghgVarZzg = zzghjVar.zzg();
        if (zzghg.zza.equals(zzghgVarZzg)) {
            zzgtnVar = zzgtn.SHA1;
        } else if (zzghg.zzb.equals(zzghgVarZzg)) {
            zzgtnVar = zzgtn.SHA224;
        } else if (zzghg.zzc.equals(zzghgVarZzg)) {
            zzgtnVar = zzgtn.SHA256;
        } else if (zzghg.zzd.equals(zzghgVarZzg)) {
            zzgtnVar = zzgtn.SHA384;
        } else {
            if (!zzghg.zze.equals(zzghgVarZzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzghgVarZzg)));
            }
            zzgtnVar = zzgtn.SHA512;
        }
        zzgtuVarZzc.zza(zzgtnVar);
        return (zzgtw) zzgtuVarZzc.zzbr();
    }

    private static zzgve zzi(zzghh zzghhVar) throws GeneralSecurityException {
        if (zzghh.zza.equals(zzghhVar)) {
            return zzgve.TINK;
        }
        if (zzghh.zzb.equals(zzghhVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzghh.zzc.equals(zzghhVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzghhVar)));
    }
}

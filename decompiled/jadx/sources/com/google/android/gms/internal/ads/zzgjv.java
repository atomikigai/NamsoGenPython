package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgjv {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzgwuVarZzb;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgjr
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgjv.zzd((zzgjq) zzggjVar);
            }
        }, zzgjq.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgjv.zzb((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgjv.zzc((zzgjl) zzgfwVar, zzggnVar);
            }
        }, zzgjl.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgju
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgjv.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzgjl zza(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgva zzgvaVarZzd = zzgva.zzd(zzgowVar.zze(), zzgyh.zza());
            if (zzgvaVarZzd.zza() == 0) {
                return zzgjl.zza(zzf(zzgvaVarZzd.zzf(), zzgowVar.zzc()), zzgowVar.zzf());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zzgvaVarZzd)));
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzgjq zzb(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            return zzf(zzgvd.zzf(zzgoxVar.zzc().zzh(), zzgyh.zza()), zzgoxVar.zzc().zzg());
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgow zzc(zzgjl zzgjlVar, zzggn zzggnVar) {
        zzguy zzguyVarZzb = zzgva.zzb();
        zzguyVarZzb.zza(zzg(zzgjlVar.zzb()));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgva) zzguyVarZzb.zzbr()).zzaN(), zzgty.REMOTE, zzh(zzgjlVar.zzb().zzc()), zzgjlVar.zzd());
    }

    public static /* synthetic */ zzgox zzd(zzgjq zzgjqVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzgucVarZza.zzc(zzg(zzgjqVar).zzaN());
        zzgucVarZza.zza(zzh(zzgjqVar.zzc()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgjq zzf(zzgvd zzgvdVar, zzgve zzgveVar) throws GeneralSecurityException {
        zzgjn zzgjnVar;
        zzgjo zzgjoVar;
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb(zzgvdVar.zza().zzi());
        zzgucVarZza.zzc(zzgvdVar.zza().zzh());
        zzgucVarZza.zza(zzgve.RAW);
        zzggj zzggjVarZza = zzggp.zza(((zzgue) zzgucVarZza.zzbr()).zzaV());
        if (zzggjVarZza instanceof zzgie) {
            zzgjnVar = zzgjn.zza;
        } else if (zzggjVarZza instanceof zzgiv) {
            zzgjnVar = zzgjn.zzc;
        } else if (zzggjVarZza instanceof zzgkm) {
            zzgjnVar = zzgjn.zzb;
        } else if (zzggjVarZza instanceof zzghj) {
            zzgjnVar = zzgjn.zzd;
        } else if (zzggjVarZza instanceof zzght) {
            zzgjnVar = zzgjn.zze;
        } else {
            if (!(zzggjVarZza instanceof zzgip)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzggjVarZza.toString()));
            }
            zzgjnVar = zzgjn.zzf;
        }
        zzgjm zzgjmVar = new zzgjm(null);
        int iOrdinal = zzgveVar.ordinal();
        if (iOrdinal == 1) {
            zzgjoVar = zzgjo.zza;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException(v.f(zzgveVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            zzgjoVar = zzgjo.zzb;
        }
        zzgjmVar.zzd(zzgjoVar);
        zzgjmVar.zzc(zzgvdVar.zzg());
        zzgjmVar.zza((zzggt) zzggjVarZza);
        zzgjmVar.zzb(zzgjnVar);
        return zzgjmVar.zze();
    }

    private static zzgvd zzg(zzgjq zzgjqVar) throws GeneralSecurityException {
        try {
            zzgue zzgueVarZzf = zzgue.zzf(zzggp.zzb(zzgjqVar.zzb()), zzgyh.zza());
            zzgvb zzgvbVarZzb = zzgvd.zzb();
            zzgvbVarZzb.zzb(zzgjqVar.zzd());
            zzgvbVarZzb.zza(zzgueVarZzf);
            return (zzgvd) zzgvbVarZzb.zzbr();
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzgve zzh(zzgjo zzgjoVar) throws GeneralSecurityException {
        if (zzgjo.zza.equals(zzgjoVar)) {
            return zzgve.TINK;
        }
        if (zzgjo.zzb.equals(zzgjoVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgjoVar)));
    }
}

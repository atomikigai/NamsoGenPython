package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgli {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgwuVarZzb;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgle
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgli.zzd((zzgip) zzggjVar);
            }
        }, zzgip.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzglf
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgli.zzb((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgli.zzc((zzgih) zzgfwVar, zzggnVar);
            }
        }, zzgih.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgli.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzgih zza(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgtd zzgtdVarZzd = zzgtd.zzd(zzgowVar.zze(), zzgyh.zza());
            if (zzgtdVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgim zzgimVarZzc = zzgip.zzc();
            zzgimVarZzc.zza(zzgtdVarZzd.zzf().zzd());
            zzgimVarZzc.zzb(zzf(zzgowVar.zzc()));
            zzgip zzgipVarZzc = zzgimVarZzc.zzc();
            zzgif zzgifVarZza = zzgih.zza();
            zzgifVarZza.zzc(zzgipVarZzc);
            zzgifVarZza.zzb(zzgwv.zzb(zzgtdVarZzd.zzf().zzA(), zzggnVar));
            zzgifVarZza.zza(zzgowVar.zzf());
            return zzgifVarZza.zzd();
        } catch (zzgzm unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgip zzb(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            zzgtg zzgtgVarZzf = zzgtg.zzf(zzgoxVar.zzc().zzh(), zzgyh.zza());
            if (zzgtgVarZzf.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgim zzgimVarZzc = zzgip.zzc();
            zzgimVarZzc.zza(zzgtgVarZzf.zza());
            zzgimVarZzc.zzb(zzf(zzgoxVar.zzc().zzg()));
            return zzgimVarZzc.zzc();
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgow zzc(zzgih zzgihVar, zzggn zzggnVar) {
        zzgtb zzgtbVarZzb = zzgtd.zzb();
        byte[] bArrZzd = zzgihVar.zzd().zzd(zzggnVar);
        zzgtbVarZzb.zza(zzgxp.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgtd) zzgtbVarZzb.zzbr()).zzaN(), zzgty.SYMMETRIC, zzg(zzgihVar.zzb().zzd()), zzgihVar.zze());
    }

    public static /* synthetic */ zzgox zzd(zzgip zzgipVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgte zzgteVarZzc = zzgtg.zzc();
        zzgteVarZzc.zza(zzgipVar.zzb());
        zzgucVarZza.zzc(((zzgtg) zzgteVarZzc.zzbr()).zzaN());
        zzgucVarZza.zza(zzg(zzgipVar.zzd()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgin zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int iOrdinal = zzgveVar.ordinal();
        if (iOrdinal == 1) {
            return zzgin.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgin.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzgveVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgin.zzb;
    }

    private static zzgve zzg(zzgin zzginVar) throws GeneralSecurityException {
        if (zzgin.zza.equals(zzginVar)) {
            return zzgve.TINK;
        }
        if (zzgin.zzb.equals(zzginVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgin.zzc.equals(zzginVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzginVar)));
    }
}

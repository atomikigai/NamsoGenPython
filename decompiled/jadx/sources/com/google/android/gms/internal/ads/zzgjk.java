package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgjk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzgwuVarZzb;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgjg
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgjk.zzd((zzgjf) zzggjVar);
            }
        }, zzgjf.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgjh
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgjk.zzb((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgji
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgjk.zzc((zzgjd) zzgfwVar, zzggnVar);
            }
        }, zzgjd.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgjj
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgjk.zza((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzgjd zza(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzguu zzguuVarZzd = zzguu.zzd(zzgowVar.zze(), zzgyh.zza());
            if (zzguuVarZzd.zza() == 0) {
                return zzgjd.zza(zzgjf.zzc(zzguuVarZzd.zzf().zzf(), zzf(zzgowVar.zzc())), zzgowVar.zzf());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzguuVarZzd)));
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzgjf zzb(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            return zzgjf.zzc(zzgux.zzd(zzgoxVar.zzc().zzh(), zzgyh.zza()).zzf(), zzf(zzgoxVar.zzc().zzg()));
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgow zzc(zzgjd zzgjdVar, zzggn zzggnVar) {
        zzgus zzgusVarZzb = zzguu.zzb();
        zzguv zzguvVarZza = zzgux.zza();
        zzguvVarZza.zza(zzgjdVar.zzb().zzd());
        zzgusVarZzb.zza((zzgux) zzguvVarZza.zzbr());
        return zzgow.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzguu) zzgusVarZzb.zzbr()).zzaN(), zzgty.REMOTE, zzg(zzgjdVar.zzb().zzb()), zzgjdVar.zzd());
    }

    public static /* synthetic */ zzgox zzd(zzgjf zzgjfVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzguv zzguvVarZza = zzgux.zza();
        zzguvVarZza.zza(zzgjfVar.zzd());
        zzgucVarZza.zzc(((zzgux) zzguvVarZza.zzbr()).zzaN());
        zzgucVarZza.zza(zzg(zzgjfVar.zzb()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgje zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int iOrdinal = zzgveVar.ordinal();
        if (iOrdinal == 1) {
            return zzgje.zza;
        }
        if (iOrdinal == 3) {
            return zzgje.zzb;
        }
        throw new GeneralSecurityException(v.f(zzgveVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgve zzg(zzgje zzgjeVar) throws GeneralSecurityException {
        if (zzgje.zza.equals(zzgjeVar)) {
            return zzgve.TINK;
        }
        if (zzgje.zzb.equals(zzgjeVar)) {
            return zzgve.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjeVar.toString()));
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfu {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) throws GeneralSecurityException {
                zzxo zzxoVar;
                zzfp zzfpVar = (zzfp) zzceVar;
                int i = zzfu.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                zzto zztoVarZzc = zztp.zzc();
                zztoVarZzc.zza(zzfpVar.zzb());
                zzwmVarZza.zzc(((zztp) zztoVarZzc.zzi()).zzo());
                zzfn zzfnVarZzc = zzfpVar.zzc();
                if (zzfn.zza.equals(zzfnVarZzc)) {
                    zzxoVar = zzxo.TINK;
                } else if (zzfn.zzb.equals(zzfnVarZzc)) {
                    zzxoVar = zzxo.CRUNCHY;
                } else {
                    if (!zzfn.zzc.equals(zzfnVarZzc)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzfnVarZzc)));
                    }
                    zzxoVar = zzxo.RAW;
                }
                zzwmVarZza.zza(zzxoVar);
                return zzop.zzb((zzwn) zzwmVarZza.zzi());
            }
        }, zzfp.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzfu.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfs
        }, zzfh.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzft
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzfu.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzfh zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zztm zztmVarZzd = zztm.zzd(zzooVar.zze(), zzajx.zza());
            if (zztmVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzfm zzfmVar = new zzfm(null);
            zzfmVar.zza(zztmVarZzd.zze().zzd());
            zzfmVar.zzb(zzd(zzooVar.zzc()));
            zzfp zzfpVarZzc = zzfmVar.zzc();
            zzff zzffVar = new zzff(null);
            zzffVar.zzc(zzfpVarZzc);
            zzffVar.zzb(zzzq.zzb(zztmVarZzd.zze().zzq(), zzcrVar));
            zzffVar.zza(zzooVar.zzf());
            return zzffVar.zzd();
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzfp zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            zztp zztpVarZze = zztp.zze(zzopVar.zzc().zzf(), zzajx.zza());
            if (zztpVarZze.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzfm zzfmVar = new zzfm(null);
            zzfmVar.zza(zztpVarZze.zza());
            zzfmVar.zzb(zzd(zzopVar.zzc().zze()));
            return zzfmVar.zzc();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static void zzc(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zzfn zzd(zzxo zzxoVar) throws GeneralSecurityException {
        zzxo zzxoVar2 = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVar.ordinal();
        if (iOrdinal == 1) {
            return zzfn.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzfn.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzxoVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzfn.zzb;
    }
}

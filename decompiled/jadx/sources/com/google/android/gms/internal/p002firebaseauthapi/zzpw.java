package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzpw {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzps
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) throws GeneralSecurityException {
                zzxo zzxoVar;
                zzpr zzprVar = (zzpr) zzceVar;
                int i = zzpw.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
                zzsb zzsbVarZzb = zzsc.zzb();
                zzse zzseVarZzb = zzsf.zzb();
                zzseVarZzb.zza(zzprVar.zzb());
                zzsbVarZzb.zzb((zzsf) zzseVarZzb.zzi());
                zzsbVarZzb.zza(zzprVar.zzc());
                zzwmVarZza.zzc(((zzsc) zzsbVarZzb.zzi()).zzo());
                zzpp zzppVarZze = zzprVar.zze();
                if (zzpp.zza.equals(zzppVarZze)) {
                    zzxoVar = zzxo.TINK;
                } else if (zzpp.zzb.equals(zzppVarZze)) {
                    zzxoVar = zzxo.CRUNCHY;
                } else if (zzpp.zzd.equals(zzppVarZze)) {
                    zzxoVar = zzxo.RAW;
                } else {
                    if (!zzpp.zzc.equals(zzppVarZze)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzppVarZze)));
                    }
                    zzxoVar = zzxo.LEGACY;
                }
                zzwmVarZza.zza(zzxoVar);
                return zzop.zzb((zzwn) zzwmVarZza.zzi());
            }
        }, zzpr.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzpw.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpu
        }, zzph.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzpw.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzph zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzrz zzrzVarZzd = zzrz.zzd(zzooVar.zze(), zzajx.zza());
            if (zzrzVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzpo zzpoVar = new zzpo(null);
            zzpoVar.zza(zzrzVarZzd.zzf().zzd());
            zzpoVar.zzb(zzrzVarZzd.zze().zza());
            zzpoVar.zzc(zzd(zzooVar.zzc()));
            zzpr zzprVarZzd = zzpoVar.zzd();
            zzpf zzpfVar = new zzpf(null);
            zzpfVar.zzc(zzprVarZzd);
            zzpfVar.zza(zzzq.zzb(zzrzVarZzd.zzf().zzq(), zzcrVar));
            zzpfVar.zzb(zzooVar.zzf());
            return zzpfVar.zzd();
        } catch (zzaks | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzpr zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            zzsc zzscVarZzd = zzsc.zzd(zzopVar.zzc().zzf(), zzajx.zza());
            zzpo zzpoVar = new zzpo(null);
            zzpoVar.zza(zzscVarZzd.zza());
            zzpoVar.zzb(zzscVarZzd.zze().zza());
            zzpoVar.zzc(zzd(zzopVar.zzc().zze()));
            return zzpoVar.zzd();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zzc(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zzpp zzd(zzxo zzxoVar) throws GeneralSecurityException {
        zzxo zzxoVar2 = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVar.ordinal();
        if (iOrdinal == 1) {
            return zzpp.zza;
        }
        if (iOrdinal == 2) {
            return zzpp.zzc;
        }
        if (iOrdinal == 3) {
            return zzpp.zzd;
        }
        if (iOrdinal == 4) {
            return zzpp.zzb;
        }
        throw new GeneralSecurityException(v.f(zzxoVar.zza(), "Unable to parse OutputPrefixType: "));
    }
}

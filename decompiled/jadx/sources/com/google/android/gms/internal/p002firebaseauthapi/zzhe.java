package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhe {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzha
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) throws GeneralSecurityException {
                zzgz zzgzVar = (zzgz) zzceVar;
                int i = zzhe.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                try {
                    zzwn zzwnVarZzd = zzwn.zzd(zzcs.zzb(zzgzVar.zzb()), zzajx.zza());
                    zzxl zzxlVarZzb = zzxm.zzb();
                    zzxlVarZzb.zzb(zzgzVar.zzc());
                    zzxlVarZzb.zza(zzwnVarZzd);
                    zzwmVarZza.zzc(((zzxm) zzxlVarZzb.zzi()).zzo());
                    zzwmVarZza.zza(zzxo.RAW);
                    return zzop.zzb((zzwn) zzwmVarZza.zzi());
                } catch (zzaks e) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
                }
            }
        }, zzgz.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzhe.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhc
        }, zzgu.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzhe.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzgu zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzxj zzxjVarZzd = zzxj.zzd(zzooVar.zze(), zzajx.zza());
            if (zzooVar.zzc() != zzxo.RAW) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got ".concat(String.valueOf(zzxjVarZzd)));
            }
            if (zzxjVarZzd.zza() == 0) {
                return zzgu.zza(zzd(zzxjVarZzd.zze()));
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zzxjVarZzd)));
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzgz zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            return zzd(zzxm.zze(zzopVar.zzc().zzf(), zzajx.zza()));
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static void zzc(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zzgz zzd(zzxm zzxmVar) throws GeneralSecurityException {
        zzgx zzgxVar;
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzb(zzxmVar.zza().zzg());
        zzwmVarZza.zzc(zzxmVar.zza().zzf());
        zzwmVarZza.zza(zzxo.RAW);
        zzce zzceVarZza = zzcs.zza(((zzwn) zzwmVarZza.zzi()).zzq());
        if (zzceVarZza instanceof zzey) {
            zzgxVar = zzgx.zza;
        } else if (zzceVarZza instanceof zzga) {
            zzgxVar = zzgx.zzc;
        } else if (zzceVarZza instanceof zzhr) {
            zzgxVar = zzgx.zzb;
        } else if (zzceVarZza instanceof zzdn) {
            zzgxVar = zzgx.zzd;
        } else if (zzceVarZza instanceof zzeh) {
            zzgxVar = zzgx.zze;
        } else {
            if (!(zzceVarZza instanceof zzfp)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzceVarZza.toString()));
            }
            zzgxVar = zzgx.zzf;
        }
        zzgw zzgwVar = new zzgw(null);
        zzgwVar.zzc(zzxmVar.zzf());
        zzgwVar.zza((zzcx) zzceVarZza);
        zzgwVar.zzb(zzgxVar);
        return zzgwVar.zzd();
    }
}

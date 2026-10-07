package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfd {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzez
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) throws GeneralSecurityException {
                zzxo zzxoVar;
                zzey zzeyVar = (zzey) zzceVar;
                int i = zzfd.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
                zzti zztiVarZzc = zztj.zzc();
                zztiVarZzc.zza(zzeyVar.zzb());
                zzwmVarZza.zzc(((zztj) zztiVarZzc.zzi()).zzo());
                zzew zzewVarZzd = zzeyVar.zzd();
                if (zzew.zza.equals(zzewVarZzd)) {
                    zzxoVar = zzxo.TINK;
                } else if (zzew.zzb.equals(zzewVarZzd)) {
                    zzxoVar = zzxo.CRUNCHY;
                } else {
                    if (!zzew.zzc.equals(zzewVarZzd)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzewVarZzd)));
                    }
                    zzxoVar = zzxo.RAW;
                }
                zzwmVarZza.zza(zzxoVar);
                return zzop.zzb((zzwn) zzwmVarZza.zzi());
            }
        }, zzey.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfa
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzfd.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfb
        }, zzeq.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzfd.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzeq zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zztg zztgVarZzd = zztg.zzd(zzooVar.zze(), zzajx.zza());
            if (zztgVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzev zzevVar = new zzev(null);
            zzevVar.zzb(zztgVarZzd.zze().zzd());
            zzevVar.zza(12);
            zzevVar.zzc(16);
            zzevVar.zzd(zzd(zzooVar.zzc()));
            zzey zzeyVarZze = zzevVar.zze();
            zzeo zzeoVar = new zzeo(null);
            zzeoVar.zzc(zzeyVarZze);
            zzeoVar.zzb(zzzq.zzb(zztgVarZzd.zze().zzq(), zzcrVar));
            zzeoVar.zza(zzooVar.zzf());
            return zzeoVar.zzd();
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzey zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            zztj zztjVarZze = zztj.zze(zzopVar.zzc().zzf(), zzajx.zza());
            if (zztjVarZze.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzev zzevVar = new zzev(null);
            zzevVar.zzb(zztjVarZze.zza());
            zzevVar.zza(12);
            zzevVar.zzc(16);
            zzevVar.zzd(zzd(zzopVar.zzc().zze()));
            return zzevVar.zze();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static void zzc(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zzew zzd(zzxo zzxoVar) throws GeneralSecurityException {
        zzxo zzxoVar2 = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVar.ordinal();
        if (iOrdinal == 1) {
            return zzew.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzew.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzxoVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzew.zzb;
    }
}

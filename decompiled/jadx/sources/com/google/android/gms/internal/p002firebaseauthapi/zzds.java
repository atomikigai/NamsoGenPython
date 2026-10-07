package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzds {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdo
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) throws GeneralSecurityException {
                zzvc zzvcVar;
                zzxo zzxoVar;
                zzdn zzdnVar = (zzdn) zzceVar;
                int i = zzds.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zzsk zzskVarZza = zzsl.zza();
                zzsq zzsqVarZzb = zzsr.zzb();
                zzst zzstVarZzb = zzsu.zzb();
                zzstVarZzb.zza(zzdnVar.zzd());
                zzsqVarZzb.zzb((zzsu) zzstVarZzb.zzi());
                zzsqVarZzb.zza(zzdnVar.zzb());
                zzskVarZza.zza((zzsr) zzsqVarZzb.zzi());
                zzvh zzvhVarZzc = zzvi.zzc();
                zzvk zzvkVarZzc = zzvl.zzc();
                zzvkVarZzc.zzb(zzdnVar.zze());
                zzdk zzdkVarZzg = zzdnVar.zzg();
                if (zzdk.zza.equals(zzdkVarZzg)) {
                    zzvcVar = zzvc.SHA1;
                } else if (zzdk.zzb.equals(zzdkVarZzg)) {
                    zzvcVar = zzvc.SHA224;
                } else if (zzdk.zzc.equals(zzdkVarZzg)) {
                    zzvcVar = zzvc.SHA256;
                } else if (zzdk.zzd.equals(zzdkVarZzg)) {
                    zzvcVar = zzvc.SHA384;
                } else {
                    if (!zzdk.zze.equals(zzdkVarZzg)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzdkVarZzg)));
                    }
                    zzvcVar = zzvc.SHA512;
                }
                zzvkVarZzc.zza(zzvcVar);
                zzvhVarZzc.zzb((zzvl) zzvkVarZzc.zzi());
                zzvhVarZzc.zza(zzdnVar.zzc());
                zzskVarZza.zzb((zzvi) zzvhVarZzc.zzi());
                zzwmVarZza.zzc(((zzsl) zzskVarZza.zzi()).zzo());
                zzdl zzdlVarZzh = zzdnVar.zzh();
                if (zzdl.zza.equals(zzdlVarZzh)) {
                    zzxoVar = zzxo.TINK;
                } else if (zzdl.zzb.equals(zzdlVarZzh)) {
                    zzxoVar = zzxo.CRUNCHY;
                } else {
                    if (!zzdl.zzc.equals(zzdlVarZzh)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzdlVarZzh)));
                    }
                    zzxoVar = zzxo.RAW;
                }
                zzwmVarZza.zza(zzxoVar);
                return zzop.zzb((zzwn) zzwmVarZza.zzi());
            }
        }, zzdn.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzds.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdq
        }, zzde.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzds.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzde zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzsi zzsiVarZzd = zzsi.zzd(zzooVar.zze(), zzajx.zza());
            if (zzsiVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzsiVarZzd.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzsiVarZzd.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzdj zzdjVar = new zzdj(null);
            zzdjVar.zza(zzsiVarZzd.zze().zzg().zzd());
            zzdjVar.zzc(zzsiVarZzd.zzf().zzg().zzd());
            zzdjVar.zzd(zzsiVarZzd.zze().zzf().zza());
            zzdjVar.zze(zzsiVarZzd.zzf().zzf().zza());
            zzdjVar.zzb(zzd(zzsiVarZzd.zzf().zzf().zzb()));
            zzdjVar.zzf(zze(zzooVar.zzc()));
            zzdn zzdnVarZzg = zzdjVar.zzg();
            zzdc zzdcVar = new zzdc(null);
            zzdcVar.zzd(zzdnVarZzg);
            zzdcVar.zza(zzzq.zzb(zzsiVarZzd.zze().zzg().zzq(), zzcrVar));
            zzdcVar.zzb(zzzq.zzb(zzsiVarZzd.zzf().zzg().zzq(), zzcrVar));
            zzdcVar.zzc(zzooVar.zzf());
            return zzdcVar.zze();
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzdn zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            zzsl zzslVarZzc = zzsl.zzc(zzopVar.zzc().zzf(), zzajx.zza());
            if (zzslVarZzc.zze().zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzdj zzdjVar = new zzdj(null);
            zzdjVar.zza(zzslVarZzc.zzd().zza());
            zzdjVar.zzc(zzslVarZzc.zze().zza());
            zzdjVar.zzd(zzslVarZzc.zzd().zzf().zza());
            zzdjVar.zze(zzslVarZzc.zze().zzg().zza());
            zzdjVar.zzb(zzd(zzslVarZzc.zze().zzg().zzb()));
            zzdjVar.zzf(zze(zzopVar.zzc().zze()));
            return zzdjVar.zzg();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static void zzc(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zzdk zzd(zzvc zzvcVar) throws GeneralSecurityException {
        zzvc zzvcVar2 = zzvc.UNKNOWN_HASH;
        zzxo zzxoVar = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzvcVar.ordinal();
        if (iOrdinal == 1) {
            return zzdk.zza;
        }
        if (iOrdinal == 2) {
            return zzdk.zzd;
        }
        if (iOrdinal == 3) {
            return zzdk.zzc;
        }
        if (iOrdinal == 4) {
            return zzdk.zze;
        }
        if (iOrdinal == 5) {
            return zzdk.zzb;
        }
        throw new GeneralSecurityException(v.f(zzvcVar.zza(), "Unable to parse HashType: "));
    }

    private static zzdl zze(zzxo zzxoVar) throws GeneralSecurityException {
        zzvc zzvcVar = zzvc.UNKNOWN_HASH;
        zzxo zzxoVar2 = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVar.ordinal();
        if (iOrdinal == 1) {
            return zzdl.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzdl.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzxoVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzdl.zzb;
    }
}

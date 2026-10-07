package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzky {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzzo zzc;
    private static final zzob zzd;
    private static final zznx zze;
    private static final zzne zzf;
    private static final zzna zzg;
    private static final zzne zzh;
    private static final zzna zzi;
    private static final zzmu zzj;
    private static final zzmu zzk;
    private static final zzmu zzl;
    private static final zzmu zzm;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zzb = zzzoVarZzb;
        zzzo zzzoVarZzb2 = zzpd.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzc = zzzoVarZzb2;
        zzd = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzks
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) {
                return zzky.zzd((zzkq) zzceVar);
            }
        }, zzkq.class, zzop.class);
        zze = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzky.zza((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zzf = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzku
        }, zzkz.class, zzoo.class);
        zzg = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzky.zzc((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb2, zzoo.class);
        zzh = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkw
        }, zzkr.class, zzoo.class);
        zzi = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzky.zzb((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
        zzms zzmsVarZza = zzmu.zza();
        zzmsVarZza.zza(zzxo.RAW, zzko.zzc);
        zzmsVarZza.zza(zzxo.TINK, zzko.zza);
        zzxo zzxoVar = zzxo.LEGACY;
        zzko zzkoVar = zzko.zzb;
        zzmsVarZza.zza(zzxoVar, zzkoVar);
        zzmsVarZza.zza(zzxo.CRUNCHY, zzkoVar);
        zzj = zzmsVarZza.zzb();
        zzms zzmsVarZza2 = zzmu.zza();
        zzmsVarZza2.zza(zzvr.DHKEM_P256_HKDF_SHA256, zzkn.zza);
        zzmsVarZza2.zza(zzvr.DHKEM_P384_HKDF_SHA384, zzkn.zzb);
        zzmsVarZza2.zza(zzvr.DHKEM_P521_HKDF_SHA512, zzkn.zzc);
        zzmsVarZza2.zza(zzvr.DHKEM_X25519_HKDF_SHA256, zzkn.zzf);
        zzk = zzmsVarZza2.zzb();
        zzms zzmsVarZza3 = zzmu.zza();
        zzmsVarZza3.zza(zzvp.HKDF_SHA256, zzkm.zza);
        zzmsVarZza3.zza(zzvp.HKDF_SHA384, zzkm.zzb);
        zzmsVarZza3.zza(zzvp.HKDF_SHA512, zzkm.zzc);
        zzl = zzmsVarZza3.zzb();
        zzms zzmsVarZza4 = zzmu.zza();
        zzmsVarZza4.zza(zzvn.AES_128_GCM, zzkh.zza);
        zzmsVarZza4.zza(zzvn.AES_256_GCM, zzkh.zzb);
        zzmsVarZza4.zza(zzvn.CHACHA20_POLY1305, zzkh.zzc);
        zzm = zzmsVarZza4.zzb();
    }

    public static /* synthetic */ zzkq zza(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            return zzf(zzopVar.zzc().zze(), zzvu.zzc(zzopVar.zzc().zzf(), zzajx.zza()).zzd());
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzkr zzb(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzooVar.zzg())));
        }
        try {
            zzwa zzwaVarZzd = zzwa.zzd(zzooVar.zze(), zzajx.zza());
            if (zzwaVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzwd zzwdVarZze = zzwaVarZzd.zze();
            return zzkr.zza(zzkz.zzb(zzf(zzooVar.zzc(), zzwdVarZze.zzb()), zzg(zzwdVarZze.zzb().zzc(), zzwdVarZze.zzg().zzq()), zzooVar.zzf()), zzzq.zzb(zzmn.zzc(zzmn.zza(zzwaVarZzd.zzf().zzq()), zzmb.zza(zzwdVarZze.zzb().zzc())), zzcrVar));
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    public static /* synthetic */ zzkz zzc(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzooVar.zzg())));
        }
        try {
            zzwd zzwdVarZzf = zzwd.zzf(zzooVar.zze(), zzajx.zza());
            if (zzwdVarZzf.zza() == 0) {
                return zzkz.zzb(zzf(zzooVar.zzc(), zzwdVarZzf.zzb()), zzg(zzwdVarZzf.zzb().zzc(), zzwdVarZzf.zzg().zzq()), zzooVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }

    public static /* synthetic */ zzop zzd(zzkq zzkqVar) {
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zzvt zzvtVarZza = zzvu.zza();
        zzvw zzvwVarZzd = zzvx.zzd();
        zzvwVarZzd.zzc((zzvr) zzk.zzb(zzkqVar.zze()));
        zzvwVarZzd.zzb((zzvp) zzl.zzb(zzkqVar.zzd()));
        zzvwVarZzd.zza((zzvn) zzm.zzb(zzkqVar.zzb()));
        zzvtVarZza.zza((zzvx) zzvwVarZzd.zzi());
        zzwmVarZza.zzc(((zzvu) zzvtVarZza.zzi()).zzo());
        zzwmVarZza.zza((zzxo) zzj.zzb(zzkqVar.zzf()));
        return zzop.zzb((zzwn) zzwmVarZza.zzi());
    }

    public static void zze(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzd);
        zzntVar.zzg(zze);
        zzntVar.zzf(zzf);
        zzntVar.zze(zzg);
        zzntVar.zzf(zzh);
        zzntVar.zze(zzi);
    }

    private static zzkq zzf(zzxo zzxoVar, zzvx zzvxVar) throws GeneralSecurityException {
        zzkl zzklVar = new zzkl(null);
        zzklVar.zzd((zzko) zzj.zzc(zzxoVar));
        zzklVar.zzc((zzkn) zzk.zzc(zzvxVar.zzc()));
        zzklVar.zzb((zzkm) zzl.zzc(zzvxVar.zzb()));
        zzklVar.zza((zzkh) zzm.zzc(zzvxVar.zza()));
        return zzklVar.zze();
    }

    private static zzzo zzg(zzvr zzvrVar, byte[] bArr) throws GeneralSecurityException {
        int i;
        BigInteger bigIntegerZza = zzmn.zza(bArr);
        byte[] bArr2 = zzmb.zza;
        zzvr zzvrVar2 = zzvr.KEM_UNKNOWN;
        int iOrdinal = zzvrVar.ordinal();
        if (iOrdinal == 1) {
            i = 32;
        } else if (iOrdinal == 2) {
            i = 65;
        } else if (iOrdinal == 3) {
            i = 97;
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i = 133;
        }
        return zzzo.zzb(zzmn.zzc(bigIntegerZza, i));
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzkf {
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
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zzb = zzzoVarZzb;
        zzzo zzzoVarZzb2 = zzpd.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzc = zzzoVarZzb2;
        zzd = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) {
                return zzkf.zzd((zzjx) zzceVar);
            }
        }, zzjx.class, zzop.class);
        zze = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzka
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzkf.zza((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zzf = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkb
        }, zzkg.class, zzoo.class);
        zzg = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzkf.zzc((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb2, zzoo.class);
        zzh = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkd
        }, zzjy.class, zzoo.class);
        zzi = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzke
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzkf.zzb((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
        zzms zzmsVarZza = zzmu.zza();
        zzmsVarZza.zza(zzxo.RAW, zzjv.zzc);
        zzmsVarZza.zza(zzxo.TINK, zzjv.zza);
        zzxo zzxoVar = zzxo.LEGACY;
        zzjv zzjvVar = zzjv.zzb;
        zzmsVarZza.zza(zzxoVar, zzjvVar);
        zzmsVarZza.zza(zzxo.CRUNCHY, zzjvVar);
        zzj = zzmsVarZza.zzb();
        zzms zzmsVarZza2 = zzmu.zza();
        zzmsVarZza2.zza(zzvc.SHA1, zzjt.zza);
        zzmsVarZza2.zza(zzvc.SHA224, zzjt.zzb);
        zzmsVarZza2.zza(zzvc.SHA256, zzjt.zzc);
        zzmsVarZza2.zza(zzvc.SHA384, zzjt.zzd);
        zzmsVarZza2.zza(zzvc.SHA512, zzjt.zze);
        zzk = zzmsVarZza2.zzb();
        zzms zzmsVarZza3 = zzmu.zza();
        zzmsVarZza3.zza(zzux.NIST_P256, zzjs.zza);
        zzmsVarZza3.zza(zzux.NIST_P384, zzjs.zzb);
        zzmsVarZza3.zza(zzux.NIST_P521, zzjs.zzc);
        zzmsVarZza3.zza(zzux.CURVE25519, zzjs.zzd);
        zzl = zzmsVarZza3.zzb();
        zzms zzmsVarZza4 = zzmu.zza();
        zzmsVarZza4.zza(zzud.UNCOMPRESSED, zzju.zzb);
        zzmsVarZza4.zza(zzud.COMPRESSED, zzju.zza);
        zzmsVarZza4.zza(zzud.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzju.zzc);
        zzm = zzmsVarZza4.zzb();
    }

    public static /* synthetic */ zzjx zza(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            return zzf(zzopVar.zzc().zze(), zzuj.zzc(zzopVar.zzc().zzf(), zzajx.zza()).zzd());
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzjy zzb(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzooVar.zzg())));
        }
        try {
            zzup zzupVarZzd = zzup.zzd(zzooVar.zze(), zzajx.zza());
            if (zzupVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzus zzusVarZze = zzupVarZzd.zze();
            zzjx zzjxVarZzf = zzf(zzooVar.zzc(), zzusVarZze.zzb());
            return zzjxVarZzf.zzc().equals(zzjs.zzd) ? zzjy.zza(zzkg.zzb(zzjxVarZzf, zzzo.zzb(zzusVarZze.zzg().zzq()), zzooVar.zzf()), zzzq.zzb(zzupVarZzd.zzf().zzq(), zzcrVar)) : zzjy.zzb(zzkg.zzc(zzjxVarZzf, new ECPoint(zzmn.zza(zzusVarZze.zzg().zzq()), zzmn.zza(zzusVarZze.zzh().zzq())), zzooVar.zzf()), zzzp.zza(zzmn.zza(zzupVarZzd.zzf().zzq()), zzcrVar));
        } catch (zzaks | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    public static /* synthetic */ zzkg zzc(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzooVar.zzg())));
        }
        try {
            zzus zzusVarZzf = zzus.zzf(zzooVar.zze(), zzajx.zza());
            if (zzusVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjx zzjxVarZzf = zzf(zzooVar.zzc(), zzusVarZzf.zzb());
            if (!zzjxVarZzf.zzc().equals(zzjs.zzd)) {
                return zzkg.zzc(zzjxVarZzf, new ECPoint(zzmn.zza(zzusVarZzf.zzg().zzq()), zzmn.zza(zzusVarZzf.zzh().zzq())), zzooVar.zzf());
            }
            if (zzusVarZzf.zzh().zzp()) {
                return zzkg.zzb(zzjxVarZzf, zzzo.zzb(zzusVarZzf.zzg().zzq()), zzooVar.zzf());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzaks | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static /* synthetic */ zzop zzd(zzjx zzjxVar) throws GeneralSecurityException {
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zzui zzuiVarZza = zzuj.zza();
        zzuu zzuuVarZza = zzuv.zza();
        zzuuVarZza.zza((zzux) zzl.zzb(zzjxVar.zzc()));
        zzuuVarZza.zzb((zzvc) zzk.zzb(zzjxVar.zzd()));
        if (zzjxVar.zzg() != null && zzjxVar.zzg().zza() > 0) {
            byte[] bArrZzc = zzjxVar.zzg().zzc();
            zzuuVarZza.zzc(zzajf.zzn(bArrZzc, 0, bArrZzc.length));
        }
        zzuv zzuvVar = (zzuv) zzuuVarZza.zzi();
        try {
            zzwn zzwnVarZzd = zzwn.zzd(zzcs.zzb(zzjxVar.zzb()), zzajx.zza());
            zzuf zzufVarZza = zzug.zza();
            zzwm zzwmVarZza2 = zzwn.zza();
            zzwmVarZza2.zzb(zzwnVarZzd.zzg());
            zzwmVarZza2.zza(zzxo.TINK);
            zzwmVarZza2.zzc(zzwnVarZzd.zzf());
            zzufVarZza.zza((zzwn) zzwmVarZza2.zzi());
            zzug zzugVar = (zzug) zzufVarZza.zzi();
            zzju zzjuVarZze = zzjxVar.zze();
            if (zzjuVarZze == null) {
                zzjuVarZze = zzju.zza;
            }
            zzul zzulVarZzc = zzum.zzc();
            zzulVarZzc.zzc(zzuvVar);
            zzulVarZzc.zza(zzugVar);
            zzulVarZzc.zzb((zzud) zzm.zzb(zzjuVarZze));
            zzuiVarZza.zza((zzum) zzulVarZzc.zzi());
            zzwmVarZza.zzc(((zzuj) zzuiVarZza.zzi()).zzo());
            zzwmVarZza.zza((zzxo) zzj.zzb(zzjxVar.zzf()));
            return zzop.zzb((zzwn) zzwmVarZza.zzi());
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    public static void zze(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzd);
        zzntVar.zzg(zze);
        zzntVar.zzf(zzf);
        zzntVar.zze(zzg);
        zzntVar.zzf(zzh);
        zzntVar.zze(zzi);
    }

    private static zzjx zzf(zzxo zzxoVar, zzum zzumVar) throws GeneralSecurityException {
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzb(zzumVar.zzb().zzd().zzg());
        zzwmVarZza.zza(zzxo.RAW);
        zzwmVarZza.zzc(zzumVar.zzb().zzd().zzf());
        zzwn zzwnVar = (zzwn) zzwmVarZza.zzi();
        zzjr zzjrVar = new zzjr(null);
        zzjrVar.zzf((zzjv) zzj.zzc(zzxoVar));
        zzjrVar.zza((zzjs) zzl.zzc(zzumVar.zzf().zzd()));
        zzjrVar.zzc((zzjt) zzk.zzc(zzumVar.zzf().zze()));
        zzjrVar.zzb(zzcs.zza(zzwnVar.zzq()));
        zzjrVar.zze(zzzo.zzb(zzumVar.zzf().zzf().zzq()));
        if (!zzumVar.zzf().zzd().equals(zzux.CURVE25519)) {
            zzjrVar.zzd((zzju) zzm.zzc(zzumVar.zza()));
        } else if (!zzumVar.zza().equals(zzud.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zzjrVar.zzg();
    }
}

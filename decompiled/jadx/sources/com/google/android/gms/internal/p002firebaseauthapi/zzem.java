package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzem {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzei
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) throws GeneralSecurityException {
                zzxo zzxoVar;
                zzeh zzehVar = (zzeh) zzceVar;
                int i = zzem.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
                zzsz zzszVarZzb = zzta.zzb();
                zztc zztcVarZzb = zztd.zzb();
                zztcVarZzb.zza(zzehVar.zzb());
                zzszVarZzb.zzb((zztd) zztcVarZzb.zzi());
                zzszVarZzb.zza(zzehVar.zzc());
                zzwmVarZza.zzc(((zzta) zzszVarZzb.zzi()).zzo());
                zzef zzefVarZzd = zzehVar.zzd();
                if (zzef.zza.equals(zzefVarZzd)) {
                    zzxoVar = zzxo.TINK;
                } else if (zzef.zzb.equals(zzefVarZzd)) {
                    zzxoVar = zzxo.CRUNCHY;
                } else {
                    if (!zzef.zzc.equals(zzefVarZzd)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzefVarZzd)));
                    }
                    zzxoVar = zzxo.RAW;
                }
                zzwmVarZza.zza(zzxoVar);
                return zzop.zzb((zzwn) zzwmVarZza.zzi());
            }
        }, zzeh.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzej
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzem.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzek
        }, zzdz.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzel
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzem.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzdz zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzsx zzsxVarZzd = zzsx.zzd(zzooVar.zze(), zzajx.zza());
            if (zzsxVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzee zzeeVar = new zzee(null);
            zzeeVar.zzb(zzsxVarZzd.zzf().zzd());
            zzeeVar.zza(zzsxVarZzd.zze().zza());
            zzeeVar.zzc(16);
            zzeeVar.zzd(zzd(zzooVar.zzc()));
            zzeh zzehVarZze = zzeeVar.zze();
            zzdx zzdxVar = new zzdx(null);
            zzdxVar.zzc(zzehVarZze);
            zzdxVar.zzb(zzzq.zzb(zzsxVarZzd.zzf().zzq(), zzcrVar));
            zzdxVar.zza(zzooVar.zzf());
            return zzdxVar.zzd();
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzeh zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            zzta zztaVarZzd = zzta.zzd(zzopVar.zzc().zzf(), zzajx.zza());
            zzee zzeeVar = new zzee(null);
            zzeeVar.zzb(zztaVarZzd.zza());
            zzeeVar.zza(zztaVarZzd.zze().zza());
            zzeeVar.zzc(16);
            zzeeVar.zzd(zzd(zzopVar.zzc().zze()));
            return zzeeVar.zze();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static void zzc(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zzef zzd(zzxo zzxoVar) throws GeneralSecurityException {
        zzxo zzxoVar2 = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVar.ordinal();
        if (iOrdinal == 1) {
            return zzef.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzef.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzxoVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzef.zzb;
    }
}

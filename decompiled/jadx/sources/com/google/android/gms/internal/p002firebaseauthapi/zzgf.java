package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgf {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) throws GeneralSecurityException {
                zzxo zzxoVar;
                int i = zzgf.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                zzwmVarZza.zzc(zzub.zzb().zzo());
                zzfz zzfzVarZzb = ((zzga) zzceVar).zzb();
                if (zzfz.zza.equals(zzfzVarZzb)) {
                    zzxoVar = zzxo.TINK;
                } else if (zzfz.zzb.equals(zzfzVarZzb)) {
                    zzxoVar = zzxo.CRUNCHY;
                } else {
                    if (!zzfz.zzc.equals(zzfzVarZzb)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzfzVarZzb.toString()));
                    }
                    zzxoVar = zzxo.RAW;
                }
                zzwmVarZza.zza(zzxoVar);
                return zzop.zzb((zzwn) zzwmVarZza.zzi());
            }
        }, zzga.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzgf.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgd
        }, zzfv.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzge
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzgf.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzfv zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzty zztyVarZzd = zzty.zzd(zzooVar.zze(), zzajx.zza());
            if (zztyVarZzd.zza() == 0) {
                return zzfv.zza(zzd(zzooVar.zzc()), zzzq.zzb(zztyVarZzd.zze().zzq(), zzcrVar), zzooVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzga zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            zzub.zzc(zzopVar.zzc().zzf(), zzajx.zza());
            return zzga.zzc(zzd(zzopVar.zzc().zze()));
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static void zzc(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zzfz zzd(zzxo zzxoVar) throws GeneralSecurityException {
        zzxo zzxoVar2 = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVar.ordinal();
        if (iOrdinal == 1) {
            return zzfz.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzfz.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzxoVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzfz.zzb;
    }
}

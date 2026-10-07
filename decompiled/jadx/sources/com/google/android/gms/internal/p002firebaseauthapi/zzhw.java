package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhw {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) throws GeneralSecurityException {
                zzxo zzxoVar;
                int i = zzhw.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                zzwmVarZza.zzc(zzxx.zzc().zzo());
                zzhq zzhqVarZzb = ((zzhr) zzceVar).zzb();
                if (zzhq.zza.equals(zzhqVarZzb)) {
                    zzxoVar = zzxo.TINK;
                } else if (zzhq.zzb.equals(zzhqVarZzb)) {
                    zzxoVar = zzxo.CRUNCHY;
                } else {
                    if (!zzhq.zzc.equals(zzhqVarZzb)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhqVarZzb.toString()));
                    }
                    zzxoVar = zzxo.RAW;
                }
                zzwmVarZza.zza(zzxoVar);
                return zzop.zzb((zzwn) zzwmVarZza.zzi());
            }
        }, zzhr.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzht
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzhw.zzb((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhu
        }, zzhm.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzhw.zza((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzhm zza(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzxu zzxuVarZzd = zzxu.zzd(zzooVar.zze(), zzajx.zza());
            if (zzxuVarZzd.zza() == 0) {
                return zzhm.zza(zzd(zzooVar.zzc()), zzzq.zzb(zzxuVarZzd.zze().zzq(), zzcrVar), zzooVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaks unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzhr zzb(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            if (zzxx.zzd(zzopVar.zzc().zzf(), zzajx.zza()).zza() == 0) {
                return zzhr.zzd(zzd(zzopVar.zzc().zze()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static void zzc(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }

    private static zzhq zzd(zzxo zzxoVar) throws GeneralSecurityException {
        zzxo zzxoVar2 = zzxo.UNKNOWN_PREFIX;
        int iOrdinal = zzxoVar.ordinal();
        if (iOrdinal == 1) {
            return zzhq.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhq.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(v.f(zzxoVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzhq.zzb;
    }
}

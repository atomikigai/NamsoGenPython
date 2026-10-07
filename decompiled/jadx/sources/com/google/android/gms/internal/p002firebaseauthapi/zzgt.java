package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgt {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzob zzc;
    private static final zznx zzd;
    private static final zzne zze;
    private static final zzna zzf;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzzoVarZzb;
        zzc = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) {
                int i = zzgt.zza;
                zzwm zzwmVarZza = zzwn.zza();
                zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                zzxf zzxfVarZza = zzxg.zza();
                zzxfVarZza.zza(((zzgo) zzceVar).zzc());
                zzwmVarZza.zzc(((zzxg) zzxfVarZza.zzi()).zzo());
                zzwmVarZza.zza(zzxo.RAW);
                return zzop.zzb((zzwn) zzwmVarZza.zzi());
            }
        }, zzgo.class, zzop.class);
        zzd = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) throws GeneralSecurityException {
                int i = zzgt.zza;
                zzop zzopVar = (zzop) zzotVar;
                if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
                }
                try {
                    zzxg zzxgVarZzd = zzxg.zzd(((zzop) zzotVar).zzc().zzf(), zzajx.zza());
                    if (zzopVar.zzc().zze() == zzxo.RAW) {
                        return zzgo.zzb(zzxgVarZzd.zze());
                    }
                    throw new GeneralSecurityException(v.j("Only key templates with RAW are accepted, but got ", String.valueOf(zzopVar.zzc().zze()), " with format ", String.valueOf(zzxgVarZzd)));
                } catch (zzaks e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            }
        }, zzzoVarZzb, zzop.class);
        zze = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgr
        }, zzgn.class, zzoo.class);
        zzf = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) throws GeneralSecurityException {
                int i = zzgt.zza;
                zzoo zzooVar = (zzoo) zzotVar;
                if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                if (zzooVar.zzc() != zzxo.RAW) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got ".concat(String.valueOf(zzooVar.zzc())));
                }
                try {
                    zzxd zzxdVarZzd = zzxd.zzd(((zzoo) zzotVar).zze(), zzajx.zza());
                    if (zzxdVarZzd.zza() == 0) {
                        return zzgn.zza(zzgo.zzb(zzxdVarZzd.zze().zze()));
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzxdVarZzd)));
                } catch (zzaks e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static void zza(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zzc);
        zzntVar.zzg(zzd);
        zzntVar.zzf(zze);
        zzntVar.zze(zzf);
    }
}

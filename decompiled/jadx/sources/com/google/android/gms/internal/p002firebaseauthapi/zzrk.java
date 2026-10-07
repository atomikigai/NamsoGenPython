package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrk {
    public static final /* synthetic */ int zza = 0;
    private static final zzzo zzb;
    private static final zzmu zzc;
    private static final zzmu zzd;
    private static final zzob zze;
    private static final zznx zzf;
    private static final zzne zzg;
    private static final zzna zzh;

    static {
        zzzo zzzoVarZzb = zzpd.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzzoVarZzb;
        zzms zzmsVarZza = zzmu.zza();
        zzmsVarZza.zza(zzxo.RAW, zzqn.zzd);
        zzmsVarZza.zza(zzxo.TINK, zzqn.zza);
        zzmsVarZza.zza(zzxo.LEGACY, zzqn.zzc);
        zzmsVarZza.zza(zzxo.CRUNCHY, zzqn.zzb);
        zzc = zzmsVarZza.zzb();
        zzms zzmsVarZza2 = zzmu.zza();
        zzmsVarZza2.zza(zzvc.SHA1, zzqm.zza);
        zzmsVarZza2.zza(zzvc.SHA224, zzqm.zzb);
        zzmsVarZza2.zza(zzvc.SHA256, zzqm.zzc);
        zzmsVarZza2.zza(zzvc.SHA384, zzqm.zzd);
        zzmsVarZza2.zza(zzvc.SHA512, zzqm.zze);
        zzd = zzmsVarZza2.zzb();
        zze = zzob.zzb(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzot zza(zzce zzceVar) {
                return zzrk.zza((zzqp) zzceVar);
            }
        }, zzqp.class, zzop.class);
        zzf = zznx.zzb(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzce zza(zzot zzotVar) {
                return zzrk.zzc((zzop) zzotVar);
            }
        }, zzzoVarZzb, zzop.class);
        zzg = zzne.zza(new zznc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzri
        }, zzqe.class, zzoo.class);
        zzh = zzna.zzb(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzbn zza(zzot zzotVar, zzcr zzcrVar) {
                return zzrk.zzb((zzoo) zzotVar, zzcrVar);
            }
        }, zzzoVarZzb, zzoo.class);
    }

    public static /* synthetic */ zzop zza(zzqp zzqpVar) {
        zzwm zzwmVarZza = zzwn.zza();
        zzwmVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzvh zzvhVarZzc = zzvi.zzc();
        zzvk zzvkVarZzc = zzvl.zzc();
        zzvkVarZzc.zzb(zzqpVar.zzb());
        zzvkVarZzc.zza((zzvc) zzd.zzb(zzqpVar.zzf()));
        zzvhVarZzc.zzb((zzvl) zzvkVarZzc.zzi());
        zzvhVarZzc.zza(zzqpVar.zzc());
        zzwmVarZza.zzc(((zzvi) zzvhVarZzc.zzi()).zzo());
        zzwmVarZza.zza((zzxo) zzc.zzb(zzqpVar.zzg()));
        return zzop.zzb((zzwn) zzwmVarZza.zzi());
    }

    public static /* synthetic */ zzqe zzb(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!zzooVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzvf zzvfVarZze = zzvf.zze(zzooVar.zze(), zzajx.zza());
            if (zzvfVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzql zzqlVarZze = zzqp.zze();
            zzqlVarZze.zzb(zzvfVarZze.zzg().zzd());
            zzqlVarZze.zzc(zzvfVarZze.zzf().zza());
            zzqlVarZze.zza((zzqm) zzd.zzc(zzvfVarZze.zzf().zzb()));
            zzqlVarZze.zzd((zzqn) zzc.zzc(zzooVar.zzc()));
            zzqp zzqpVarZze = zzqlVarZze.zze();
            zzqc zzqcVarZza = zzqe.zza();
            zzqcVarZza.zzc(zzqpVarZze);
            zzqcVarZza.zzb(zzzq.zzb(zzvfVarZze.zzg().zzq(), zzcrVar));
            zzqcVarZza.zza(zzooVar.zzf());
            return zzqcVarZza.zzd();
        } catch (zzaks | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzqp zzc(zzop zzopVar) throws GeneralSecurityException {
        if (!zzopVar.zzc().zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzopVar.zzc().zzg())));
        }
        try {
            zzvi zzviVarZzf = zzvi.zzf(zzopVar.zzc().zzf(), zzajx.zza());
            if (zzviVarZzf.zzb() != 0) {
                throw new GeneralSecurityException(v.f(zzviVarZzf.zzb(), "Parsing HmacParameters failed: unknown Version "));
            }
            zzql zzqlVarZze = zzqp.zze();
            zzqlVarZze.zzb(zzviVarZzf.zza());
            zzqlVarZze.zzc(zzviVarZzf.zzg().zza());
            zzqlVarZze.zza((zzqm) zzd.zzc(zzviVarZzf.zzg().zzb()));
            zzqlVarZze.zzd((zzqn) zzc.zzc(zzopVar.zzc().zze()));
            return zzqlVarZze.zze();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zzd(zznt zzntVar) throws GeneralSecurityException {
        zzntVar.zzh(zze);
        zzntVar.zzg(zzf);
        zzntVar.zzf(zzg);
        zzntVar.zze(zzh);
    }
}

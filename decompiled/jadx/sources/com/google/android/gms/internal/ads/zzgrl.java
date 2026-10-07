package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgrl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgmm zzc;
    private static final zzgmm zzd;
    private static final zzgoi zze;
    private static final zzgoe zzf;
    private static final zzgmw zzg;
    private static final zzgms zzh;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgwuVarZzb;
        zzgmk zzgmkVarZza = zzgmm.zza();
        zzgmkVarZza.zza(zzgve.RAW, zzgqj.zzd);
        zzgmkVarZza.zza(zzgve.TINK, zzgqj.zza);
        zzgmkVarZza.zza(zzgve.LEGACY, zzgqj.zzc);
        zzgmkVarZza.zza(zzgve.CRUNCHY, zzgqj.zzb);
        zzc = zzgmkVarZza.zzb();
        zzgmk zzgmkVarZza2 = zzgmm.zza();
        zzgmkVarZza2.zza(zzgtn.SHA1, zzgqi.zza);
        zzgmkVarZza2.zza(zzgtn.SHA224, zzgqi.zzb);
        zzgmkVarZza2.zza(zzgtn.SHA256, zzgqi.zzc);
        zzgmkVarZza2.zza(zzgtn.SHA384, zzgqi.zzd);
        zzgmkVarZza2.zza(zzgtn.SHA512, zzgqi.zze);
        zzd = zzgmkVarZza2.zzb();
        zze = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgrh
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgrl.zzb((zzgql) zzggjVar);
            }
        }, zzgql.class, zzgox.class);
        zzf = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgri
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgrl.zzd((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zzg = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgrj
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgrl.zza((zzgqb) zzgfwVar, zzggnVar);
            }
        }, zzgqb.class, zzgow.class);
        zzh = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgrk
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgrl.zzc((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzgow zza(zzgqb zzgqbVar, zzggn zzggnVar) {
        zzgto zzgtoVarZzb = zzgtq.zzb();
        zzgtoVarZzb.zzb(zzf(zzgqbVar.zzb()));
        byte[] bArrZzd = zzgqbVar.zzd().zzd(zzggnVar);
        zzgtoVarZzb.zza(zzgxp.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgtq) zzgtoVarZzb.zzbr()).zzaN(), zzgty.SYMMETRIC, (zzgve) zzc.zzb(zzgqbVar.zzb().zzg()), zzgqbVar.zze());
    }

    public static /* synthetic */ zzgox zzb(zzgql zzgqlVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgtr zzgtrVarZzc = zzgtt.zzc();
        zzgtrVarZzc.zzb(zzf(zzgqlVar));
        zzgtrVarZzc.zza(zzgqlVar.zzc());
        zzgucVarZza.zzc(((zzgtt) zzgtrVarZzc.zzbr()).zzaN());
        zzgucVarZza.zza((zzgve) zzc.zzb(zzgqlVar.zzg()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static /* synthetic */ zzgqb zzc(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgtq zzgtqVarZzf = zzgtq.zzf(zzgowVar.zze(), zzgyh.zza());
            if (zzgtqVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgqh zzgqhVarZze = zzgql.zze();
            zzgqhVarZze.zzb(zzgtqVarZzf.zzh().zzd());
            zzgqhVarZze.zzc(zzgtqVarZzf.zzg().zza());
            zzgqhVarZze.zza((zzgqi) zzd.zzc(zzgtqVarZzf.zzg().zzb()));
            zzgqhVarZze.zzd((zzgqj) zzc.zzc(zzgowVar.zzc()));
            zzgql zzgqlVarZze = zzgqhVarZze.zze();
            zzgpz zzgpzVarZza = zzgqb.zza();
            zzgpzVarZza.zzc(zzgqlVarZze);
            zzgpzVarZza.zzb(zzgwv.zzb(zzgtqVarZzf.zzh().zzA(), zzggnVar));
            zzgpzVarZza.zza(zzgowVar.zzf());
            return zzgpzVarZza.zzd();
        } catch (zzgzm | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgql zzd(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            zzgtt zzgttVarZzg = zzgtt.zzg(zzgoxVar.zzc().zzh(), zzgyh.zza());
            if (zzgttVarZzg.zzb() != 0) {
                throw new GeneralSecurityException(v.f(zzgttVarZzg.zzb(), "Parsing HmacParameters failed: unknown Version "));
            }
            zzgqh zzgqhVarZze = zzgql.zze();
            zzgqhVarZze.zzb(zzgttVarZzg.zza());
            zzgqhVarZze.zzc(zzgttVarZzg.zzh().zza());
            zzgqhVarZze.zza((zzgqi) zzd.zzc(zzgttVarZzg.zzh().zzb()));
            zzgqhVarZze.zzd((zzgqj) zzc.zzc(zzgoxVar.zzc().zzg()));
            return zzgqhVarZze.zze();
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zze);
        zzgnzVar.zzh(zzf);
        zzgnzVar.zzg(zzg);
        zzgnzVar.zzf(zzh);
    }

    private static zzgtw zzf(zzgql zzgqlVar) throws GeneralSecurityException {
        zzgtu zzgtuVarZzc = zzgtw.zzc();
        zzgtuVarZzc.zzb(zzgqlVar.zzb());
        zzgtuVarZzc.zza((zzgtn) zzd.zzb(zzgqlVar.zzf()));
        return (zzgtw) zzgtuVarZzc.zzbr();
    }
}

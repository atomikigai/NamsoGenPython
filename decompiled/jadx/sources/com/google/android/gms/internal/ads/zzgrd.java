package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgrd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgwu zzb;
    private static final zzgoi zzc;
    private static final zzgoe zzd;
    private static final zzgmw zze;
    private static final zzgms zzf;

    static {
        zzgwu zzgwuVarZzb = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgwuVarZzb;
        zzc = zzgoi.zzb(new zzgog() { // from class: com.google.android.gms.internal.ads.zzgqz
            @Override // com.google.android.gms.internal.ads.zzgog
            public final zzgpb zza(zzggj zzggjVar) {
                return zzgrd.zzb((zzgpu) zzggjVar);
            }
        }, zzgpu.class, zzgox.class);
        zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgra
            @Override // com.google.android.gms.internal.ads.zzgoc
            public final zzggj zza(zzgpb zzgpbVar) {
                return zzgrd.zzd((zzgox) zzgpbVar);
            }
        }, zzgwuVarZzb, zzgox.class);
        zze = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgrb
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                return zzgrd.zza((zzgpm) zzgfwVar, zzggnVar);
            }
        }, zzgpm.class, zzgow.class);
        zzf = zzgms.zzb(new zzgmq() { // from class: com.google.android.gms.internal.ads.zzgrc
            @Override // com.google.android.gms.internal.ads.zzgmq
            public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) {
                return zzgrd.zzc((zzgow) zzgpbVar, zzggnVar);
            }
        }, zzgwuVarZzb, zzgow.class);
    }

    public static /* synthetic */ zzgow zza(zzgpm zzgpmVar, zzggn zzggnVar) {
        zzgro zzgroVarZzb = zzgrq.zzb();
        zzgroVarZzb.zzb(zzg(zzgpmVar.zzb()));
        byte[] bArrZzd = zzgpmVar.zzd().zzd(zzggnVar);
        zzgroVarZzb.zza(zzgxp.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgow.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgrq) zzgroVarZzb.zzbr()).zzaN(), zzgty.SYMMETRIC, zzh(zzgpmVar.zzb().zzf()), zzgpmVar.zze());
    }

    public static /* synthetic */ zzgox zzb(zzgpu zzgpuVar) {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgrr zzgrrVarZzb = zzgrt.zzb();
        zzgrrVarZzb.zzb(zzg(zzgpuVar));
        zzgrrVarZzb.zza(zzgpuVar.zzc());
        zzgucVarZza.zzc(((zzgrt) zzgrrVarZzb.zzbr()).zzaN());
        zzgucVarZza.zza(zzh(zzgpuVar.zzf()));
        return zzgox.zzb((zzgue) zzgucVarZza.zzbr());
    }

    public static /* synthetic */ zzgpm zzc(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgowVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgrq zzgrqVarZzd = zzgrq.zzd(zzgowVar.zze(), zzgyh.zza());
            if (zzgrqVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgpr zzgprVarZze = zzgpu.zze();
            zzgprVarZze.zza(zzgrqVarZzd.zzg().zzd());
            zzgprVarZze.zzb(zzgrqVarZzd.zzf().zza());
            zzgprVarZze.zzc(zzf(zzgowVar.zzc()));
            zzgpu zzgpuVarZzd = zzgprVarZze.zzd();
            zzgpk zzgpkVarZza = zzgpm.zza();
            zzgpkVarZza.zzc(zzgpuVarZzd);
            zzgpkVarZza.zza(zzgwv.zzb(zzgrqVarZzd.zzg().zzA(), zzggnVar));
            zzgpkVarZza.zzb(zzgowVar.zzf());
            return zzgpkVarZza.zzd();
        } catch (zzgzm | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgpu zzd(zzgox zzgoxVar) throws GeneralSecurityException {
        if (!zzgoxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoxVar.zzc().zzi())));
        }
        try {
            zzgrt zzgrtVarZzd = zzgrt.zzd(zzgoxVar.zzc().zzh(), zzgyh.zza());
            zzgpr zzgprVarZze = zzgpu.zze();
            zzgprVarZze.zza(zzgrtVarZzd.zza());
            zzgprVarZze.zzb(zzgrtVarZzd.zzf().zza());
            zzgprVarZze.zzc(zzf(zzgoxVar.zzc().zzg()));
            return zzgprVarZze.zzd();
        } catch (zzgzm e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zze(zzgnz zzgnzVar) throws GeneralSecurityException {
        zzgnzVar.zzi(zzc);
        zzgnzVar.zzh(zzd);
        zzgnzVar.zzg(zze);
        zzgnzVar.zzf(zzf);
    }

    private static zzgps zzf(zzgve zzgveVar) throws GeneralSecurityException {
        int iOrdinal = zzgveVar.ordinal();
        if (iOrdinal == 1) {
            return zzgps.zza;
        }
        if (iOrdinal == 2) {
            return zzgps.zzc;
        }
        if (iOrdinal == 3) {
            return zzgps.zzd;
        }
        if (iOrdinal == 4) {
            return zzgps.zzb;
        }
        throw new GeneralSecurityException(v.f(zzgveVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgrw zzg(zzgpu zzgpuVar) {
        zzgru zzgruVarZzb = zzgrw.zzb();
        zzgruVarZzb.zza(zzgpuVar.zzb());
        return (zzgrw) zzgruVarZzb.zzbr();
    }

    private static zzgve zzh(zzgps zzgpsVar) throws GeneralSecurityException {
        if (zzgps.zza.equals(zzgpsVar)) {
            return zzgve.TINK;
        }
        if (zzgps.zzb.equals(zzgpsVar)) {
            return zzgve.CRUNCHY;
        }
        if (zzgps.zzd.equals(zzgpsVar)) {
            return zzgve.RAW;
        }
        if (zzgps.zzc.equals(zzgpsVar)) {
            return zzgve.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgpsVar)));
    }
}

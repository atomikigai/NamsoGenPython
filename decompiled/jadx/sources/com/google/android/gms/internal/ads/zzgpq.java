package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgpq {
    private static final zzgno zza = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgpn
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            return zzgpq.zzb((zzgpu) zzggjVar, num);
        }
    };
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgpo
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgpq.zzc((zzgpm) zzgfwVar);
        }
    }, zzgpm.class, zzgpv.class);
    private static final zzgom zzc = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgpp
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgpq.zza((zzgpm) zzgfwVar);
        }
    }, zzgpm.class, zzggi.class);
    private static final zzgfx zzd = zzgmx.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzggi.class, zzgty.SYMMETRIC, zzgrq.zzh());

    public static /* synthetic */ zzggi zza(zzgpm zzgpmVar) throws GeneralSecurityException {
        zze(zzgpmVar.zzb());
        return zzgwr.zza(zzgpmVar);
    }

    public static /* synthetic */ zzgpm zzb(zzgpu zzgpuVar, Integer num) throws GeneralSecurityException {
        zze(zzgpuVar);
        zzgpk zzgpkVar = new zzgpk(null);
        zzgpkVar.zzc(zzgpuVar);
        zzgpkVar.zza(zzgwv.zzc(zzgpuVar.zzc()));
        zzgpkVar.zzb(num);
        return zzgpkVar.zzd();
    }

    public static /* synthetic */ zzgpv zzc(zzgpm zzgpmVar) throws GeneralSecurityException {
        zze(zzgpmVar.zzb());
        return new zzgrf(zzgpmVar);
    }

    public static void zzd(boolean z4) throws GeneralSecurityException {
        if (!zzgmh.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzgrd.zza;
        zzgrd.zze(zzgnz.zzc());
        zzgnp.zzb().zzc(zza, zzgpu.class);
        zzgnw.zza().zze(zzb);
        zzgnw.zza().zze(zzc);
        zzgnv zzgnvVarZzb = zzgnv.zzb();
        HashMap map = new HashMap();
        zzgpu zzgpuVar = zzgqy.zzc;
        map.put("AES_CMAC", zzgpuVar);
        map.put("AES256_CMAC", zzgpuVar);
        zzgpr zzgprVar = new zzgpr(null);
        zzgprVar.zza(32);
        zzgprVar.zzb(16);
        zzgprVar.zzc(zzgps.zzd);
        map.put("AES256_CMAC_RAW", zzgprVar.zzd());
        zzgnvVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgmo.zzc().zzd(zzd, true);
    }

    private static void zze(zzgpu zzgpuVar) throws GeneralSecurityException {
        if (zzgpuVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}

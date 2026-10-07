package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgia {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzghx
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgvt.zzb((zzghw) zzgfwVar);
        }
    }, zzghw.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgfm.class, zzgty.SYMMETRIC, zzgsx.zzg());
    private static final zzgnq zzd = new zzgnq() { // from class: com.google.android.gms.internal.ads.zzghy
    };
    private static final zzgno zze = new zzgno() { // from class: com.google.android.gms.internal.ads.zzghz
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) throws GeneralSecurityException {
            zzgie zzgieVar = (zzgie) zzggjVar;
            int i = zzgia.zza;
            if (zzgieVar.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzghu zzghuVar = new zzghu(null);
            zzghuVar.zzc(zzgieVar);
            zzghuVar.zza(num);
            zzghuVar.zzb(zzgwv.zzc(zzgieVar.zzb()));
            return zzghuVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z4) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgmh.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzgld.zza;
        zzgld.zze(zzgnz.zzc());
        zzgnw.zza().zze(zzb);
        zzgnv zzgnvVarZzb = zzgnv.zzb();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzgkd.zza);
        zzgib zzgibVar = new zzgib(null);
        zzgibVar.zza(12);
        zzgibVar.zzb(16);
        zzgibVar.zzc(16);
        zzgic zzgicVar = zzgic.zzc;
        zzgibVar.zzd(zzgicVar);
        map.put("AES128_GCM_RAW", zzgibVar.zze());
        map.put("AES256_GCM", zzgkd.zzb);
        zzgib zzgibVar2 = new zzgib(null);
        zzgibVar2.zza(12);
        zzgibVar2.zzb(32);
        zzgibVar2.zzc(16);
        zzgibVar2.zzd(zzgicVar);
        map.put("AES256_GCM_RAW", zzgibVar2.zze());
        zzgnvVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnr.zza().zzb(zzd, zzgie.class);
        zzgnp.zzb().zzc(zze, zzgie.class);
        zzgmo.zzc().zzf(zzc, i, true);
    }
}

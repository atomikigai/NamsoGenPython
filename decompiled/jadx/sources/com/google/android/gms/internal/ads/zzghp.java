package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzghp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzghn
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgvs.zzb((zzghm) zzgfwVar);
        }
    }, zzghm.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgfm.class, zzgty.SYMMETRIC, zzgso.zzh());
    private static final zzgno zzd = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgho
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) throws GeneralSecurityException {
            zzght zzghtVar = (zzght) zzggjVar;
            int i = zzghp.zza;
            if (zzghtVar.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzghk zzghkVar = new zzghk(null);
            zzghkVar.zzc(zzghtVar);
            zzghkVar.zza(num);
            zzghkVar.zzb(zzgwv.zzc(zzghtVar.zzc()));
            return zzghkVar.zzd();
        }
    };

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (!zzgmh.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = zzgkw.zza;
        zzgkw.zze(zzgnz.zzc());
        zzgnw.zza().zze(zzb);
        zzgnv zzgnvVarZzb = zzgnv.zzb();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzgkd.zzc);
        zzghq zzghqVar = new zzghq(null);
        zzghqVar.zza(16);
        zzghqVar.zzb(16);
        zzghqVar.zzc(16);
        zzghr zzghrVar = zzghr.zzc;
        zzghqVar.zzd(zzghrVar);
        map.put("AES128_EAX_RAW", zzghqVar.zze());
        map.put("AES256_EAX", zzgkd.zzd);
        zzghq zzghqVar2 = new zzghq(null);
        zzghqVar2.zza(16);
        zzghqVar2.zzb(32);
        zzghqVar2.zzc(16);
        zzghqVar2.zzd(zzghrVar);
        map.put("AES256_EAX_RAW", zzghqVar2.zze());
        zzgnvVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnp.zzb().zzc(zzd, zzght.class);
        zzgmo.zzc().zzd(zzc, true);
    }
}

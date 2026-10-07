package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgil {
    private static final zzgom zza = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgii
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgmg.zzb((zzgih) zzgfwVar);
        }
    }, zzgih.class, zzgfm.class);
    private static final zzgno zzb = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgij
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            zzgip zzgipVar = (zzgip) zzggjVar;
            zzgif zzgifVar = new zzgif(null);
            zzgifVar.zzc(zzgipVar);
            zzgifVar.zza(num);
            zzgifVar.zzb(zzgwv.zzc(zzgipVar.zzb()));
            return zzgifVar.zzd();
        }
    };
    private static final zzgnq zzc = new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgik
    };
    private static final zzgfx zzd = zzgmx.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgfm.class, zzgty.SYMMETRIC, zzgtd.zzg());

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (!zzgmh.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = zzgli.zza;
        zzgli.zze(zzgnz.zzc());
        if (zzb()) {
            zzgnw.zza().zze(zza);
            zzgnv zzgnvVarZzb = zzgnv.zzb();
            HashMap map = new HashMap();
            zzgim zzgimVar = new zzgim(null);
            zzgimVar.zza(16);
            zzgin zzginVar = zzgin.zza;
            zzgimVar.zzb(zzginVar);
            map.put("AES128_GCM_SIV", zzgimVar.zzc());
            zzgim zzgimVar2 = new zzgim(null);
            zzgimVar2.zza(16);
            zzgin zzginVar2 = zzgin.zzc;
            zzgimVar2.zzb(zzginVar2);
            map.put("AES128_GCM_SIV_RAW", zzgimVar2.zzc());
            zzgim zzgimVar3 = new zzgim(null);
            zzgimVar3.zza(32);
            zzgimVar3.zzb(zzginVar);
            map.put("AES256_GCM_SIV", zzgimVar3.zzc());
            zzgim zzgimVar4 = new zzgim(null);
            zzgimVar4.zza(32);
            zzgimVar4.zzb(zzginVar2);
            map.put("AES256_GCM_SIV_RAW", zzgimVar4.zzc());
            zzgnvVarZzb.zzd(Collections.unmodifiableMap(map));
            zzgnr.zza().zzb(zzc, zzgip.class);
            zzgnp.zzb().zzc(zzb, zzgip.class);
            zzgmo.zzc().zzd(zzd, true);
        }
    }

    private static boolean zzb() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}

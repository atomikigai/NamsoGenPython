package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgit {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgir
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            zzgiq zzgiqVar = (zzgiq) zzgfwVar;
            int i = zzgit.zza;
            return zzglk.zze() ? zzglk.zzb(zzgiqVar) : zzgvv.zzb(zzgiqVar);
        }
    }, zzgiq.class, zzgfm.class);
    private static final zzgno zzc = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgis
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            int i = zzgit.zza;
            return zzgiq.zza(((zzgiv) zzggjVar).zzb(), zzgwv.zzc(32), num);
        }
    };
    private static final zzgfx zzd = zzgmx.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgfm.class, zzgty.SYMMETRIC, zzgtj.zzg());

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (!zzgmh.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzglp.zza;
        zzglp.zze(zzgnz.zzc());
        zzgnw.zza().zze(zzb);
        zzgnp.zzb().zzc(zzc, zzgiv.class);
        zzgnv zzgnvVarZzb = zzgnv.zzb();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzgiv.zzc(zzgiu.zza));
        map.put("CHACHA20_POLY1305_RAW", zzgiv.zzc(zzgiu.zzc));
        zzgnvVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgmo.zzc().zzd(zzd, true);
    }
}

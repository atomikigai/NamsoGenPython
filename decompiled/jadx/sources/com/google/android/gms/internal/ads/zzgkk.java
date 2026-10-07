package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgkk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgkh
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            zzgkg zzgkgVar = (zzgkg) zzgfwVar;
            int i = zzgkk.zza;
            return zzglz.zzc() ? zzglz.zzb(zzgkgVar) : zzgwt.zzb(zzgkgVar);
        }
    }, zzgkg.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgfm.class, zzgty.SYMMETRIC, zzgvk.zzg());
    private static final zzgnq zzd = new zzgnq() { // from class: com.google.android.gms.internal.ads.zzgki
    };
    private static final zzgno zze = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgkj
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            int i = zzgkk.zza;
            return zzgkg.zza(((zzgkm) zzggjVar).zzb(), zzgwv.zzc(32), num);
        }
    };

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (!zzgmh.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgme.zza;
        zzgme.zze(zzgnz.zzc());
        zzgnw.zza().zze(zzb);
        zzgnv zzgnvVarZzb = zzgnv.zzb();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzgkm.zzc(zzgkl.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzgkm.zzc(zzgkl.zzc));
        zzgnvVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnp.zzb().zzc(zze, zzgkm.class);
        zzgnr.zza().zzb(zzd, zzgkm.class);
        zzgmo.zzc().zzd(zzc, true);
    }
}

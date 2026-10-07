package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgiy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgiw
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            zzgjd zzgjdVar = (zzgjd) zzgfwVar;
            int i = zzgiy.zza;
            return zzglx.zzc(zzggh.zza(zzgjdVar.zzb().zzd()).zzb(), zzgjdVar.zzc());
        }
    }, zzgjd.class, zzgfm.class);
    private static final zzgfx zzc = zzgmx.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgfm.class, zzgty.REMOTE, zzguu.zzg());
    private static final zzgno zzd = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgix
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            return zzgjd.zza((zzgjf) zzggjVar, num);
        }
    };

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (!zzgmh.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = zzgjk.zza;
        zzgjk.zze(zzgnz.zzc());
        zzgnw.zza().zze(zzb);
        zzgnp.zzb().zzc(zzd, zzgjf.class);
        zzgmo.zzc().zzd(zzc, true);
    }
}

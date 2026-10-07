package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgjc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgfx zzb = zzgmx.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgfm.class, zzgty.SYMMETRIC, zzgva.zzg());
    private static final zzgno zzc = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgja
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) {
            return zzgjl.zza((zzgjq) zzggjVar, num);
        }
    };
    private static final zzgom zzd = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgjb
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) throws GeneralSecurityException {
            zzgjl zzgjlVar = (zzgjl) zzgfwVar;
            int i = zzgjc.zza;
            String strZzd = zzgjlVar.zzb().zzd();
            zzggt zzggtVarZzb = zzgjlVar.zzb().zzb();
            zzgfm zzgfmVarZzb = zzggh.zza(strZzd).zzb();
            int i10 = zzgiz.zza;
            try {
                return zzglx.zzc(new zzgiz(zzgue.zzf(zzggp.zzb(zzggtVarZzb), zzgyh.zza()), zzgfmVarZzb), zzgjlVar.zzc());
            } catch (zzgzm e) {
                throw new GeneralSecurityException(e);
            }
        }
    }, zzgjl.class, zzgfm.class);

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (!zzgmh.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i = zzgjv.zza;
        zzgjv.zze(zzgnz.zzc());
        zzgnp.zzb().zzc(zzc, zzgjq.class);
        zzgnw.zza().zze(zzd);
        zzgmo.zzc().zzd(zzb, true);
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcu {
    public static final String zza;
    public static final String zzb;

    @Deprecated
    static final zzxr zzc;

    @Deprecated
    static final zzxr zzd;

    @Deprecated
    static final zzxr zze;

    static {
        new zzdh();
        zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzet();
        zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzfk();
        new zzec();
        new zzgi();
        new zzgm();
        new zzfy();
        new zzhp();
        zzxr zzxrVarZzb = zzxr.zzb();
        zzc = zzxrVarZzb;
        zzd = zzxrVarZzb;
        zze = zzxrVarZzb;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzda.zzd();
        zzqq.zza();
        zzcq.zzg(new zzdh(), true);
        int i = zzds.zza;
        zzds.zzc(zznt.zzc());
        zzcq.zzg(new zzet(), true);
        int i10 = zzfd.zza;
        zzfd.zzc(zznt.zzc());
        if (zzik.zzb()) {
            return;
        }
        zzcq.zzg(new zzec(), true);
        int i11 = zzem.zza;
        zzem.zzc(zznt.zzc());
        zzfk.zzg(true);
        zzcq.zzg(new zzfy(), true);
        int i12 = zzgf.zza;
        zzgf.zzc(zznt.zzc());
        zzcq.zzg(new zzgi(), true);
        int i13 = zzgt.zza;
        zzgt.zza(zznt.zzc());
        zzcq.zzg(new zzgm(), true);
        int i14 = zzhe.zza;
        zzhe.zzc(zznt.zzc());
        zzcq.zzg(new zzhp(), true);
        int i15 = zzhw.zza;
        zzhw.zzc(zznt.zzc());
    }
}

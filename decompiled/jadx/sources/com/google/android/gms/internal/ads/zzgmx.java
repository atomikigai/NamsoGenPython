package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgmx implements zzgfx {
    final String zza;
    final Class zzb;
    final zzgty zzc;

    public zzgmx(String str, Class cls, zzgty zzgtyVar, zzhaq zzhaqVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgtyVar;
    }

    public static zzgfx zzd(String str, Class cls, zzgty zzgtyVar, zzhaq zzhaqVar) {
        return new zzgmx(str, cls, zzgtyVar, zzhaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final zzgua zza(zzgxp zzgxpVar) throws GeneralSecurityException {
        zzguc zzgucVarZza = zzgue.zza();
        zzgucVarZza.zzb(this.zza);
        zzgucVarZza.zzc(zzgxpVar);
        zzgucVarZza.zza(zzgve.RAW);
        zzgow zzgowVar = (zzgow) zzgnz.zzc().zzd(zzgnp.zzb().zza(zzgnz.zzc().zzb(zzgox.zza((zzgue) zzgucVarZza.zzbr())), null), zzgow.class, zzgfv.zza());
        zzgtx zzgtxVarZza = zzgua.zza();
        zzgtxVarZza.zzb(zzgowVar.zzg());
        zzgtxVarZza.zzc(zzgowVar.zze());
        zzgtxVarZza.zza(zzgowVar.zzb());
        return (zzgua) zzgtxVarZza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final Object zzc(zzgxp zzgxpVar) throws GeneralSecurityException {
        return zzgnw.zza().zzc(zzgnz.zzc().zza(zzgow.zza(this.zza, zzgxpVar, this.zzc, zzgve.RAW, null), zzgfv.zza()), this.zzb);
    }
}

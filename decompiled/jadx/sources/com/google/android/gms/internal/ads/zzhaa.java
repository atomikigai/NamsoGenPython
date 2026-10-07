package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhaa implements zzhbc {
    private static final zzhag zza = new zzgzy();
    private final zzhag zzb;

    public zzhaa() {
        zzgyq zzgyqVarZza = zzgyq.zza();
        int i = zzhas.zza;
        zzgzz zzgzzVar = new zzgzz(zzgyqVarZza, zza);
        byte[] bArr = zzgzk.zzb;
        this.zzb = zzgzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhbb zza(Class cls) {
        int i = zzhbd.zza;
        if (!zzgyx.class.isAssignableFrom(cls)) {
            int i10 = zzhas.zza;
        }
        zzhaf zzhafVarZzb = this.zzb.zzb(cls);
        if (zzhafVarZzb.zzb()) {
            int i11 = zzhas.zza;
            return zzham.zzc(zzhbd.zzm(), zzgyk.zza(), zzhafVarZzb.zza());
        }
        int i12 = zzhas.zza;
        return zzhal.zzm(cls, zzhafVarZzb, zzhap.zza(), zzgzw.zza(), zzhbd.zzm(), zzhafVarZzb.zzc() + (-1) != 1 ? zzgyk.zza() : null, zzhae.zza());
    }
}

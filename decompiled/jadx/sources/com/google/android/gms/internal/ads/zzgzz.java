package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgzz implements zzhag {
    private final zzhag[] zza;

    public zzgzz(zzhag... zzhagVarArr) {
        this.zza = zzhagVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final zzhaf zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzhag zzhagVar = this.zza[i];
            if (zzhagVar.zzc(cls)) {
                return zzhagVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}

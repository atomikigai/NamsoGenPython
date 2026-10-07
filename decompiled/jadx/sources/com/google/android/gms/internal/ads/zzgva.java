package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgva extends zzgyx implements zzhaj {
    private static final zzgva zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzgvd zze;

    static {
        zzgva zzgvaVar = new zzgva();
        zza = zzgvaVar;
        zzgyx.zzcb(zzgva.class, zzgvaVar);
    }

    private zzgva() {
    }

    public static zzguy zzb() {
        return (zzguy) zza.zzaZ();
    }

    public static zzgva zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgva) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static zzhaq zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgva zzgvaVar, zzgvd zzgvdVar) {
        zzgvdVar.getClass();
        zzgvaVar.zze = zzgvdVar;
        zzgvaVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzguz zzguzVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgva();
            case NEW_BUILDER:
                return new zzguy(zzguzVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgva.class) {
                    try {
                        zzgysVar = zzb;
                        if (zzgysVar == null) {
                            zzgysVar = new zzgys(zza);
                            zzb = zzgysVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzgysVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzgvd zzf() {
        zzgvd zzgvdVar = this.zze;
        return zzgvdVar == null ? zzgvd.zzd() : zzgvdVar;
    }
}

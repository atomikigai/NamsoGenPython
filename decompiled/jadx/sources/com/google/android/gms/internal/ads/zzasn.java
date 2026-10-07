package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzasn extends zzgyx implements zzhaj {
    private static final zzasn zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = zzbbs.zzq.zzf;
    private int zzf = zzbbs.zzq.zzf;

    static {
        zzasn zzasnVar = new zzasn();
        zza = zzasnVar;
        zzgyx.zzcb(zzasn.class, zzasnVar);
    }

    private zzasn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzatq zzatqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzgzd zzgzdVar = zzatg.zza;
                return zzgyx.zzbS(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", zzgzdVar, "zzf", zzgzdVar});
            case NEW_MUTABLE_INSTANCE:
                return new zzasn();
            case NEW_BUILDER:
                return new zzasm(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzasn.class) {
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
}

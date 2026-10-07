package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgtm extends zzgyx implements zzhaj {
    private static final zzgtm zza;
    private static volatile zzhaq zzb;

    static {
        zzgtm zzgtmVar = new zzgtm();
        zza = zzgtmVar;
        zzgyx.zzcb(zzgtm.class, zzgtmVar);
    }

    private zzgtm() {
    }

    public static zzgtm zzb() {
        return zza;
    }

    public static zzgtm zzc(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgtm) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzgtl zzgtlVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new zzgtm();
            case NEW_BUILDER:
                return new zzgtk(zzgtlVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgtm.class) {
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

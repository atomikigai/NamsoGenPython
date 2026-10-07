package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfkv extends zzgyx implements zzhaj {
    private static final zzfkv zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzfks zzd;

    static {
        zzfkv zzfkvVar = new zzfkv();
        zza = zzfkvVar;
        zzgyx.zzcb(zzfkv.class, zzfkvVar);
    }

    private zzfkv() {
    }

    public static zzfku zza() {
        return (zzfku) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfkv zzfkvVar, zzfks zzfksVar) {
        zzfksVar.getClass();
        zzfkvVar.zzd = zzfksVar;
        zzfkvVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzfkw zzfkwVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfkv();
            case NEW_BUILDER:
                return new zzfku(zzfkwVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzfkv.class) {
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

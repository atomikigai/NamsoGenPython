package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfkx extends zzgyx implements zzhaj {
    private static final zzfkx zza;
    private static volatile zzhaq zzb;
    private zzgzj zzc = zzgyx.zzbK();

    static {
        zzfkx zzfkxVar = new zzfkx();
        zza = zzfkxVar;
        zzgyx.zzcb(zzfkx.class, zzfkxVar);
    }

    private zzfkx() {
    }

    public static zzfkt zzb() {
        return (zzfkt) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzfkx zzfkxVar, zzfkv zzfkvVar) {
        zzfkvVar.getClass();
        zzgzj zzgzjVar = zzfkxVar.zzc;
        if (!zzgzjVar.zzc()) {
            zzfkxVar.zzc = zzgyx.zzbL(zzgzjVar);
        }
        zzfkxVar.zzc.add(zzfkvVar);
    }

    public final int zza() {
        return this.zzc.size();
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
                return zzgyx.zzbS(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfkv.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzfkx();
            case NEW_BUILDER:
                return new zzfkt(zzfkwVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzfkx.class) {
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

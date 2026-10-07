package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhci extends zzgyx implements zzhaj {
    private static final zzhci zza;
    private static volatile zzhaq zzb;
    private zzgzj zzc = zzgyx.zzbK();

    static {
        zzhci zzhciVar = new zzhci();
        zza = zzhciVar;
        zzgyx.zzcb(zzhci.class, zzhciVar);
    }

    private zzhci() {
    }

    public static zzhch zzc() {
        return (zzhch) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhci zzhciVar, zzhcg zzhcgVar) {
        zzhcgVar.getClass();
        zzgzj zzgzjVar = zzhciVar.zzc;
        if (!zzgzjVar.zzc()) {
            zzhciVar.zzc = zzgyx.zzbL(zzgzjVar);
        }
        zzhciVar.zzc.add(zzhcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzhcj zzhcjVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhcg.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzhci();
            case NEW_BUILDER:
                return new zzhch(zzhcjVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzhci.class) {
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

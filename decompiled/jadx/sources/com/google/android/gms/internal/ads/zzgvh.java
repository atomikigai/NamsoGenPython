package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzgvh extends zzgyx implements zzhaj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvh zzb;
    private static volatile zzhaq zzc;
    private String zzd = "";
    private zzgzj zze = zzgyx.zzbK();

    static {
        zzgvh zzgvhVar = new zzgvh();
        zzb = zzgvhVar;
        zzgyx.zzcb(zzgvh.class, zzgvhVar);
    }

    private zzgvh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzgvg zzgvgVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzguh.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvh();
            case NEW_BUILDER:
                return new zzgvf(zzgvgVar);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                zzhaq zzhaqVar = zzc;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgvh.class) {
                    try {
                        zzgysVar = zzc;
                        if (zzgysVar == null) {
                            zzgysVar = new zzgys(zzb);
                            zzc = zzgysVar;
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

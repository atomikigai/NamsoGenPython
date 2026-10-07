package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgur extends zzgyx implements zzhaj {
    private static final zzgur zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgzj zzd = zzgyx.zzbK();

    static {
        zzgur zzgurVar = new zzgur();
        zza = zzgurVar;
        zzgyx.zzcb(zzgur.class, zzgurVar);
    }

    private zzgur() {
    }

    public static zzgun zza() {
        return (zzgun) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzgur zzgurVar, zzgup zzgupVar) {
        zzgupVar.getClass();
        zzgzj zzgzjVar = zzgurVar.zzd;
        if (!zzgzjVar.zzc()) {
            zzgurVar.zzd = zzgyx.zzbL(zzgzjVar);
        }
        zzgurVar.zzd.add(zzgupVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzguq zzguqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgup.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgur();
            case NEW_BUILDER:
                return new zzgun(zzguqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgur.class) {
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

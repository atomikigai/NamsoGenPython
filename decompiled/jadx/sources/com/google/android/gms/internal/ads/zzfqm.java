package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfqm extends zzgyx implements zzhaj {
    private static final zzfqm zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgzf zzd = zzgyx.zzbG();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfqm zzfqmVar = new zzfqm();
        zza = zzfqmVar;
        zzgyx.zzcb(zzfqm.class, zzfqmVar);
    }

    private zzfqm() {
    }

    public static zzfqk zza() {
        return (zzfqk) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfqm zzfqmVar, String str) {
        str.getClass();
        zzfqmVar.zzc |= 1;
        zzfqmVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfqm zzfqmVar, int i) {
        zzgzf zzgzfVar = zzfqmVar.zzd;
        if (!zzgzfVar.zzc()) {
            zzfqmVar.zzd = zzgyx.zzbH(zzgzfVar);
        }
        zzfqmVar.zzd.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzfql zzfqlVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfqj.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfqm();
            case NEW_BUILDER:
                return new zzfqk(zzfqlVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzfqm.class) {
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

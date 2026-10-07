package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfqq extends zzgyx implements zzhaj {
    private static final zzfqq zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfqm zzg;

    static {
        zzfqq zzfqqVar = new zzfqq();
        zza = zzfqqVar;
        zzgyx.zzcb(zzfqq.class, zzfqqVar);
    }

    private zzfqq() {
    }

    public static zzfqn zza() {
        return (zzfqn) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfqq zzfqqVar, String str) {
        str.getClass();
        zzfqqVar.zzc |= 2;
        zzfqqVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfqq zzfqqVar, zzfqm zzfqmVar) {
        zzfqmVar.getClass();
        zzfqqVar.zzg = zzfqmVar;
        zzfqqVar.zzc |= 8;
    }

    public static /* synthetic */ void zzf(zzfqq zzfqqVar, int i) {
        zzfqqVar.zzd = 1;
        zzfqqVar.zzc = 1 | zzfqqVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzfqp zzfqpVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfqo.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfqq();
            case NEW_BUILDER:
                return new zzfqn(zzfqpVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzfqq.class) {
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

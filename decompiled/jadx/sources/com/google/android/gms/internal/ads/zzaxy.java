package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxy extends zzgyx implements zzhaj {
    private static final zzaxy zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzayb zzd;
    private zzgxp zze;
    private zzgxp zzf;

    static {
        zzaxy zzaxyVar = new zzaxy();
        zza = zzaxyVar;
        zzgyx.zzcb(zzaxy.class, zzaxyVar);
    }

    private zzaxy() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zze = zzgxpVar;
        this.zzf = zzgxpVar;
    }

    public static zzaxy zzb(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzaxy) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public final zzayb zzc() {
        zzayb zzaybVar = this.zzd;
        return zzaybVar == null ? zzayb.zzg() : zzaybVar;
    }

    public final zzgxp zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzaxx zzaxxVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzaxy();
            case NEW_BUILDER:
                return new zzaxw(zzaxxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzaxy.class) {
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

    public final zzgxp zzf() {
        return this.zze;
    }
}

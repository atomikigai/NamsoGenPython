package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhdj extends zzgyx implements zzhaj {
    private static final zzhdj zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzhdi zzd;
    private zzgxp zzf;
    private zzgxp zzg;
    private int zzh;
    private byte zzi = 2;
    private zzgzj zze = zzgyx.zzbK();

    static {
        zzhdj zzhdjVar = new zzhdj();
        zza = zzhdjVar;
        zzgyx.zzcb(zzhdj.class, zzhdjVar);
    }

    private zzhdj() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zzf = zzgxpVar;
        this.zzg = zzgxpVar;
    }

    public static zzhdg zzc() {
        return (zzhdg) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhdj zzhdjVar, zzhdf zzhdfVar) {
        zzhdfVar.getClass();
        zzgzj zzgzjVar = zzhdjVar.zze;
        if (!zzgzjVar.zzc()) {
            zzhdjVar.zze = zzgyx.zzbL(zzgzjVar);
        }
        zzhdjVar.zze.add(zzhdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzhfd zzhfdVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhdf.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdj();
            case NEW_BUILDER:
                return new zzhdg(zzhfdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzhdj.class) {
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

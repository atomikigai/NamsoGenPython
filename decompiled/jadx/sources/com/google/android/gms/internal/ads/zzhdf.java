package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhdf extends zzgyx implements zzhaj {
    private static final zzhdf zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgxp zzd;
    private zzgxp zze;
    private byte zzf = 2;

    static {
        zzhdf zzhdfVar = new zzhdf();
        zza = zzhdfVar;
        zzgyx.zzcb(zzhdf.class, zzhdfVar);
    }

    private zzhdf() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zzd = zzgxpVar;
        this.zze = zzgxpVar;
    }

    public static zzhde zzc() {
        return (zzhde) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhdf zzhdfVar, zzgxp zzgxpVar) {
        zzhdfVar.zzc |= 1;
        zzhdfVar.zzd = zzgxpVar;
    }

    public static /* synthetic */ void zzg(zzhdf zzhdfVar, zzgxp zzgxpVar) {
        zzhdfVar.zzc |= 2;
        zzhdfVar.zze = zzgxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzhfd zzhfdVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdf();
            case NEW_BUILDER:
                return new zzhde(zzhfdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzhdf.class) {
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

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzate extends zzgyx implements zzhaj {
    private static final zzate zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgxp zzd;
    private zzgxp zze;
    private zzgxp zzf;
    private zzgxp zzg;

    static {
        zzate zzateVar = new zzate();
        zza = zzateVar;
        zzgyx.zzcb(zzate.class, zzateVar);
    }

    private zzate() {
        zzgxp zzgxpVar = zzgxp.zzb;
        this.zzd = zzgxpVar;
        this.zze = zzgxpVar;
        this.zzf = zzgxpVar;
        this.zzg = zzgxpVar;
    }

    public static zzatd zza() {
        return (zzatd) zza.zzaZ();
    }

    public static zzate zzc(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
        return (zzate) zzgyx.zzbx(zza, bArr, zzgyhVar);
    }

    public static /* synthetic */ void zzi(zzate zzateVar, zzgxp zzgxpVar) {
        zzateVar.zzc |= 1;
        zzateVar.zzd = zzgxpVar;
    }

    public static /* synthetic */ void zzj(zzate zzateVar, zzgxp zzgxpVar) {
        zzateVar.zzc |= 2;
        zzateVar.zze = zzgxpVar;
    }

    public static /* synthetic */ void zzk(zzate zzateVar, zzgxp zzgxpVar) {
        zzateVar.zzc |= 8;
        zzateVar.zzg = zzgxpVar;
    }

    public static /* synthetic */ void zzl(zzate zzateVar, zzgxp zzgxpVar) {
        zzateVar.zzc |= 4;
        zzateVar.zzf = zzgxpVar;
    }

    public final zzgxp zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzatq zzatqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzate();
            case NEW_BUILDER:
                return new zzatd(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzate.class) {
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

    public final zzgxp zzg() {
        return this.zzg;
    }

    public final zzgxp zzh() {
        return this.zzf;
    }
}

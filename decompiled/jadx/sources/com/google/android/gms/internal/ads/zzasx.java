package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzasx extends zzgyx implements zzhaj {
    private static final zzasx zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = zzbbs.zzq.zzf;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = zzbbs.zzq.zzf;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzasx zzasxVar = new zzasx();
        zza = zzasxVar;
        zzgyx.zzcb(zzasx.class, zzasxVar);
    }

    private zzasx() {
    }

    public static zzasw zza() {
        return (zzasw) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasx zzasxVar) {
        zzasxVar.zzc &= -9;
        zzasxVar.zzg = -1L;
    }

    public static /* synthetic */ void zzd(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 8;
        zzasxVar.zzg = j4;
    }

    public static /* synthetic */ void zzf(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 32;
        zzasxVar.zzi = j4;
    }

    public static /* synthetic */ void zzg(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 4096;
        zzasxVar.zzp = j4;
    }

    public static /* synthetic */ void zzh(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 512;
        zzasxVar.zzm = j4;
    }

    public static /* synthetic */ void zzi(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 2048;
        zzasxVar.zzo = j4;
    }

    public static /* synthetic */ void zzj(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 4;
        zzasxVar.zzf = j4;
    }

    public static /* synthetic */ void zzk(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 16;
        zzasxVar.zzh = j4;
    }

    public static /* synthetic */ void zzl(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 128;
        zzasxVar.zzk = j4;
    }

    public static /* synthetic */ void zzm(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 131072;
        zzasxVar.zzy = j4;
    }

    public static /* synthetic */ void zzn(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 1;
        zzasxVar.zzd = j4;
    }

    public static /* synthetic */ void zzo(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 262144;
        zzasxVar.zzz = j4;
    }

    public static /* synthetic */ void zzp(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 2;
        zzasxVar.zze = j4;
    }

    public static /* synthetic */ void zzq(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 256;
        zzasxVar.zzl = j4;
    }

    public static /* synthetic */ void zzr(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 32768;
        zzasxVar.zzw = j4;
    }

    public static /* synthetic */ void zzs(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 65536;
        zzasxVar.zzx = j4;
    }

    public static /* synthetic */ void zzt(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 8192;
        zzasxVar.zzu = j4;
    }

    public static /* synthetic */ void zzu(zzasx zzasxVar, long j4) {
        zzasxVar.zzc |= 16384;
        zzasxVar.zzv = j4;
    }

    public static /* synthetic */ void zzv(zzasx zzasxVar, int i) {
        zzasxVar.zzn = i - 1;
        zzasxVar.zzc |= 1024;
    }

    public static /* synthetic */ void zzw(zzasx zzasxVar, int i) {
        zzasxVar.zzj = i - 1;
        zzasxVar.zzc |= 64;
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
                zzgzd zzgzdVar = zzatg.zza;
                return zzgyx.zzbS(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgzdVar, "zzk", "zzl", "zzm", "zzn", zzgzdVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case NEW_MUTABLE_INSTANCE:
                return new zzasx();
            case NEW_BUILDER:
                return new zzasw(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzasx.class) {
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

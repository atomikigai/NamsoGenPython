package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzarp extends zzgyx implements zzhaj {
    private static final zzarp zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private zzgzj zzo = zzgyx.zzbK();

    static {
        zzarp zzarpVar = new zzarp();
        zza = zzarpVar;
        zzgyx.zzcb(zzarp.class, zzarpVar);
    }

    private zzarp() {
    }

    public static zzarl zza() {
        return (zzarl) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzarp zzarpVar, String str) {
        str.getClass();
        zzarpVar.zzc |= 1;
        zzarpVar.zzd = str;
    }

    public static /* synthetic */ void zzd(zzarp zzarpVar, String str) {
        zzarpVar.zzc |= 16;
        zzarpVar.zzh = str;
    }

    public static /* synthetic */ void zzf(zzarp zzarpVar, String str) {
        zzarpVar.zzc |= 1024;
        zzarpVar.zzn = str;
    }

    public static /* synthetic */ void zzg(zzarp zzarpVar, String str) {
        str.getClass();
        zzarpVar.zzc |= 8;
        zzarpVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzarp zzarpVar, long j4) {
        zzarpVar.zzc |= 2;
        zzarpVar.zze = j4;
    }

    public static /* synthetic */ void zzi(zzarp zzarpVar, String str) {
        str.getClass();
        zzarpVar.zzc |= 4;
        zzarpVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzarp zzarpVar, int i) {
        zzarpVar.zzp = i - 1;
        zzarpVar.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzarq zzarqVar = null;
        switch (zzgywVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgyx.zzbS(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzarn.class, "zzp", zzaro.zza});
            case 3:
                return new zzarp();
            case 4:
                return new zzarl(zzarqVar);
            case 5:
                return zza;
            case 6:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzarp.class) {
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

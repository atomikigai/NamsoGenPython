package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgue extends zzgyx implements zzhaj {
    private static final zzgue zza;
    private static volatile zzhaq zzb;
    private String zzc = "";
    private zzgxp zzd = zzgxp.zzb;
    private int zze;

    static {
        zzgue zzgueVar = new zzgue();
        zza = zzgueVar;
        zzgyx.zzcb(zzgue.class, zzgueVar);
    }

    private zzgue() {
    }

    public static zzguc zza() {
        return (zzguc) zza.zzaZ();
    }

    public static zzguc zzb(zzgue zzgueVar) {
        return (zzguc) zza.zzba(zzgueVar);
    }

    public static zzgue zzd() {
        return zza;
    }

    public static zzgue zzf(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
        return (zzgue) zzgyx.zzbx(zza, bArr, zzgyhVar);
    }

    public static /* synthetic */ void zzk(zzgue zzgueVar, String str) {
        str.getClass();
        zzgueVar.zzc = str;
    }

    public static /* synthetic */ void zzl(zzgue zzgueVar, zzgxp zzgxpVar) {
        zzgxpVar.getClass();
        zzgueVar.zzd = zzgxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzgud zzgudVar = null;
        switch (zzgywVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzgue();
            case 4:
                return new zzguc(zzgudVar);
            case 5:
                return zza;
            case 6:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgue.class) {
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

    public final zzgve zzg() {
        zzgve zzgveVarZzb = zzgve.zzb(this.zze);
        return zzgveVarZzb == null ? zzgve.UNRECOGNIZED : zzgveVarZzb;
    }

    public final zzgxp zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}

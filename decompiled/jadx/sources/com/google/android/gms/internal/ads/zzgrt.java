package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgrt extends zzgyx implements zzhaj {
    private static final zzgrt zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzgrw zze;

    static {
        zzgrt zzgrtVar = new zzgrt();
        zza = zzgrtVar;
        zzgyx.zzcb(zzgrt.class, zzgrtVar);
    }

    private zzgrt() {
    }

    public static zzgrr zzb() {
        return (zzgrr) zza.zzaZ();
    }

    public static zzgrt zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgrt) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static /* synthetic */ void zzh(zzgrt zzgrtVar, zzgrw zzgrwVar) {
        zzgrwVar.getClass();
        zzgrtVar.zze = zzgrwVar;
        zzgrtVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzgrs zzgrsVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgrt();
            case NEW_BUILDER:
                return new zzgrr(zzgrsVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgrt.class) {
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

    public final zzgrw zzf() {
        zzgrw zzgrwVar = this.zze;
        return zzgrwVar == null ? zzgrw.zzd() : zzgrwVar;
    }
}

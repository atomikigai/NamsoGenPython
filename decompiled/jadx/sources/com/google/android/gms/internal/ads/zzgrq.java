package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgrq extends zzgyx implements zzhaj {
    private static final zzgrq zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private zzgxp zze = zzgxp.zzb;
    private zzgrw zzf;

    static {
        zzgrq zzgrqVar = new zzgrq();
        zza = zzgrqVar;
        zzgyx.zzcb(zzgrq.class, zzgrqVar);
    }

    private zzgrq() {
    }

    public static zzgro zzb() {
        return (zzgro) zza.zzaZ();
    }

    public static zzgrq zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgrq) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static zzhaq zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgrq zzgrqVar, zzgrw zzgrwVar) {
        zzgrwVar.getClass();
        zzgrqVar.zzf = zzgrwVar;
        zzgrqVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzgrp zzgrpVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgrq();
            case NEW_BUILDER:
                return new zzgro(zzgrpVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgrq.class) {
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
        zzgrw zzgrwVar = this.zzf;
        return zzgrwVar == null ? zzgrw.zzd() : zzgrwVar;
    }

    public final zzgxp zzg() {
        return this.zze;
    }
}

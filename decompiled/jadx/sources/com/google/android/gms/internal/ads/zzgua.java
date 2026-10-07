package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgua extends zzgyx implements zzhaj {
    private static final zzgua zza;
    private static volatile zzhaq zzb;
    private String zzc = "";
    private zzgxp zzd = zzgxp.zzb;
    private int zze;

    static {
        zzgua zzguaVar = new zzgua();
        zza = zzguaVar;
        zzgyx.zzcb(zzgua.class, zzguaVar);
    }

    private zzgua() {
    }

    public static zzgtx zza() {
        return (zzgtx) zza.zzaZ();
    }

    public static zzgua zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgua zzguaVar, String str) {
        str.getClass();
        zzguaVar.zzc = str;
    }

    public static /* synthetic */ void zzj(zzgua zzguaVar, zzgxp zzgxpVar) {
        zzgxpVar.getClass();
        zzguaVar.zzd = zzgxpVar;
    }

    public final zzgty zzb() {
        zzgty zzgtyVar;
        int i = this.zze;
        if (i == 0) {
            zzgtyVar = zzgty.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            zzgtyVar = zzgty.SYMMETRIC;
        } else if (i == 2) {
            zzgtyVar = zzgty.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            zzgtyVar = i != 4 ? null : zzgty.REMOTE;
        } else {
            zzgtyVar = zzgty.ASYMMETRIC_PUBLIC;
        }
        return zzgtyVar == null ? zzgty.UNRECOGNIZED : zzgtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzgtz zzgtzVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgua();
            case NEW_BUILDER:
                return new zzgtx(zzgtzVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgua.class) {
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
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgtw extends zzgyx implements zzhaj {
    private static final zzgtw zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;

    static {
        zzgtw zzgtwVar = new zzgtw();
        zza = zzgtwVar;
        zzgyx.zzcb(zzgtw.class, zzgtwVar);
    }

    private zzgtw() {
    }

    public static zzgtu zzc() {
        return (zzgtu) zza.zzaZ();
    }

    public static zzgtw zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgtn zzb() {
        zzgtn zzgtnVar;
        int i = this.zzc;
        if (i == 0) {
            zzgtnVar = zzgtn.UNKNOWN_HASH;
        } else if (i == 1) {
            zzgtnVar = zzgtn.SHA1;
        } else if (i == 2) {
            zzgtnVar = zzgtn.SHA384;
        } else if (i == 3) {
            zzgtnVar = zzgtn.SHA256;
        } else if (i != 4) {
            zzgtnVar = i != 5 ? null : zzgtn.SHA224;
        } else {
            zzgtnVar = zzgtn.SHA512;
        }
        return zzgtnVar == null ? zzgtn.UNRECOGNIZED : zzgtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzgtv zzgtvVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtw();
            case NEW_BUILDER:
                return new zzgtu(zzgtvVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzgtw.class) {
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

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzguk extends zzgyx implements zzhaj {
    private static final zzguk zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgua zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzguk zzgukVar = new zzguk();
        zza = zzgukVar;
        zzgyx.zzcb(zzguk.class, zzgukVar);
    }

    private zzguk() {
    }

    public static zzguj zzc() {
        return (zzguj) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzguk zzgukVar, zzgua zzguaVar) {
        zzguaVar.getClass();
        zzgukVar.zzd = zzguaVar;
        zzgukVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgua zzb() {
        zzgua zzguaVar = this.zzd;
        return zzguaVar == null ? zzgua.zzd() : zzguaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhaq zzgysVar;
        zzgul zzgulVar = null;
        switch (zzgywVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgyx.zzbS(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new zzguk();
            case 4:
                return new zzguj(zzgulVar);
            case 5:
                return zza;
            case 6:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar != null) {
                    return zzhaqVar;
                }
                synchronized (zzguk.class) {
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

    public final zzgve zzf() {
        zzgve zzgveVarZzb = zzgve.zzb(this.zzg);
        return zzgveVarZzb == null ? zzgve.UNRECOGNIZED : zzgveVarZzb;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i = this.zze;
        int i10 = 2;
        if (i != 0) {
            if (i == 1) {
                i10 = 3;
            } else if (i != 2) {
                i10 = i != 3 ? 0 : 5;
            } else {
                i10 = 4;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}

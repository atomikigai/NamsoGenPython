package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzji extends zzfi implements zzgm {
    private static final zzji zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzis zzg;
    private zziv zzh;

    static {
        zzji zzjiVar = new zzji();
        zzb = zzjiVar;
        zzfi.zzw(zzji.class, zzjiVar);
    }

    private zzji() {
    }

    public static /* synthetic */ void zzA(zzji zzjiVar, zzhx zzhxVar) {
        zzjiVar.zzf = zzhxVar;
        zzjiVar.zze = 2;
    }

    public static /* synthetic */ void zzB(zzji zzjiVar, zzib zzibVar) {
        zzjiVar.zzf = zzibVar;
        zzjiVar.zze = 3;
    }

    public static /* synthetic */ void zzC(zzji zzjiVar, zzij zzijVar) {
        zzijVar.getClass();
        zzjiVar.zzf = zzijVar;
        zzjiVar.zze = 7;
    }

    public static /* synthetic */ void zzD(zzji zzjiVar, zzis zzisVar) {
        zzisVar.getClass();
        zzjiVar.zzg = zzisVar;
        zzjiVar.zzd |= 1;
    }

    public static /* synthetic */ void zzE(zzji zzjiVar, zzjo zzjoVar) {
        zzjoVar.getClass();
        zzjiVar.zzf = zzjoVar;
        zzjiVar.zze = 8;
    }

    public static /* synthetic */ void zzF(zzji zzjiVar, zzjs zzjsVar) {
        zzjiVar.zzf = zzjsVar;
        zzjiVar.zze = 4;
    }

    public static zzjg zzc() {
        return (zzjg) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzhx.class, zzib.class, zzjs.class, zzip.class, "zzh", zzij.class, zzjo.class});
        }
        if (i10 == 3) {
            return new zzji();
        }
        zzjh zzjhVar = null;
        if (i10 == 4) {
            return new zzjg(zzjhVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}

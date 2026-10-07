package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzip extends zzfi implements zzgm {
    private static final zzip zzb;
    private int zzd;
    private int zzf;
    private zzig zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private zzfm zzg = zzfi.zzq();
    private zzfn zzh = zzfi.zzr();

    static {
        zzip zzipVar = new zzip();
        zzb = zzipVar;
        zzfi.zzw(zzip.class, zzipVar);
    }

    private zzip() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", zzin.zza, "zzg", zzik.zza, "zzh", zzjl.class, "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzip();
        }
        zzio zzioVar = null;
        if (i10 == 4) {
            return new zzim(zzioVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}

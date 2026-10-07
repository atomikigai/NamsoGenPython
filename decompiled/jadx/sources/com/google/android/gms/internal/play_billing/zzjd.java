package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjd extends zzfi implements zzgm {
    private static final zzjd zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzjd zzjdVar = new zzjd();
        zzb = zzjdVar;
        zzfi.zzw(zzjd.class, zzjdVar);
    }

    private zzjd() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzjc.zza, "zzf"});
        }
        if (i10 == 3) {
            return new zzjd();
        }
        zzje zzjeVar = null;
        if (i10 == 4) {
            return new zzjb(zzjeVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}

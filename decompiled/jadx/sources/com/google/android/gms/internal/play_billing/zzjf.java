package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjf extends zzfi implements zzgm {
    private static final zzjf zzb;
    private int zzd;
    private zzfn zze = zzfi.zzr();
    private String zzf = "";
    private boolean zzg;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzfi.zzw(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static /* synthetic */ void zzA(zzjf zzjfVar, boolean z4) {
        zzjfVar.zzd |= 2;
        zzjfVar.zzg = z4;
    }

    public static zzjf zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzjd.class, "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzjf();
        }
        zzje zzjeVar = null;
        if (i10 == 4) {
            return new zzja(zzjeVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}

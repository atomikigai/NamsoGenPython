package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zziv extends zzfi implements zzgm {
    private static final zziv zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zziv zzivVar = new zziv();
        zzb = zzivVar;
        zzfi.zzw(zziv.class, zzivVar);
    }

    private zziv() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zziv();
        }
        zziu zziuVar = null;
        if (i10 == 4) {
            return new zzit(zziuVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}

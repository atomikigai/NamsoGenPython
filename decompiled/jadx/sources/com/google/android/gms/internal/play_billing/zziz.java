package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zziz extends zzfi implements zzgm {
    private static final zziz zzb;
    private int zzd;
    private int zze;

    static {
        zziz zzizVar = new zziz();
        zzb = zzizVar;
        zzfi.zzw(zziz.class, zzizVar);
    }

    private zziz() {
    }

    public static /* synthetic */ void zzA(zziz zzizVar, int i) {
        zzizVar.zze = i - 1;
        zzizVar.zzd |= 1;
    }

    public static zziw zzc() {
        return (zziw) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzix.zza});
        }
        if (i10 == 3) {
            return new zziz();
        }
        zziy zziyVar = null;
        if (i10 == 4) {
            return new zziw(zziyVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}

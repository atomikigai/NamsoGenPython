package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjv extends zzfi implements zzgm {
    private static final zzjv zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzjv zzjvVar = new zzjv();
        zzb = zzjvVar;
        zzfi.zzw(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    public static /* synthetic */ void zzA(zzjv zzjvVar, boolean z4) {
        zzjvVar.zzd |= 8;
        zzjvVar.zzh = z4;
    }

    public static /* synthetic */ void zzB(zzjv zzjvVar, int i) {
        zzjvVar.zzd |= 16;
        zzjvVar.zzi = i;
    }

    public static /* synthetic */ void zzC(zzjv zzjvVar, long j4) {
        zzjvVar.zzd |= 4;
        zzjvVar.zzg = j4;
    }

    public static /* synthetic */ void zzD(zzjv zzjvVar, boolean z4) {
        zzjvVar.zzd |= 2;
        zzjvVar.zzf = true;
    }

    public static zzjt zzc() {
        return (zzjt) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzjv();
        }
        zzju zzjuVar = null;
        if (i10 == 4) {
            return new zzjt(zzjuVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}

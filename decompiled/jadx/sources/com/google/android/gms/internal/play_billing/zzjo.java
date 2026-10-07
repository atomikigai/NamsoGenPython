package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjo extends zzfi implements zzgm {
    private static final zzjo zzb;
    private int zzd;
    private zzig zze;
    private long zzf;

    static {
        zzjo zzjoVar = new zzjo();
        zzb = zzjoVar;
        zzfi.zzw(zzjo.class, zzjoVar);
    }

    private zzjo() {
    }

    public static /* synthetic */ void zzA(zzjo zzjoVar, zzig zzigVar) {
        zzigVar.getClass();
        zzjoVar.zze = zzigVar;
        zzjoVar.zzd |= 1;
    }

    public static /* synthetic */ void zzB(zzjo zzjoVar, long j4) {
        zzjoVar.zzd |= 2;
        zzjoVar.zzf = j4;
    }

    public static zzjm zzc() {
        return (zzjm) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzjo();
        }
        zzjn zzjnVar = null;
        if (i10 == 4) {
            return new zzjm(zzjnVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}

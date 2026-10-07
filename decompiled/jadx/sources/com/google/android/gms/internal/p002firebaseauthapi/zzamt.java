package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamt extends zzakk implements zzalq {
    private static final zzamt zzb;
    private long zzd;
    private int zze;

    static {
        zzamt zzamtVar = new zzamt();
        zzb = zzamtVar;
        zzakk.zzH(zzamt.class, zzamtVar);
    }

    private zzamt() {
    }

    public static zzams zzc() {
        return (zzams) zzb.zzt();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new zzalz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzamt();
        }
        zzamr zzamrVar = null;
        if (i10 == 4) {
            return new zzams(zzamrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

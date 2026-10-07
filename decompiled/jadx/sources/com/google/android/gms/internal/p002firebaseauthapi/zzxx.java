package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxx extends zzakk implements zzalq {
    private static final zzxx zzb;
    private int zzd;

    static {
        zzxx zzxxVar = new zzxx();
        zzb = zzxxVar;
        zzakk.zzH(zzxx.class, zzxxVar);
    }

    private zzxx() {
    }

    public static zzxx zzc() {
        return zzb;
    }

    public static zzxx zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxx) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i10 == 3) {
            return new zzxx();
        }
        zzxv zzxvVar = null;
        if (i10 == 4) {
            return new zzxw(zzxvVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

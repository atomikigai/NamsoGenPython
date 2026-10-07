package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzub extends zzakk implements zzalq {
    private static final zzub zzb;

    static {
        zzub zzubVar = new zzub();
        zzb = zzubVar;
        zzakk.zzH(zzub.class, zzubVar);
    }

    private zzub() {
    }

    public static zzub zzb() {
        return zzb;
    }

    public static zzub zzc(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzub) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zztz zztzVar = null;
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0000", null);
        }
        if (i10 == 3) {
            return new zzub();
        }
        if (i10 == 4) {
            return new zzua(zztzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

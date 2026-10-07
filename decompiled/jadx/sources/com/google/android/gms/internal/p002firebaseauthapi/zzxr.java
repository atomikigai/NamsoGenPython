package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzxr extends zzakk implements zzalq {
    private static final zzxr zzb;
    private String zzd = "";
    private zzakp zze = zzakk.zzA();

    static {
        zzxr zzxrVar = new zzxr();
        zzb = zzxrVar;
        zzakk.zzH(zzxr.class, zzxrVar);
    }

    private zzxr() {
    }

    public static zzxr zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzwq.class});
        }
        if (i10 == 3) {
            return new zzxr();
        }
        zzxp zzxpVar = null;
        if (i10 == 4) {
            return new zzxq(zzxpVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

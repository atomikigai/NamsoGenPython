package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxg extends zzakk implements zzalq {
    private static final zzxg zzb;
    private String zzd = "";

    static {
        zzxg zzxgVar = new zzxg();
        zzb = zzxgVar;
        zzakk.zzH(zzxg.class, zzxgVar);
    }

    private zzxg() {
    }

    public static zzxf zza() {
        return (zzxf) zzb.zzt();
    }

    public static zzxg zzc() {
        return zzb;
    }

    public static zzxg zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxg) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzf(zzxg zzxgVar, String str) {
        str.getClass();
        zzxgVar.zzd = str;
    }

    public final String zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i10 == 3) {
            return new zzxg();
        }
        zzxe zzxeVar = null;
        if (i10 == 4) {
            return new zzxf(zzxeVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

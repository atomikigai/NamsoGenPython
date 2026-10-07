package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwi extends zzakk implements zzalq {
    private static final zzwi zzb;
    private String zzd = "";
    private zzajf zze = zzajf.zzb;
    private int zzf;

    static {
        zzwi zzwiVar = new zzwi();
        zzb = zzwiVar;
        zzakk.zzH(zzwi.class, zzwiVar);
    }

    private zzwi() {
    }

    public static zzwf zza() {
        return (zzwf) zzb.zzt();
    }

    public static zzwi zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzwi zzwiVar, String str) {
        str.getClass();
        zzwiVar.zzd = str;
    }

    public static /* synthetic */ void zzh(zzwi zzwiVar, zzajf zzajfVar) {
        zzajfVar.getClass();
        zzwiVar.zze = zzajfVar;
    }

    public final zzwh zzb() {
        zzwh zzwhVar;
        int i = this.zzf;
        zzwh zzwhVar2 = zzwh.UNKNOWN_KEYMATERIAL;
        if (i == 0) {
            zzwhVar = zzwh.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            zzwhVar = zzwh.SYMMETRIC;
        } else if (i == 2) {
            zzwhVar = zzwh.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            zzwhVar = i != 4 ? null : zzwh.REMOTE;
        } else {
            zzwhVar = zzwh.ASYMMETRIC_PUBLIC;
        }
        return zzwhVar == null ? zzwh.UNRECOGNIZED : zzwhVar;
    }

    public final zzajf zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzwi();
        }
        zzwe zzweVar = null;
        if (i10 == 4) {
            return new zzwf(zzweVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

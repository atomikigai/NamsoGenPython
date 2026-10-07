package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxm extends zzakk implements zzalq {
    private static final zzxm zzb;
    private int zzd;
    private String zze = "";
    private zzwn zzf;

    static {
        zzxm zzxmVar = new zzxm();
        zzb = zzxmVar;
        zzakk.zzH(zzxm.class, zzxmVar);
    }

    private zzxm() {
    }

    public static zzxl zzb() {
        return (zzxl) zzb.zzt();
    }

    public static zzxm zzd() {
        return zzb;
    }

    public static zzxm zze(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxm) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzg(zzxm zzxmVar, String str) {
        str.getClass();
        zzxmVar.zze = str;
    }

    public static /* synthetic */ void zzh(zzxm zzxmVar, zzwn zzwnVar) {
        zzwnVar.getClass();
        zzxmVar.zzf = zzwnVar;
        zzxmVar.zzd |= 1;
    }

    public final zzwn zza() {
        zzwn zzwnVar = this.zzf;
        return zzwnVar == null ? zzwn.zzc() : zzwnVar;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzxm();
        }
        zzxk zzxkVar = null;
        if (i10 == 4) {
            return new zzxl(zzxkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

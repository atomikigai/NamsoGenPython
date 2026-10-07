package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxj extends zzakk implements zzalq {
    private static final zzxj zzb;
    private int zzd;
    private int zze;
    private zzxm zzf;

    static {
        zzxj zzxjVar = new zzxj();
        zzb = zzxjVar;
        zzakk.zzH(zzxj.class, zzxjVar);
    }

    private zzxj() {
    }

    public static zzxi zzb() {
        return (zzxi) zzb.zzt();
    }

    public static zzxj zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxj) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzg(zzxj zzxjVar, zzxm zzxmVar) {
        zzxmVar.getClass();
        zzxjVar.zzf = zzxmVar;
        zzxjVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzxm zze() {
        zzxm zzxmVar = this.zzf;
        return zzxmVar == null ? zzxm.zzd() : zzxmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzxj();
        }
        zzxh zzxhVar = null;
        if (i10 == 4) {
            return new zzxi(zzxhVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

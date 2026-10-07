package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsr extends zzakk implements zzalq {
    private static final zzsr zzb;
    private int zzd;
    private zzsu zze;
    private int zzf;

    static {
        zzsr zzsrVar = new zzsr();
        zzb = zzsrVar;
        zzakk.zzH(zzsr.class, zzsrVar);
    }

    private zzsr() {
    }

    public static zzsq zzb() {
        return (zzsq) zzb.zzt();
    }

    public static zzsr zzd() {
        return zzb;
    }

    public static zzsr zze(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzsr) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzg(zzsr zzsrVar, zzsu zzsuVar) {
        zzsuVar.getClass();
        zzsrVar.zze = zzsuVar;
        zzsrVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsu zzf() {
        zzsu zzsuVar = this.zze;
        return zzsuVar == null ? zzsu.zzd() : zzsuVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzsr();
        }
        zzsp zzspVar = null;
        if (i10 == 4) {
            return new zzsq(zzspVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

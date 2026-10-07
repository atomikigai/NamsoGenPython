package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsl extends zzakk implements zzalq {
    private static final zzsl zzb;
    private int zzd;
    private zzsr zze;
    private zzvi zzf;

    static {
        zzsl zzslVar = new zzsl();
        zzb = zzslVar;
        zzakk.zzH(zzsl.class, zzslVar);
    }

    private zzsl() {
    }

    public static zzsk zza() {
        return (zzsk) zzb.zzt();
    }

    public static zzsl zzc(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzsl) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzf(zzsl zzslVar, zzsr zzsrVar) {
        zzsrVar.getClass();
        zzslVar.zze = zzsrVar;
        zzslVar.zzd |= 1;
    }

    public static /* synthetic */ void zzg(zzsl zzslVar, zzvi zzviVar) {
        zzviVar.getClass();
        zzslVar.zzf = zzviVar;
        zzslVar.zzd |= 2;
    }

    public final zzsr zzd() {
        zzsr zzsrVar = this.zze;
        return zzsrVar == null ? zzsr.zzd() : zzsrVar;
    }

    public final zzvi zze() {
        zzvi zzviVar = this.zzf;
        return zzviVar == null ? zzvi.zze() : zzviVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzsl();
        }
        zzsj zzsjVar = null;
        if (i10 == 4) {
            return new zzsk(zzsjVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

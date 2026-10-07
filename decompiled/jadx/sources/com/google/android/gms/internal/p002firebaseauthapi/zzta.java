package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzta extends zzakk implements zzalq {
    private static final zzta zzb;
    private int zzd;
    private zztd zze;
    private int zzf;

    static {
        zzta zztaVar = new zzta();
        zzb = zztaVar;
        zzakk.zzH(zzta.class, zztaVar);
    }

    private zzta() {
    }

    public static zzsz zzb() {
        return (zzsz) zzb.zzt();
    }

    public static zzta zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzta) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzf(zzta zztaVar, zztd zztdVar) {
        zztdVar.getClass();
        zztaVar.zze = zztdVar;
        zztaVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztd zze() {
        zztd zztdVar = this.zze;
        return zztdVar == null ? zztd.zzd() : zztdVar;
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
            return new zzta();
        }
        zzsy zzsyVar = null;
        if (i10 == 4) {
            return new zzsz(zzsyVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

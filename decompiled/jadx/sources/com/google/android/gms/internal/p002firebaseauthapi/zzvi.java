package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvi extends zzakk implements zzalq {
    private static final zzvi zzb;
    private int zzd;
    private zzvl zze;
    private int zzf;
    private int zzg;

    static {
        zzvi zzviVar = new zzvi();
        zzb = zzviVar;
        zzakk.zzH(zzvi.class, zzviVar);
    }

    private zzvi() {
    }

    public static zzvh zzc() {
        return (zzvh) zzb.zzt();
    }

    public static zzvi zze() {
        return zzb;
    }

    public static zzvi zzf(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzvi) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzh(zzvi zzviVar, zzvl zzvlVar) {
        zzvlVar.getClass();
        zzviVar.zze = zzvlVar;
        zzviVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final zzvl zzg() {
        zzvl zzvlVar = this.zze;
        return zzvlVar == null ? zzvl.zze() : zzvlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzvi();
        }
        zzvg zzvgVar = null;
        if (i10 == 4) {
            return new zzvh(zzvgVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

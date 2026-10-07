package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwd extends zzakk implements zzalq {
    private static final zzwd zzb;
    private int zzd;
    private int zze;
    private zzvx zzf;
    private zzajf zzg = zzajf.zzb;

    static {
        zzwd zzwdVar = new zzwd();
        zzb = zzwdVar;
        zzakk.zzH(zzwd.class, zzwdVar);
    }

    private zzwd() {
    }

    public static zzwc zzc() {
        return (zzwc) zzb.zzt();
    }

    public static zzwd zze() {
        return zzb;
    }

    public static zzwd zzf(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzwd) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzi(zzwd zzwdVar, zzvx zzvxVar) {
        zzvxVar.getClass();
        zzwdVar.zzf = zzvxVar;
        zzwdVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzvx zzb() {
        zzvx zzvxVar = this.zzf;
        return zzvxVar == null ? zzvx.zzf() : zzvxVar;
    }

    public final zzajf zzg() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzwd();
        }
        zzwb zzwbVar = null;
        if (i10 == 4) {
            return new zzwc(zzwbVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzl() {
        return (this.zzd & 1) != 0;
    }
}

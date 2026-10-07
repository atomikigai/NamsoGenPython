package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzus extends zzakk implements zzalq {
    private static final zzus zzb;
    private int zzd;
    private int zze;
    private zzum zzf;
    private zzajf zzg;
    private zzajf zzh;

    static {
        zzus zzusVar = new zzus();
        zzb = zzusVar;
        zzakk.zzH(zzus.class, zzusVar);
    }

    private zzus() {
        zzajf zzajfVar = zzajf.zzb;
        this.zzg = zzajfVar;
        this.zzh = zzajfVar;
    }

    public static zzur zzc() {
        return (zzur) zzb.zzt();
    }

    public static zzus zze() {
        return zzb;
    }

    public static zzus zzf(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzus) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzk(zzus zzusVar, zzum zzumVar) {
        zzumVar.getClass();
        zzusVar.zzf = zzumVar;
        zzusVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzum zzb() {
        zzum zzumVar = this.zzf;
        return zzumVar == null ? zzum.zze() : zzumVar;
    }

    public final zzajf zzg() {
        return this.zzg;
    }

    public final zzajf zzh() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzus();
        }
        zzuq zzuqVar = null;
        if (i10 == 4) {
            return new zzur(zzuqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

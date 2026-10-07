package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzup extends zzakk implements zzalq {
    private static final zzup zzb;
    private int zzd;
    private int zze;
    private zzus zzf;
    private zzajf zzg = zzajf.zzb;

    static {
        zzup zzupVar = new zzup();
        zzb = zzupVar;
        zzakk.zzH(zzup.class, zzupVar);
    }

    private zzup() {
    }

    public static zzuo zzb() {
        return (zzuo) zzb.zzt();
    }

    public static zzup zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzup) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzh(zzup zzupVar, zzus zzusVar) {
        zzusVar.getClass();
        zzupVar.zzf = zzusVar;
        zzupVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzus zze() {
        zzus zzusVar = this.zzf;
        return zzusVar == null ? zzus.zze() : zzusVar;
    }

    public final zzajf zzf() {
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
            return new zzup();
        }
        zzun zzunVar = null;
        if (i10 == 4) {
            return new zzuo(zzunVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvu extends zzakk implements zzalq {
    private static final zzvu zzb;
    private int zzd;
    private zzvx zze;

    static {
        zzvu zzvuVar = new zzvu();
        zzb = zzvuVar;
        zzakk.zzH(zzvu.class, zzvuVar);
    }

    private zzvu() {
    }

    public static zzvt zza() {
        return (zzvt) zzb.zzt();
    }

    public static zzvu zzc(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzvu) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zze(zzvu zzvuVar, zzvx zzvxVar) {
        zzvxVar.getClass();
        zzvuVar.zze = zzvxVar;
        zzvuVar.zzd |= 1;
    }

    public final zzvx zzd() {
        zzvx zzvxVar = this.zze;
        return zzvxVar == null ? zzvx.zzf() : zzvxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzvu();
        }
        zzvs zzvsVar = null;
        if (i10 == 4) {
            return new zzvt(zzvsVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

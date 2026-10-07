package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvl extends zzakk implements zzalq {
    private static final zzvl zzb;
    private int zzd;
    private int zze;

    static {
        zzvl zzvlVar = new zzvl();
        zzb = zzvlVar;
        zzakk.zzH(zzvl.class, zzvlVar);
    }

    private zzvl() {
    }

    public static zzvk zzc() {
        return (zzvk) zzb.zzt();
    }

    public static zzvl zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzvc zzb() {
        zzvc zzvcVarZzb = zzvc.zzb(this.zzd);
        return zzvcVarZzb == null ? zzvc.UNRECOGNIZED : zzvcVarZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzvl();
        }
        zzvj zzvjVar = null;
        if (i10 == 4) {
            return new zzvk(zzvjVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

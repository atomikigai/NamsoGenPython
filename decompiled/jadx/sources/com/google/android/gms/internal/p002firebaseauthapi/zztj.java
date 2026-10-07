package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zztj extends zzakk implements zzalq {
    private static final zztj zzb;
    private int zzd;
    private int zze;

    static {
        zztj zztjVar = new zztj();
        zzb = zztjVar;
        zzakk.zzH(zztj.class, zztjVar);
    }

    private zztj() {
    }

    public static zzti zzc() {
        return (zzti) zzb.zzt();
    }

    public static zztj zze(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zztj) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zztj();
        }
        zzth zzthVar = null;
        if (i10 == 4) {
            return new zzti(zzthVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzso extends zzakk implements zzalq {
    private static final zzso zzb;
    private int zzd;
    private int zze;
    private zzsu zzf;
    private zzajf zzg = zzajf.zzb;

    static {
        zzso zzsoVar = new zzso();
        zzb = zzsoVar;
        zzakk.zzH(zzso.class, zzsoVar);
    }

    private zzso() {
    }

    public static zzsn zzb() {
        return (zzsn) zzb.zzt();
    }

    public static zzso zzd() {
        return zzb;
    }

    public static zzso zze(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzso) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzi(zzso zzsoVar, zzsu zzsuVar) {
        zzsuVar.getClass();
        zzsoVar.zzf = zzsuVar;
        zzsoVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzsu zzf() {
        zzsu zzsuVar = this.zzf;
        return zzsuVar == null ? zzsu.zzd() : zzsuVar;
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
            return new zzso();
        }
        zzsm zzsmVar = null;
        if (i10 == 4) {
            return new zzsn(zzsmVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

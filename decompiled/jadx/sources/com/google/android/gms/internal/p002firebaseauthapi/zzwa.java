package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwa extends zzakk implements zzalq {
    private static final zzwa zzb;
    private int zzd;
    private int zze;
    private zzwd zzf;
    private zzajf zzg = zzajf.zzb;

    static {
        zzwa zzwaVar = new zzwa();
        zzb = zzwaVar;
        zzakk.zzH(zzwa.class, zzwaVar);
    }

    private zzwa() {
    }

    public static zzvz zzb() {
        return (zzvz) zzb.zzt();
    }

    public static zzwa zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzwa) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzh(zzwa zzwaVar, zzwd zzwdVar) {
        zzwdVar.getClass();
        zzwaVar.zzf = zzwdVar;
        zzwaVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzwd zze() {
        zzwd zzwdVar = this.zzf;
        return zzwdVar == null ? zzwd.zze() : zzwdVar;
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
            return new zzwa();
        }
        zzvy zzvyVar = null;
        if (i10 == 4) {
            return new zzvz(zzvyVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }
}

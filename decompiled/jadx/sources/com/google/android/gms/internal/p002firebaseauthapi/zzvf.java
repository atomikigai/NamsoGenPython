package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvf extends zzakk implements zzalq {
    private static final zzvf zzb;
    private int zzd;
    private int zze;
    private zzvl zzf;
    private zzajf zzg = zzajf.zzb;

    static {
        zzvf zzvfVar = new zzvf();
        zzb = zzvfVar;
        zzakk.zzH(zzvf.class, zzvfVar);
    }

    private zzvf() {
    }

    public static zzve zzb() {
        return (zzve) zzb.zzt();
    }

    public static zzvf zzd() {
        return zzb;
    }

    public static zzvf zze(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzvf) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzi(zzvf zzvfVar, zzvl zzvlVar) {
        zzvlVar.getClass();
        zzvfVar.zzf = zzvlVar;
        zzvfVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzvl zzf() {
        zzvl zzvlVar = this.zzf;
        return zzvlVar == null ? zzvl.zze() : zzvlVar;
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
            return new zzvf();
        }
        zzvd zzvdVar = null;
        if (i10 == 4) {
            return new zzve(zzvdVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

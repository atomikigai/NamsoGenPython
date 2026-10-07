package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrz extends zzakk implements zzalq {
    private static final zzrz zzb;
    private int zzd;
    private int zze;
    private zzajf zzf = zzajf.zzb;
    private zzsf zzg;

    static {
        zzrz zzrzVar = new zzrz();
        zzb = zzrzVar;
        zzakk.zzH(zzrz.class, zzrzVar);
    }

    private zzrz() {
    }

    public static zzry zzb() {
        return (zzry) zzb.zzt();
    }

    public static zzrz zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzrz) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zzi(zzrz zzrzVar, zzsf zzsfVar) {
        zzsfVar.getClass();
        zzrzVar.zzg = zzsfVar;
        zzrzVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzsf zze() {
        zzsf zzsfVar = this.zzg;
        return zzsfVar == null ? zzsf.zzd() : zzsfVar;
    }

    public final zzajf zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzrz();
        }
        zzrx zzrxVar = null;
        if (i10 == 4) {
            return new zzry(zzrxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

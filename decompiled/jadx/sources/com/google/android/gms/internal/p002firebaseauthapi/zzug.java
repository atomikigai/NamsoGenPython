package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzug extends zzakk implements zzalq {
    private static final zzug zzb;
    private int zzd;
    private zzwn zze;

    static {
        zzug zzugVar = new zzug();
        zzb = zzugVar;
        zzakk.zzH(zzug.class, zzugVar);
    }

    private zzug() {
    }

    public static zzuf zza() {
        return (zzuf) zzb.zzt();
    }

    public static zzug zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzug zzugVar, zzwn zzwnVar) {
        zzwnVar.getClass();
        zzugVar.zze = zzwnVar;
        zzugVar.zzd |= 1;
    }

    public final zzwn zzd() {
        zzwn zzwnVar = this.zze;
        return zzwnVar == null ? zzwn.zzc() : zzwnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzug();
        }
        zzue zzueVar = null;
        if (i10 == 4) {
            return new zzuf(zzueVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

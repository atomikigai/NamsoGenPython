package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwz extends zzakk implements zzalq {
    private static final zzwz zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzwz zzwzVar = new zzwz();
        zzb = zzwzVar;
        zzakk.zzH(zzwz.class, zzwzVar);
    }

    private zzwz() {
    }

    public static zzwy zzb() {
        return (zzwy) zzb.zzt();
    }

    public static /* synthetic */ void zzd(zzwz zzwzVar, String str) {
        str.getClass();
        zzwzVar.zzd = str;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzwz();
        }
        zzww zzwwVar = null;
        if (i10 == 4) {
            return new zzwy(zzwwVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

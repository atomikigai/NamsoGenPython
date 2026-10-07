package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzuj extends zzakk implements zzalq {
    private static final zzuj zzb;
    private int zzd;
    private zzum zze;

    static {
        zzuj zzujVar = new zzuj();
        zzb = zzujVar;
        zzakk.zzH(zzuj.class, zzujVar);
    }

    private zzuj() {
    }

    public static zzui zza() {
        return (zzui) zzb.zzt();
    }

    public static zzuj zzc(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzuj) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public static /* synthetic */ void zze(zzuj zzujVar, zzum zzumVar) {
        zzumVar.getClass();
        zzujVar.zze = zzumVar;
        zzujVar.zzd |= 1;
    }

    public final zzum zzd() {
        zzum zzumVar = this.zze;
        return zzumVar == null ? zzum.zze() : zzumVar;
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
            return new zzuj();
        }
        zzuh zzuhVar = null;
        if (i10 == 4) {
            return new zzui(zzuhVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

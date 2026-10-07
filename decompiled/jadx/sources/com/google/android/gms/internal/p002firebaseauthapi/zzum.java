package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzum extends zzakk implements zzalq {
    private static final zzum zzb;
    private int zzd;
    private zzuv zze;
    private zzug zzf;
    private int zzg;

    static {
        zzum zzumVar = new zzum();
        zzb = zzumVar;
        zzakk.zzH(zzum.class, zzumVar);
    }

    private zzum() {
    }

    public static zzul zzc() {
        return (zzul) zzb.zzt();
    }

    public static zzum zze() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzum zzumVar, zzuv zzuvVar) {
        zzuvVar.getClass();
        zzumVar.zze = zzuvVar;
        zzumVar.zzd |= 1;
    }

    public static /* synthetic */ void zzh(zzum zzumVar, zzug zzugVar) {
        zzugVar.getClass();
        zzumVar.zzf = zzugVar;
        zzumVar.zzd |= 2;
    }

    public final zzud zza() {
        zzud zzudVar;
        int i = this.zzg;
        zzud zzudVar2 = zzud.UNKNOWN_FORMAT;
        if (i == 0) {
            zzudVar = zzud.UNKNOWN_FORMAT;
        } else if (i == 1) {
            zzudVar = zzud.UNCOMPRESSED;
        } else if (i != 2) {
            zzudVar = i != 3 ? null : zzud.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        } else {
            zzudVar = zzud.COMPRESSED;
        }
        return zzudVar == null ? zzud.UNRECOGNIZED : zzudVar;
    }

    public final zzug zzb() {
        zzug zzugVar = this.zzf;
        return zzugVar == null ? zzug.zzc() : zzugVar;
    }

    public final zzuv zzf() {
        zzuv zzuvVar = this.zze;
        return zzuvVar == null ? zzuv.zzc() : zzuvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzum();
        }
        zzuk zzukVar = null;
        if (i10 == 4) {
            return new zzul(zzukVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}

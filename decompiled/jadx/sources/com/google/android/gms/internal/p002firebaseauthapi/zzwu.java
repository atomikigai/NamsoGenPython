package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwu extends zzakk implements zzalq {
    private static final zzwu zzb;
    private int zzd;
    private zzwi zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzwu zzwuVar = new zzwu();
        zzb = zzwuVar;
        zzakk.zzH(zzwu.class, zzwuVar);
    }

    private zzwu() {
    }

    public static zzwt zzc() {
        return (zzwt) zzb.zzt();
    }

    public static /* synthetic */ void zzf(zzwu zzwuVar, zzwi zzwiVar) {
        zzwiVar.getClass();
        zzwuVar.zze = zzwiVar;
        zzwuVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzwi zzb() {
        zzwi zzwiVar = this.zze;
        return zzwiVar == null ? zzwi.zzd() : zzwiVar;
    }

    public final zzxo zze() {
        zzxo zzxoVarZzb = zzxo.zzb(this.zzh);
        return zzxoVarZzb == null ? zzxo.UNRECOGNIZED : zzxoVarZzb;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final Object zzj(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzwu();
        }
        zzwr zzwrVar = null;
        if (i10 == 4) {
            return new zzwt(zzwrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzk() {
        int i = this.zzf;
        int i10 = 2;
        if (i != 0) {
            if (i == 1) {
                i10 = 3;
            } else if (i != 2) {
                i10 = i != 3 ? 0 : 5;
            } else {
                i10 = 4;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}

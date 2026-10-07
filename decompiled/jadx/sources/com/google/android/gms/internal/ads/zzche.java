package com.google.android.gms.internal.ads;

import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzche {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzche(int i, int i10, int i11) {
        this.zzc = i;
        this.zzb = i10;
        this.zza = i11;
    }

    public static zzche zza() {
        return new zzche(0, 0, 0);
    }

    public static zzche zzb(int i, int i10) {
        return new zzche(1, i, i10);
    }

    public static zzche zzc(q3 q3Var) {
        if (q3Var.f3409d) {
            return new zzche(3, 0, 0);
        }
        if (q3Var.f3413t) {
            return new zzche(2, 0, 0);
        }
        return q3Var.f3412s ? new zzche(0, 0, 0) : new zzche(1, q3Var.f3410f, q3Var.f3408c);
    }

    public static zzche zzd() {
        return new zzche(5, 0, 0);
    }

    public static zzche zze() {
        return new zzche(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}

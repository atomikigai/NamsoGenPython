package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzly {
    private final zzz zza;
    private final SparseArray zzb;

    public zzly(zzz zzzVar, SparseArray sparseArray) {
        this.zza = zzzVar;
        SparseArray sparseArray2 = new SparseArray(zzzVar.zzb());
        for (int i = 0; i < zzzVar.zzb(); i++) {
            int iZza = zzzVar.zza(i);
            zzlx zzlxVar = (zzlx) sparseArray.get(iZza);
            zzlxVar.getClass();
            sparseArray2.append(iZza, zzlxVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlx zzc(int i) {
        zzlx zzlxVar = (zzlx) this.zzb.get(i);
        zzlxVar.getClass();
        return zzlxVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}

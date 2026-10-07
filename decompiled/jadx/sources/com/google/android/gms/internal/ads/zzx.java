package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzx {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzx zza(int i) {
        zzdb.zzf(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzz zzb() {
        zzdb.zzf(!this.zzb);
        this.zzb = true;
        return new zzz(this.zza, null);
    }
}

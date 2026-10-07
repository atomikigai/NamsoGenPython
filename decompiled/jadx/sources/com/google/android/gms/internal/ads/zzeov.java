package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeov {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeou zzb;

    public final zzeou zza() {
        return this.zzb;
    }

    public final void zzb(zzeou zzeouVar) {
        this.zzb = zzeouVar;
    }

    public final void zzc(boolean z4) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}

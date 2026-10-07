package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcfa {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzcfa(String str) {
    }

    public final void zza() {
        this.zza.set(false);
    }

    public final void zzb() {
        this.zza.set(true);
    }

    public final void zzc() {
        this.zza.set(false);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}

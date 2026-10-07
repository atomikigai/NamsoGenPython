package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgnu {
    private static final zzgnu zza = new zzgnu();
    private static final zzgns zzb = new zzgns(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgnu zzb() {
        return zza;
    }

    public final zzgnf zza() {
        zzgnf zzgnfVar = (zzgnf) this.zzc.get();
        return zzgnfVar == null ? zzb : zzgnfVar;
    }
}

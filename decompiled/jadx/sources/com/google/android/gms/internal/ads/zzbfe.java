package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbfe {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbfc zza() {
        return (zzbfc) zza.get();
    }

    public static zzbfd zzb() {
        return (zzbfd) zzb.get();
    }

    public static void zzc(zzbfc zzbfcVar) {
        zza.set(zzbfcVar);
    }
}

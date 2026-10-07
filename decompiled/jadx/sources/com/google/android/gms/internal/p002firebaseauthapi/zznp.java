package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zznp {
    private static final zznp zza = new zznp();
    private static final zzno zzb = new zzno(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zznp zza() {
        return zza;
    }

    public final zzrq zzb() {
        zzrq zzrqVar = (zzrq) this.zzc.get();
        return zzrqVar == null ? zzb : zzrqVar;
    }
}

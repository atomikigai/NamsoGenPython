package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzv {
    public static final zzv zza = new zzv();
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    private zzv() {
    }

    public static final void zza(int i, long j4) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i);
        Object zzuVar = concurrentHashMap.get(numValueOf);
        if (zzuVar == null) {
            zzuVar = new zzu();
        }
        zzu zzuVar2 = (zzu) zzuVar;
        zzuVar2.zzg(zzuVar2.zzb() + 1);
        zzuVar2.zzf(zzuVar2.zzd() + j4);
        zzuVar2.zze(Math.max(j4, zzuVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzuVar2);
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzack {
    private final zzacj zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzack(zzacj zzacjVar) {
        this.zza = zzacjVar;
    }

    public final zzacr zza(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.zzb) {
            try {
                if (!this.zzb.get()) {
                    try {
                        constructorZza = this.zza.zza();
                    } catch (ClassNotFoundException unused) {
                        this.zzb.set(true);
                        constructorZza = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorZza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (zzacr) constructorZza.newInstance(objArr);
        } catch (Exception e4) {
            throw new IllegalStateException("Unexpected error creating extractor", e4);
        }
    }
}

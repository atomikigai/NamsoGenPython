package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgfb implements Runnable {
    zzgfe zza;

    public zzgfb(zzgfe zzgfeVar) {
        this.zza = zzgfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m9.a aVar;
        zzgfe zzgfeVar = this.zza;
        if (zzgfeVar == null || (aVar = zzgfeVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (aVar.isDone()) {
            zzgfeVar.zzs(aVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzgfeVar.zzb;
            zzgfeVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgfeVar.zzd(new zzgfc(str, null));
                    throw th;
                }
            }
            zzgfeVar.zzd(new zzgfc(str + ": " + aVar.toString(), null));
            aVar.cancel(true);
        } catch (Throwable th2) {
            aVar.cancel(true);
            throw th2;
        }
    }
}

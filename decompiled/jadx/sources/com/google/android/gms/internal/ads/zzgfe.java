package com.google.android.gms.internal.ads;

import da.v;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgfe extends zzgdy {
    private m9.a zza;
    private ScheduledFuture zzb;

    private zzgfe(m9.a aVar) {
        aVar.getClass();
        this.zza = aVar;
    }

    public static m9.a zzf(m9.a aVar, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgfe zzgfeVar = new zzgfe(aVar);
        zzgfb zzgfbVar = new zzgfb(zzgfeVar);
        zzgfeVar.zzb = scheduledExecutorService.schedule(zzgfbVar, j4, timeUnit);
        aVar.addListener(zzgfbVar, zzgdw.INSTANCE);
        return zzgfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        m9.a aVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (aVar == null) {
            return null;
        }
        String strI = v.i("inputFuture=[", aVar.toString(), "]");
        if (scheduledFuture == null) {
            return strI;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strI;
        }
        return strI + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}

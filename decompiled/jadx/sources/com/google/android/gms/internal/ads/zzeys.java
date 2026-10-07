package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import e6.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeys implements zzevz {
    final ScheduledExecutorService zza;

    public zzeys(zzbtk zzbtkVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return zzgei.zzm(zzgei.zzo(zzgei.zzh(new Bundle()), ((Long) t.f3437d.f3440c.zza(zzbcn.zzej)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeyr
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzeyt((Bundle) obj);
            }
        }, zzcaj.zza);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfjj {
    private static final m9.a zza = zzgei.zzh(null);
    private final zzges zzb;
    private final ScheduledExecutorService zzc;
    private final zzfjk zzd;

    public zzfjj(zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, zzfjk zzfjkVar) {
        this.zzb = zzgesVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfjkVar;
    }

    public final zzfiz zza(Object obj, m9.a... aVarArr) {
        return new zzfiz(this, obj, Arrays.asList(aVarArr), null);
    }

    public final zzfjh zzb(Object obj, m9.a aVar) {
        return new zzfjh(this, obj, aVar, Collections.singletonList(aVar), aVar);
    }

    public abstract String zzf(Object obj);
}

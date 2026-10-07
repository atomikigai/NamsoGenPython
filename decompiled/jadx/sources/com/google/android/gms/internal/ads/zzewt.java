package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import h6.m0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzewt implements zzevz {
    private final m0 zza;
    private final Context zzb;
    private final zzges zzc;
    private final ScheduledExecutorService zzd;
    private final zzeez zze;
    private final zzffo zzf;
    private final i6.a zzg;

    public zzewt(m0 m0Var, Context context, zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, zzeez zzeezVar, zzffo zzffoVar, i6.a aVar) {
        this.zza = m0Var;
        this.zzb = context;
        this.zzc = zzgesVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeezVar;
        this.zzf = zzffoVar;
        this.zzg = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r9.zzb.getPackageName()) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.zzevz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m9.a zzb() {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewt.zzb():m9.a");
    }

    public final /* synthetic */ m9.a zzc(final Throwable th) throws Exception {
        zzewv zzewvVar;
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewq
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkc)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    p.C.f2982g.zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    p.C.f2982g.zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzewvVar = new zzewv("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzewvVar = new zzewv("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzewvVar = new zzewv("", 4, null);
        } else {
            zzewvVar = th instanceof TimeoutException ? new zzewv("", 5, null) : new zzewv("", 0, null);
        }
        return zzgei.zzh(zzewvVar);
    }
}

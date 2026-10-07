package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfnf extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzfnh zzb;
    final /* synthetic */ zzcfz zzc;

    public zzfnf(zzfnh zzfnhVar, zzcfz zzcfzVar, Timer timer) {
        this.zzc = zzcfzVar;
        this.zza = timer;
        this.zzb = zzfnhVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzg();
        this.zzc.zza(true);
        this.zza.cancel();
    }
}

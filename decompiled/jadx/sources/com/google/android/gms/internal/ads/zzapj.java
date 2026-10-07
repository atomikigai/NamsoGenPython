package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzapj extends Thread {
    private final BlockingQueue zza;
    private final zzapi zzb;
    private final zzaoz zzc;
    private volatile boolean zzd = false;
    private final zzapg zze;

    public zzapj(BlockingQueue blockingQueue, zzapi zzapiVar, zzaoz zzaozVar, zzapg zzapgVar) {
        this.zza = blockingQueue;
        this.zzb = zzapiVar;
        this.zzc = zzaozVar;
        this.zze = zzapgVar;
    }

    private void zzb() throws InterruptedException {
        zzapp zzappVar = (zzapp) this.zza.take();
        SystemClock.elapsedRealtime();
        zzappVar.zzt(3);
        try {
            try {
                zzappVar.zzm("network-queue-take");
                zzappVar.zzw();
                TrafficStats.setThreadStatsTag(zzappVar.zzc());
                zzapl zzaplVarZza = this.zzb.zza(zzappVar);
                zzappVar.zzm("network-http-complete");
                if (zzaplVarZza.zze && zzappVar.zzv()) {
                    zzappVar.zzp("not-modified");
                    zzappVar.zzr();
                } else {
                    zzapv zzapvVarZzh = zzappVar.zzh(zzaplVarZza);
                    zzappVar.zzm("network-parse-complete");
                    if (zzapvVarZzh.zzb != null) {
                        this.zzc.zzd(zzappVar.zzj(), zzapvVarZzh.zzb);
                        zzappVar.zzm("network-cache-written");
                    }
                    zzappVar.zzq();
                    this.zze.zzb(zzappVar, zzapvVarZzh, null);
                    zzappVar.zzs(zzapvVarZzh);
                }
            } catch (zzapy e) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzappVar, e);
                zzappVar.zzr();
            } catch (Exception e4) {
                zzaqb.zzc(e4, "Unhandled exception %s", e4.toString());
                zzapy zzapyVar = new zzapy(e4);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzappVar, zzapyVar);
                zzappVar.zzr();
            }
        } finally {
            zzappVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqb.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}

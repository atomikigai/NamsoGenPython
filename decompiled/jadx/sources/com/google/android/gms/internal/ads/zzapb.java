package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzapb extends Thread {
    private static final boolean zza = zzaqb.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaoz zzd;
    private volatile boolean zze = false;
    private final zzaqc zzf;
    private final zzapg zzg;

    public zzapb(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaoz zzaozVar, zzapg zzapgVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaozVar;
        this.zzg = zzapgVar;
        this.zzf = new zzaqc(this, blockingQueue2, zzapgVar);
    }

    private void zzc() throws InterruptedException {
        zzapp zzappVar = (zzapp) this.zzb.take();
        zzappVar.zzm("cache-queue-take");
        zzappVar.zzt(1);
        try {
            zzappVar.zzw();
            zzaoy zzaoyVarZza = this.zzd.zza(zzappVar.zzj());
            if (zzaoyVarZza == null) {
                zzappVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzappVar)) {
                    this.zzc.put(zzappVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzaoyVarZza.zza(jCurrentTimeMillis)) {
                    zzappVar.zzm("cache-hit-expired");
                    zzappVar.zze(zzaoyVarZza);
                    if (!this.zzf.zzc(zzappVar)) {
                        this.zzc.put(zzappVar);
                    }
                } else {
                    zzappVar.zzm("cache-hit");
                    zzapv zzapvVarZzh = zzappVar.zzh(new zzapl(zzaoyVarZza.zza, zzaoyVarZza.zzg));
                    zzappVar.zzm("cache-hit-parsed");
                    if (!zzapvVarZzh.zzc()) {
                        zzappVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzappVar.zzj(), true);
                        zzappVar.zze(null);
                        if (!this.zzf.zzc(zzappVar)) {
                            this.zzc.put(zzappVar);
                        }
                    } else if (zzaoyVarZza.zzf < jCurrentTimeMillis) {
                        zzappVar.zzm("cache-hit-refresh-needed");
                        zzappVar.zze(zzaoyVarZza);
                        zzapvVarZzh.zzd = true;
                        if (this.zzf.zzc(zzappVar)) {
                            this.zzg.zzb(zzappVar, zzapvVarZzh, null);
                        } else {
                            this.zzg.zzb(zzappVar, zzapvVarZzh, new zzapa(this, zzappVar));
                        }
                    } else {
                        this.zzg.zzb(zzappVar, zzapvVarZzh, null);
                    }
                }
            }
        } finally {
            zzappVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzaqb.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqb.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}

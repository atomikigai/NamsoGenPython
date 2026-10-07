package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzg {
    public static final zzyz zza = new zzyz(2, -9223372036854775807L, null);
    public static final zzyz zzb = new zzyz(3, -9223372036854775807L, null);
    private final Executor zzc;
    private final Runnable zzd;
    private zzza zze;
    private IOException zzf;

    public zzzg(String str) {
        final String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzel
            public final /* synthetic */ String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.zza);
            }
        });
        this.zzc = executorServiceNewSingleThreadExecutor;
        Objects.requireNonNull(executorServiceNewSingleThreadExecutor);
        this.zzd = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyx
            @Override // java.lang.Runnable
            public final void run() {
                executorServiceNewSingleThreadExecutor.shutdown();
            }
        };
    }

    public static zzyz zzb(boolean z4, long j4) {
        return new zzyz(z4 ? 1 : 0, j4, null);
    }

    public final long zza(zzzb zzzbVar, zzyy zzyyVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        zzdb.zzb(looperMyLooper);
        this.zzf = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzza(this, looperMyLooper, zzzbVar, zzyyVar, i, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzza zzzaVar = this.zze;
        zzdb.zzb(zzzaVar);
        zzzaVar.zza(false);
    }

    public final void zzh() {
        this.zzf = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null) {
            throw iOException;
        }
        zzza zzzaVar = this.zze;
        if (zzzaVar != null) {
            zzzaVar.zzb(i);
        }
    }

    public final void zzj(zzzc zzzcVar) {
        zzza zzzaVar = this.zze;
        if (zzzaVar != null) {
            zzzaVar.zza(true);
        }
        this.zzc.execute(new zzzd(zzzcVar));
        this.zzd.run();
    }

    public final boolean zzk() {
        return this.zzf != null;
    }

    public final boolean zzl() {
        return this.zze != null;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzza extends Handler implements Runnable {
    final /* synthetic */ zzzg zza;
    private final zzzb zzb;
    private final long zzc;
    private zzyy zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzza(zzzg zzzgVar, Looper looper, zzzb zzzbVar, zzyy zzyyVar, int i, long j4) {
        super(looper);
        this.zza = zzzgVar;
        this.zzb = zzzbVar;
        this.zzd = zzyyVar;
        this.zzc = j4;
    }

    private final void zzd() {
        SystemClock.elapsedRealtime();
        this.zzd.getClass();
        this.zze = null;
        zzzg zzzgVar = this.zza;
        Executor executor = zzzgVar.zzc;
        zzza zzzaVar = zzzgVar.zze;
        zzzaVar.getClass();
        executor.execute(zzzaVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            zzd();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.zza.zze = null;
        long j4 = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - j4;
        zzyy zzyyVar = this.zzd;
        zzyyVar.getClass();
        if (this.zzh) {
            zzyyVar.zzJ(this.zzb, jElapsedRealtime, j10, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                zzyyVar.zzK(this.zzb, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e) {
                zzdt.zzd("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzf = new zzze(e);
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i11 = this.zzf + 1;
        this.zzf = i11;
        zzyz zzyzVarZzu = zzyyVar.zzu(this.zzb, jElapsedRealtime, j10, iOException, i11);
        if (zzyzVarZzu.zza == 3) {
            this.zza.zzf = this.zze;
        } else if (zzyzVarZzu.zza != 2) {
            if (zzyzVarZzu.zza == 1) {
                this.zzf = 1;
            }
            zzc(zzyzVarZzu.zzb != -9223372036854775807L ? zzyzVarZzu.zzb : Math.min((this.zzf - 1) * zzbbs.zzq.zzf, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z4) {
                Trace.beginSection("load:".concat(this.zzb.getClass().getSimpleName()));
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e4) {
            if (this.zzi) {
                return;
            }
            zzdt.zzd("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(3, new zzze(e4)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.zzi) {
                return;
            }
            zzdt.zzd("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(3, new zzze(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.zzi) {
                zzdt.zzd("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }

    public final void zza(boolean z4) {
        this.zzi = z4;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z4) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzg();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.zza.zze = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzyy zzyyVar = this.zzd;
            zzyyVar.getClass();
            zzyyVar.zzJ(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j4) {
        zzdb.zzf(this.zza.zze == null);
        this.zza.zze = this;
        if (j4 > 0) {
            sendEmptyMessageDelayed(1, j4);
        } else {
            zzd();
        }
    }
}

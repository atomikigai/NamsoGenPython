package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaaj extends HandlerThread implements Handler.Callback {
    private zzdi zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzaal zze;

    public zzaaj() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i10 = message.arg1;
                    zzdi zzdiVar = this.zza;
                    if (zzdiVar == null) {
                        throw null;
                    }
                    zzdiVar.zzb(i10);
                    this.zze = new zzaal(this, this.zza.zza(), i10 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdj e) {
                    zzdt.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.zzd = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e4) {
                    zzdt.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.zzc = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    zzdt.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.zzd = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzdi zzdiVar2 = this.zza;
                    if (zzdiVar2 == null) {
                        throw null;
                    }
                    zzdiVar2.zzc();
                    return true;
                } catch (Throwable th) {
                    try {
                        zzdt.zzd("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzaal zza(int i) {
        boolean z4;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdi(handler, null);
        synchronized (this) {
            z4 = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaal zzaalVar = this.zze;
        zzaalVar.getClass();
        return zzaalVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}

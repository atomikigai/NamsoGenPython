package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import d6.p;
import e6.t;
import i6.h;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbat {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbap(this);
    private final Object zzc = new Object();
    private zzbaw zzd;
    private Context zze;
    private zzbaz zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzbat zzbatVar) {
        synchronized (zzbatVar.zzc) {
            try {
                zzbaw zzbawVar = zzbatVar.zzd;
                if (zzbawVar == null) {
                    return;
                }
                if (zzbawVar.isConnected() || zzbatVar.zzd.isConnecting()) {
                    zzbatVar.zzd.disconnect();
                }
                zzbatVar.zzd = null;
                zzbatVar.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbaw zzbawVarZzd = zzd(new zzbar(this), new zzbas(this));
                    this.zzd = zzbawVarZzd;
                    zzbawVarZzd.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long zza(zzbax zzbaxVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zze(zzbaxVar);
                    } catch (RemoteException e) {
                        h.e("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbau zzb(zzbax zzbaxVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbau();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbaxVar);
                }
                return this.zzf.zzf(zzbaxVar);
            } catch (RemoteException e) {
                h.e("Unable to call into cache service.", e);
                return new zzbau();
            }
        }
    }

    public final synchronized zzbaw zzd(b bVar, c cVar) {
        return new zzbaw(this.zze, p.C.f2992s.a(), bVar, cVar);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                zzbce zzbceVar = zzbcn.zzel;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    zzl();
                } else {
                    if (((Boolean) tVar.f3440c.zza(zzbcn.zzek)).booleanValue()) {
                        p.C.f2981f.zzc(new zzbaq(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        zzbce zzbceVar = zzbcn.zzem;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzl();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcaj.zzd.schedule(this.zzb, ((Long) tVar.f3440c.zza(zzbcn.zzen)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

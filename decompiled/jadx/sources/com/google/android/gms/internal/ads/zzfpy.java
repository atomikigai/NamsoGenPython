package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfpy implements b, c {
    protected final zzfqw zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfpp zzf;
    private final long zzg;
    private final int zzh;

    public zzfpy(Context context, int i, int i10, String str, String str2, String str3, zzfpp zzfppVar) {
        this.zzb = str;
        this.zzh = i10;
        this.zzc = str2;
        this.zzf = zzfppVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfqw zzfqwVar = new zzfqw(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfqwVar;
        this.zzd = new LinkedBlockingQueue();
        zzfqwVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j4, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j4, exc);
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzfrb zzfrbVarZzc = zzc();
        if (zzfrbVarZzc != null) {
            try {
                zzfri zzfriVarZzf = zzfrbVarZzc.zzf(new zzfrg(1, this.zzh, this.zzb, this.zzc));
                zzd(5011, this.zzg, null);
                this.zzd.put(zzfriVarZzf);
            } catch (Throwable th) {
                try {
                    zzd(2010, this.zzg, new Exception(th));
                } finally {
                    zzb();
                    this.zze.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(g7.b bVar) {
        try {
            zzd(4012, this.zzg, null);
            this.zzd.put(new zzfri(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new zzfri(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfri zza(int i) {
        zzfri zzfriVar;
        try {
            zzfriVar = (zzfri) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(2009, this.zzg, e);
            zzfriVar = null;
        }
        zzd(3004, this.zzg, null);
        if (zzfriVar != null) {
            if (zzfriVar.zzc == 7) {
                zzfpp.zzg(3);
            } else {
                zzfpp.zzg(2);
            }
        }
        return zzfriVar == null ? new zzfri(null, 1) : zzfriVar;
    }

    public final void zzb() {
        zzfqw zzfqwVar = this.zza;
        if (zzfqwVar != null) {
            if (zzfqwVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfrb zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}

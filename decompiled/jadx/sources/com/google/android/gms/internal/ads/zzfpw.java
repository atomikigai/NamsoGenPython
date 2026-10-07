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
final class zzfpw implements b, c {
    protected final zzfqw zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfpw(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfqw zzfqwVar = new zzfqw(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfqwVar;
        this.zzd = new LinkedBlockingQueue();
        zzfqwVar.checkAvailabilityAndConnect();
    }

    public static zzata zza() {
        zzasf zzasfVarZza = zzata.zza();
        zzasfVarZza.zzD(32768L);
        return (zzata) zzasfVarZza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzfrb zzfrbVarZzd = zzd();
        if (zzfrbVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfrbVarZzd.zze(new zzfqx(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zza());
                }
            } catch (InterruptedException unused2) {
            } finally {
                zzc();
                this.zze.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(g7.b bVar) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzata zzb(int i) {
        zzata zzataVar;
        try {
            zzataVar = (zzata) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzataVar = null;
        }
        return zzataVar == null ? zza() : zzataVar;
    }

    public final void zzc() {
        zzfqw zzfqwVar = this.zza;
        if (zzfqwVar != null) {
            if (zzfqwVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfrb zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}

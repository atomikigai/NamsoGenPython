package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfvu {
    private final zzfxg zza;
    private final Context zzb;
    private final zzfvv zzc;
    private boolean zzf;
    private final Intent zzg;
    private ServiceConnection zzi;
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfvm
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.zza.zzk();
        }
    };

    public zzfvu(Context context, zzfvv zzfvvVar, String str, Intent intent, zzfuz zzfuzVar) {
        this.zzb = context;
        this.zzc = zzfvvVar;
        final String str2 = "OverlayDisplayService";
        this.zzg = intent;
        this.zza = zzfxk.zza(new zzfxg(str2) { // from class: com.google.android.gms.internal.ads.zzfvl
            public final /* synthetic */ String zza = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                HandlerThread handlerThread = new HandlerThread(this.zza, 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzl(runnable);
            }
        });
    }

    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzi(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(runnable);
            }
        });
    }

    public final /* synthetic */ void zzj(Runnable runnable) {
        if (this.zzj != null || this.zzf) {
            if (!this.zzf) {
                runnable.run();
                return;
            }
            this.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
            return;
        }
        this.zzc.zzc("Initiate binding to the service.", new Object[0]);
        synchronized (this.zze) {
            this.zze.add(runnable);
        }
        zzfvs zzfvsVar = new zzfvs(this, null);
        this.zzi = zzfvsVar;
        this.zzf = true;
        if (this.zzb.bindService(this.zzg, zzfvsVar, 1)) {
            return;
        }
        this.zzc.zzc("Failed to bind to the service.", new Object[0]);
        this.zzf = false;
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    public final /* synthetic */ void zzk() {
        this.zzc.zzc("%s : Binder has died.", this.zzd);
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    public final /* synthetic */ void zzl(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            this.zzc.zza("error caused by ", e);
        }
    }

    public final /* synthetic */ void zzm() {
        if (this.zzj != null) {
            this.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = this.zzb;
            ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            synchronized (this.zze) {
                this.zze.clear();
            }
        }
    }

    public final void zzn() {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm();
            }
        });
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import e6.h3;
import e6.s0;
import h6.r0;
import i6.h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfmo {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpg zzd;
    protected final h3 zze;
    private final s0 zzg;
    private final zzflx zzi;
    private final ScheduledExecutorService zzk;
    private final n7.a zzm;
    private final ConcurrentLinkedQueue zzh = new ConcurrentLinkedQueue();
    protected final AtomicBoolean zzf = new AtomicBoolean(true);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicBoolean zzl = new AtomicBoolean(true);

    public zzfmo(ClientApi clientApi, Context context, int i, zzbpg zzbpgVar, h3 h3Var, s0 s0Var, ScheduledExecutorService scheduledExecutorService, zzflx zzflxVar, n7.a aVar) {
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzbpgVar;
        this.zze = h3Var;
        this.zzg = s0Var;
        this.zzk = scheduledExecutorService;
        this.zzi = zzflxVar;
        this.zzm = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(Object obj) {
        zzfmi zzfmiVar = new zzfmi(obj, this.zzm);
        this.zzh.add(zzfmiVar);
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
        this.zzk.schedule(new zzfmj(this), zzfmiVar.zza(), TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzn() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            if (((zzfmi) it.next()).zzc()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzo(boolean z4) {
        try {
            if (this.zzi.zzd()) {
                return;
            }
            if (z4) {
                this.zzi.zzb();
            }
            this.zzk.schedule(new zzfmj(this), this.zzi.zza(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract m9.a zza();

    public final synchronized zzfmo zzc() {
        this.zzk.submit(new zzfmj(this));
        return this;
    }

    public final synchronized Object zzd() {
        this.zzi.zzc();
        zzfmi zzfmiVar = (zzfmi) this.zzh.poll();
        zzh();
        if (zzfmiVar == null) {
            return null;
        }
        return zzfmiVar.zzb();
    }

    public final synchronized void zzh() {
        zzn();
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfml
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj();
            }
        });
        if (!this.zzj.get() && this.zzf.get()) {
            if (this.zzh.size() < this.zze.f3321d) {
                this.zzj.set(true);
                zzgei.zzr(zza(), new zzfmm(this), this.zzk);
            }
        }
    }

    public final void zzi() {
        if (this.zzl.get()) {
            try {
                s0 s0Var = this.zzg;
                h3 h3Var = this.zze;
                e6.r0 r0Var = (e6.r0) s0Var;
                Parcel parcelZza = r0Var.zza();
                zzaye.zzd(parcelZza, h3Var);
                r0Var.zzdc(1, parcelZza);
            } catch (RemoteException unused) {
                h.g("Failed to call onAdsAvailable");
            }
        }
    }

    public final void zzj() {
        if (this.zzl.get() && this.zzh.isEmpty()) {
            try {
                s0 s0Var = this.zzg;
                h3 h3Var = this.zze;
                e6.r0 r0Var = (e6.r0) s0Var;
                Parcel parcelZza = r0Var.zza();
                zzaye.zzd(parcelZza, h3Var);
                r0Var.zzdc(2, parcelZza);
            } catch (RemoteException unused) {
                h.g("Failed to call onAdsExhausted");
            }
        }
    }

    public final void zzk() {
        this.zzf.set(false);
        this.zzl.set(false);
    }

    public final synchronized boolean zzl() {
        zzn();
        return !this.zzh.isEmpty();
    }
}

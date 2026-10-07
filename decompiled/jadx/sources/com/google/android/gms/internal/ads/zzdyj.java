package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import d6.p;
import e6.t;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdyj extends zzdyh {
    private final Context zzg;
    private final Executor zzh;

    public zzdyj(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbur(context, p.C.f2992s.a(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdyh, com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzf(this.zze, ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmD)).booleanValue() ? new zzdyg(this.zza, this.zze) : new zzdyf(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdyw(1));
                    } catch (Throwable th) {
                        p.C.f2982g.zzw(th, "RemoteSignalsClientTask.onConnected");
                        this.zza.zzd(new zzdyw(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final m9.a zza(zzbvx zzbvxVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbvxVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                }, zzcaj.zzf);
                zzdyh.zzc(this.zzg, this.zza, this.zzh);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

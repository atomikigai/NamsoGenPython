package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import d6.p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeaj extends zzeap {
    private zzbvb zzh;

    public zzeaj(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = p.C.f2992s.a();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeap, com.google.android.gms.common.internal.b
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            this.zzd.zzp().zze(this.zzh, new zzeao(this));
        } catch (RemoteException unused) {
            this.zza.zzd(new zzdyw(1));
        } catch (Throwable th) {
            p.C.f2982g.zzw(th, "RemoteAdsServiceProxyClientTask.onConnected");
            this.zza.zzd(th);
        }
    }

    public final synchronized m9.a zza(zzbvb zzbvbVar, long j4) {
        if (this.zzb) {
            return zzgei.zzo(this.zza, j4, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbvbVar;
        zzb();
        m9.a aVarZzo = zzgei.zzo(this.zza, j4, TimeUnit.MILLISECONDS, this.zzg);
        aVarZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, zzcaj.zzf);
        return aVarZzo;
    }
}

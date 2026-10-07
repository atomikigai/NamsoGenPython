package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import e6.t;
import i6.h;
import i6.i;
import i6.j;
import java.util.concurrent.atomic.AtomicBoolean;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzboy {
    private static zzboy zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzboy zza() {
        if (zza == null) {
            zza = new zzboy();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbox
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbcn.zza(context2);
                zzbce zzbceVar = zzbcn.zzaD;
                t tVar = t.f3437d;
                zzbcl zzbclVar = tVar.f3440c;
                zzbcl zzbclVar2 = tVar.f3440c;
                if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) zzbclVar2.zza(zzbcn.zzas)).booleanValue());
                if (((Boolean) zzbclVar2.zza(zzbcn.zzaz)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzchj) b.I(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new i() { // from class: com.google.android.gms.internal.ads.zzbow
                        @Override // i6.i
                        public final Object zza(Object obj) {
                            return zzchi.zzb((IBinder) obj);
                        }
                    })).zze(new q7.b(context2), new zzbov(com.google.android.gms.internal.measurement.zzef.zzg(context2, "FA-Ads", "am", str, bundle).zzd()));
                } catch (RemoteException | j | NullPointerException e) {
                    h.i("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}

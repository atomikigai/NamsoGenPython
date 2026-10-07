package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import e6.t;
import i6.b;
import i6.h;
import i6.i;
import i6.j;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbbr {
    zzayh zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbbr() {
        this.zzc = b.f5218b;
    }

    public zzbbr(final Context context) {
        ExecutorService executorService = b.f5218b;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbm
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeV)).booleanValue();
                zzbbr zzbbrVar = this.zza;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        zzbbrVar.zza = (zzayh) qd.b.I(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new i() { // from class: com.google.android.gms.internal.ads.zzbbn
                            @Override // i6.i
                            public final Object zza(Object obj) {
                                return zzayg.zzb((IBinder) obj);
                            }
                        });
                        zzbbrVar.zza.zze(new q7.b(context2), "GMA_SDK");
                        zzbbrVar.zzb = true;
                    } catch (RemoteException | j | NullPointerException unused) {
                        h.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}

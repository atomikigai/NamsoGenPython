package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeb {
    private static zzeb zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzeb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzdz(this, null), intentFilter);
    }

    public static synchronized zzeb zzb(Context context) {
        try {
            if (zza == null) {
                zza = new zzeb(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public static /* synthetic */ void zzc(zzeb zzebVar, int i) throws Throwable {
        synchronized (zzebVar.zzd) {
            try {
                if (zzebVar.zze == i) {
                    return;
                }
                zzebVar.zze = i;
                for (WeakReference weakReference : zzebVar.zzc) {
                    zzyt zzytVar = (zzyt) weakReference.get();
                    if (zzytVar != null) {
                        zzytVar.zza.zzl(i);
                    } else {
                        zzebVar.zzc.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final zzyt zzytVar) {
        for (WeakReference weakReference : this.zzc) {
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzytVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdx
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzytVar.zza.zzl(this.zza.zza());
            }
        });
    }
}

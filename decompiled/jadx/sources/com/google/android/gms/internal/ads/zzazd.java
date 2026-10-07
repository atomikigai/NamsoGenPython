package com.google.android.gms.internal.ads;

import i6.h;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzazd implements Runnable {
    final /* synthetic */ zzaze zza;

    public zzazd(zzaze zzazeVar) {
        this.zza = zzazeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            zzaze zzazeVar = this.zza;
            if (zzazeVar.zzd && zzazeVar.zze) {
                zzazeVar.zzd = false;
                h.b("App went background");
                Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzazf) it.next()).zza(false);
                    } catch (Exception e) {
                        h.e("", e);
                    }
                }
            } else {
                h.b("App is still foreground");
            }
        }
    }
}

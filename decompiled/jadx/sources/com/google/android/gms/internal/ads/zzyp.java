package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyp {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyq zzyqVar) {
        zzc(zzyqVar);
        this.zza.add(new zzyo(handler, zzyqVar));
    }

    public final void zzb(final int i, final long j4, final long j10) {
        for (final zzyo zzyoVar : this.zza) {
            if (!zzyoVar.zzc) {
                zzyoVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyoVar.zzb.zzY(i, j4, j10);
                    }
                });
            }
        }
    }

    public final void zzc(zzyq zzyqVar) {
        for (zzyo zzyoVar : this.zza) {
            if (zzyoVar.zzb == zzyqVar) {
                zzyoVar.zzc();
                this.zza.remove(zzyoVar);
            }
        }
    }
}

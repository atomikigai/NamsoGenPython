package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import e6.t;
import h6.r0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcbz {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) t.f3437d.f3440c.zza(zzbcn.zzN)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcbk zzcbkVar) {
        if (zzcbkVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j4 = timestamp - this.zzb;
            if (Math.abs(j4) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
            @Override // java.lang.Runnable
            public final void run() {
                zzcbkVar.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}

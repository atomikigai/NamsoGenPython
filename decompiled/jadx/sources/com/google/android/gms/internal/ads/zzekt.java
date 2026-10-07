package com.google.android.gms.internal.ads;

import android.view.View;
import d6.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzekt implements f {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcwk zzb;
    private final zzcxe zzc;
    private final zzden zzd;
    private final zzdef zze;
    private final zzcny zzf;

    public zzekt(zzcwk zzcwkVar, zzcxe zzcxeVar, zzden zzdenVar, zzdef zzdefVar, zzcny zzcnyVar) {
        this.zzb = zzcwkVar;
        this.zzc = zzcxeVar;
        this.zzd = zzdenVar;
        this.zze = zzdefVar;
        this.zzf = zzcnyVar;
    }

    @Override // d6.f
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzr();
            this.zze.zza(view);
        }
    }

    @Override // d6.f
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // d6.f
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}

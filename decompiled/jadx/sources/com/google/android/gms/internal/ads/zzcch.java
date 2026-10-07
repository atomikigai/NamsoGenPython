package com.google.android.gms.internal.ads;

import h6.l0;
import h6.r0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcch implements Runnable {
    private final zzcbt zza;
    private boolean zzb = false;

    public zzcch(zzcbt zzcbtVar) {
        this.zza = zzcbtVar;
    }

    private final void zzc() {
        l0 l0Var = r0.f5068l;
        l0Var.removeCallbacks(this);
        l0Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}

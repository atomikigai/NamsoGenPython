package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcrf implements zzcya, zzaym {
    private final zzfet zza;
    private final zzcxe zzb;
    private final zzcyj zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcrf(zzfet zzfetVar, zzcxe zzcxeVar, zzcyj zzcyjVar) {
        this.zza = zzfetVar;
        this.zzb = zzcxeVar;
        this.zzc = zzcyjVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        if (this.zza.zze == 1 && zzaylVar.zzj) {
            zza();
        }
        if (zzaylVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zzs() {
        if (this.zza.zze != 1) {
            zza();
        }
    }
}

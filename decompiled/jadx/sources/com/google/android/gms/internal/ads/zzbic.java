package com.google.android.gms.internal.ads;

import z5.j;
import z5.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbic {
    private final k zza;
    private final j zzb;
    private zzbgt zzc;

    public zzbic(k kVar, j jVar) {
        this.zza = kVar;
        this.zzb = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbgt zzf(zzbgs zzbgsVar) {
        zzbgt zzbgtVar = this.zzc;
        if (zzbgtVar != null) {
            return zzbgtVar;
        }
        zzbgt zzbgtVar2 = new zzbgt(zzbgsVar);
        this.zzc = zzbgtVar2;
        return zzbgtVar2;
    }

    public final zzbhc zzc() {
        zzbib zzbibVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbhz(this, zzbibVar);
    }

    public final zzbhf zzd() {
        return new zzbia(this, null);
    }
}

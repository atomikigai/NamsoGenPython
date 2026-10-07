package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdep {
    private final List zza;
    private final zzflr zzb;
    private boolean zzc;

    public zzdep(zzfet zzfetVar, zzflr zzflrVar) {
        this.zza = zzfetVar.zzp;
        this.zzb = zzflrVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}

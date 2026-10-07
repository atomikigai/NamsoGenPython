package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhgk {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzhgk(int i, int i10, zzhgj zzhgjVar) {
        this.zza = zzhfu.zzc(i);
        this.zzb = zzhfu.zzc(i10);
    }

    public final zzhgk zza(zzhgg zzhggVar) {
        this.zzb.add(zzhggVar);
        return this;
    }

    public final zzhgk zzb(zzhgg zzhggVar) {
        this.zza.add(zzhggVar);
        return this;
    }

    public final zzhgl zzc() {
        return new zzhgl(this.zza, this.zzb, null);
    }
}

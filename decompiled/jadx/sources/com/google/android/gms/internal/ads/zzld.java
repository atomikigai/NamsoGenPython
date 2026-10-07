package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzld implements zzku {
    public final zzum zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzld(zzut zzutVar, boolean z4) {
        this.zza = new zzum(zzutVar, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final zzbv zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}

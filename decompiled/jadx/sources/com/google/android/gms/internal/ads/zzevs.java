package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzevs implements zzevz {
    private final boolean zza;

    public zzevs(zzfco zzfcoVar) {
        this.zza = zzfcoVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return zzgei.zzh(this.zza ? new zzevy() { // from class: com.google.android.gms.internal.ads.zzevr
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}

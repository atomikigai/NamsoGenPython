package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfyu extends zzfyi {
    final /* synthetic */ zzfyx zza;
    private final Object zzb;
    private int zzc;

    public zzfyu(zzfyx zzfyxVar, int i) {
        this.zza = zzfyxVar;
        this.zzb = zzfyx.zzg(zzfyxVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfwn.zza(this.zzb, zzfyx.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfyx.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfyx zzfyxVar = this.zza;
        Object objZzj = zzfyx.zzj(zzfyxVar, i);
        zzfyx.zzn(zzfyxVar, this.zzc, obj);
        return objZzj;
    }
}

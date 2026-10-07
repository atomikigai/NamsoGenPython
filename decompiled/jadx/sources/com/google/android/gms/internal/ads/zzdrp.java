package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdrp implements zzfjs {
    private final Map zza;
    private final zzbbl zzb;

    public zzdrp(zzbbl zzbblVar, Map map) {
        this.zza = map;
        this.zzb = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzd(zzfjl zzfjlVar, String str) {
        if (this.zza.containsKey(zzfjlVar)) {
            this.zzb.zzc(((zzdro) this.zza.get(zzfjlVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdD(zzfjl zzfjlVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfjlVar)) {
            this.zzb.zzc(((zzdro) this.zza.get(zzfjlVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdE(zzfjl zzfjlVar, String str) {
        if (this.zza.containsKey(zzfjlVar)) {
            this.zzb.zzc(((zzdro) this.zza.get(zzfjlVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdC(zzfjl zzfjlVar, String str) {
    }
}

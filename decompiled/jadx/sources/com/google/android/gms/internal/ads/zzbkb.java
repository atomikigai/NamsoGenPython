package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbkb implements g6.a {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ e6.a zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbkb(zzbkd zzbkdVar, boolean z4, e6.a aVar, Map map, Map map2) {
        this.zzb = z4;
        this.zzc = aVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // g6.a
    public final void zza(boolean z4) {
        if (this.zza) {
            return;
        }
        if (z4 && this.zzb) {
            ((zzdel) this.zzc).zzdG();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z4));
        ((zzbmm) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // g6.a
    public final void zzb(int i) {
    }
}

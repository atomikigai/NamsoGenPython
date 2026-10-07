package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzctv implements zzdbz, zzcya {
    private final n7.a zza;
    private final zzctx zzb;
    private final zzffo zzc;
    private final String zzd;

    public zzctv(n7.a aVar, zzctx zzctxVar, zzffo zzffoVar, String str) {
        this.zza = aVar;
        this.zzb = zzctxVar;
        this.zzc = zzffoVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zza() {
        n7.a aVar = this.zza;
        zzctx zzctxVar = this.zzb;
        String str = this.zzd;
        ((b) aVar).getClass();
        zzctxVar.zze(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        n7.a aVar = this.zza;
        String str = this.zzd;
        ((b) aVar).getClass();
        this.zzb.zzd(this.zzc.zzf, str, SystemClock.elapsedRealtime());
    }
}

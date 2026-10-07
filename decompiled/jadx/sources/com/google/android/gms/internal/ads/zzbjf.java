package com.google.android.gms.internal.ads;

import d6.p;
import h6.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbjf implements zzgee {
    final /* synthetic */ zzcfk zza;

    public zzbjf(zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        p.C.f2982g.zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfk zzcfkVar = this.zza;
        new a0(zzcfkVar.getContext(), zzcfkVar.zzn().f5213a, (String) obj).zzb();
    }
}

package com.google.android.gms.internal.ads;

import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzffz implements zzgee {
    final /* synthetic */ zzfga zza;
    final /* synthetic */ int zzb;

    public zzffz(zzfga zzfgaVar, int i) {
        this.zzb = i;
        this.zza = zzfgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        p.C.f2982g.zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = this.zzb;
        this.zza.zzb((String) obj, i);
    }
}

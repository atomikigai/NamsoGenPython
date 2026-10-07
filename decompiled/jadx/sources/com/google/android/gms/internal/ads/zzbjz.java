package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbjz implements zzgee {
    final /* synthetic */ Map zza;
    final /* synthetic */ e6.a zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbkd zzd;

    public zzbjz(zzbkd zzbkdVar, Map map, e6.a aVar, String str) {
        this.zza = map;
        this.zzb = aVar;
        this.zzc = str;
        this.zzd = zzbkdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        p.C.f2982g.zzw(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjJ)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzh(str, this.zzb, this.zza, this.zzc);
    }
}

package com.google.android.gms.internal.ads;

import d6.p;
import e6.s;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzffy implements zzgee {
    final /* synthetic */ zzcfk zza;
    final /* synthetic */ zzcnb zzb;
    final /* synthetic */ zzflr zzc;
    final /* synthetic */ zzedp zzd;

    public zzffy(zzcfk zzcfkVar, zzcnb zzcnbVar, zzflr zzflrVar, zzedp zzedpVar) {
        this.zza = zzcfkVar;
        this.zzb = zzcnbVar;
        this.zzc = zzflrVar;
        this.zzd = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzai) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjI)).booleanValue() && this.zzb != null && zzcnb.zzj(str)) {
                this.zzb.zzi(str, this.zzc, s.f3427f.e);
                return;
            } else {
                this.zzc.zzc(str, null);
                return;
            }
        }
        p pVar = p.C;
        pVar.f2983j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = this.zza.zzR().zzb;
        int i = 2;
        if (!pVar.f2982g.zzA(this.zza.getContext())) {
            if ((!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzge)).booleanValue() || !this.zza.zzD().zzS) && this.zza.zzD().zzad == null) {
                i = 1;
            }
        }
        this.zzd.zzd(new zzedr(jCurrentTimeMillis, str2, str, i));
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
    }
}

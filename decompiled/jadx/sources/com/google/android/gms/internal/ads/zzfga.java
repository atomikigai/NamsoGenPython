package com.google.android.gms.internal.ads;

import d6.p;
import e6.s;
import e6.t;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfga {
    private final zzfet zza;
    private final zzfew zzb;
    private final zzedp zzc;
    private final zzflr zzd;
    private final zzfkl zze;
    private final zzcnb zzf;

    public zzfga(zzedp zzedpVar, zzflr zzflrVar, zzfet zzfetVar, zzfew zzfewVar, zzcnb zzcnbVar, zzfkl zzfklVar) {
        this.zza = zzfetVar;
        this.zzb = zzfewVar;
        this.zzc = zzedpVar;
        this.zzd = zzflrVar;
        this.zzf = zzcnbVar;
        this.zze = zzfklVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzai) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        p.C.f2983j.getClass();
        this.zzc.zzd(new zzedr(System.currentTimeMillis(), this.zzb.zzb, str, i));
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgei.zzr((((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjI)).booleanValue() && zzcnb.zzj(str)) ? this.zzf.zzb(str, s.f3427f.e) : zzgei.zzh(str), new zzffz(this, i), zzcaj.zza);
        }
    }
}

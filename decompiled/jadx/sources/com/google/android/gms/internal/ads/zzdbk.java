package com.google.android.gms.internal.ads;

import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdbk implements zzczj {
    private int zza;
    private int zzb;

    public zzdbk() {
        zzbce zzbceVar = zzbcn.zzbn;
        t tVar = t.f3437d;
        this.zza = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
        this.zzb = ((Integer) tVar.f3440c.zza(zzbcn.zzmz)).intValue();
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzdo(zzfff zzfffVar) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbo)).booleanValue()) {
            try {
                zzfew zzfewVar = zzfffVar.zzb.zzb;
                this.zza = zzfewVar.zzc;
                this.zzb = zzfewVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }
}

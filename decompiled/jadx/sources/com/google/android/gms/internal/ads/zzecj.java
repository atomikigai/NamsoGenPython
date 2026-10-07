package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;
import h6.m0;
import h6.n0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzecj implements zzcya, zzcwp {
    private static final Object zza = new Object();
    private static int zzb;
    private final m0 zzc;
    private final zzect zzd;

    public zzecj(zzect zzectVar, m0 m0Var) {
        this.zzd = zzectVar;
        this.zzc = m0Var;
    }

    private final void zzb(boolean z4) {
        int i;
        int iIntValue;
        zzbce zzbceVar = zzbcn.zzgc;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && !((n0) this.zzc).k()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                iIntValue = ((Integer) tVar.f3440c.zza(zzbcn.zzgd)).intValue();
            }
            if (i < iIntValue) {
                this.zzd.zzd(z4);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(h2 h2Var) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        zzb(true);
    }
}

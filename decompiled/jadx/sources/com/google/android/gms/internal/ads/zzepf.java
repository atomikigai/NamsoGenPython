package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.t;
import e6.u3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepf implements zzevy {
    private final u3 zza;
    private final boolean zzb;

    public zzepf(u3 u3Var, boolean z4) {
        this.zza = u3Var;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfo)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        u3 u3Var = this.zza;
        if (u3Var != null) {
            int i = u3Var.f3455a;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}

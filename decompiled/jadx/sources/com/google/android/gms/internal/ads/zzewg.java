package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.s;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzewg implements zzevy {
    private final int zza;
    private final int zzb;

    public zzewg(int i, int i10) {
        this.zza = i;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("sessions_without_flags", this.zza);
        bundle.putInt("crashes_without_flags", this.zzb);
        s sVar = s.f3427f;
        if (t.f3437d.f3440c.zze()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}

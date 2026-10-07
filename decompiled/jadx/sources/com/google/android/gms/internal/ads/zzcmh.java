package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import h6.m0;
import h6.n0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcmh implements zzclr {
    private final Context zza;
    private final m0 zzb = p.C.f2982g.zzi();

    public zzcmh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        m0 m0Var = this.zzb;
        boolean z4 = Boolean.parseBoolean(str);
        ((n0) m0Var).c(z4);
        if (z4) {
            p3.a.x(this.zza);
        }
    }
}

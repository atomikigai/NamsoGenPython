package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import h6.m0;
import h6.n0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzclv implements zzclr {
    private final m0 zza;

    public zzclv(m0 m0Var) {
        this.zza = m0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        boolean z4 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
        n0 n0Var = (n0) this.zza;
        n0Var.l();
        synchronized (n0Var.f5036a) {
            try {
                if (n0Var.f5054v == z4) {
                    return;
                }
                n0Var.f5054v = z4;
                SharedPreferences.Editor editor = n0Var.f5041g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z4);
                    n0Var.f5041g.apply();
                }
                n0Var.m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

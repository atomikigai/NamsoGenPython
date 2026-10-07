package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import e6.t;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzevw implements zzevz {
    private final zzges zza;
    private final Context zzb;

    public zzevw(zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final zzevy zzc() throws Exception {
        final Bundle bundleW = p3.a.w(this.zzb, (String) t.f3437d.f3440c.zza(zzbcn.zzfY));
        if (bundleW.isEmpty()) {
            return null;
        }
        return new zzevy() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", bundleW);
            }
        };
    }
}

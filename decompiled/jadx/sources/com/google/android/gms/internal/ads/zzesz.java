package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import d6.p;
import h6.r0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesz implements zzevz {
    private final Context zza;
    private final zzges zzb;

    public zzesz(zzges zzgesVar, Context context) {
        this.zzb = zzgesVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final zzeta zzc() throws Exception {
        r0 r0Var = p.C.f2979c;
        Object systemService = this.zza.getSystemService("display");
        return new zzeta(systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
    }
}

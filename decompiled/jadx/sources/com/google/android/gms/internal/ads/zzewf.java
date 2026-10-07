package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzewf implements zzevz {
    private final Context zza;
    private final zzges zzb;

    public zzewf(Context context, zzges zzgesVar) {
        this.zza = context;
        this.zzb = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return ((Boolean) zzbef.zzb.zze()).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        }) : zzgei.zzh(null);
    }

    public final /* synthetic */ zzewg zzc() throws Exception {
        Context context = this.zza;
        return new zzewg(zzbbx.zzb(context), zzbbx.zza(context));
    }
}

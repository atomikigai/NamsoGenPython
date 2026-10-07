package com.google.android.gms.internal.ads;

import e6.t;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepi implements zzevz {
    private final Executor zza;
    private final zzbzz zzb;

    public zzepi(Executor executor, zzbzz zzbzzVar) {
        this.zza = executor;
        this.zzb = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcV)).booleanValue() ? zzgei.zzh(null) : zzgei.zzm(this.zzb.zzk(), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeph
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzepj(arrayList);
            }
        }, this.zza);
    }
}

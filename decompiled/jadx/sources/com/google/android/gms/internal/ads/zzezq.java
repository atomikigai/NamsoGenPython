package com.google.android.gms.internal.ads;

import android.os.Build;
import e6.t;
import h6.i0;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzezq implements zzevz {
    private final zzges zza;

    public zzezq(zzges zzgesVar) {
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzezp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                zzbce zzbceVar = zzbcn.zzT;
                t tVar = t.f3437d;
                String str = (String) tVar.f3440c.zza(zzbceVar);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) tVar.f3440c.zza(zzbcn.zzU)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, i0.a(str2));
                        }
                    }
                }
                return new zzezr(map);
            }
        });
    }
}

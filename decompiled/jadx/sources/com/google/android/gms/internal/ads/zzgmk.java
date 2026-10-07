package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgmk {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgmk() {
    }

    public final zzgmk zza(Enum r10, Object obj) {
        this.zza.put(r10, obj);
        this.zzb.put(obj, r10);
        return this;
    }

    public final zzgmm zzb() {
        return new zzgmm(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzgmk(zzgml zzgmlVar) {
    }
}

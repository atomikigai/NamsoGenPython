package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.i0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbkl implements zzbjr {
    private final zzdvk zza;

    public zzbkl(zzdvk zzdvkVar) {
        i0.j(zzdvkVar, "The Inspector Manager must not be null");
        this.zza = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j4 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j4 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j4);
    }
}

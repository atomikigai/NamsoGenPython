package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbda {
    private final Map zza = new HashMap();
    private final zzbdc zzb;

    public zzbda(zzbdc zzbdcVar) {
        this.zzb = zzbdcVar;
    }

    public final zzbdc zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbcz zzbczVar) {
        this.zza.put(str, zzbczVar);
    }

    public final void zzc(String str, String str2, long j4) {
        zzbcz zzbczVar = (zzbcz) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbczVar != null) {
            this.zzb.zze(zzbczVar, j4, strArr);
        }
        this.zza.put(str, new zzbcz(j4, null, null));
    }
}

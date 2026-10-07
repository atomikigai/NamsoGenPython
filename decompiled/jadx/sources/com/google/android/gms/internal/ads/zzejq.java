package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzejq implements zzefd {
    private final Map zza = new HashMap();
    private final zzdqd zzb;

    public zzejq(zzdqd zzdqdVar) {
        this.zzb = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzefe zza(String str, JSONObject jSONObject) throws zzffv {
        zzefe zzefeVar;
        synchronized (this) {
            try {
                zzefeVar = (zzefe) this.zza.get(str);
                if (zzefeVar == null) {
                    zzefeVar = new zzefe(this.zzb.zzc(str, jSONObject), new zzegy(), str);
                    this.zza.put(str, zzefeVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzefeVar;
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzclp {
    private final Map zza;
    private final Map zzb;

    public zzclp(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfff zzfffVar) throws Exception {
        for (zzffd zzffdVar : zzfffVar.zzb.zzc) {
            if (this.zza.containsKey(zzffdVar.zza)) {
                ((zzcls) this.zza.get(zzffdVar.zza)).zza(zzffdVar.zzb);
            } else if (this.zzb.containsKey(zzffdVar.zza)) {
                zzclr zzclrVar = (zzclr) this.zzb.get(zzffdVar.zza);
                JSONObject jSONObject = zzffdVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzclrVar.zza(map);
            }
        }
    }
}

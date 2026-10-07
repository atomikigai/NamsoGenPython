package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e6.t;
import h6.k0;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeby {
    private final zzbvr zza;

    public zzeby(zzbvr zzbvrVar) {
        this.zza = zzbvrVar;
    }

    public static void zza(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
        if (jSONObjectOptJSONObject == null) {
            k0.k("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
    }

    public final void zzb() {
        m9.a aVarZza = this.zza.zza();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhr)).booleanValue()) {
            zzcam.zzb(aVarZza, "persistFlags");
        } else {
            zzcam.zza(aVarZza, "persistFlags");
        }
    }
}

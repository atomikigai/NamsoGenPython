package com.google.android.gms.internal.ads;

import e6.s;
import e6.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzebe implements zzbob {
    @Override // com.google.android.gms.internal.ads.zzbob
    public final JSONObject zzb(Object obj) throws JSONException {
        zzebf zzebfVar = (zzebf) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziS)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzebfVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzebfVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzebfVar.zzd.zzd());
        jSONObject2.put("signals", zzebfVar.zzc);
        jSONObject3.put("body", zzebfVar.zzb.zzc);
        jSONObject3.put("headers", s.f3427f.f3428a.i(zzebfVar.zzb.zzb));
        jSONObject3.put("response_code", zzebfVar.zzb.zza);
        jSONObject3.put("latency", zzebfVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzebfVar.zzd.zzi());
        return jSONObject;
    }
}

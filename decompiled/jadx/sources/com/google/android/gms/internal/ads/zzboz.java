package com.google.android.gms.internal.ads;

import d6.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzboz {
    public final List zza;
    public final String zzb;
    public final String zzc;

    public zzboz(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        p pVar = p.C;
        zzbpb zzbpbVar = pVar.f2995v;
        zzbpb.zza(jSONObject, "clickurl");
        zzbpb zzbpbVar2 = pVar.f2995v;
        zzbpb.zza(jSONObject, "imp_urls");
        zzbpb zzbpbVar3 = pVar.f2995v;
        zzbpb.zza(jSONObject, "downloaded_imp_urls");
        zzbpb zzbpbVar4 = pVar.f2995v;
        zzbpb.zza(jSONObject, "fill_urls");
        zzbpb zzbpbVar5 = pVar.f2995v;
        zzbpb.zza(jSONObject, "video_start_urls");
        zzbpb zzbpbVar6 = pVar.f2995v;
        zzbpb.zza(jSONObject, "video_complete_urls");
        zzbpb zzbpbVar7 = pVar.f2995v;
        zzbpb.zza(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzbpb zzbpbVar8 = pVar.f2995v;
            zzbpb.zza(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.zzb = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        zzbpb zzbpbVar9 = pVar.f2995v;
        zzbpb.zza(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}

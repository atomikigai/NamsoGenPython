package com.google.android.gms.internal.ads;

import d6.p;
import h6.k0;
import i6.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbpa {
    public final List zza;

    public zzbpa(JSONObject jSONObject) throws JSONException {
        if (h.j(2)) {
            k0.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                zzboz zzbozVar = new zzboz(jSONArray.getJSONObject(i10));
                "banner".equalsIgnoreCase(zzbozVar.zzc);
                arrayList.add(zzbozVar);
                if (i < 0) {
                    Iterator it = zzbozVar.zza.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i = i10;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            p pVar = p.C;
            zzbpb zzbpbVar = pVar.f2995v;
            zzbpb.zza(jSONObjectOptJSONObject, "click_urls");
            zzbpb zzbpbVar2 = pVar.f2995v;
            zzbpb.zza(jSONObjectOptJSONObject, "imp_urls");
            zzbpb zzbpbVar3 = pVar.f2995v;
            zzbpb.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
            zzbpb zzbpbVar4 = pVar.f2995v;
            zzbpb.zza(jSONObjectOptJSONObject, "nofill_urls");
            zzbpb zzbpbVar5 = pVar.f2995v;
            zzbpb.zza(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            zzbwv.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}

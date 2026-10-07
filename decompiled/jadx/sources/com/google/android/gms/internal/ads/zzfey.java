package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfey {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfey(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectO = b.O(jsonReader);
        this.zzd = jSONObjectO;
        this.zza = jSONObjectO.optString("ad_html", null);
        this.zzb = jSONObjectO.optString("ad_base_url", null);
        this.zzc = jSONObjectO.optJSONObject("ad_json");
    }
}

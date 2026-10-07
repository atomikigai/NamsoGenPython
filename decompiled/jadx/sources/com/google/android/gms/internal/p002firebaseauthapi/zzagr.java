package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import n7.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagr implements zzaek {
    private static final String zza = "zzagr";
    private zzagt zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        zzagt zzagtVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("users")) {
                this.zzb = new zzagt();
                return this;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                zzagtVar = new zzagt(new ArrayList());
            } else {
                ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                boolean z4 = false;
                int i = 0;
                while (i < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    arrayList.add(jSONObject2 == null ? new zzags() : new zzags(g.a(jSONObject2.optString("localId", null)), g.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z4), g.a(jSONObject2.optString("displayName", null)), g.a(jSONObject2.optString("photoUrl", null)), zzahh.zza(jSONObject2.optJSONArray("providerUserInfo")), g.a(jSONObject2.optString("rawPassword", null)), g.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzahf.zzg(jSONObject2.optJSONArray("mfaInfo"))));
                    i++;
                    z4 = false;
                }
                zzagtVar = new zzagt(arrayList);
            }
            this.zzb = zzagtVar;
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzain.zza(e, zza, str);
        } catch (JSONException e4) {
            e = e4;
            throw zzain.zza(e, zza, str);
        }
    }

    public final List zzb() {
        return this.zzb.zza();
    }
}

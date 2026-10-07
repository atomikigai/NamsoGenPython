package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahh {
    private final List zza;

    public zzahh() {
        this.zza = new ArrayList();
    }

    public static zzahh zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzahh(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(jSONObject == null ? new zzahg() : new zzahg(g.a(jSONObject.optString("federatedId", null)), g.a(jSONObject.optString("displayName", null)), g.a(jSONObject.optString("photoUrl", null)), g.a(jSONObject.optString("providerId", null)), null, g.a(jSONObject.optString("phoneNumber", null)), g.a(jSONObject.optString("email", null))));
        }
        return new zzahh(arrayList);
    }

    public static zzahh zzb(zzahh zzahhVar) {
        zzahh zzahhVar2 = new zzahh();
        List list = zzahhVar.zza;
        if (list != null) {
            zzahhVar2.zza.addAll(list);
        }
        return zzahhVar2;
    }

    public final List zzc() {
        return this.zza;
    }

    public zzahh(List list) {
        if (list.isEmpty()) {
            this.zza = Collections.EMPTY_LIST;
        } else {
            this.zza = Collections.unmodifiableList(list);
        }
    }
}

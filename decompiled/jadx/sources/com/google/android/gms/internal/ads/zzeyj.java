package com.google.android.gms.internal.ads;

import h6.k0;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeyj implements zzevy {
    private final String zza;
    private final String zzb;

    public zzeyj(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject jSONObjectN = b.N((JSONObject) obj, "pii");
            jSONObjectN.put("doritos", this.zza);
            jSONObjectN.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            k0.k("Failed putting doritos string.");
        }
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import h6.k0;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzexx implements zzevy {
    final String zza;
    final int zzb;

    public zzexx(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject jSONObjectN = b.N(jSONObject, "pii");
            jSONObjectN.put("pvid", this.zza);
            jSONObjectN.put("pvid_s", this.zzb);
        } catch (JSONException e) {
            k0.l("Failed putting gms core app set ID info.", e);
        }
    }
}

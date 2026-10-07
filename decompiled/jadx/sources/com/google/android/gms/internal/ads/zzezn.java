package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import i6.h;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzezn implements zzevy {
    private final String zza;

    public zzezn(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            b.N(jSONObject, "pii").put("adsid", this.zza);
        } catch (JSONException e) {
            h.h("Failed putting trustless token.", e);
        }
    }
}

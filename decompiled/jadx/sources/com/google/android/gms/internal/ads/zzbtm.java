package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbtm {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbtm(boolean z4, String str, boolean z10) {
        this.zza = z4;
        this.zzb = str;
        this.zzc = z10;
    }

    public static zzbtm zza(JSONObject jSONObject) {
        return new zzbtm(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}

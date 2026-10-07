package com.google.android.gms.internal.ads;

import da.v;
import e6.t;
import i6.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdtp {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdtp(String str, zzdtq zzdtqVar) {
        this.zzb = str;
    }

    public static String zza(zzdtp zzdtpVar) {
        String str = (String) t.f3437d.f3440c.zza(zzbcn.zzjF);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtpVar.zza);
            jSONObject.put("eventCategory", zzdtpVar.zzb);
            jSONObject.putOpt("event", zzdtpVar.zzc);
            jSONObject.putOpt("errorCode", zzdtpVar.zzd);
            jSONObject.putOpt("rewardType", zzdtpVar.zze);
            jSONObject.putOpt("rewardAmount", zzdtpVar.zzf);
        } catch (JSONException unused) {
            h.g("Could not convert parameters to JSON.");
        }
        return v.v(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}

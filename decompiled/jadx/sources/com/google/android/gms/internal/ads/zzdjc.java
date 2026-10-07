package com.google.android.gms.internal.ads;

import e6.t;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdjc extends zzdjd {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdjc(zzfet zzfetVar, JSONObject jSONObject) {
        super(zzfetVar);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectS = b.S(jSONObject, strArr);
        this.zzb = jSONObjectS == null ? null : jSONObjectS.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectS2 = b.S(jSONObject, strArr2);
        this.zzc = jSONObjectS2 == null ? false : jSONObjectS2.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectS3 = b.S(jSONObject, strArr3);
        this.zzd = jSONObjectS3 == null ? false : jSONObjectS3.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectS4 = b.S(jSONObject, strArr4);
        this.zze = jSONObjectS4 == null ? false : jSONObjectS4.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectS5 = b.S(jSONObject, strArr5);
        this.zzg = jSONObjectS5 != null ? jSONObjectS5.optString(strArr5[0], "") : "";
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfi)).booleanValue()) {
            this.zzh = jSONObject.optJSONObject("omid_settings");
        } else {
            this.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final zzffr zza() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzffr(jSONObject) : this.zza.zzV;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final boolean zzg() {
        return this.zzf;
    }
}

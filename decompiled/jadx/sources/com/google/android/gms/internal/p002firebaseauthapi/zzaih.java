package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaih implements zzaej {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzaih(String str, String str2, String str3, String str4) {
        i0.e(str);
        this.zza = str;
        i0.e(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put("password", this.zzb);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzain.zzd(jSONObject, "captchaResponse", str2);
        } else {
            zzain.zzc(jSONObject);
        }
        return jSONObject.toString();
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahp implements zzaej {
    private String zza;
    private String zzb;
    private final String zzc;
    private String zzd;

    public zzahp(String str) {
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            zzain.zzd(jSONObject, "captchaResponse", str4);
        } else {
            zzain.zzc(jSONObject);
        }
        return jSONObject.toString();
    }

    public zzahp(String str, String str2, String str3, String str4, String str5) {
        i0.e(str);
        this.zza = str;
        i0.e(str2);
        this.zzb = str2;
        this.zzc = str4;
        this.zzd = str5;
    }
}

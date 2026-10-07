package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import j7.a;
import org.json.JSONException;
import org.json.JSONObject;
import v9.c;
import v9.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzage implements zzaej {
    private static final String zza = "zzage";
    private static final a zzb = new a(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzage(e eVar, String str, String str2) {
        String str3 = eVar.f9235a;
        i0.e(str3);
        this.zzc = str3;
        String str4 = eVar.f9237c;
        i0.e(str4);
        this.zzd = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        c cVar;
        String str = this.zzd;
        zzap zzapVar = c.f9227d;
        i0.e(str);
        try {
            cVar = new c(str);
        } catch (IllegalArgumentException unused) {
            cVar = null;
        }
        String str2 = cVar != null ? cVar.f9228a : null;
        String str3 = cVar != null ? cVar.f9230c : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzain.zzd(jSONObject, "captchaResp", str5);
        } else {
            zzain.zzc(jSONObject);
        }
        return jSONObject.toString();
    }
}

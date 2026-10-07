package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaij implements zzaej {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaij() {
    }

    public static zzaij zzb(String str, String str2, boolean z4) {
        zzaij zzaijVar = new zzaij();
        i0.e(str);
        zzaijVar.zzb = str;
        i0.e(str2);
        zzaijVar.zzc = str2;
        zzaijVar.zzf = z4;
        return zzaijVar;
    }

    public static zzaij zzc(String str, String str2, boolean z4) {
        zzaij zzaijVar = new zzaij();
        i0.e(str);
        zzaijVar.zza = str;
        i0.e(str2);
        zzaijVar.zzd = str2;
        zzaijVar.zzf = z4;
        return zzaijVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        } else {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zzd(String str) {
        this.zze = str;
    }
}

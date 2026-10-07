package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahw extends zzahs {
    private static final String zza = "zzahw";
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahs, com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        zzd(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahs
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ zzahs zza(String str) throws zzaca {
        zzd(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahs
    public final String zzc() {
        return this.zzb;
    }

    public final zzahw zzd(String str) throws zzaca {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            this.zzb = zzac.zza(jSONObjectOptJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzain.zza(e, zza, str);
        }
    }
}

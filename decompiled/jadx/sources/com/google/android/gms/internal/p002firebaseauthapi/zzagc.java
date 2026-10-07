package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagc implements zzaek {
    private static final String zza = "zzagc";
    private String zzb;
    private String zzc;
    private zzahz zzd = new zzahz(null);
    private List zze;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", null);
            jSONObject.optBoolean("registered", false);
            this.zzc = jSONObject.optString("providerId", null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                this.zzd = new zzahz(1, zzain.zzb(jSONObject.optJSONArray("allProviders")));
            } else {
                this.zzd = new zzahz(null);
            }
            this.zze = zzain.zzb(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzain.zza(e, zza, str);
        } catch (JSONException e4) {
            e = e4;
            throw zzain.zza(e, zza, str);
        }
    }

    public final List zzb() {
        return this.zze;
    }
}

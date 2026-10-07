package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import n7.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaho implements zzaek {
    private static final String zza = "zzaho";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzahh zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = g.a(jSONObject.optString("email", null));
            this.zzc = g.a(jSONObject.optString("passwordHash", null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = g.a(jSONObject.optString("displayName", null));
            this.zzf = g.a(jSONObject.optString("photoUrl", null));
            this.zzg = zzahh.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = g.a(jSONObject.optString("idToken", null));
            this.zzi = g.a(jSONObject.optString("refreshToken", null));
            this.zzj = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzain.zza(e, zza, str);
        }
    }

    public final long zzb() {
        return this.zzj;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzi;
    }

    public final List zzf() {
        zzahh zzahhVar = this.zzg;
        if (zzahhVar != null) {
            return zzahhVar.zzc();
        }
        return null;
    }
}

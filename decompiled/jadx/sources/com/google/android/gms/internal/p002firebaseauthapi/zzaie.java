package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import java.util.List;
import n7.g;
import org.json.JSONException;
import org.json.JSONObject;
import v9.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaie implements zzaek {
    private static final String zza = "zzaie";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private boolean zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private List zzs;
    private String zzt;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = g.a(jSONObject.optString("idToken", null));
            this.zzd = g.a(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            this.zzf = g.a(jSONObject.optString("localId", null));
            this.zzg = g.a(jSONObject.optString("email", null));
            this.zzh = g.a(jSONObject.optString("displayName", null));
            this.zzi = g.a(jSONObject.optString("photoUrl", null));
            this.zzj = g.a(jSONObject.optString("providerId", null));
            this.zzk = g.a(jSONObject.optString("rawUserInfo", null));
            this.zzl = jSONObject.optBoolean("isNewUser", false);
            this.zzm = jSONObject.optString("oauthAccessToken", null);
            this.zzn = jSONObject.optString("oauthIdToken", null);
            this.zzp = g.a(jSONObject.optString("errorMessage", null));
            this.zzq = g.a(jSONObject.optString("pendingToken", null));
            this.zzr = g.a(jSONObject.optString("tenantId", null));
            this.zzs = zzahf.zzg(jSONObject.optJSONArray("mfaInfo"));
            this.zzt = g.a(jSONObject.optString("mfaPendingCredential", null));
            this.zzo = g.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzain.zza(e, zza, str);
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final h0 zzc() {
        if (TextUtils.isEmpty(this.zzm) && TextUtils.isEmpty(this.zzn)) {
            return null;
        }
        String str = this.zzj;
        String str2 = this.zzn;
        String str3 = this.zzm;
        String str4 = this.zzq;
        String str5 = this.zzo;
        i0.f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new h0(str, str2, str3, null, str4, str5, null);
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzt;
    }

    public final String zzh() {
        return this.zzj;
    }

    public final String zzi() {
        return this.zzk;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzr;
    }

    public final List zzl() {
        return this.zzs;
    }

    public final boolean zzm() {
        return !TextUtils.isEmpty(this.zzt);
    }

    public final boolean zzn() {
        return this.zzb;
    }

    public final boolean zzo() {
        return this.zzl;
    }

    public final boolean zzp() {
        return this.zzb || !TextUtils.isEmpty(this.zzp);
    }
}

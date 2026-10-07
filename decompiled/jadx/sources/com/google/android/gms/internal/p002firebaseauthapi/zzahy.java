package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahy extends zzahs {
    private static final String zza = "zzahy";
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahs, com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        zzg(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahs
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ zzahs zza(String str) throws zzaca {
        zzg(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahs
    public final String zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final int zze() {
        return this.zzd;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final zzahy zzg(String str) throws zzaca {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (jSONObjectOptJSONObject != null) {
                this.zzc = zzac.zza(jSONObjectOptJSONObject.optString("sharedSecretKey"));
                this.zzd = jSONObjectOptJSONObject.optInt("verificationCodeLength");
                this.zze = zzac.zza(jSONObjectOptJSONObject.optString("hashingAlgorithm"));
                this.zzf = jSONObjectOptJSONObject.optInt("periodSec");
                this.zzb = zzac.zza(jSONObjectOptJSONObject.optString("sessionInfo"));
                String strOptString = jSONObjectOptJSONObject.optString("finalizeEnrollmentTime");
                try {
                    zzamt zzamtVarZzb = zzano.zzb(strOptString);
                    zzano.zza(zzamtVarZzb);
                    this.zzg = zzamtVarZzb.zzb();
                    return this;
                } catch (ParseException unused) {
                    Log.e(zza, "Failed to parse timestamp: " + strOptString);
                }
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzain.zza(e, zza, str);
        }
    }

    public final String zzh() {
        return this.zze;
    }

    public final String zzi() {
        return this.zzc;
    }
}

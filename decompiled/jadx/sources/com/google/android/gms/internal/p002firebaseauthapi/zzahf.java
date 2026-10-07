package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahf {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzaia zze;
    private String zzf;

    public zzahf(String str, String str2, String str3, long j4, zzaia zzaiaVar) {
        if (!TextUtils.isEmpty(str) && zzaiaVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        i0.e(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j4;
        this.zze = zzaiaVar;
    }

    public static zzahf zzb(JSONObject jSONObject) {
        zzahf zzahfVar = new zzahf(jSONObject.optString("phoneInfo", null), jSONObject.optString("mfaEnrollmentId", null), jSONObject.optString("displayName", null), zzh(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzaia() : null);
        zzahfVar.zzf = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahfVar;
    }

    public static List zzg(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(zzb(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    private static long zzh(String str) {
        try {
            zzamt zzamtVarZzb = zzano.zzb(str);
            zzano.zza(zzamtVarZzb);
            return zzamtVarZzb.zzb();
        } catch (ParseException e) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e);
            return 0L;
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzaia zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import n7.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahk implements zzaek {
    private static final String zza = "zzahk";
    private String zzb;
    private String zzc;
    private String zzd;
    private zzahf zze;

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = g.a(jSONObject.optString("email"));
            this.zzc = g.a(jSONObject.optString("newEmail"));
            int iOptInt = jSONObject.optInt("reqType");
            String str3 = null;
            if (iOptInt != 1) {
                switch (iOptInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.zzd = str2;
            if (TextUtils.isEmpty(str2)) {
                String strOptString = jSONObject.optString("requestType");
                switch (strOptString.hashCode()) {
                    case -1874510116:
                        if (strOptString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            str3 = strOptString;
                        }
                        break;
                    case -1452371317:
                        if (strOptString.equals("PASSWORD_RESET")) {
                            str3 = strOptString;
                        }
                        break;
                    case -1341836234:
                        if (strOptString.equals("VERIFY_EMAIL")) {
                            str3 = strOptString;
                        }
                        break;
                    case -1099157829:
                        if (strOptString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            str3 = strOptString;
                        }
                        break;
                    case 870738373:
                        if (strOptString.equals("EMAIL_SIGNIN")) {
                            str3 = strOptString;
                        }
                        break;
                    case 970484929:
                        if (strOptString.equals("RECOVER_EMAIL")) {
                            str3 = strOptString;
                        }
                        break;
                }
                this.zzd = str3;
            }
            if (jSONObject.has("mfaInfo")) {
                this.zze = zzahf.zzb(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzain.zza(e, zza, str);
        } catch (JSONException e4) {
            e = e4;
            throw zzain.zza(e, zza, str);
        }
    }

    public final zzahf zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zzb != null;
    }

    public final boolean zzg() {
        return this.zze != null;
    }

    public final boolean zzh() {
        return this.zzc != null;
    }

    public final boolean zzi() {
        return this.zzd != null;
    }
}

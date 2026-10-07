package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import org.json.JSONException;
import org.json.JSONObject;
import v9.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagu implements zzaej {
    private final String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private b zze;
    private String zzf;
    private String zzg;

    public zzagu(int i) {
        this.zza = i != 1 ? i != 4 ? i != 6 ? i != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public static zzagu zzc(b bVar, String str, String str2) {
        i0.e(str);
        i0.e(str2);
        i0.i(bVar);
        return new zzagu(7, bVar, null, str2, str, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        switch (this.zza) {
            case "PASSWORD_RESET":
                i = 1;
                break;
            case "VERIFY_EMAIL":
                i = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i = 7;
                break;
            case "EMAIL_SIGNIN":
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        jSONObject.put("requestType", i);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("newEmail", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        b bVar = this.zze;
        if (bVar != null) {
            jSONObject.put("androidInstallApp", bVar.e);
            jSONObject.put("canHandleCodeInApp", this.zze.f9221r);
            String str4 = this.zze.f9216a;
            if (str4 != null) {
                jSONObject.put("continueUrl", str4);
            }
            String str5 = this.zze.f9217b;
            if (str5 != null) {
                jSONObject.put("iosBundleId", str5);
            }
            String str6 = this.zze.f9218c;
            if (str6 != null) {
                jSONObject.put("iosAppStoreId", str6);
            }
            String str7 = this.zze.f9219d;
            if (str7 != null) {
                jSONObject.put("androidPackageName", str7);
            }
            String str8 = this.zze.f9220f;
            if (str8 != null) {
                jSONObject.put("androidMinimumVersion", str8);
            }
            String str9 = this.zze.f9224u;
            if (str9 != null) {
                jSONObject.put("dynamicLinkDomain", str9);
            }
        }
        String str10 = this.zzf;
        if (str10 != null) {
            jSONObject.put("tenantId", str10);
        }
        String str11 = this.zzg;
        if (str11 != null) {
            zzain.zzd(jSONObject, "captchaResp", str11);
        } else {
            zzain.zzc(jSONObject);
        }
        return jSONObject.toString();
    }

    public final b zzb() {
        return this.zze;
    }

    public final zzagu zzd(b bVar) {
        i0.i(bVar);
        this.zze = bVar;
        return this;
    }

    public final zzagu zze(String str) {
        this.zzg = str;
        return this;
    }

    public final zzagu zzf(String str) {
        i0.e(str);
        this.zzb = str;
        return this;
    }

    public final zzagu zzg(String str) {
        this.zzf = str;
        return this;
    }

    public final zzagu zzh(String str) {
        i0.e(str);
        this.zzd = str;
        return this;
    }

    private zzagu(int i, b bVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = "VERIFY_AND_CHANGE_EMAIL";
        i0.i(bVar);
        this.zze = bVar;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }
}

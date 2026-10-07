package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.i0;
import h7.a;
import org.json.JSONException;
import org.json.JSONObject;
import w9.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaic extends a implements zzaej {
    public static final Parcelable.Creator<zzaic> CREATOR = new zzaid();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzaic() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.K(parcel, 2, this.zza, false);
        d.K(parcel, 3, this.zzb, false);
        d.K(parcel, 4, this.zzc, false);
        d.K(parcel, 5, this.zzd, false);
        d.K(parcel, 6, this.zze, false);
        d.K(parcel, 7, this.zzf, false);
        d.K(parcel, 8, this.zzg, false);
        d.K(parcel, 9, this.zzh, false);
        boolean z4 = this.zzi;
        d.R(parcel, 10, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.zzj;
        d.R(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d.K(parcel, 12, this.zzk, false);
        d.K(parcel, 13, this.zzl, false);
        d.K(parcel, 14, this.zzm, false);
        d.K(parcel, 15, this.zzn, false);
        boolean z11 = this.zzo;
        d.R(parcel, 16, 4);
        parcel.writeInt(z11 ? 1 : 0);
        d.K(parcel, 17, this.zzp, false);
        d.Q(iP, parcel);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (TextUtils.isEmpty(this.zzm)) {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        } else {
            jSONObject.put("requestUri", this.zzm);
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public final zzaic zzb(boolean z4) {
        this.zzj = false;
        return this;
    }

    public final zzaic zzc(String str) {
        i0.e(str);
        this.zzb = str;
        return this;
    }

    public final zzaic zzd(boolean z4) {
        this.zzo = true;
        return this;
    }

    public final zzaic zze(boolean z4) {
        this.zzi = true;
        return this;
    }

    public final zzaic zzf(String str) {
        this.zzn = str;
        return this;
    }

    public zzaic(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        i0.e(str3);
        this.zze = str3;
        this.zzf = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb2.append("id_token=");
            sb2.append(this.zzc);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb2.append("access_token=");
            sb2.append(this.zzd);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb2.append("identifier=");
            sb2.append(this.zzf);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb2.append("oauth_token_secret=");
            sb2.append(this.zzh);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb2.append("code=");
            sb2.append(this.zzk);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb2.append("nonce=");
            sb2.append(str9);
            sb2.append("&");
        }
        sb2.append("providerId=");
        sb2.append(this.zze);
        this.zzg = sb2.toString();
        this.zzj = true;
    }

    public zzaic(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z4, boolean z10, String str9, String str10, String str11, String str12, boolean z11, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z4;
        this.zzj = z10;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z11;
        this.zzp = str13;
    }

    public zzaic(x xVar, String str) {
        i0.i(xVar);
        String str2 = xVar.f9865a;
        i0.e(str2);
        this.zzl = str2;
        i0.e(str);
        this.zzm = str;
        String str3 = xVar.f9867c;
        i0.e(str3);
        this.zze = str3;
        this.zzi = true;
        this.zzg = "providerId=".concat(str3);
    }
}

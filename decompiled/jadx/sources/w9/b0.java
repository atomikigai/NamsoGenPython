package w9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzahg;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends h7.a implements v9.c0 {
    public static final Parcelable.Creator<b0> CREATOR = new b(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9809d;
    public Uri e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9810f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f9811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9813t;

    public b0(zzags zzagsVar) {
        i0.e("firebase");
        String strZzo = zzagsVar.zzo();
        i0.e(strZzo);
        this.f9806a = strZzo;
        this.f9807b = "firebase";
        this.f9810f = zzagsVar.zzn();
        this.f9808c = zzagsVar.zzm();
        Uri uriZzc = zzagsVar.zzc();
        if (uriZzc != null) {
            this.f9809d = uriZzc.toString();
            this.e = uriZzc;
        }
        this.f9812s = zzagsVar.zzs();
        this.f9813t = null;
        this.f9811r = zzagsVar.zzp();
    }

    @Override // v9.c0
    public final String d() {
        return this.f9807b;
    }

    public final String g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f9806a);
            jSONObject.putOpt("providerId", this.f9807b);
            jSONObject.putOpt("displayName", this.f9808c);
            jSONObject.putOpt("photoUrl", this.f9809d);
            jSONObject.putOpt("email", this.f9810f);
            jSONObject.putOpt("phoneNumber", this.f9811r);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f9812s));
            jSONObject.putOpt("rawUserInfo", this.f9813t);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzzr(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9806a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9807b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9808c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9809d, false);
        com.bumptech.glide.d.K(parcel, 5, this.f9810f, false);
        com.bumptech.glide.d.K(parcel, 6, this.f9811r, false);
        com.bumptech.glide.d.R(parcel, 7, 4);
        parcel.writeInt(this.f9812s ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 8, this.f9813t, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public b0(zzahg zzahgVar) {
        i0.i(zzahgVar);
        this.f9806a = zzahgVar.zzd();
        String strZzf = zzahgVar.zzf();
        i0.e(strZzf);
        this.f9807b = strZzf;
        this.f9808c = zzahgVar.zzb();
        Uri uriZza = zzahgVar.zza();
        if (uriZza != null) {
            this.f9809d = uriZza.toString();
            this.e = uriZza;
        }
        this.f9810f = zzahgVar.zzc();
        this.f9811r = zzahgVar.zze();
        this.f9812s = false;
        this.f9813t = zzahgVar.zzg();
    }

    public b0(String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7) {
        this.f9806a = str;
        this.f9807b = str2;
        this.f9810f = str3;
        this.f9811r = str4;
        this.f9808c = str5;
        this.f9809d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.e = Uri.parse(str6);
        }
        this.f9812s = z4;
        this.f9813t = str7;
    }
}

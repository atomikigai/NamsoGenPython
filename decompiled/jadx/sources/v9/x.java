package v9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends s {
    public static final Parcelable.Creator<x> CREATOR = new v7.i(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9284d;

    public x(long j4, String str, String str2, String str3) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f9281a = str;
        this.f9282b = str2;
        this.f9283c = j4;
        com.google.android.gms.common.internal.i0.e(str3);
        this.f9284d = str3;
    }

    @Override // v9.s
    public final String g() {
        return "phone";
    }

    @Override // v9.s
    public final JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f9281a);
            jSONObject.putOpt("displayName", this.f9282b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f9283c));
            jSONObject.putOpt("phoneNumber", this.f9284d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzr(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9281a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9282b, false);
        com.bumptech.glide.d.R(parcel, 3, 8);
        parcel.writeLong(this.f9283c);
        com.bumptech.glide.d.K(parcel, 4, this.f9284d, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

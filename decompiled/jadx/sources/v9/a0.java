package v9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends s {
    public static final Parcelable.Creator<a0> CREATOR = new v7.i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzaia f9215d;

    public a0(String str, String str2, long j4, zzaia zzaiaVar) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f9212a = str;
        this.f9213b = str2;
        this.f9214c = j4;
        com.google.android.gms.common.internal.i0.j(zzaiaVar, "totpInfo cannot be null.");
        this.f9215d = zzaiaVar;
    }

    @Override // v9.s
    public final String g() {
        return "totp";
    }

    @Override // v9.s
    public final JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f9212a);
            jSONObject.putOpt("displayName", this.f9213b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f9214c));
            jSONObject.putOpt("totpInfo", this.f9215d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzr(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9212a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9213b, false);
        com.bumptech.glide.d.R(parcel, 3, 8);
        parcel.writeLong(this.f9214c);
        com.bumptech.glide.d.J(parcel, 4, this.f9215d, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import d7.e;
import h7.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2009d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f2010f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f2011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f2012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f2014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f2016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashSet f2017x = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2006a = i;
        this.f2007b = str;
        this.f2008c = str2;
        this.f2009d = str3;
        this.e = str4;
        this.f2010f = uri;
        this.f2011r = str5;
        this.f2012s = j4;
        this.f2013t = str6;
        this.f2014u = arrayList;
        this.f2015v = str7;
        this.f2016w = str8;
    }

    public static GoogleSignInAccount g(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j4 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        i0.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j4, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f2011r = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f2013t.equals(this.f2013t)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f2014u);
        hashSet.addAll(googleSignInAccount.f2017x);
        HashSet hashSet2 = new HashSet(this.f2014u);
        hashSet2.addAll(this.f2017x);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f2013t.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2014u);
        hashSet.addAll(this.f2017x);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(this.f2006a);
        d.K(parcel, 2, this.f2007b, false);
        d.K(parcel, 3, this.f2008c, false);
        d.K(parcel, 4, this.f2009d, false);
        d.K(parcel, 5, this.e, false);
        d.J(parcel, 6, this.f2010f, i, false);
        d.K(parcel, 7, this.f2011r, false);
        d.R(parcel, 8, 8);
        parcel.writeLong(this.f2012s);
        d.K(parcel, 9, this.f2013t, false);
        d.O(parcel, 10, this.f2014u, false);
        d.K(parcel, 11, this.f2015v, false);
        d.K(parcel, 12, this.f2016w, false);
        d.Q(iP, parcel);
    }
}

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d7.d;
import h7.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends a implements e, ReflectedParcelable {
    public static final d A;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final GoogleSignInOptions f2018v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Scope f2019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Scope f2020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Scope f2021y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Scope f2022z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f2025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2026d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2027f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f2029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f2030t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f2031u;

    static {
        Scope scope = new Scope(1, "profile");
        f2019w = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f2020x = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f2021y = scope3;
        f2022z = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f2022z)) {
            Scope scope4 = f2021y;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f2018v = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f2022z)) {
            Scope scope5 = f2021y;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new d7.e(1);
        A = new d(1);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z4, boolean z10, boolean z11, String str, String str2, HashMap map, String str3) {
        this.f2023a = i;
        this.f2024b = arrayList;
        this.f2025c = account;
        this.f2026d = z4;
        this.e = z10;
        this.f2027f = z11;
        this.f2028r = str;
        this.f2029s = str2;
        this.f2030t = new ArrayList(map.values());
        this.f2031u = str3;
    }

    public static GoogleSignInOptions g(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap h(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e7.a aVar = (e7.a) obj;
                map.put(Integer.valueOf(aVar.f3466b), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f2028r;
        ArrayList arrayList = this.f2024b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f2024b;
            String str2 = googleSignInOptions.f2028r;
            Account account = googleSignInOptions.f2025c;
            if (this.f2030t.isEmpty() && googleSignInOptions.f2030t.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f2025c;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                return this.f2027f == googleSignInOptions.f2027f && this.f2026d == googleSignInOptions.f2026d && this.e == googleSignInOptions.e && TextUtils.equals(this.f2031u, googleSignInOptions.f2031u);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f2024b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).f2040b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f2025c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f2028r;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f2027f ? 1 : 0)) * 31) + (this.f2026d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        String str2 = this.f2031u;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2023a);
        com.bumptech.glide.d.O(parcel, 2, new ArrayList(this.f2024b), false);
        com.bumptech.glide.d.J(parcel, 3, this.f2025c, i, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f2026d ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeInt(this.f2027f ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 7, this.f2028r, false);
        com.bumptech.glide.d.K(parcel, 8, this.f2029s, false);
        com.bumptech.glide.d.O(parcel, 9, this.f2030t, false);
        com.bumptech.glide.d.K(parcel, 10, this.f2031u, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

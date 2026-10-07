package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import h7.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class Credential extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new c1(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f1983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1984d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1985f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f1986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1987s;

    public Credential(String str, String str2, Uri uri, ArrayList arrayList, String str3, String str4, String str5, String str6) {
        Boolean boolValueOf;
        i0.j(str, "credential identifier cannot be null");
        String strTrim = str.trim();
        i0.f(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                boolValueOf = Boolean.FALSE;
            } else {
                Uri uri2 = Uri.parse(str4);
                if (!uri2.isAbsolute() || !uri2.isHierarchical() || TextUtils.isEmpty(uri2.getScheme()) || TextUtils.isEmpty(uri2.getAuthority())) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    boolean z4 = true;
                    if (!ProxyConfig.MATCH_HTTP.equalsIgnoreCase(uri2.getScheme()) && !ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(uri2.getScheme())) {
                        z4 = false;
                    }
                    boolValueOf = Boolean.valueOf(z4);
                }
            }
            if (!boolValueOf.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f1982b = str2;
        this.f1983c = uri;
        this.f1984d = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f1981a = strTrim;
        this.e = str3;
        this.f1985f = str4;
        this.f1986r = str5;
        this.f1987s = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f1981a, credential.f1981a) && TextUtils.equals(this.f1982b, credential.f1982b) && i0.m(this.f1983c, credential.f1983c) && TextUtils.equals(this.e, credential.e) && TextUtils.equals(this.f1985f, credential.f1985f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1981a, this.f1982b, this.f1983c, this.e, this.f1985f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, this.f1981a, false);
        d.K(parcel, 2, this.f1982b, false);
        d.J(parcel, 3, this.f1983c, i, false);
        d.O(parcel, 4, this.f1984d, false);
        d.K(parcel, 5, this.e, false);
        d.K(parcel, 6, this.f1985f, false);
        d.K(parcel, 9, this.f1986r, false);
        d.K(parcel, 10, this.f1987s, false);
        d.Q(iP, parcel);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import u7.v0;
import v7.c;
import v7.g;
import v7.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new v0(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f2286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f2287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2288d;
    public final List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f2289f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2290r;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, ArrayList arrayList, ArrayList arrayList2, c cVar, String str) {
        this.f2285a = num;
        this.f2286b = d10;
        this.f2287c = uri;
        i0.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f2288d = arrayList;
        this.e = arrayList2;
        this.f2289f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g gVar = (g) obj;
            i0.a("register request has null appId and no request appId is provided", (uri == null && gVar.f9202d == null) ? false : true);
            String str2 = gVar.f9202d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            h hVar = (h) obj2;
            i0.a("registered key has null appId and no request appId is provided", (uri == null && hVar.f9204b == null) ? false : true);
            String str3 = hVar.f9204b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        i0.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f2290r = str;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.e;
        return i0.m(this.f2285a, registerRequestParams.f2285a) && i0.m(this.f2286b, registerRequestParams.f2286b) && i0.m(this.f2287c, registerRequestParams.f2287c) && i0.m(this.f2288d, registerRequestParams.f2288d) && (((list = this.e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && i0.m(this.f2289f, registerRequestParams.f2289f) && i0.m(this.f2290r, registerRequestParams.f2290r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2285a, this.f2287c, this.f2286b, this.f2288d, this.e, this.f2289f, this.f2290r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.H(parcel, 2, this.f2285a);
        d.E(parcel, 3, this.f2286b);
        d.J(parcel, 4, this.f2287c, i, false);
        d.O(parcel, 5, this.f2288d, false);
        d.O(parcel, 6, this.e, false);
        d.J(parcel, 7, this.f2289f, i, false);
        d.K(parcel, 8, this.f2290r, false);
        d.Q(iP, parcel);
    }
}

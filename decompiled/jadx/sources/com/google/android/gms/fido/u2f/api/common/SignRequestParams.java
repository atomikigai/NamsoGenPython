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
import v7.c;
import v7.h;
import v7.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f2292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f2293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2294d;
    public final List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f2295f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2296r;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, ArrayList arrayList, c cVar, String str) {
        this.f2291a = num;
        this.f2292b = d10;
        this.f2293c = uri;
        this.f2294d = bArr;
        i0.a("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.e = arrayList;
        this.f2295f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h hVar = (h) obj;
            i0.a("registered key has null appId and no request appId is provided", (hVar.f9204b == null && uri == null) ? false : true);
            String str2 = hVar.f9204b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        i0.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f2296r = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.e;
        if (i0.m(this.f2291a, signRequestParams.f2291a) && i0.m(this.f2292b, signRequestParams.f2292b) && i0.m(this.f2293c, signRequestParams.f2293c) && Arrays.equals(this.f2294d, signRequestParams.f2294d)) {
            List list2 = this.e;
            if (list2.containsAll(list) && list.containsAll(list2) && i0.m(this.f2295f, signRequestParams.f2295f) && i0.m(this.f2296r, signRequestParams.f2296r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2291a, this.f2293c, this.f2292b, this.e, this.f2295f, this.f2296r, Integer.valueOf(Arrays.hashCode(this.f2294d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.H(parcel, 2, this.f2291a);
        d.E(parcel, 3, this.f2292b);
        d.J(parcel, 4, this.f2293c, i, false);
        d.D(parcel, 5, this.f2294d, false);
        d.O(parcel, 6, this.e, false);
        d.J(parcel, 7, this.f2295f, i, false);
        d.K(parcel, 8, this.f2296r, false);
        d.Q(iP, parcel);
    }
}

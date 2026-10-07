package com.google.android.gms.auth.api.identity;

import a7.n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import h7.a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new n(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f2001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2004d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2005f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i) {
        this.f2001a = pendingIntent;
        this.f2002b = str;
        this.f2003c = str2;
        this.f2004d = list;
        this.e = str3;
        this.f2005f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = saveAccountLinkingTokenRequest.f2004d;
        List list2 = this.f2004d;
        return list2.size() == list.size() && list2.containsAll(list) && i0.m(this.f2001a, saveAccountLinkingTokenRequest.f2001a) && i0.m(this.f2002b, saveAccountLinkingTokenRequest.f2002b) && i0.m(this.f2003c, saveAccountLinkingTokenRequest.f2003c) && i0.m(this.e, saveAccountLinkingTokenRequest.e) && this.f2005f == saveAccountLinkingTokenRequest.f2005f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2001a, this.f2002b, this.f2003c, this.f2004d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.J(parcel, 1, this.f2001a, i, false);
        d.K(parcel, 2, this.f2002b, false);
        d.K(parcel, 3, this.f2003c, false);
        d.M(parcel, 4, this.f2004d);
        d.K(parcel, 5, this.e, false);
        d.R(parcel, 6, 4);
        parcel.writeInt(this.f2005f);
        d.Q(iP, parcel);
    }
}

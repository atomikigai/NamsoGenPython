package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbbs;
import h7.a;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class HintRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new c1(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CredentialPickerConfig f1993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1995d;
    public final String[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1996f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f1997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1998s;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z4, boolean z10, String[] strArr, boolean z11, String str, String str2) {
        this.f1992a = i;
        i0.i(credentialPickerConfig);
        this.f1993b = credentialPickerConfig;
        this.f1994c = z4;
        this.f1995d = z10;
        i0.i(strArr);
        this.e = strArr;
        if (i < 2) {
            this.f1996f = true;
            this.f1997r = null;
            this.f1998s = null;
        } else {
            this.f1996f = z11;
            this.f1997r = str;
            this.f1998s = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.J(parcel, 1, this.f1993b, i, false);
        d.R(parcel, 2, 4);
        parcel.writeInt(this.f1994c ? 1 : 0);
        d.R(parcel, 3, 4);
        parcel.writeInt(this.f1995d ? 1 : 0);
        d.L(parcel, 4, this.e, false);
        d.R(parcel, 5, 4);
        parcel.writeInt(this.f1996f ? 1 : 0);
        d.K(parcel, 6, this.f1997r, false);
        d.K(parcel, 7, this.f1998s, false);
        d.R(parcel, zzbbs.zzq.zzf, 4);
        parcel.writeInt(this.f1992a);
        d.Q(iP, parcel);
    }
}

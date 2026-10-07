package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.zzbbs;
import h7.a;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CredentialPickerConfig extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new c1(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1991d;

    public CredentialPickerConfig(int i, boolean z4, boolean z10, boolean z11, int i10) {
        this.f1988a = i;
        this.f1989b = z4;
        this.f1990c = z10;
        if (i < 2) {
            this.f1991d = true == z11 ? 3 : 1;
        } else {
            this.f1991d = i10;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(this.f1989b ? 1 : 0);
        d.R(parcel, 2, 4);
        parcel.writeInt(this.f1990c ? 1 : 0);
        int i10 = this.f1991d;
        int i11 = i10 != 3 ? 0 : 1;
        d.R(parcel, 3, 4);
        parcel.writeInt(i11);
        d.R(parcel, 4, 4);
        parcel.writeInt(i10);
        d.R(parcel, zzbbs.zzq.zzf, 4);
        parcel.writeInt(this.f1988a);
        d.Q(iP, parcel);
    }
}

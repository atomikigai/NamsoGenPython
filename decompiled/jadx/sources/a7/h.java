package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends h7.a {
    public static final Parcelable.Creator<h> CREATOR = new n(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f225d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f226f;

    public h(String str, String str2, String str3, String str4, boolean z4, int i) {
        i0.i(str);
        this.f222a = str;
        this.f223b = str2;
        this.f224c = str3;
        this.f225d = str4;
        this.e = z4;
        this.f226f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i0.m(this.f222a, hVar.f222a) && i0.m(this.f225d, hVar.f225d) && i0.m(this.f223b, hVar.f223b) && i0.m(Boolean.valueOf(this.e), Boolean.valueOf(hVar.e)) && this.f226f == hVar.f226f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f222a, this.f223b, this.f225d, Boolean.valueOf(this.e), Integer.valueOf(this.f226f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f222a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f223b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f224c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f225d, false);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeInt(this.f226f);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

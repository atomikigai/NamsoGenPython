package a7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import u7.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends h7.a {
    public static final Parcelable.Creator<l> CREATOR = new n(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f235d;
    public final Uri e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f236f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f239t;

    public l(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, x xVar) {
        i0.e(str);
        this.f232a = str;
        this.f233b = str2;
        this.f234c = str3;
        this.f235d = str4;
        this.e = uri;
        this.f236f = str5;
        this.f237r = str6;
        this.f238s = str7;
        this.f239t = xVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i0.m(this.f232a, lVar.f232a) && i0.m(this.f233b, lVar.f233b) && i0.m(this.f234c, lVar.f234c) && i0.m(this.f235d, lVar.f235d) && i0.m(this.e, lVar.e) && i0.m(this.f236f, lVar.f236f) && i0.m(this.f237r, lVar.f237r) && i0.m(this.f238s, lVar.f238s) && i0.m(this.f239t, lVar.f239t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f232a, this.f233b, this.f234c, this.f235d, this.e, this.f236f, this.f237r, this.f238s, this.f239t});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f232a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f233b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f234c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f235d, false);
        com.bumptech.glide.d.J(parcel, 5, this.e, i, false);
        com.bumptech.glide.d.K(parcel, 6, this.f236f, false);
        com.bumptech.glide.d.K(parcel, 7, this.f237r, false);
        com.bumptech.glide.d.K(parcel, 8, this.f238s, false);
        com.bumptech.glide.d.J(parcel, 9, this.f239t, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

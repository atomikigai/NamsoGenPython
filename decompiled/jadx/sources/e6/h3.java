package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends h7.a {
    public static final Parcelable.Creator<h3> CREATOR = new b8.f(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o3 f3320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3321d;

    public h3(String str, int i, o3 o3Var, int i10) {
        this.f3318a = str;
        this.f3319b = i;
        this.f3320c = o3Var;
        this.f3321d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return this.f3318a.equals(h3Var.f3318a) && this.f3319b == h3Var.f3319b && this.f3320c.g(h3Var.f3320c);
    }

    public final int hashCode() {
        return Objects.hash(this.f3318a, Integer.valueOf(this.f3319b), this.f3320c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f3318a, false);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f3319b);
        com.bumptech.glide.d.J(parcel, 3, this.f3320c, i, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f3321d);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

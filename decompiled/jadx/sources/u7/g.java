package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h7.a {
    public static final Parcelable.Creator<g> CREATOR = new v0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f8903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f8904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f8905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f8906d;

    public g(n0 n0Var, w0 w0Var, h hVar, x0 x0Var) {
        this.f8903a = n0Var;
        this.f8904b = w0Var;
        this.f8905c = hVar;
        this.f8906d = x0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return com.google.android.gms.common.internal.i0.m(this.f8903a, gVar.f8903a) && com.google.android.gms.common.internal.i0.m(this.f8904b, gVar.f8904b) && com.google.android.gms.common.internal.i0.m(this.f8905c, gVar.f8905c) && com.google.android.gms.common.internal.i0.m(this.f8906d, gVar.f8906d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8903a, this.f8904b, this.f8905c, this.f8906d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f8903a, i, false);
        com.bumptech.glide.d.J(parcel, 2, this.f8904b, i, false);
        com.bumptech.glide.d.J(parcel, 3, this.f8905c, i, false);
        com.bumptech.glide.d.J(parcel, 4, this.f8906d, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

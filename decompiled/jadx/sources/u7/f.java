package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h7.a {
    public static final Parcelable.Creator<f> CREATOR = new v0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f8890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f8891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f8892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f8893d;
    public final p0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q0 f8894f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a1 f8895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f8896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w f8897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s0 f8898u;

    public f(v vVar, z0 z0Var, m0 m0Var, b1 b1Var, p0 p0Var, q0 q0Var, a1 a1Var, r0 r0Var, w wVar, s0 s0Var) {
        this.f8890a = vVar;
        this.f8892c = m0Var;
        this.f8891b = z0Var;
        this.f8893d = b1Var;
        this.e = p0Var;
        this.f8894f = q0Var;
        this.f8895r = a1Var;
        this.f8896s = r0Var;
        this.f8897t = wVar;
        this.f8898u = s0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return com.google.android.gms.common.internal.i0.m(this.f8890a, fVar.f8890a) && com.google.android.gms.common.internal.i0.m(this.f8891b, fVar.f8891b) && com.google.android.gms.common.internal.i0.m(this.f8892c, fVar.f8892c) && com.google.android.gms.common.internal.i0.m(this.f8893d, fVar.f8893d) && com.google.android.gms.common.internal.i0.m(this.e, fVar.e) && com.google.android.gms.common.internal.i0.m(this.f8894f, fVar.f8894f) && com.google.android.gms.common.internal.i0.m(this.f8895r, fVar.f8895r) && com.google.android.gms.common.internal.i0.m(this.f8896s, fVar.f8896s) && com.google.android.gms.common.internal.i0.m(this.f8897t, fVar.f8897t) && com.google.android.gms.common.internal.i0.m(this.f8898u, fVar.f8898u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8890a, this.f8891b, this.f8892c, this.f8893d, this.e, this.f8894f, this.f8895r, this.f8896s, this.f8897t, this.f8898u});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 2, this.f8890a, i, false);
        com.bumptech.glide.d.J(parcel, 3, this.f8891b, i, false);
        com.bumptech.glide.d.J(parcel, 4, this.f8892c, i, false);
        com.bumptech.glide.d.J(parcel, 5, this.f8893d, i, false);
        com.bumptech.glide.d.J(parcel, 6, this.e, i, false);
        com.bumptech.glide.d.J(parcel, 7, this.f8894f, i, false);
        com.bumptech.glide.d.J(parcel, 8, this.f8895r, i, false);
        com.bumptech.glide.d.J(parcel, 9, this.f8896s, i, false);
        com.bumptech.glide.d.J(parcel, 10, this.f8897t, i, false);
        com.bumptech.glide.d.J(parcel, 11, this.f8898u, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

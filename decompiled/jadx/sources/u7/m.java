package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h7.a {
    public static final Parcelable.Creator<m> CREATOR = new v0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f8929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f8930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f8931d;

    public m(String str, Boolean bool, String str2, String str3) {
        c cVarA;
        i0 i0VarA = null;
        if (str == null) {
            cVarA = null;
        } else {
            try {
                cVarA = c.a(str);
            } catch (b | h0 | t0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f8928a = cVarA;
        this.f8929b = bool;
        this.f8930c = str2 == null ? null : u0.a(str2);
        if (str3 != null) {
            i0VarA = i0.a(str3);
        }
        this.f8931d = i0VarA;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return com.google.android.gms.common.internal.i0.m(this.f8928a, mVar.f8928a) && com.google.android.gms.common.internal.i0.m(this.f8929b, mVar.f8929b) && com.google.android.gms.common.internal.i0.m(this.f8930c, mVar.f8930c) && com.google.android.gms.common.internal.i0.m(this.f8931d, mVar.f8931d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8928a, this.f8929b, this.f8930c, this.f8931d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        c cVar = this.f8928a;
        com.bumptech.glide.d.K(parcel, 2, cVar == null ? null : cVar.f8883a, false);
        com.bumptech.glide.d.B(parcel, 3, this.f8929b);
        u0 u0Var = this.f8930c;
        com.bumptech.glide.d.K(parcel, 4, u0Var == null ? null : u0Var.f8953a, false);
        i0 i0Var = this.f8931d;
        com.bumptech.glide.d.K(parcel, 5, i0Var != null ? i0Var.f8916a : null, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

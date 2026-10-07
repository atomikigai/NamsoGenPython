package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends h7.a {
    public static final Parcelable.Creator<a0> CREATOR = new r4.a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f8870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f8871b;

    public a0(String str, int i) {
        com.google.android.gms.common.internal.i0.i(str);
        try {
            this.f8870a = e0.a(str);
            try {
                this.f8871b = r.a(i);
            } catch (q e) {
                throw new IllegalArgumentException(e);
            }
        } catch (d0 e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f8870a.equals(a0Var.f8870a) && this.f8871b.equals(a0Var.f8871b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8870a, this.f8871b});
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, u7.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        this.f8870a.getClass();
        com.bumptech.glide.d.K(parcel, 2, "public-key", false);
        com.bumptech.glide.d.H(parcel, 3, Integer.valueOf(this.f8871b.f8945a.a()));
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

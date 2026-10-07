package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzal;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends h7.a {
    public static final Parcelable.Creator<l0> CREATOR = new r4.a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f8926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8927b;

    static {
        new l0("supported", null);
        new l0("not-supported", null);
    }

    public l0(String str, String str2) {
        com.google.android.gms.common.internal.i0.i(str);
        try {
            this.f8926a = j0.a(str);
            this.f8927b = str2;
        } catch (k0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return zzal.zza(this.f8926a, l0Var.f8926a) && zzal.zza(this.f8927b, l0Var.f8927b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8926a, this.f8927b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f8926a.f8922a, false);
        com.bumptech.glide.d.K(parcel, 3, this.f8927b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

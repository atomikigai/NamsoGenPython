package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h7.a {
    public static final Parcelable.Creator<m> CREATOR = new n(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241b;

    public m(String str, String str2) {
        i0.j(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        i0.f(strTrim, "Account identifier cannot be empty");
        this.f240a = strTrim;
        i0.e(str2);
        this.f241b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i0.m(this.f240a, mVar.f240a) && i0.m(this.f241b, mVar.f241b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f240a, this.f241b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f240a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f241b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

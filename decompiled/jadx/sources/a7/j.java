package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h7.a {
    public static final Parcelable.Creator<j> CREATOR = new n(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f230c;

    public j(m mVar, String str, int i) {
        i0.i(mVar);
        this.f228a = mVar;
        this.f229b = str;
        this.f230c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i0.m(this.f228a, jVar.f228a) && i0.m(this.f229b, jVar.f229b) && this.f230c == jVar.f230c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f228a, this.f229b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f228a, i, false);
        com.bumptech.glide.d.K(parcel, 2, this.f229b, false);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f230c);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

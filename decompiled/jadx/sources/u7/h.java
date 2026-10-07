package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends h7.a {
    public static final Parcelable.Creator<h> CREATOR = new v0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8910a;

    public h(boolean z4) {
        this.f8910a = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && this.f8910a == ((h) obj).f8910a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8910a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f8910a ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

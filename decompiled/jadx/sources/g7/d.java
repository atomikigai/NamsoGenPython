package g7;

import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h7.a {
    public static final Parcelable.Creator<d> CREATOR = new r3(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4237c;

    public d(int i, long j4, String str) {
        this.f4235a = str;
        this.f4236b = i;
        this.f4237c = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f4235a;
            String str2 = this.f4235a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && g() == dVar.g()) {
                return true;
            }
        }
        return false;
    }

    public final long g() {
        long j4 = this.f4237c;
        return j4 == -1 ? this.f4236b : j4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4235a, Long.valueOf(g())});
    }

    public final String toString() {
        aa.c cVar = new aa.c(this);
        cVar.b(this.f4235a, "name");
        cVar.b(Long.valueOf(g()), "version");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f4235a, false);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f4236b);
        long jG = g();
        com.bumptech.glide.d.R(parcel, 3, 8);
        parcel.writeLong(jG);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public d(String str, long j4) {
        this.f4235a = str;
        this.f4237c = j4;
        this.f4236b = -1;
    }
}

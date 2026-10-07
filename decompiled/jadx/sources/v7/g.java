package v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u7.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h7.a {
    public static final Parcelable.Creator<g> CREATOR = new v0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f9200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9202d;

    public g(String str, String str2, int i, byte[] bArr) {
        this.f9199a = i;
        try {
            this.f9200b = f.a(str);
            this.f9201c = bArr;
            this.f9202d = str2;
        } catch (e e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f9202d;
        if (!Arrays.equals(this.f9201c, gVar.f9201c) || this.f9200b != gVar.f9200b) {
            return false;
        }
        String str2 = this.f9202d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f9201c) + 31) * 31) + this.f9200b.hashCode();
        String str = this.f9202d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9199a);
        com.bumptech.glide.d.K(parcel, 2, this.f9200b.f9198a, false);
        com.bumptech.glide.d.D(parcel, 3, this.f9201c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9202d, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

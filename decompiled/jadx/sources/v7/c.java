package v7;

import android.os.Parcel;
import android.os.Parcelable;
import u7.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h7.a {
    public static final Parcelable.Creator<c> CREATOR = new v0(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9191c;

    static {
        new c("unavailable");
        new c("unused");
    }

    public c(int i, String str, String str2) {
        try {
            this.f9189a = g(i);
            this.f9190b = str;
            this.f9191c = str2;
        } catch (b e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static a g(int i) throws b {
        for (a aVar : a.values()) {
            if (i == aVar.f9188a) {
                return aVar;
            }
        }
        throw new b(q1.a.j(i, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        a aVar = cVar.f9189a;
        a aVar2 = this.f9189a;
        if (!aVar2.equals(aVar)) {
            return false;
        }
        int iOrdinal = aVar2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f9190b.equals(cVar.f9190b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f9191c.equals(cVar.f9191c);
    }

    public final int hashCode() {
        int i;
        int iHashCode;
        a aVar = this.f9189a;
        int iHashCode2 = aVar.hashCode() + 31;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.f9190b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.f9191c.hashCode();
        }
        return iHashCode + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        int i10 = this.f9189a.f9188a;
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.d.K(parcel, 3, this.f9190b, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9191c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public c(String str) {
        this.f9190b = str;
        this.f9189a = a.STRING;
        this.f9191c = null;
    }
}

package s4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new r4.a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8424d;
    public final Uri e;

    public i(String str, String str2, String str3, String str4, Uri uri) {
        this.f8421a = str;
        this.f8422b = str2;
        this.f8423c = str3;
        this.f8424d = str4;
        this.e = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        Uri uri;
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            Uri uri2 = iVar.e;
            String str4 = iVar.f8424d;
            String str5 = iVar.f8423c;
            String str6 = iVar.f8422b;
            if (this.f8421a.equals(iVar.f8421a) && ((str = this.f8422b) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f8423c) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f8424d) != null ? str3.equals(str4) : str4 == null) && ((uri = this.e) != null ? uri.equals(uri2) : uri2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f8421a.hashCode() * 31;
        String str = this.f8422b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8423c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8424d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.e;
        return iHashCode4 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "User{mProviderId='" + this.f8421a + "', mEmail='" + this.f8422b + "', mPhoneNumber='" + this.f8423c + "', mName='" + this.f8424d + "', mPhotoUri=" + this.e + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8421a);
        parcel.writeString(this.f8422b);
        parcel.writeString(this.f8423c);
        parcel.writeString(this.f8424d);
        parcel.writeParcelable(this.e, i);
    }
}

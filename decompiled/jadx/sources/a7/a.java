package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new n(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f205d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f206f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f207r;

    public a(boolean z4, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        i0.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.f202a = z4;
        if (z4) {
            i0.j(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f203b = str;
        this.f204c = str2;
        this.f205d = z10;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f206f = arrayList2;
        this.e = str3;
        this.f207r = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f202a == aVar.f202a && i0.m(this.f203b, aVar.f203b) && i0.m(this.f204c, aVar.f204c) && this.f205d == aVar.f205d && i0.m(this.e, aVar.e) && i0.m(this.f206f, aVar.f206f) && this.f207r == aVar.f207r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f202a), this.f203b, this.f204c, Boolean.valueOf(this.f205d), this.e, this.f206f, Boolean.valueOf(this.f207r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f202a ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 2, this.f203b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f204c, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f205d ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 5, this.e, false);
        com.bumptech.glide.d.M(parcel, 6, this.f206f);
        com.bumptech.glide.d.R(parcel, 7, 4);
        parcel.writeInt(this.f207r ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

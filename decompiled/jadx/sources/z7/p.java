package z7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends h7.a implements Iterable {
    public static final Parcelable.Creator<p> CREATOR = new d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f11292a;

    public p(Bundle bundle) {
        this.f11292a = bundle;
    }

    public final Bundle g() {
        return new Bundle(this.f11292a);
    }

    public final Double h() {
        return Double.valueOf(this.f11292a.getDouble("value"));
    }

    public final Object i(String str) {
        return this.f11292a.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o(this);
    }

    public final String j() {
        return this.f11292a.getString("currency");
    }

    public final String toString() {
        return this.f11292a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.C(parcel, 2, g(), false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}

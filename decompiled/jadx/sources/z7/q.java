package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h7.a {
    public static final Parcelable.Creator<q> CREATOR = new d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f11303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11305d;

    public q(String str, p pVar, String str2, long j4) {
        this.f11302a = str;
        this.f11303b = pVar;
        this.f11304c = str2;
        this.f11305d = j4;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11303b);
        StringBuilder sbE = u3.b.e("origin=", this.f11304c, ",name=", this.f11302a, ",params=");
        sbE.append(strValueOf);
        return sbE.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }

    public q(q qVar, long j4) {
        com.google.android.gms.common.internal.i0.i(qVar);
        this.f11302a = qVar.f11302a;
        this.f11303b = qVar.f11303b;
        this.f11304c = qVar.f11304c;
        this.f11305d = j4;
    }
}

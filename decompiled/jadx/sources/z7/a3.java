package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends h7.a {
    public static final Parcelable.Creator<a3> CREATOR = new d(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f11017d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11018f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f11019r;

    public a3(int i, String str, long j4, Long l2, Float f10, String str2, String str3, Double d10) {
        this.f11014a = i;
        this.f11015b = str;
        this.f11016c = j4;
        this.f11017d = l2;
        if (i == 1) {
            this.f11019r = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f11019r = d10;
        }
        this.e = str2;
        this.f11018f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.b(this, parcel);
    }

    public final Object zza() {
        Long l2 = this.f11017d;
        if (l2 != null) {
            return l2;
        }
        Double d10 = this.f11019r;
        if (d10 != null) {
            return d10;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public a3(long j4, Object obj, String str, String str2) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f11014a = 2;
        this.f11015b = str;
        this.f11016c = j4;
        this.f11018f = str2;
        if (obj == null) {
            this.f11017d = null;
            this.f11019r = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f11017d = (Long) obj;
            this.f11019r = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.f11017d = null;
            this.f11019r = null;
            this.e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f11017d = null;
                this.f11019r = (Double) obj;
                this.e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public a3(b3 b3Var) {
        this(b3Var.f11036d, b3Var.e, b3Var.f11035c, b3Var.f11034b);
    }
}

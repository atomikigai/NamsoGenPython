package s4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new r4.a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.c f8396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8397d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8398f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f8399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f8400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v9.b f8401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f8403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f8404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f8406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r4.b f8407z;

    public c(String str, ArrayList arrayList, r4.c cVar, int i, int i10, String str2, String str3, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, String str4, v9.b bVar, r4.b bVar2) {
        p3.a.g(str, "appName cannot be null", new Object[0]);
        this.f8394a = str;
        p3.a.g(arrayList, "providers cannot be null", new Object[0]);
        this.f8395b = Collections.unmodifiableList(arrayList);
        this.f8396c = cVar;
        this.f8397d = i;
        this.e = i10;
        this.f8398f = str2;
        this.f8399r = str3;
        this.f8402u = z4;
        this.f8403v = z10;
        this.f8404w = z11;
        this.f8405x = z12;
        this.f8406y = z13;
        this.f8400s = str4;
        this.f8401t = bVar;
        this.f8407z = bVar2;
    }

    public final boolean a() {
        if (this.f8396c == null) {
            return this.f8395b.size() != 1 || this.f8405x;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8394a);
        parcel.writeTypedList(this.f8395b);
        parcel.writeParcelable(this.f8396c, i);
        parcel.writeInt(this.f8397d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f8398f);
        parcel.writeString(this.f8399r);
        parcel.writeInt(this.f8402u ? 1 : 0);
        parcel.writeInt(this.f8403v ? 1 : 0);
        parcel.writeInt(this.f8404w ? 1 : 0);
        parcel.writeInt(this.f8405x ? 1 : 0);
        parcel.writeInt(this.f8406y ? 1 : 0);
        parcel.writeString(this.f8400s);
        parcel.writeParcelable(this.f8401t, i);
        parcel.writeParcelable(this.f8407z, i);
    }
}

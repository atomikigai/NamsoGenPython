package x1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new c1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f10050d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f10051f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f10052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10055u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10047a);
        parcel.writeInt(this.f10048b);
        parcel.writeInt(this.f10049c);
        if (this.f10049c > 0) {
            parcel.writeIntArray(this.f10050d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f10051f);
        }
        parcel.writeInt(this.f10053s ? 1 : 0);
        parcel.writeInt(this.f10054t ? 1 : 0);
        parcel.writeInt(this.f10055u ? 1 : 0);
        parcel.writeList(this.f10052r);
    }
}

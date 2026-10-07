package o2;

import android.os.Parcel;
import android.util.SparseIntArray;
import r.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7465d;
    public final Parcel e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7467g;
    public final String h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7469k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // o2.a
    public final b a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f7468j;
        if (i == this.f7466f) {
            i = this.f7467g;
        }
        return new b(parcel, iDataPosition, i, q1.a.m(new StringBuilder(), this.h, "  "), this.f7462a, this.f7463b, this.f7464c);
    }

    @Override // o2.a
    public final boolean e(int i) {
        while (this.f7468j < this.f7467g) {
            int i10 = this.f7469k;
            if (i10 == i) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i11 = this.f7468j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i11);
            int i12 = parcel.readInt();
            this.f7469k = parcel.readInt();
            this.f7468j += i12;
        }
        return this.f7469k == i;
    }

    @Override // o2.a
    public final void i(int i) {
        int i10 = this.i;
        SparseIntArray sparseIntArray = this.f7465d;
        Parcel parcel = this.e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f7465d = new SparseIntArray();
        this.i = -1;
        this.f7469k = -1;
        this.e = parcel;
        this.f7466f = i;
        this.f7467g = i10;
        this.f7468j = i;
        this.h = str;
    }
}

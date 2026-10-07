package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a7.n(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f837d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f838f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f842u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CharSequence f843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f846y;

    public b(a aVar) {
        int size = aVar.f817a.size();
        this.f834a = new int[size * 5];
        if (!aVar.f822g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f835b = new ArrayList(size);
        this.f836c = new int[size];
        this.f837d = new int[size];
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p0 p0Var = (p0) aVar.f817a.get(i10);
            int i11 = i + 1;
            this.f834a[i] = p0Var.f959a;
            ArrayList arrayList = this.f835b;
            s sVar = p0Var.f960b;
            arrayList.add(sVar != null ? sVar.e : null);
            int[] iArr = this.f834a;
            iArr[i11] = p0Var.f961c;
            iArr[i + 2] = p0Var.f962d;
            int i12 = i + 4;
            iArr[i + 3] = p0Var.e;
            i += 5;
            iArr[i12] = p0Var.f963f;
            this.f836c[i10] = p0Var.f964g.ordinal();
            this.f837d[i10] = p0Var.h.ordinal();
        }
        this.e = aVar.f821f;
        this.f838f = aVar.i;
        this.f839r = aVar.f832s;
        this.f840s = aVar.f823j;
        this.f841t = aVar.f824k;
        this.f842u = aVar.f825l;
        this.f843v = aVar.f826m;
        this.f844w = aVar.f827n;
        this.f845x = aVar.f828o;
        this.f846y = aVar.f829p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f834a);
        parcel.writeStringList(this.f835b);
        parcel.writeIntArray(this.f836c);
        parcel.writeIntArray(this.f837d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f838f);
        parcel.writeInt(this.f839r);
        parcel.writeInt(this.f840s);
        TextUtils.writeToParcel(this.f841t, parcel, 0);
        parcel.writeInt(this.f842u);
        TextUtils.writeToParcel(this.f843v, parcel, 0);
        parcel.writeStringList(this.f844w);
        parcel.writeStringList(this.f845x);
        parcel.writeInt(this.f846y ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f834a = parcel.createIntArray();
        this.f835b = parcel.createStringArrayList();
        this.f836c = parcel.createIntArray();
        this.f837d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f838f = parcel.readString();
        this.f839r = parcel.readInt();
        this.f840s = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f841t = (CharSequence) creator.createFromParcel(parcel);
        this.f842u = parcel.readInt();
        this.f843v = (CharSequence) creator.createFromParcel(parcel);
        this.f844w = parcel.createStringArrayList();
        this.f845x = parcel.createStringArrayList();
        this.f846y = parcel.readInt() != 0;
    }
}

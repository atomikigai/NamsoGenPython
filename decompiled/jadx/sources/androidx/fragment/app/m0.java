package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a7.n(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f931d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f932f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f937v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f939x;

    public m0(s sVar) {
        this.f928a = sVar.getClass().getName();
        this.f929b = sVar.e;
        this.f930c = sVar.f984x;
        this.f931d = sVar.G;
        this.e = sVar.H;
        this.f932f = sVar.I;
        this.f933r = sVar.L;
        this.f934s = sVar.f983w;
        this.f935t = sVar.K;
        this.f936u = sVar.f977f;
        this.f937v = sVar.J;
        this.f938w = sVar.W.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f928a);
        sb2.append(" (");
        sb2.append(this.f929b);
        sb2.append(")}:");
        if (this.f930c) {
            sb2.append(" fromLayout");
        }
        int i = this.e;
        if (i != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i));
        }
        String str = this.f932f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f933r) {
            sb2.append(" retainInstance");
        }
        if (this.f934s) {
            sb2.append(" removing");
        }
        if (this.f935t) {
            sb2.append(" detached");
        }
        if (this.f937v) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f928a);
        parcel.writeString(this.f929b);
        parcel.writeInt(this.f930c ? 1 : 0);
        parcel.writeInt(this.f931d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f932f);
        parcel.writeInt(this.f933r ? 1 : 0);
        parcel.writeInt(this.f934s ? 1 : 0);
        parcel.writeInt(this.f935t ? 1 : 0);
        parcel.writeBundle(this.f936u);
        parcel.writeInt(this.f937v ? 1 : 0);
        parcel.writeBundle(this.f939x);
        parcel.writeInt(this.f938w);
    }

    public m0(Parcel parcel) {
        this.f928a = parcel.readString();
        this.f929b = parcel.readString();
        this.f930c = parcel.readInt() != 0;
        this.f931d = parcel.readInt();
        this.e = parcel.readInt();
        this.f932f = parcel.readString();
        this.f933r = parcel.readInt() != 0;
        this.f934s = parcel.readInt() != 0;
        this.f935t = parcel.readInt() != 0;
        this.f936u = parcel.readBundle();
        this.f937v = parcel.readInt() != 0;
        this.f939x = parcel.readBundle();
        this.f938w = parcel.readInt();
    }
}

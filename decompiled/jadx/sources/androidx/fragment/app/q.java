package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import l.g3;
import l.u2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f965a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f965a) {
            case 0:
                return new r(parcel, classLoader);
            case 1:
                return new b0.g(parcel, classLoader);
            case 2:
                return new c9.e(parcel, classLoader);
            case 3:
                return new e9.a(parcel, classLoader);
            case 4:
                return new g9.c0(parcel, classLoader);
            case 5:
                return new j8.a(parcel, classLoader);
            case 6:
                return new k8.b(parcel, classLoader);
            case 7:
                return new u2(parcel, classLoader);
            case 8:
                return new g3(parcel, classLoader);
            case 9:
                jc.i.e(parcel, "source");
                jc.i.e(classLoader, "loader");
                return new pb.g(parcel, classLoader);
            case 10:
                s2.m mVar = new s2.m(parcel, classLoader);
                mVar.f8362a = parcel.readInt();
                mVar.f8363b = parcel.readInt();
                mVar.f8364c = parcel.readParcelable(classLoader);
                return mVar;
            case 11:
                return new u8.b(parcel, classLoader);
            case 12:
                if (parcel.readParcelable(classLoader) == null) {
                    return x0.b.f10010b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new x1.p0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f965a) {
            case 0:
                return new r[i];
            case 1:
                return new b0.g[i];
            case 2:
                return new c9.e[i];
            case 3:
                return new e9.a[i];
            case 4:
                return new g9.c0[i];
            case 5:
                return new j8.a[i];
            case 6:
                return new k8.b[i];
            case 7:
                return new u2[i];
            case 8:
                return new g3[i];
            case 9:
                return new pb.g[0];
            case 10:
                return new s2.m[i];
            case 11:
                return new u8.b[i];
            case 12:
                return new x0.b[i];
            default:
                return new x1.p0[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f965a) {
            case 0:
                return new r(parcel, null);
            case 1:
                return new b0.g(parcel, null);
            case 2:
                return new c9.e(parcel, null);
            case 3:
                return new e9.a(parcel, null);
            case 4:
                return new g9.c0(parcel, null);
            case 5:
                return new j8.a(parcel, null);
            case 6:
                return new k8.b(parcel, null);
            case 7:
                return new u2(parcel, null);
            case 8:
                return new g3(parcel, null);
            case 9:
                jc.i.e(parcel, "source");
                return new pb.g(parcel, null);
            case 10:
                s2.m mVar = new s2.m(parcel, null);
                mVar.f8362a = parcel.readInt();
                mVar.f8363b = parcel.readInt();
                mVar.f8364c = parcel.readParcelable(null);
                return mVar;
            case 11:
                return new u8.b(parcel, null);
            case 12:
                if (parcel.readParcelable(null) == null) {
                    return x0.b.f10010b;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new x1.p0(parcel, null);
        }
    }
}

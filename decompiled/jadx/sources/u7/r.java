package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new v0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum f8945a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(a aVar) {
        this.f8945a = (Enum) aVar;
    }

    public static r a(int i) throws q {
        a aVar;
        if (i != -262) {
            for (g0 g0Var : g0.values()) {
                if (g0Var.f8909a == i) {
                    aVar = g0Var;
                }
            }
            for (s sVar : s.values()) {
                if (sVar.f8948a == i) {
                    aVar = sVar;
                }
            }
            throw new q(q1.a.j(i, "Algorithm with COSE value ", " not supported"));
        }
        aVar = g0.RS1;
        return new r(aVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, u7.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, u7.a] */
    public final boolean equals(Object obj) {
        return (obj instanceof r) && this.f8945a.a() == ((r) obj).f8945a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8945a});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, u7.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8945a.a());
    }
}

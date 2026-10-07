package u7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    e0 EF5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e0[] f8889a = {new e0("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<e0> CREATOR = new r4.a(23);

    public static e0 a(String str) throws d0 {
        for (e0 e0Var : values()) {
            e0Var.getClass();
            if (str.equals("public-key")) {
                return e0Var;
            }
        }
        throw new d0(da.v.i("PublicKeyCredentialType ", str, " not supported"));
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f8889a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}

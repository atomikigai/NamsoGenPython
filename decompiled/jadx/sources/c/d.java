package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b8.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f1713a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f1713a == null) {
                    this.f1713a = new c(this);
                }
                parcel.writeStrongBinder(this.f1713a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i, Bundle bundle) {
    }
}

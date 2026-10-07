package k9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f6091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6092b;

    public a(IBinder iBinder, String str) {
        this.f6091a = iBinder;
        this.f6092b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6091a;
    }

    public final void y(int i, Parcel parcel) {
        try {
            this.f6091a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

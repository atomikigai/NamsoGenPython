package k9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends i implements u {
    @Override // k9.i
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) j.a(parcel);
        j.b(parcel);
        b(bundle);
        return true;
    }
}

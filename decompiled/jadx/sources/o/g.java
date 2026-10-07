package o;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f7426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f7427b;

    public g(a aVar) {
        this.f7427b = aVar;
        attachInterface(this, b.a.f1315g);
        this.f7426a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        String str = b.a.f1315g;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f7426a;
        a aVar = this.f7427b;
        switch (i) {
            case 2:
                int i11 = parcel.readInt();
                Bundle bundle = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new androidx.activity.g(this, i11, bundle, 5));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle3, 1));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i12 = parcel.readInt();
                Uri uri = (Uri) r7.g.a(parcel, Uri.CREATOR);
                boolean z4 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d(this, i12, uri, z4, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = aVar == null ? null : aVar.extraCallbackWithResult(parcel.readString(), (Bundle) r7.g.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (bundleExtraCallbackWithResult == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleExtraCallbackWithResult.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Bundle bundle6 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new e(this, i13, i14, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle7, 2));
                    return true;
                }
                return true;
            case 10:
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                Bundle bundle8 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new f(this, i15, i16, i17, i18, i19, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) r7.g.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

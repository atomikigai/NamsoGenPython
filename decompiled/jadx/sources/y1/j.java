package y1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Binder implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f10463a;

    public j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f10463a = multiInstanceInvalidationService;
        attachInterface(this, f.f10430q);
    }

    @Override // y1.f
    public final void F(int i, String[] strArr) {
        jc.i.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f10463a;
        synchronized (multiInstanceInvalidationService.f1183c) {
            try {
                String str = (String) multiInstanceInvalidationService.f1182b.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f1183c.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f1183c.getBroadcastCookie(i10);
                        jc.i.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f1182b.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((e) multiInstanceInvalidationService.f1183c.getBroadcastItem(i10)).g(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.f1183c.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.f1183c.finishBroadcast();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        String str = f.f10430q;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        e eVar = null;
        e eVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i10);
                }
                F(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(e.f10425p);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) {
                    d dVar = new d();
                    dVar.f10420a = strongBinder;
                    eVar2 = dVar;
                } else {
                    eVar2 = (e) iInterfaceQueryLocalInterface;
                }
            }
            int i11 = parcel.readInt();
            jc.i.e(eVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f10463a;
            synchronized (multiInstanceInvalidationService.f1183c) {
                multiInstanceInvalidationService.f1183c.unregister(eVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(e.f10425p);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof e)) {
                d dVar2 = new d();
                dVar2.f10420a = strongBinder2;
                eVar = dVar2;
            } else {
                eVar = (e) iInterfaceQueryLocalInterface2;
            }
        }
        String string = parcel.readString();
        jc.i.e(eVar, "callback");
        int i12 = 0;
        if (string != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f10463a;
            synchronized (multiInstanceInvalidationService2.f1183c) {
                try {
                    int i13 = multiInstanceInvalidationService2.f1181a + 1;
                    multiInstanceInvalidationService2.f1181a = i13;
                    if (multiInstanceInvalidationService2.f1183c.register(eVar, Integer.valueOf(i13))) {
                        multiInstanceInvalidationService2.f1182b.put(Integer.valueOf(i13), string);
                        i12 = i13;
                    } else {
                        multiInstanceInvalidationService2.f1181a--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i12);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

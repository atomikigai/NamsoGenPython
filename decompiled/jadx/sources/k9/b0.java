package k9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ IBinder f6095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f6096s;

    public b0(b bVar, IBinder iBinder) {
        this.f6096s = bVar;
        this.f6095r = iBinder;
    }

    @Override // k9.w
    public final void b() {
        c cVar = (c) this.f6096s.f6094b;
        cVar.f6108n = (IInterface) cVar.i.a(this.f6095r);
        int i = 0;
        cVar.f6099b.b("linkToDeath", new Object[0]);
        try {
            cVar.f6108n.asBinder().linkToDeath(cVar.f6105k, 0);
        } catch (RemoteException e) {
            cVar.f6099b.a(e, "linkToDeath failed", new Object[0]);
        }
        cVar.f6103g = false;
        ArrayList arrayList = cVar.f6101d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        cVar.f6101d.clear();
    }
}

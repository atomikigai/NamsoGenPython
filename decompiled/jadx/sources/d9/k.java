package d9;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import gb.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3078b;

    public /* synthetic */ k(Object obj, int i) {
        this.f3077a = i;
        this.f3078b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f3077a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                r rVar = (r) this.f3078b;
                l lVar = (l) message.obj;
                synchronized (rVar.f4493a) {
                    if (((l) rVar.f4495c) == lVar || ((l) rVar.f4496d) == lVar) {
                        rVar.c(lVar, 2);
                    }
                    break;
                }
                return true;
            case 1:
                f7.h hVar = (f7.h) this.f3078b;
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("Received response to request: ");
                    sb2.append(i);
                    Log.d("MessengerIpcClient", sb2.toString());
                }
                synchronized (hVar) {
                    try {
                        f7.i iVar = (f7.i) hVar.e.get(i);
                        if (iVar == null) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("Received response for unknown request: ");
                            sb3.append(i);
                            Log.w("MessengerIpcClient", sb3.toString());
                            return true;
                        }
                        hVar.e.remove(i);
                        hVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            iVar.b(new f7.j("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (iVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    iVar.c(null);
                                    return true;
                                }
                                iVar.b(new f7.j("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                iVar.c(bundle);
                                return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                h4.g gVar = (h4.g) this.f3078b;
                int i10 = message.what;
                if (i10 == 1) {
                    gVar.b((h4.e) message.obj);
                    return true;
                }
                if (i10 == 2) {
                    gVar.f4953d.k((h4.e) message.obj);
                }
                return false;
        }
    }
}

package g;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h6.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3987a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3988b;

    public /* synthetic */ c() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        o0[] o0VarArr;
        switch (this.f3987a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f3988b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                o1.b bVar = (o1.b) this.f3988b;
                while (true) {
                    synchronized (bVar.f7459b) {
                        try {
                            size = bVar.f7461d.size();
                            if (size <= 0) {
                                return;
                            }
                            o0VarArr = new o0[size];
                            bVar.f7461d.toArray(o0VarArr);
                            bVar.f7461d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        o0 o0Var = o0VarArr[i10];
                        int size2 = ((ArrayList) o0Var.f5062c).size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            o1.a aVar = (o1.a) ((ArrayList) o0Var.f5062c).get(i11);
                            if (!aVar.f7455d) {
                                aVar.f7453b.onReceive(bVar.f7458a, (Intent) o0Var.f5061b);
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o1.b bVar, Looper looper) {
        super(looper);
        this.f3988b = bVar;
    }
}

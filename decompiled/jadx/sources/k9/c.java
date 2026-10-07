package k9;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f6097o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f6099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6100c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6103g;
    public final Intent h;
    public final a0 i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f6107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f6108n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6101d = new ArrayList();
    public final HashSet e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6102f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f6105k = new IBinder.DeathRecipient() { // from class: k9.x
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c cVar = this.f6120a;
            int i = 0;
            cVar.f6099b.b("reportBinderDeath", new Object[0]);
            if (cVar.f6104j.get() != null) {
                throw new ClassCastException();
            }
            cVar.f6099b.b("%s : Binder has died.", cVar.f6100c);
            ArrayList arrayList = cVar.f6101d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((w) obj).a(new RemoteException(String.valueOf(cVar.f6100c).concat(" : Binder has died.")));
            }
            cVar.f6101d.clear();
            synchronized (cVar.f6102f) {
                cVar.d();
            }
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f6106l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f6104j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [k9.x] */
    public c(Context context, v vVar, String str, Intent intent, a0 a0Var) {
        this.f6098a = context;
        this.f6099b = vVar;
        this.f6100c = str;
        this.h = intent;
        this.i = a0Var;
    }

    public static void b(c cVar, w wVar) {
        IInterface iInterface = cVar.f6108n;
        v vVar = cVar.f6099b;
        ArrayList arrayList = cVar.f6101d;
        int i = 0;
        if (iInterface != null || cVar.f6103g) {
            if (!cVar.f6103g) {
                wVar.run();
                return;
            } else {
                vVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(wVar);
                return;
            }
        }
        vVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(wVar);
        b bVar = new b(cVar, 0);
        cVar.f6107m = bVar;
        cVar.f6103g = true;
        if (cVar.f6098a.bindService(cVar.h, bVar, 1)) {
            return;
        }
        vVar.b("Failed to bind to the service.", new Object[0]);
        cVar.f6103g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((w) obj).a(new d("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f6097o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f6100c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f6100c, 10);
                    handlerThread.start();
                    map.put(this.f6100c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f6100c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f6102f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new z(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f6100c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}

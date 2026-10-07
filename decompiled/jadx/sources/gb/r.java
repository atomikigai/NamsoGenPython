package gb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import fa.r0;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements n5.b, Continuation {
    public static r e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static r f4492f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4496d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f4493a = obj;
        this.f4494b = obj2;
        this.f4495c = obj3;
        this.f4496d = obj4;
    }

    public static synchronized r g() {
        try {
            if (e == null) {
                e = new r(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static r h() {
        if (f4492f == null) {
            f4492f = new r(3);
        }
        return f4492f;
    }

    public synchronized void a(u3.f fVar, w3.r rVar) {
        w3.a aVar = (w3.a) ((HashMap) this.f4494b).put(fVar, new w3.a(fVar, rVar, (ReferenceQueue) this.f4495c));
        if (aVar != null) {
            aVar.f9480c = null;
            aVar.clear();
        }
    }

    public r0 b() {
        String strH = ((Integer) this.f4495c) == null ? " platform" : "";
        if (((String) this.f4493a) == null) {
            strH = strH.concat(" version");
        }
        if (((String) this.f4496d) == null) {
            strH = da.v.h(strH, " buildVersion");
        }
        if (((Boolean) this.f4494b) == null) {
            strH = da.v.h(strH, " jailbroken");
        }
        if (strH.isEmpty()) {
            return new r0((String) this.f4493a, ((Integer) this.f4495c).intValue(), (String) this.f4496d, ((Boolean) this.f4494b).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public boolean c(d9.l lVar, int i) {
        d9.e eVar = (d9.e) lVar.f3079a.get();
        if (eVar == null) {
            return false;
        }
        ((Handler) this.f4494b).removeCallbacksAndMessages(lVar);
        Handler handler = d9.h.f3057x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, eVar.f3042a));
        return true;
    }

    public void d(w3.a aVar) {
        w3.x xVar;
        synchronized (this) {
            ((HashMap) this.f4494b).remove(aVar.f9478a);
            if (aVar.f9479b && (xVar = aVar.f9480c) != null) {
                ((w3.k) this.f4496d).e(aVar.f9478a, new w3.r(xVar, true, false, aVar.f9478a, (w3.k) this.f4496d));
            }
        }
    }

    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((r.k) this.f4494b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public j.f f(j.a aVar) {
        ArrayList arrayList = (ArrayList) this.f4495c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.f fVar = (j.f) arrayList.get(i);
            if (fVar != null && fVar.f5594b == aVar) {
                return fVar;
            }
        }
        j.f fVar2 = new j.f((Context) this.f4494b, aVar);
        arrayList.add(fVar2);
        return fVar2;
    }

    @Override // tb.a
    public Object get() {
        return new a3.j((Executor) ((tb.a) this.f4493a).get(), (s5.d) ((tb.a) this.f4494b).get(), (q5.d) ((q5.d) this.f4495c).get(), (t5.c) ((tb.a) this.f4496d).get());
    }

    public boolean i(Context context) {
        if (((Boolean) this.f4495c) == null) {
            this.f4495c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f4494b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f4495c).booleanValue();
    }

    public boolean j(Context context) {
        if (((Boolean) this.f4494b) == null) {
            this.f4494b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f4494b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f4494b).booleanValue();
    }

    public boolean k(d9.e eVar) {
        d9.l lVar = (d9.l) this.f4495c;
        return (lVar == null || eVar == null || lVar.f3079a.get() != eVar) ? false : true;
    }

    public synchronized boolean l(q3.k kVar) {
        try {
            String strG = kVar.g();
            if (!((HashMap) this.f4493a).containsKey(strG)) {
                ((HashMap) this.f4493a).put(strG, null);
                synchronized (kVar.e) {
                    kVar.f8018z = this;
                }
                if (q3.q.f8026a) {
                    q3.q.b("new request, sending to network %s", strG);
                }
                return false;
            }
            List arrayList = (List) ((HashMap) this.f4493a).get(strG);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            kVar.a("waiting-for-response");
            arrayList.add(kVar);
            ((HashMap) this.f4493a).put(strG, arrayList);
            if (q3.q.f8026a) {
                q3.q.b("Request for cacheKey=%s is in flight, putting on hold.", strG);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void m(z0.k kVar) throws Throwable {
        Object objA = ((tc.b) this.f4495c).a(kVar);
        if (objA instanceof tc.g) {
            Throwable th = ((tc.g) objA).f8707a;
            if (th != null) {
                throw th;
            }
            throw new tc.l("Channel was closed normally");
        }
        if (objA instanceof tc.h) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f4496d).getAndIncrement() == 0) {
            rc.b0.q((rc.a0) this.f4493a, null, new a2.g(this, (yb.d) null, 26), 3);
        }
    }

    public boolean n(j.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f4493a).onActionItemClicked(f(aVar), new k.s((Context) this.f4494b, (j0.a) menuItem));
    }

    public boolean o(j.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f4493a;
        j.f fVarF = f(aVar);
        r.k kVar = (r.k) this.f4496d;
        Menu b0Var = (Menu) kVar.get(menu);
        if (b0Var == null) {
            b0Var = new k.b0((Context) this.f4494b, (k.l) menu);
            kVar.put(menu, b0Var);
        }
        return callback.onCreateActionMode(fVarF, b0Var);
    }

    public synchronized void p(q3.k kVar) {
        BlockingQueue blockingQueue;
        try {
            String strG = kVar.g();
            List list = (List) ((HashMap) this.f4493a).remove(strG);
            if (list != null && !list.isEmpty()) {
                if (q3.q.f8026a) {
                    q3.q.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strG);
                }
                q3.k kVar2 = (q3.k) list.remove(0);
                ((HashMap) this.f4493a).put(strG, list);
                synchronized (kVar2.e) {
                    kVar2.f8018z = this;
                }
                if (((q3.c) this.f4495c) != null && (blockingQueue = (BlockingQueue) this.f4496d) != null) {
                    try {
                        blockingQueue.put(kVar2);
                    } catch (InterruptedException e4) {
                        q3.q.c("Couldn't add request to queue. %s", e4.toString());
                        Thread.currentThread().interrupt();
                        q3.c cVar = (q3.c) this.f4495c;
                        cVar.e = true;
                        cVar.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void q(d9.e eVar) {
        synchronized (this.f4493a) {
            try {
                if (k(eVar)) {
                    d9.l lVar = (d9.l) this.f4495c;
                    if (!lVar.f3081c) {
                        lVar.f3081c = true;
                        ((Handler) this.f4494b).removeCallbacksAndMessages(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(d9.e eVar) {
        synchronized (this.f4493a) {
            try {
                if (k(eVar)) {
                    d9.l lVar = (d9.l) this.f4495c;
                    if (lVar.f3081c) {
                        lVar.f3081c = false;
                        s(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(d9.l lVar) {
        Handler handler = (Handler) this.f4494b;
        int i = lVar.f3080b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(lVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, lVar), i);
    }

    public void t() {
        d9.l lVar = (d9.l) this.f4496d;
        if (lVar != null) {
            this.f4495c = lVar;
            this.f4496d = null;
            d9.e eVar = (d9.e) lVar.f3079a.get();
            if (eVar == null) {
                this.f4495c = null;
            } else {
                Handler handler = d9.h.f3057x;
                handler.sendMessage(handler.obtainMessage(0, eVar.f3042a));
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String str = (String) this.f4493a;
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        i0.i(exception);
        int i = zzadz.zzb;
        if (!(exception instanceof v9.h) || !((v9.h) exception).f9247a.endsWith("INVALID_RECAPTCHA_TOKEN")) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant ".concat(String.valueOf(str)));
        }
        return ((a3.j) this.f4494b).h(str, Boolean.TRUE, (RecaptchaAction) this.f4495c).continueWithTask((w9.v) this.f4496d);
    }

    public r(int i) {
        switch (i) {
            case 1:
                this.f4493a = new p0.e(10);
                this.f4494b = new r.k(0);
                this.f4495c = new ArrayList();
                this.f4496d = new HashSet();
                break;
            case 3:
                this.f4493a = new Object();
                this.f4494b = new Handler(Looper.getMainLooper(), new d9.k(this, 0));
                break;
            case 6:
                this.f4493a = new r.e(0);
                this.f4494b = new SparseArray();
                this.f4495c = new r.h();
                this.f4496d = new r.e(0);
                break;
            case 9:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new n0.i(1));
                this.f4494b = new HashMap();
                this.f4495c = new ReferenceQueue();
                this.f4493a = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new v9.i0(this, 1));
                break;
            default:
                this.f4493a = null;
                this.f4494b = null;
                this.f4495c = null;
                this.f4496d = new ArrayDeque();
                break;
        }
    }
}

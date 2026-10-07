package gb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f4454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f4456d;
    public b0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4457f;

    public d0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new da.x("Firebase-FirebaseInstanceIdServiceConnection", 3));
        this.f4456d = new ArrayDeque();
        this.f4457f = false;
        Context applicationContext = context.getApplicationContext();
        this.f4453a = applicationContext;
        this.f4454b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f4455c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f4456d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                b0 b0Var = this.e;
                if (b0Var == null || !b0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((c0) this.f4456d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Task b(Intent intent) {
        c0 c0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c0Var = new c0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f4455c;
            c0Var.f4449b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new a5.a(scheduledThreadPoolExecutor.schedule(new androidx.activity.d(c0Var, 14), 20L, TimeUnit.SECONDS), 11));
            this.f4456d.add(c0Var);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return c0Var.f4449b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f4457f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f4457f) {
            return;
        }
        this.f4457f = true;
        try {
            if (m7.a.b().a(this.f4453a, this.f4454b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f4456d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((c0) arrayDeque.poll()).f4449b.trySetResult(null);
                }
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.f4457f = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f4457f = false;
            if (iBinder instanceof b0) {
                this.e = (b0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f4456d;
            while (!arrayDeque.isEmpty()) {
                ((c0) arrayDeque.poll()).f4449b.trySetResult(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}

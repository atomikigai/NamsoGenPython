package f7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public aa.c f3631c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f3633f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3629a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f3630b = new Messenger(new zzf(Looper.getMainLooper(), new d9.k(this, 1)));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f3632d = new ArrayDeque();
    public final SparseArray e = new SparseArray();

    public /* synthetic */ h(k kVar) {
        this.f3633f = kVar;
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            int i = this.f3629a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f3629a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f3629a = 4;
            m7.a.b().c((Context) this.f3633f.f3639b, this);
            j jVar = new j(str, securityException);
            Iterator it = this.f3632d.iterator();
            while (it.hasNext()) {
                ((i) it.next()).b(jVar);
            }
            this.f3632d.clear();
            for (int i10 = 0; i10 < this.e.size(); i10++) {
                ((i) this.e.valueAt(i10)).b(jVar);
            }
            this.e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f3629a == 2 && this.f3632d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f3629a = 3;
                m7.a.b().c((Context) this.f3633f.f3639b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(i iVar) {
        try {
            int i = this.f3629a;
            if (i != 0) {
                if (i == 1) {
                    this.f3632d.add(iVar);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                this.f3632d.add(iVar);
                ((ScheduledExecutorService) this.f3633f.f3640c).execute(new g(this, 1));
                return true;
            }
            this.f3632d.add(iVar);
            i0.l(this.f3629a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f3629a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (m7.a.b().a((Context) this.f3633f.f3639b, intent, this, 1)) {
                    ((ScheduledExecutorService) this.f3633f.f3640c).schedule(new g(this, 2), 30L, TimeUnit.SECONDS);
                } else {
                    a("Unable to bind to service");
                }
            } catch (SecurityException e) {
                b("Unable to bind to service", e);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f3633f.f3640c).execute(new a3.e(this, iBinder, 9, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f3633f.f3640c).execute(new g(this, 0));
    }
}

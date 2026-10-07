package gb;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f4460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f4461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4463d;
    public int e;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new da.x("Firebase-Messaging-Intent-Handle", 3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f4460a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f4462c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            a0.b(intent);
        }
        synchronized (this.f4462c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    stopSelfResult(this.f4463d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f4461b == null) {
                this.f4461b = new b0(new a4.b(this, 13));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4461b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f4460a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        synchronized (this.f4462c) {
            this.f4463d = i10;
            this.e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) r.g().f4496d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4460a.execute(new androidx.emoji2.text.m(this, intent2, taskCompletionSource, 3));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new androidx.webkit.a(3), new e5.c(8, this, intent));
        return 3;
    }
}

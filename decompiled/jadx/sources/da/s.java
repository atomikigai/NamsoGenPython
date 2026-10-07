package da;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.internal.h0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f3143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.c f3144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3145d;
    public aa.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public aa.c f3146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f3147g;
    public final z h;
    public final ia.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z9.a f3148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z9.a f3149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f3150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a3.j f3151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f3152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final aa.b f3153o;

    public s(n9.g gVar, z zVar, aa.b bVar, h0 h0Var, z9.a aVar, z9.a aVar2, ia.b bVar2, ExecutorService executorService, l lVar) {
        this.f3143b = h0Var;
        gVar.a();
        this.f3142a = gVar.f7359a;
        this.h = zVar;
        this.f3153o = bVar;
        this.f3148j = aVar;
        this.f3149k = aVar2;
        this.f3150l = executorService;
        this.i = bVar2;
        a3.j jVar = new a3.j();
        jVar.f108b = Tasks.forResult(null);
        jVar.f109c = new Object();
        jVar.f110d = new ThreadLocal();
        jVar.f107a = executorService;
        executorService.execute(new androidx.activity.i(jVar, 11));
        this.f3151m = jVar;
        this.f3152n = lVar;
        this.f3145d = System.currentTimeMillis();
        this.f3144c = new aa.c(20);
    }

    public static Task a(s sVar, c3.j jVar) {
        Task taskForException;
        r rVar;
        a3.j jVar2 = sVar.f3151m;
        if (!Boolean.TRUE.equals(((ThreadLocal) jVar2.f110d).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        sVar.e.c();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                sVar.f3148j.a(new q(sVar));
                sVar.f3147g.f();
                if (jVar.h().f6130b.f6126a) {
                    if (!sVar.f3147g.d(jVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    taskForException = sVar.f3147g.g(((TaskCompletionSource) ((AtomicReference) jVar.i).get()).getTask());
                    rVar = new r(sVar, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    taskForException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    rVar = new r(sVar, 0);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                taskForException = Tasks.forException(e);
                rVar = new r(sVar, 0);
            }
            jVar2.d(rVar);
            return taskForException;
        } catch (Throwable th) {
            jVar2.d(new r(sVar, 0));
            throw th;
        }
    }

    public final void b(c3.j jVar) {
        Future<?> futureSubmit = this.f3150l.submit(new a3.e(7, this, jVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e4) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e4);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }
}

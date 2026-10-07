package com.google.firebase.messaging;

import a5.a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import bd.v;
import com.bumptech.glide.manager.q;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import da.x;
import gb.j;
import gb.k;
import gb.n;
import gb.s;
import gb.t;
import i5.e;
import ib.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n9.g;
import ya.b;
import za.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f2725l = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static c f2726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static e f2727n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f2728o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f2731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f2732d;
    public final q e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f2734g;
    public final ThreadPoolExecutor h;
    public final Task i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f2735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2736k;

    public FirebaseMessaging(g gVar, b bVar, b bVar2, d dVar, e eVar, va.c cVar) {
        gVar.a();
        Context context = gVar.f7359a;
        final n nVar = new n();
        final int i = 0;
        nVar.f4482b = 0;
        nVar.f4483c = context;
        final v vVar = new v(gVar, nVar, bVar, bVar2, dVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new x("Firebase-Messaging-Task", 3));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new x("Firebase-Messaging-Init", 3));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new x("Firebase-Messaging-File-Io", 3));
        this.f2736k = false;
        f2727n = eVar;
        this.f2729a = gVar;
        q qVar = new q();
        qVar.f1935d = this;
        qVar.f1933b = cVar;
        this.e = qVar;
        gVar.a();
        final Context context2 = gVar.f7359a;
        this.f2730b = context2;
        k kVar = new k();
        this.f2735j = nVar;
        this.f2734g = executorServiceNewSingleThreadExecutor;
        this.f2731c = vVar;
        this.f2732d = new j(executorServiceNewSingleThreadExecutor);
        this.f2733f = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(kVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: gb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f4477b;

            {
                this.f4477b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z4;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f4477b;
                        if (firebaseMessaging.e.d() && firebaseMessaging.h(firebaseMessaging.f())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f2736k) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = this.f4477b.f2730b;
                        Context applicationContext = context3.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context3;
                        }
                        if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        try {
                            Context applicationContext2 = context3.getApplicationContext();
                            PackageManager packageManager = applicationContext2.getPackageManager();
                            z4 = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (Build.VERSION.SDK_INT < 29) {
                            Tasks.forResult(null);
                            return;
                        }
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        p.a(context3, z4, taskCompletionSource);
                        taskCompletionSource.getTask();
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new x("Firebase-Messaging-Topics-Io", 3));
        int i11 = gb.x.f4516j;
        Task taskCall = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: gb.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v vVar2;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                n nVar2 = nVar;
                bd.v vVar3 = vVar;
                synchronized (v.class) {
                    try {
                        WeakReference weakReference = v.f4509c;
                        vVar2 = weakReference != null ? (v) weakReference.get() : null;
                        if (vVar2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            v vVar4 = new v(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (vVar4) {
                                vVar4.f4510a = bd.u.e(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            v.f4509c = new WeakReference(vVar4);
                            vVar2 = vVar4;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new x(firebaseMessaging, nVar2, vVar2, vVar3, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.i = taskCall;
        taskCall.addOnSuccessListener(scheduledThreadPoolExecutor, new a(this, 7));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: gb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f4477b;

            {
                this.f4477b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z4;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f4477b;
                        if (firebaseMessaging.e.d() && firebaseMessaging.h(firebaseMessaging.f())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f2736k) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = this.f4477b.f2730b;
                        Context applicationContext = context3.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context3;
                        }
                        if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        try {
                            Context applicationContext2 = context3.getApplicationContext();
                            PackageManager packageManager = applicationContext2.getPackageManager();
                            z4 = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (Build.VERSION.SDK_INT < 29) {
                            Tasks.forResult(null);
                            return;
                        }
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        p.a(context3, z4, taskCompletionSource);
                        taskCompletionSource.getTask();
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j4) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f2728o == null) {
                    f2728o = new ScheduledThreadPoolExecutor(1, new x("TAG", 3));
                }
                f2728o.schedule(runnable, j4, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(g.d());
    }

    public static synchronized c d(Context context) {
        try {
            if (f2726m == null) {
                f2726m = new c(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2726m;
    }

    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        i0.j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() throws IOException {
        Task taskContinueWithTask;
        s sVarF = f();
        if (!h(sVarF)) {
            return sVarF.f4498a;
        }
        String strB = n.b(this.f2729a);
        j jVar = this.f2732d;
        synchronized (jVar) {
            taskContinueWithTask = (Task) ((r.e) jVar.f4473b).get(strB);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                v vVar = this.f2731c;
                taskContinueWithTask = vVar.h(vVar.q(n.b((g) vVar.f1682c), ProxyConfig.MATCH_ALL_SCHEMES, new Bundle())).onSuccessTask(this.h, new e5.d(this, strB, sVarF, 3)).continueWithTask((Executor) jVar.f4472a, new e5.c(9, jVar, strB));
                ((r.e) jVar.f4473b).put(strB, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final Task e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2733f.execute(new androidx.webkit.b(3, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final s f() {
        s sVarB;
        c cVarD = d(this.f2730b);
        g gVar = this.f2729a;
        gVar.a();
        String strF = "[DEFAULT]".equals(gVar.f7360b) ? "" : gVar.f();
        String strB = n.b(this.f2729a);
        synchronized (cVarD) {
            sVarB = s.b(((SharedPreferences) cVarD.f5256b).getString(strF + "|T|" + strB + "|*", null));
        }
        return sVarB;
    }

    public final synchronized void g(long j4) {
        b(new t(this, Math.min(Math.max(30L, 2 * j4), f2725l)), j4);
        this.f2736k = true;
    }

    public final boolean h(s sVar) {
        if (sVar != null) {
            return System.currentTimeMillis() > sVar.f4500c + s.f4497d || !this.f2735j.a().equals(sVar.f4499b);
        }
        return true;
    }
}

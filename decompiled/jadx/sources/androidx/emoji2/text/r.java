package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd.u f794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9.c f795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f796d = new Object();
    public Handler e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f797f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ThreadPoolExecutor f798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public jd.l f799s;

    public r(Context context, bd.u uVar) {
        qd.b.j(context, "Context cannot be null");
        this.f793a = context.getApplicationContext();
        this.f794b = uVar;
        this.f795c = s.f800d;
    }

    public final void a() {
        synchronized (this.f796d) {
            try {
                this.f799s = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f798r;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f797f = null;
                this.f798r = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n0.g b() {
        try {
            z9.c cVar = this.f795c;
            Context context = this.f793a;
            bd.u uVar = this.f794b;
            cVar.getClass();
            ea.j jVarA = n0.b.a(context, uVar);
            int i = jVarA.f3529a;
            if (i != 0) {
                throw new RuntimeException(q1.a.j(i, "fetchFonts failed (", ")"));
            }
            n0.g[] gVarArr = (n0.g[]) jVarA.f3530b;
            if (gVarArr == null || gVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return gVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // androidx.emoji2.text.k
    public final void c(jd.l lVar) {
        synchronized (this.f796d) {
            this.f799s = lVar;
        }
        synchronized (this.f796d) {
            try {
                if (this.f799s == null) {
                    return;
                }
                if (this.f797f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f798r = threadPoolExecutor;
                    this.f797f = threadPoolExecutor;
                }
                this.f797f.execute(new androidx.activity.d(this, 3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

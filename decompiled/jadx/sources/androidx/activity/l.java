package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f361b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f363d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f360a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f362c = false;

    public l(m mVar) {
        this.f363d = mVar;
    }

    public final void a(View view) {
        if (this.f362c) {
            return;
        }
        this.f362c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f361b = runnable;
        View decorView = this.f363d.getWindow().getDecorView();
        if (!this.f362c) {
            decorView.postOnAnimation(new d(this, 1));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f361b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f360a) {
                this.f362c = false;
                this.f363d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f361b = null;
        com.bumptech.glide.manager.r rVar = this.f363d.f371u;
        synchronized (rVar.f1938c) {
            z4 = rVar.f1937b;
        }
        if (z4) {
            this.f362c = false;
            this.f363d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f363d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

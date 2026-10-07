package androidx.work.impl.workers;

import android.content.Context;
import androidx.activity.i;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import e3.k;
import f3.a;
import java.util.ArrayList;
import java.util.List;
import t2.m;
import u2.j;
import y2.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f1275v = m.f("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WorkerParameters f1276f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f1277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f1278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f1279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ListenableWorker f1280u;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1276f = workerParameters;
        this.f1277r = new Object();
        this.f1278s = false;
        this.f1279t = new k();
    }

    @Override // y2.b
    public final void e(ArrayList arrayList) {
        m.d().a(f1275v, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f1277r) {
            this.f1278s = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return j.S(getApplicationContext()).f8822p;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f1280u;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f1280u;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f1280u.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final m9.a startWork() {
        getBackgroundExecutor().execute(new i(this, 18));
        return this.f1279t;
    }

    @Override // y2.b
    public final void f(List list) {
    }
}

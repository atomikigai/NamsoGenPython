package androidx.work;

import a2.l;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import d3.n;
import d3.o;
import d3.p;
import d3.q;
import e3.k;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import m9.a;
import t2.f;
import t2.g;
import t2.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f1239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f1240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1241d;
    public boolean e;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1238a = context;
        this.f1239b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f1238a;
    }

    public Executor getBackgroundExecutor() {
        return this.f1239b.f1248f;
    }

    public a getForegroundInfoAsync() {
        k kVar = new k();
        kVar.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.f1239b.f1244a;
    }

    public final f getInputData() {
        return this.f1239b.f1245b;
    }

    public final Network getNetwork() {
        return (Network) this.f1239b.f1247d.f8041c;
    }

    public final int getRunAttemptCount() {
        return this.f1239b.e;
    }

    public final Set<String> getTags() {
        return this.f1239b.f1246c;
    }

    public f3.a getTaskExecutor() {
        return this.f1239b.f1249g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f1239b.f1247d.f8039a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f1239b.f1247d.f8040b;
    }

    public t getWorkerFactory() {
        return this.f1239b.h;
    }

    public boolean isRunInForeground() {
        return this.e;
    }

    public final boolean isStopped() {
        return this.f1240c;
    }

    public final boolean isUsed() {
        return this.f1241d;
    }

    public final a setForegroundAsync(g gVar) {
        this.e = true;
        o oVar = this.f1239b.f1250j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        oVar.getClass();
        k kVar = new k();
        ((l) oVar.f2839a).m(new n(oVar, kVar, id2, gVar, applicationContext, 0));
        return kVar;
    }

    public a setProgressAsync(f fVar) {
        q qVar = this.f1239b.i;
        getApplicationContext();
        UUID id2 = getId();
        qVar.getClass();
        k kVar = new k();
        ((l) qVar.f2848b).m(new p(qVar, id2, fVar, kVar, 0));
        return kVar;
    }

    public void setRunInForeground(boolean z4) {
        this.e = z4;
    }

    public final void setUsed() {
        this.f1241d = true;
    }

    public abstract a startWork();

    public final void stop() {
        this.f1240c = true;
        onStopped();
    }

    public void onStopped() {
    }
}

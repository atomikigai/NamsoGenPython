package androidx.work;

import android.content.Context;
import androidx.activity.i;
import e3.k;
import m9.a;
import t2.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f1243f;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract l doWork();

    @Override // androidx.work.ListenableWorker
    public final a startWork() {
        this.f1243f = new k();
        getBackgroundExecutor().execute(new i(this, 28));
        return this.f1243f;
    }
}

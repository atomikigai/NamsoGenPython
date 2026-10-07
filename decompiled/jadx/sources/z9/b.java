package z9;

import androidx.emoji2.text.m;
import c3.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.g;
import da.c0;
import da.s;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f11528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f11529c;

    public b(boolean z4, s sVar, j jVar) {
        this.f11527a = z4;
        this.f11528b = sVar;
        this.f11529c = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.f11527a) {
            return null;
        }
        s sVar = this.f11528b;
        ExecutorService executorService = sVar.f3150l;
        g gVar = new g(sVar, this.f11529c, 3, false);
        ExecutorService executorService2 = c0.f3097a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new m(gVar, executorService, taskCompletionSource, 2));
        taskCompletionSource.getTask();
        return null;
    }
}

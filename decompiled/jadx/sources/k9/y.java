package k9;

import com.google.android.gms.tasks.TaskCompletionSource;
import h6.o0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f6122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f6123t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, w wVar) {
        super(taskCompletionSource);
        this.f6123t = cVar;
        this.f6121r = taskCompletionSource2;
        this.f6122s = wVar;
    }

    @Override // k9.w
    public final void b() {
        synchronized (this.f6123t.f6102f) {
            try {
                c cVar = this.f6123t;
                TaskCompletionSource taskCompletionSource = this.f6121r;
                cVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new o0(4, cVar, taskCompletionSource));
                if (this.f6123t.f6106l.getAndIncrement() > 0) {
                    this.f6123t.f6099b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f6123t, this.f6122s);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

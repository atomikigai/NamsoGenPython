package za;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f11548a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f11548a = taskCompletionSource;
    }

    @Override // za.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // za.i
    public final boolean b(ab.b bVar) {
        int i = bVar.f273b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f11548a.trySetResult(bVar.f272a);
        return true;
    }
}

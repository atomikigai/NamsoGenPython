package za;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f11547b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f11546a = jVar;
        this.f11547b = taskCompletionSource;
    }

    @Override // za.i
    public final boolean a(Exception exc) {
        this.f11547b.trySetException(exc);
        return true;
    }

    @Override // za.i
    public final boolean b(ab.b bVar) {
        if (bVar.f273b != 4 || this.f11546a.a(bVar)) {
            return false;
        }
        String str = bVar.f274c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f11547b.setResult(new a(str, bVar.e, bVar.f276f));
        return true;
    }
}

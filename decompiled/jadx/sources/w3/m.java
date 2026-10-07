package w3;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4.f f9543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f9544b;

    public m(l4.f fVar, Executor executor) {
        this.f9543a = fVar;
        this.f9544b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f9543a.equals(((m) obj).f9543a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9543a.hashCode();
    }
}

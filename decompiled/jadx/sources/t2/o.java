package t2;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f8555a;

    public o(Throwable th) {
        this.f8555a = th;
    }

    public final String toString() {
        return v.i("FAILURE (", this.f8555a.getMessage(), ")");
    }
}

package ed;

import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f3537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3538d;

    public a(String str, boolean z4) {
        i.e(str, "name");
        this.f3535a = str;
        this.f3536b = z4;
        this.f3538d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3535a;
    }
}

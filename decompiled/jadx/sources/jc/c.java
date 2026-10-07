package jc;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements nc.a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient nc.a f5760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f5762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5763d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5764f;

    public c(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f5761b = obj;
        this.f5762c = cls;
        this.f5763d = str;
        this.e = str2;
        this.f5764f = z4;
    }

    public abstract nc.a c();

    public final d d() {
        boolean z4 = this.f5764f;
        Class cls = this.f5762c;
        if (!z4) {
            return r.a(cls);
        }
        r.f5777a.getClass();
        return new k(cls);
    }
}

package jc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends n implements nc.c, ic.l {
    @Override // jc.c
    public final nc.a c() {
        r.f5777a.getClass();
        return this;
    }

    public final void f() {
        if (this.f5773r) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        nc.a aVarE = e();
        if (aVarE == this) {
            throw new hc.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((l) ((nc.c) aVarE)).f();
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        f();
        throw null;
    }
}

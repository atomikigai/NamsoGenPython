package b2;

import ic.p;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.b f1350a;

    public b(a4.b bVar) {
        this.f1350a = bVar;
    }

    @Override // a2.b
    public final Object J(boolean z4, p pVar, ac.c cVar) {
        h2.e eVar = (h2.e) this.f1350a.f113b;
        eVar.getClass();
        return pVar.invoke(new d(new a(eVar.z())), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((h2.e) this.f1350a.f113b).close();
    }
}

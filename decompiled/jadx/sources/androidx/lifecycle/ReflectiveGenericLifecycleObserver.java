package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f1025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f1026b;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f1025a = qVar;
        c cVar = c.f1035c;
        Class<?> cls = qVar.getClass();
        a aVar = (a) cVar.f1036a.get(cls);
        this.f1026b = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        HashMap map = this.f1026b.f1031a;
        List list = (List) map.get(lVar);
        q qVar = this.f1025a;
        a.a(list, rVar, lVar, qVar);
        a.a((List) map.get(l.ON_ANY), rVar, lVar, qVar);
    }
}

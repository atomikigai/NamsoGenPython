package x9;

import androidx.datastore.preferences.protobuf.d1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f10351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f10352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f10353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f10354d;
    public final Set e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f10355f;

    public s(b bVar, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<i> set = bVar.f10317c;
        Set set2 = bVar.f10320g;
        for (i iVar : set) {
            int i = iVar.f10336c;
            int i10 = iVar.f10335b;
            boolean z4 = i == 0;
            q qVar = iVar.f10334a;
            if (z4) {
                if (i10 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i == 2) {
                hashSet3.add(qVar);
            } else if (i10 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(q.a(va.b.class));
        }
        this.f10351a = Collections.unmodifiableSet(hashSet);
        this.f10352b = Collections.unmodifiableSet(hashSet2);
        this.f10353c = Collections.unmodifiableSet(hashSet3);
        this.f10354d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f10355f = cVar;
    }

    @Override // x9.c
    public final Object a(Class cls) {
        if (!this.f10351a.contains(q.a(cls))) {
            throw new d1("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = this.f10355f.a(cls);
        if (!cls.equals(va.b.class)) {
            return objA;
        }
        return new r();
    }

    @Override // x9.c
    public final Set b(q qVar) {
        if (this.f10354d.contains(qVar)) {
            return this.f10355f.b(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // x9.c
    public final ya.b c(q qVar) {
        if (this.f10352b.contains(qVar)) {
            return this.f10355f.c(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // x9.c
    public final ya.b d(Class cls) {
        return c(q.a(cls));
    }

    @Override // x9.c
    public final ya.b e(q qVar) {
        if (this.e.contains(qVar)) {
            return this.f10355f.e(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    @Override // x9.c
    public final Object f(q qVar) {
        if (this.f10351a.contains(qVar)) {
            return this.f10355f.f(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // x9.c
    public final o g(Class cls) {
        return h(q.a(cls));
    }

    @Override // x9.c
    public final o h(q qVar) {
        if (this.f10353c.contains(qVar)) {
            return this.f10355f.h(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }
}

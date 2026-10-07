package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends AbstractList implements a0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f656a;

    public i1(z zVar) {
        this.f656a = zVar;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final void b(f fVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final List c() {
        return Collections.unmodifiableList(this.f656a.f756b);
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final Object f(int i) {
        return this.f656a.f756b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f656a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        h1 h1Var = new h1();
        h1Var.f653a = this.f656a.iterator();
        return h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g1 g1Var = new g1();
        g1Var.f647a = this.f656a.listIterator(i);
        return g1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f656a.size();
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final a0 e() {
        return this;
    }
}
